public class main {
    public static void main(String[] args) {

        Server serveur = new Server();
        PizzaBuilder pizzaHawaienneBuilder = new PizzaHawaienneBuilder();
        PizzaBuilder pizzaNorvegienneBuilder = new PizzaNorvegienneBuilder();

        serveur.setPizzaBuilder( pizzaHawaienneBuilder);
        serveur.constructPizza();

        Pizza pizza = serveur.getPizza();
        System.out.println(pizza);

        serveur.setPizzaBuilder( pizzaNorvegienneBuilder);
        serveur.constructPizza();

        pizza = serveur.getPizza();
        System.out.println(pizza);
    }
}
