import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        Sistema sistema = new Sistema();

        while (running) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Sign Up");
            System.out.println("2. Login");
            System.out.println("3. Sair");
            System.out.print("Opção: ");


            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Opção de Sign Up escolhida.");
                    System.out.println("Digite o email:");
                    String email = scanner.next();
                    System.out.println("Digite o nome:");
                    String nome = scanner.next();
                    System.out.println("Digite a senha:");
                    String senha = scanner.next();
                    System.out.println("Digite o cpf:");
                    String cpf = scanner.next();
                    System.out.println("Digite o tipo de Usuario:");
                    TipoUsuario tipo = TipoUsuario.valueOf(scanner.next());
                    sistema.signUp(tipo, nome, email, cpf, senha);
                    break;
                case 2:
                    System.out.println("Opção de Login escolhida.");
                    System.out.println("Digite o email:");
                    String emailLogin = scanner.next();
                    System.out.println("Digite a senha:");
                    String senhaLogin = scanner.next();
                    System.out.println("Digite o tipo de Usuario:");
                    TipoUsuario tipoLogin = TipoUsuario.valueOf(scanner.next());
                    Usuario usuario = sistema.login(tipoLogin, emailLogin, senhaLogin);
                    if (usuario instanceof Aluno)
                        menuAluno(usuario, running, scanner);
                    if (usuario instanceof Professor)
                        menuProfessor(usuario, running, scanner);
                    if (usuario instanceof Secretaria)
                        menuSecretaria(usuario, running, scanner);
                    if (usuario instanceof Contabilidade)
                        menuContabilidade(usuario, running, scanner);
                        if (usuario == null)
                        throw new Error("Usuario não existe");
                    break;
                case 3:
                    System.out.println("Saindo do programa.");
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }


    private static void menuAluno(Usuario usuario, boolean running, Scanner scanner) {
        Aluno aluno = (Aluno) usuario;
        aluno.matricularDisciplinas();
        while (running) {
            System.out.println("Menu do Aluno");
            System.out.println("Selecione uma opção:");
            System.out.println("1. Op 1");
            System.out.println("2. Op 2");
            int choice = scanner.nextInt();
        }


    }

    private static void menuProfessor(Usuario usuario, boolean running, Scanner scanner) {
        System.out.println("Menu do Professor");
        Professor professor = (Professor) usuario;
        professor.buscarAlunosPorDisciplinas();
        while (running) {
            System.out.println("Menu do Professor");
            System.out.println("Selecione uma opção:");
            System.out.println("1. Op 1");
            System.out.println("2. Op 2");
            int choice = scanner.nextInt();
        }
    }
    private static void menuSecretaria(Usuario usuario, boolean running, Scanner scanner) {
        System.out.println("Menu do Secretaria");
        Secretaria secretaria = (Secretaria) usuario;
        // secretaria.gerarCurriculoPorSemestre();
        while (running) {
            System.out.println("Menu do Secretaria");
            System.out.println("Selecione uma opção:");
            System.out.println("1. Op 1");
            System.out.println("2. Op 2");
            int choice = scanner.nextInt();
        }
    }
    private static void menuContabilidade(Usuario usuario, boolean running, Scanner scanner) {
        System.out.println("Menu do Contabilidade");
        Contabilidade contabilidade = (Contabilidade) usuario;
        // contabilidade.cobrarAluno();
        while (running) {
            System.out.println("Menu do Contabilidade");
            System.out.println("Selecione uma opção:");
            System.out.println("1. Op 1");
            System.out.println("2. Op 2");
            int choice = scanner.nextInt();
        }
    }
}
