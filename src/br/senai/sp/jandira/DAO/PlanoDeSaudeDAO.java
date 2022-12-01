package br.senai.sp.jandira.DAO;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import javax.swing.text.DateFormatter;

public class PlanoDeSaudeDAO {

    private static final String URL = "C:\\Users\\22282225\\java\\plano_de_saude.txt";
    private static final String URL_TEMP = "C:\\Users\\22282225\\java\\plano_de_saude-temp.txt";
    private static final Path PATH = Paths.get(URL);
    private static final Path PATH_TEMP = Paths.get(URL_TEMP);
    private static ArrayList<PlanoDeSaude> planoDeSaude = new ArrayList<>();

    public static ArrayList<PlanoDeSaude> getplanoDeSaude() {
        return planoDeSaude;
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {
        for (PlanoDeSaude p : planoDeSaude) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    public static void excluir(Integer codigo) {    //excluir
        for (PlanoDeSaude p : planoDeSaude) {
            if (p.getCodigo().equals(codigo)) {
                planoDeSaude.remove(p);
                break;
            }

        }
    }

    public static void atualizarArquivo(){
        //Criar uma representação dos arquivos que serão manipulados 
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);
        
        try {
            //criar o arquivo temporario 
            arquivoTemp.createNewFile();
            // abrir o arquivo temporario para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
              //Iterar na lista para adicionar as especialidades 
            // no arquivo temporario , exceto o registro que 
            //não queremos mais
            for (PlanoDeSaude p : planoDeSaude) {
                bwTemp.write(p.getPlanoDeSaudeSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }
            bwTemp.close();
            // deletar arquivo atual e renomear arquivo novo
            arquivoAtual.delete();
            arquivoTemp.renameTo(arquivoAtual);
        } catch (Exception e) {
         e.printStackTrace();
        }
    
    
    }
    public static void atualizar(PlanoDeSaude correta) {   //atualizar
        for (PlanoDeSaude p : planoDeSaude) {
            if (correta.getCodigo() == p.getCodigo()) {
                int posicao = planoDeSaude.indexOf(p);
                planoDeSaude.set(posicao, correta);
                break;
            }
        }
        atualizarArquivo();
    }

    public static void gravar(PlanoDeSaude p) {    //Gravar
        planoDeSaude.add(p);

        //Gravar no arquivo 
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            escritor.write(p.getPlanoDeSaudeSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
        } catch (IOException erro) {
            JOptionPane.showConfirmDialog(null, "Ocorreu um erro no plano");
        }

    }

    //método para criar uma lista inicial de especialidades
    public static void criarListaDePlanoDeSaude() {
        //leitor
        try {
            BufferedReader leitorP = Files.newBufferedReader(PATH);

            String linha = leitorP.readLine();

            while (linha != null) {
                //transformar os dados da linha em um plano de saúde
                String[] vetor = linha.split(";");

                PlanoDeSaude p = new PlanoDeSaude(
                        vetor[1],
                        vetor[2],
                        vetor[3],
                        LocalDate.parse(vetor[4]),
                        Integer.valueOf(vetor[0]));
                //Guardar o plano de saúde 
                planoDeSaude.add(p);
                //ler aproxima linha 
                linha = leitorP.readLine();
            }
            leitorP.close();

        } catch (IOException p) {
            JOptionPane.showConfirmDialog(
                    null,
                    "Ocorreu um erro ao ler o arquivo");
        }
            System.out.println(planoDeSaude.size());
    }

    public static DefaultTableModel getTabelaPlanoDeSaude() {

        System.out.println(planoDeSaude.size());
        String[] titulo = {"CÓDIGO", "OPERADORA", "CATEGÓRIA", "NÚMERO", "VALIDADE"};
        String[][] dados = new String[planoDeSaude.size()][5];

        for (PlanoDeSaude p : planoDeSaude) {
            int i = planoDeSaude.indexOf(p);
            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getCategoria();
            dados[i][3] = p.getNumero();
            DateTimeFormatter padrao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dados[i][4] = p.getValidade().format(padrao);
        }

       DefaultTableModel model = new DefaultTableModel(dados, titulo);
       return model;
    }

}
