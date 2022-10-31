package br.senai.sp.jandira.DAO;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

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
            if (codigo != e.getCodigo()) {
                especialidades.remove(e);
            }
            break;
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
    }

    public static void gravar(Especialidade e) {    //Gravar
        especialidades.add(e);
    }

    //método para criar uma lista inicial de especialidades
    public static void criarListaDeEspecialidades() {
        Especialidade e1 = new Especialidade("Denstista", "cuida dos seus dentes");
        Especialidade e2 = new Especialidade("Piscologo", "cuida da cabeça");
        Especialidade e3 = new Especialidade("Cardiologia", "cuida do coração");
        Especialidade e4 = new Especialidade("Clinico Geral", "cuida de tudo um pouco");

        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        especialidades.add(e4);

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

}
