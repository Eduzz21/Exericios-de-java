import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um novo carro
        Carro meuCarro = new Carro("Ford", "Fiesta", 2020, "ABC1234");

       
        meuCarro.acelerar(50);

      
        System.out.println("Informações do Carro:");
        meuCarro.exibirInformacoes();

        
        meuCarro.frear(20);

        
        System.out.println("\nInformações do Carro após frear:");
        meuCarro.exibirInformacoes();

        scanner.close();
    }
}