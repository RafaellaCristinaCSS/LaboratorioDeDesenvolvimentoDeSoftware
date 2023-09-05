import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        Sistema sistema = new Sistema();
        preLoadData(sistema);
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
                    if (tipo.equals(TipoUsuario.ALUNO)) {
                        System.out.println("Escolha seu curso:");
                        String curso = scanner.next();
                        Aluno aluno = (Aluno) sistema.login(TipoUsuario.ALUNO, email, senha);
                        aluno.setCurso(sistema.getCursoPeloNome(curso));
                    }
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
                        menuAluno(usuario, running, scanner, sistema);
                    if (usuario instanceof Professor)
                        menuProfessor(usuario, running, scanner, sistema);
                    if (usuario instanceof Secretaria)
                        menuSecretaria(usuario, running, scanner, sistema);
                    if (usuario instanceof Contabilidade)
                        menuContabilidade(usuario, running, scanner, sistema);
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


    private static void menuAluno(Usuario usuario, boolean running, Scanner scanner, Sistema sistema) {
        Aluno aluno = (Aluno) usuario;
        while (running) {
            System.out.println("Menu do Aluno");
            System.out.println("Selecione uma opção:");
            System.out.println("1. Imprimir disciplinas atualmente matriculas");
            System.out.println("2. Listar disciplinas que faltam fazer");
            System.out.println("3. Matricular na disciplina");
            System.out.println("4. Cancelar matricula na disciplina na disciplina");
            System.out.println("5. Logout");
            int choice = scanner.nextInt();
            String aux;
            switch (choice) {
                case 1:
                    aluno.imprimirDisciplinasMatriculadas();
                    break;
                case 2:
                    aluno.imprimirDisciplinasRestantes();
                    break;
                case 3:
                    System.out.println("Digite o nome da disciplina que você deseja matricular");
                    aux = scanner.next();
                    aluno.matricularNaDisciplina(aux);
                    break;
                case 4:
                    System.out.println("Digite o nome da disciplina que você deseja cancelar a matricula");
                    aux = scanner.next();
                    aluno.cancelarMatricula(aux);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }


    }

    private static void menuProfessor(Usuario usuario, boolean running, Scanner scanner, Sistema sistema) {
        System.out.println("Menu do Professor");
        Professor professor = (Professor) usuario;
        // professor.buscarAlunosPorDisciplinas();
        while (running) {
            System.out.println("Menu do Professor");
            System.out.println("Selecione uma opção:");
            System.out.println("1. Listar alunos matriculados nas disciplinas");
            System.out.println("2. Logout");
            int choice = scanner.nextInt();
            String aux;
            switch (choice) {
                case 1:
                    professor.buscarAlunosPorDisciplinas();
                    break;
                case 2:
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
    private static void menuSecretaria(Usuario usuario, boolean running, Scanner scanner, Sistema sistema) {
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
    private static void menuContabilidade(Usuario usuario, boolean running, Scanner scanner, Sistema sistema) {
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

    private static void preLoadData(Sistema sistema) {
        Aluno aluno1 = new Aluno("João", "joao@email.com", "senha123", "12345678901");

        Aluno aluno2 = new Aluno("Maria", "maria@email.com", "senha456", "98765432101");
        sistema.adicionarAluno(aluno1);
        sistema.adicionarAluno(aluno2);


        Professor professor1 = new Professor("Professor A", "professorA@email.com", "senha111", "11122233344");
        Professor professor2 = new Professor("Professor B", "professorB@email.com", "senha222", "55566677788");
        sistema.adicionarProfessor(professor1);
        sistema.adicionarProfessor(professor2);

        Disciplina disciplinaAedsUm = new Disciplina("AEDS1", 1,true, true, 1);
        Disciplina disciplinaAedsDois = new Disciplina("AEDS2", 2, true, true, 2);
        Turma turmaAedsUm = new Turma(disciplinaAedsUm, professor1, new ArrayList<>(), new Date());
        Turma turmaAedsDois = new Turma(disciplinaAedsDois, professor2, new ArrayList<>(), new Date());
        professor1.addTurmasMinistradas(turmaAedsUm);
        professor2.addTurmasMinistradas(turmaAedsDois);
        Map<String, Turma> turmasEngSoft = new HashMap<>();
        turmasEngSoft.put(disciplinaAedsUm.getNome(), turmaAedsUm);
        turmasEngSoft.put(disciplinaAedsDois.getNome(), turmaAedsDois);
        Curso curso1 = new Curso("EngSoft", 180, List.of(disciplinaAedsUm, disciplinaAedsDois), turmasEngSoft);
        sistema.adicionarCurso(curso1);
        aluno1.setCurso(sistema.getCursoPeloNome("EngSoft"));
        aluno2.setCurso(sistema.getCursoPeloNome("EngSoft"));
    }
}
