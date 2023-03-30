public abstract class GeometricFigure extends Element {
    private Position position;
    private Size size;
    private Shape shape;
    private String color;
    private String text;

    public GeometricFigure(Shape shape, String color, String text, Size size, Position position) {
        this.shape = shape;
        this.color = color;
        this.size = size;
        this.text = text;
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
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



    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public abstract String toString();
}
