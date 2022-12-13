package br.senai.sp.jandira.DAO;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;
import jdk.dynalink.StandardOperation;

public class EspecialidadeDAO {

    private static final String URL = "C:\\Users\\22282225\\java\\Especialidade.txt";
    private static final String URL_TEMP = "C:\\Users\\22282225\\java\\Especialidade-temp.txt";
    private static final Path PATH = Paths.get(URL);
    private static final Path PATH_TEMP = Paths.get(URL_TEMP);
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public static ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public static Especialidade getEspecialidade(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (codigo == e.getCodigo()) {
                return e;
            }
        }
        return null;
    }

    public static void excluir(Integer codigo) {    //excluir
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                especialidades.remove(e);
                break;
            }

        }
    }

    public static void atualizarArquivo() {
        //Passo  1- criar um representação dos arquivos que serão manipulados 
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            //Criar o arquivo temporario
            arquivoTemp.createNewFile();

            //abrir o arquivo temporario para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            //Iterar na lista para adicionar as especialidades 
            // no arquivo temporario , exceto o registro que 
            //não queremos mais
            for (Especialidade e : especialidades) {
                bwTemp.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
                bwTemp.newLine();
            }
            bwTemp.close();
            // deletar arquivo atual e renomear arquivo novo 
            arquivoAtual.delete();
            arquivoTemp.renameTo(arquivoAtual);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void atualizar(Especialidade correta) {   //atualizar
        for (Especialidade e : especialidades) {
            if (correta.getCodigo() == e.getCodigo()) {
                int posicao = especialidades.indexOf(e);
                especialidades.set(posicao, correta);
                break;
            }
        }
        atualizarArquivo();
    }

    public static void gravar(Especialidade e) {    //Gravar
        especialidades.add(e);
        //Gravar no arquivo 
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            escritor.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
        } catch (IOException erro) {
            JOptionPane.showConfirmDialog(null, "Ocorreu um erro ou gravar");
        }
    }

    //método para criar uma lista inicial de especialidades
    public static void criarListaDeEspecialidades() {
        //leitor
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH_TEMP);

            String linha = leitor.readLine();

            while (linha != null) {
                // Trasformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");

                Especialidade e = new Especialidade(
                        vetor[1],
                        vetor[2],
                        Integer.valueOf(vetor[0]));
                // Guardar a especialidade na lista
                especialidades.add(e);
                //ler aproxima linha
                linha = leitor.readLine();
            }
            leitor.close();
        } catch (IOException e) {
            JOptionPane.showConfirmDialog(
                    null,
                    "Ocorreu um erro ao ler o arquivo");
        }
        System.out.println(especialidades.size());

    }

    public static DefaultTableModel getTabelaEspecialidades() {

        System.out.println(especialidades.size());
        String[] titulo = {"codigo", "Nome da Especialidade", "Descrição"};
        String[][] dados = new String[especialidades.size()][3];

        for (Especialidade e : especialidades) {
            int i = especialidades.indexOf(e);
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
        }

        return new DefaultTableModel(dados, titulo);

    }

    public static DefaultListModel<String> getListaEspecialidade() {
        DefaultListModel<String> listaEspecialidade = new DefaultListModel<>();
        for (Especialidade especialidade : especialidades) {
            listaEspecialidade.addElement(especialidade.getCodigo() + "-" + especialidade.getNome());

        }
        return listaEspecialidade;
    }
}
