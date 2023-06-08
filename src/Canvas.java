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

    public void addElement(Element element) {
        for (Element e: elements) {
            if (element.getPosition().equals(e.getPosition())) {
                element.setPosition(new Position(element.getPosition().getX()+200, element.getPosition().getY()));
                if (element.getPosition().getX() > this.width-element.getSize().getWidth()) {
                    element.setPosition(new Position(10, element.getPosition().getY()+150));
                }
            }
        }
        elements.add(element);
    }
    public Element getElementByName(String text) {
        for (Element e: getElements()) {
            if (e.getName().equals(text)) {
                return e;
            }
        }
        return null;
    }

    public boolean existsElement(String className) {
        return getElements().contains(getElementByName(className));
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
