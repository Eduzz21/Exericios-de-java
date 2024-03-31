import java.util.Scanner;

public class Exercicio6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        //Função para adicionar os contatos
        agenda.adicionarContato(new Contato("Andre", "45523422"));
        agenda.adicionarContato(new Contato("Caique", "5234523"));

        System.out.println("Digite o nome do contato que deseja buscar:");
        String nomeBusca = scanner.nextLine();
        Contato contatoEncontrado = agenda.buscarContato(nomeBusca);
        if (contatoEncontrado != null) {
            System.out.println("\nContato encontrado:");
            System.out.println("Nome: " + contatoEncontrado.getNome());
            System.out.println("Telefone: " + contatoEncontrado.getTelefone());
        } else {
            System.out.println("Contato não encontrado.");
        }

        scanner.close();
    }
}