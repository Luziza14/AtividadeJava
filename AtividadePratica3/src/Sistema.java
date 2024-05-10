public class Sistema {

    private static void exibirMenu() {
        System.out.println("\nSistema de Combate");
        System.out.println("1) Cadastrar Gerente");
        System.out.println("2) Cadastrar Desenvolvedor");
        System.out.println("3) Cadastrar Estagiario");
        System.out.println("4) Listar Funcionarios");
        System.out.println("5) Listar Gerentes");
        System.out.println("6) Listar Desenvolvedores");
        System.out.println("7) Listar Estagiarios");
        System.out.println("0) Sair");
        System.out.print("Informe uma Opção: ");
    }

    private static void cadastrarGerente() {
        System.out.println("\nCadastrar Gerente");
        System.out.println("Nome: ");
        String nome = Console.lerString();
        System.out.println("Número de matrícula: ");
        String matricula = Console.lerString();
        System.out.println("Quantidade de bonus: ");
        float bonus = Console.lerFloat();
        System.out.println("Nome da Equipe: ");
        String equipe = Console.lerString();
        Gerente g = new Gerente(nome, matricula, bonus, equipe);
        Cadastro.cadastrarFuncionario(g);
        System.out.println("\nGerente Cadastrado");
    }

    private static void cadastrarEstagiario() {
        System.out.println("\nCadastro de Estagiario");
        System.out.println("Nome: ");
        String nome = Console.lerString();
        System.out.println("Número de matrícula: ");
        String matricula = Console.lerString();
        System.out.println("Quantidade de horas trabalhadas: ");
        int hrtran = Console.lerInt();
        System.out.println("Nome do supervisor: ");
        String supervisor = Console.lerString();
        Estagiario e = new Estagiario(nome, matricula, hrtran, supervisor);
        Cadastro.cadastrarFuncionario(e);
        System.out.println("\nEstagario cadastrado");
    }

    private static void cadastrarDesenvolvedor() {
        System.out.println("\nCadastro de Desenvolvedor");
        System.out.println("Nome: ");
        String nome = Console.lerString();
        System.out.println("Número de matricula: ");
        String matricula = Console.lerString();
        System.out.println("Linguagens que domina: ");
        String lingdomina = Console.lerString();
        Desenvolvedor d = new Desenvolvedor(nome, matricula, lingdomina);
        Cadastro.cadastrarFuncionario(d);
        System.out.println("\nDesenvolvedor cadastrado");
    }

    private static void listarFuncionarios() {
        if (Cadastro.verificarListaVazia()) {
            System.out.println("\nSem funcionários cadastrados");
            return;
        }
        System.out.println("\nFuncionários Cadastrados (Lista):");
        for (Funcionario tempFuncionario : Cadastro.listarFuncionarios()) {
            System.out.println(tempFuncionario);
            
        }
    
    
    }
    
    private static void listarGerentes() {
        if (!Cadastro.verificarGerenteLista()) {
            System.out.println("\nNão há gerentes cadastrados");
            return;
        }
        System.out.println("\nGerentes cadastrados:");
        for (Funcionario tempFuncionario : Cadastro.listarFuncionarios()) {
            if (tempFuncionario instanceof Gerente) {
                System.out.println(tempFuncionario);
            }
        }
    }
    
    private static void listarDesenvolvedor() {
        if (!Cadastro.verificarDesenvolvedorLista()) {
            System.out.println("\nNão há desenvolvedores cadastrados");
            return;
        }
        System.out.println("\nDesenvolvedores cadastrados:");
        for (Funcionario tempFuncionario : Cadastro.listarFuncionarios()) {
            if (tempFuncionario instanceof Desenvolvedor) {
                System.out.println(tempFuncionario);
            }
        }
    }
    
    private static void listarEstagiario() {
        if (!Cadastro.verificarEstagiarioLista()) {
            System.out.println("\nNão há estagiários cadastrados");
            return;
        }
        System.out.println("\nEstagiários cadastrados:");
        for (Funcionario tempFuncionario : Cadastro.listarFuncionarios()) {
            if (tempFuncionario instanceof Estagiario) {
                System.out.println(tempFuncionario);
            }
        }
    }

    private static void verificarOpcao(int op) {
        switch (op) {
            case 1:
                cadastrarGerente();
                break;
            case 2:
                cadastrarDesenvolvedor();
                break;
            case 3:
                cadastrarEstagiario();
                break;
            case 4:
                listarFuncionarios();
                break;
            case 5:
                listarGerentes();
                break;
            case 6:
                listarDesenvolvedor();
                break;
            case 7:
                listarEstagiario();
                break;
            case 0:
                System.out.println("\nSistema finalizado...");
                break;
            default:
                System.out.println("\nOpção inválida. Digite novamente");
                break;
        }
    }

    public static void executar() {
        int op;
        do {
            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);
        } while (op != 0);
    }
}