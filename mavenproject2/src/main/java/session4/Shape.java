package session4;
public abstract class Shape {
    private String bgColor;

    public Shape() {
    }

    public Shape(String bgColor) {
        this.bgColor = bgColor;
    }

    public String getBgColor() {
        return bgColor;
    }
    public abstract double getArea();
}
