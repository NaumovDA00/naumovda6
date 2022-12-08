package N62;

public enum Auto {
    CAR1(Model.SKODA.name(),Color.RED.name(),132,6250),
    CAR2(Model.OPEL.name(),Color.BLACK.name(),145,7000),
    CAR3(Model.LEXUS.name(),Color.WHITE.name(),192,9000),
    CAR4(Model.LADA.name(),Color.GREEN.name(),115,4500),
    CAR5(Model.MAZDA.name(),Color.BLUE.name(),130,5500);

    private final String model;
    private final String color;
    private final int maxSpeed;
    private final int cost;

    Auto(String model, String color, int maxSpeed, int cost){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Model='" + model +
                ", color='" + color +
                ", maxSpeed=" + maxSpeed +
                ", cost=" + cost;
    }

}
