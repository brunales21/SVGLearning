import java.util.Objects;

public abstract class GeometricFigure extends Element {
    private Shape shape;
    private String color;

    public GeometricFigure(Shape shape, String color, String text, Size size, Position position) {
        super(text, position, size);
        this.shape = shape;
        this.color = color;
    }


    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    @Override
    public abstract String toString();

}
