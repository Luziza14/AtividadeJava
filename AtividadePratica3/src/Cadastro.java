import java.util.ArrayList;

public class Cadastro {
    private static ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void cadastrarFuncionario(Funcionario funcionario) {
        listaFuncionarios.add(funcionario);
    }

    public static ArrayList<Funcionario> listarFuncionarios() {
        return listaFuncionarios;
    }

    public static boolean verificarListaVazia() {
        return listaFuncionarios.isEmpty();
    }

    public static boolean verificarGerenteLista() {
        for (Funcionario tempFuncionario : listaFuncionarios) {
            if (tempFuncionario instanceof Gerente) {
                return true;
            }
        }
        return false;
    }

    public static boolean verificarEstagiarioLista() {
        for (Funcionario tempFuncionario : listaFuncionarios) {
            if (tempFuncionario instanceof Estagiario) {
                return true;
            }
        }
        return false;
    }

    public static boolean verificarDesenvolvedorLista() {
        for (Funcionario tempFuncionario : listaFuncionarios) {
            if (tempFuncionario instanceof Desenvolvedor) {
                return true;
            }
        }
        return false;
    }
}