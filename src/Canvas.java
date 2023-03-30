import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private int width;
    private int height;
    private List<Element> elements = new ArrayList<>();

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void addElement(Element gf) {
        elements.add(gf);
    }

    public List<Element> getElements() {
        return elements;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<svg width=\""+this.width+"\" height=\""+this.height+"\">\n");
        for (Element gf: elements) {
            sb.append("\t");
            sb.append(gf.toString());
        }
        sb.append("</svg>");
        return sb.toString();
    }
}
