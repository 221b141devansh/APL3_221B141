public class AlcoholDecorator implements Beverage {
    private Beverage beverage;
    private String alcoholType;
    private double alcoholCost;

    public AlcoholDecorator(Beverage beverage, String alcoholType) {
        this.beverage = beverage;
        this.alcoholType = alcoholType;
        this.alcoholCost = getAlcoholCost(alcoholType);
    }

    private double getAlcoholCost(String type) {
        switch (type.toLowerCase()) {
            case "rum":
                return 2.5;
            case "gin":
                return 3.0;
            case "vodka":
                return 3.5;
            default:
                return 0.0; // unknown alcohol, no cost
        }
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with " + alcoholType;
    }

    @Override
    public double cost() {
        return beverage.cost() + alcoholCost;
    }
}

