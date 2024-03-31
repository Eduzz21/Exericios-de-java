import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando alguns produtos
        Produto[] produtos = {
            new Produto("Macarrão", "001", 10.99, 50),
            new Produto("Trigo", "002", 8.99, 40),
            new Produto("Farofa de Mandioca", "003", 5.99, 30),
            new Produto("Óleo de Soja", "004", 7.99, 25),
            new Produto("Açúcar", "005", 6.99, 35),
            new Produto("Café", "006", 12.99, 20),
            new Produto("Leite", "007", 3.99, 45),
            new Produto("Farinha de Trigo", "008", 4.99, 55),
            new Produto("Sal", "009", 2.99, 60),
            new Produto("Chocolate", "010", 8.49, 15)
        };

        
        for (Produto produto : produtos) {
            System.out.println("Informações do Produto:");
            produto.exibirInformacoes();
            System.out.println();
        }

        scanner.close();
    }
}