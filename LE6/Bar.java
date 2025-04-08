public class Bar {
    public static void main(String[] args) {
        Beverage drink1 = new AlcoholDecorator(new Tea(), "Rum");
        System.out.println(drink1.getDescription() + " $" + drink1.cost());

        Beverage drink2 = new AlcoholDecorator(new Coffee(), "Gin");
        System.out.println(drink2.getDescription() + " $" + drink2.cost());

        // Chain it up: Tea + Rum + Gin
        Beverage wildMix = new AlcoholDecorator(
                             new AlcoholDecorator(
                               new Tea(), "Rum"), "Gin");
        System.out.println(wildMix.getDescription() + " $" + wildMix.cost());
    }
}
