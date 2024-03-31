import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

    
        System.out.println("Soma: " + Calculadora.adicionar(num1, num2));
        System.out.println("Subtração: " + Calculadora.subtrair(num1, num2));
        System.out.println("Multiplicação: " + Calculadora.multiplicar(num1, num2));
        
        
        if (num2 != 0) {
            System.out.println("Divisão: " + Calculadora.dividir(num1, num2));
        } else {
            System.out.println("Não é possivel fazer divisao por 0.");
        }
        
        scanner.close(); 
    }
}