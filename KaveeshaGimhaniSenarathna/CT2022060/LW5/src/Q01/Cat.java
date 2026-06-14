package Q01;

public class Cat extends Pet {
    private String coatColor;

    public String getCoatColor() { return coatColor; }
    public void setCoatColor(String color) { this.coatColor = color; }

    @Override
    public String speak() { return "Meow!"; }
}
