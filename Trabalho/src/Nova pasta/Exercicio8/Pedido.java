import java.util.ArrayList;
import java.util.List;

class Pizza {
    String nome;
    double preco;

    public Pizza(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}

class Pedido {
    List<Pizza> pizzas;

    public Pedido() {
        this.pizzas = new ArrayList<>();
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public double calcularTotal() {
        double total = 0;
        for (Pizza pizza : pizzas) {
            total += pizza.preco;
        }
        return total;
    }

    public void exibirRelatorio() {
        System.out.println("Total de pizzas no pedido: " + pizzas.size());
        System.out.println("Valor total do pedido: R$" + calcularTotal());
    }
}
