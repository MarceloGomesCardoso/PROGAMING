import java.util.Scanner;

public class Main {
    private static Agenda agenda = new Agenda();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            exibirMenu();
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    adicionarContato();
                    break;
                case 2:
                    listarContatos();
                    break;
                case 3:
                    atualizarContato();
                    break;
                case 4:
                    removerContato();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("1. Adicionar contato");
        System.out.println("2. Listar contatos");
        System.out.println("3. Atualizar contato");
        System.out.println("4. Remover contato");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarContato() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Contato contato = new Contato(nome, endereco, telefone, email);
        agenda.adicionarContato(contato);
        System.out.println("Contato adicionado com sucesso!");
    }

    private static void listarContatos() {
        System.out.println("Lista de contatos:");
        for (Contato contato : agenda.listarContatos()) {
            System.out.println(contato);
        }
    }

    private static void atualizarContato() {
        System.out.print("Nome do contato a ser atualizado: ");
        String nome = scanner.nextLine();

        System.out.print("Novo Nome: ");
        String novoNome = scanner.nextLine();
        System.out.print("Novo Endereço: ");
        String novoEndereco = scanner.nextLine();
        System.out.print("Novo Telefone: ");
        String novoTelefone = scanner.nextLine();
        System.out.print("Novo Email: ");
        String novoEmail = scanner.nextLine();

        Contato novoContato = new Contato(novoNome, novoEndereco, novoTelefone, novoEmail);
        agenda.atualizarContato(nome, novoContato);
        System.out.println("Contato atualizado com sucesso!");
    }

    private static void removerContato() {
        System.out.print("Nome do contato a ser removido: ");
        String nome = scanner.nextLine();
        agenda.removerContato(nome);
        System.out.println("Contato removido com sucesso!");
    }
}
