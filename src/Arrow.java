public class Arrow extends Element{
    private GeometricFigure start;
    private GeometricFigure end;

    public Arrow(GeometricFigure start, GeometricFigure end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return  "<path d=\"M"+(this.start.getPosition().sum(new Position(start.getSize().getWidth()/2, start.getSize().getHeight()/2))) +" L"+(this.end.getPosition().sum(new Position(end.getSize().getWidth()/2, end.getSize().getHeight()/2))) +"\" stroke=\"black\" stroke-width=\"2\" marker-end=\"url(#arrowhead)\" />\n" +
                "        <defs>\n" +
                "          <marker id=\"arrowhead\" markerWidth=\"10\" markerHeight=\"7\" refX=\"0\" refY=\"3.5\" orient=\"auto\">\n" +
                "            <polygon points=\"0 0, 10 3.5, 0 7\" />\n" +
                "          </marker>\n" +
                "        </defs>\n";
    }
}
