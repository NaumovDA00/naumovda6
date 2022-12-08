package N62;

public enum Model {
    SKODA("Skoda"),
    OPEL("Opel"),
    MAZDA("Mazda"),
    LEXUS("Lexus"),
    LADA("LADA");

    private final String name;
    Model(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
