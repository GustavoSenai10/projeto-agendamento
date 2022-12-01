package br.senai.sp.jandira.DAO;

import br.senai.sp.jandira.model.Medico;
import com.sun.source.tree.CatchTree;
import com.sun.source.tree.TryTree;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {

    private static final String URL = "C:\\Users\\22282225\\java\\Medico.txt";
    private static final String URL_TEMP = "C:\\Users\\22282225\\java\\Medico-temp.txt";
    private static final Path PATH = Paths.get(URL);
    private static final Path PATH_TEMP = Paths.get(URL_TEMP);
    public static ArrayList<Medico> medico = new ArrayList<>();

    public static ArrayList<Medico> getmedico() {
        return medico;
    }

    public static Medico getmedico(Integer codigo) {
        for (Medico m : medico) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }
        return null;
    }

    // excluir
    public static void excluir(Integer codigo) {
        for (Medico m : medico) {
            if (m.getCodigo().equals(codigo)) {
                medico.remove(m);
                break;
            }
        }
    }

    public static void atualizarArquivo() {
//Criar uma representação dos arquivos que serão manipulados 
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            //Criar o arquivo temporario
            arquivoTemp.createNewFile();
            //Abrir o arquivo temporario para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            //Iterar na lista para adicionar as especialidades 
            // no arquivo temporario , exceto o registro que 
            //não queremos mais
            for (Medico m : medico) {
                bwTemp.write(m.getmedicoSeparadosPorPontoEVirgula());
                bwTemp.newLine();
            }
            bwTemp.close();
            //Deletar arquivo atual e renomear aquivo novo 
            arquivoAtual.delete();
            arquivoTemp.renameTo(arquivoAtual);
        } catch (Exception p) {
            p.printStackTrace();
        }
    }

    //Atualizar
    public static void atualizar(Medico correta) {
        for (Medico m : medico) {
            if (correta.getCodigo() == m.getCodigo()) {
                int posicao = medico.indexOf(m);
                medico.set(posicao, correta);
                break;
            }
        }
        atualizarArquivo();
    }

    //Gravar
    public static void gravar(Medico m) {
        medico.add(m);
        //Gravar no arquivo 
        try {

            BufferedWriter escritor = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            escritor.write(m.getmedicoSeparadosPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException erro) {
            JOptionPane.showConfirmDialog(null, "Ocorreu um erro no plano");
        }
    }

    // método para criar uma lista inicial de especialidade
    public static void criarListaDeMedicos() {
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            String linha = leitor.readLine();

            while (linha != null) {
                String[] vetor = linha.split(";");

                Medico m = new Medico(
                        Integer.valueOf(vetor[0]),
                        vetor[1],
                        vetor[2],
                        vetor[3],
                        LocalDate.parse(vetor[4]));
                medico.add(m);

                linha = leitor.readLine();
            }
            leitor.close();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Ocorreu um erro.");
        }
            System.out.println(medico.size());
    }

    public static DefaultTableModel getTabelaMedico() {

        System.out.println(medico.size());
        String[] titulo = {"Codigo", "Nome", "CRM", "Telefone"};
        String[][] dados = new String[medico.size()][4];

        for (Medico m : medico) {
            int i = medico.indexOf(m);
            dados[i][0] = m.getCodigo().toString();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            dados[i][3] = m.getTelefone();
        }
        DefaultTableModel model = new DefaultTableModel(dados, titulo);
        return model;
    }
}
