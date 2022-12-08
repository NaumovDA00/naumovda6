package N62;

public enum Color {
    RED("Красный"),
    GREEN("Зеленый"),
    BLUE("Синий"),
    WHITE("Белый"),
    BLACK("Черный");

    private final String name;
    Color(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
