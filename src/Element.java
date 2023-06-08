import java.util.Objects;

public class Element {
    private String text;
    private Position position;
    private Size size;

    public Element(String text, Position position, Size size) {
        this.text = text;
        this.position = position;
        this.size = size;
    }
    public Element(String text, Position position) {
        this(text, position, new Size(0, 0));
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getName() {
        return this.text;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return Objects.equals(text, element.text);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }
}
