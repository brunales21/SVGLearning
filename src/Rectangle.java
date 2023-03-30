public class Rectangle extends GeometricFigure {

    public Rectangle(String color, Size size, String text, Position position) {
        super(Shape.rect, color, text, size, position);
    }

    @Override
    public String toString() {
        return  "<"+super.getShape()+" x=\""+super.getPosition().getX()+"\" y=\""+super.getPosition().getY()+"\" width=\""+super.getSize().getWidth()+"\" height=\""+super.getSize().getHeight()+"\" transform=\"translate(0, 0)\" fill=\""+this.getColor()+"\"/>\n" +
                "\t<text x=\""+((super.getPosition().getX()+super.getSize().getWidth()/2)+"\" y=\""+(super.getPosition().getY()+super.getSize().getHeight()/2))+"\" text-anchor=\"middle\" alignment-baseline=\"middle\" fill=\"white\" font-size=\"20\">"+this.getText()+"</text>\n";
    }
}
