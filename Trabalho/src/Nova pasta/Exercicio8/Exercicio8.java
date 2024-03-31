public class Exercicio8{
    public static void main(String[] args) {
        // Criando algumas pizzas com sabores diferentes
        Pizza pizza1 = new Pizza("Pepperoni", 35.0);
        Pizza pizza2 = new Pizza("Frango com Catupiry", 40.0);
        Pizza pizza3 = new Pizza("Vegetariana", 38.0);

        Pedido pedido = new Pedido();

        // Adicionando pizzas ao pedido
        pedido.adicionarPizza(pizza1);
        pedido.adicionarPizza(pizza2);
        pedido.adicionarPizza(pizza3);

        // Exibindo relatório do pedido
        pedido.exibirRelatorio();
    }
}