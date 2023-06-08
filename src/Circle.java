public class Circle extends GeometricFigure {

    public Circle(String color, String text, Size size, Position position) {
        super(Shape.circle, color, text, size, position);
    }

    @Override
    public String toString() {
        return "<"+super.getShape()+" cx=\""+super.getPosition().getX()+"\" cy=\""+super.getPosition().getY()+"\" r=\""+super.getSize().getWidth()+"\" transform=\"translate(-"+super.getSize().getWidth()/2+", 0)\" fill=\""+this.getColor()+"\"/>\n" +
                "\t<text x=\""+((super.getPosition().getX())+"\" y=\""+(super.getPosition().getY()+super.getSize().getHeight()/2))+"\" text-anchor=\"middle\" alignment-baseline=\"middle\" fill=\"white\" font-size=\"20\">"+this.getName()+"</text>\n";

    }
}
