public class Cube extends ThreeDimensionalShape {
    private double edge;
    public Cube(double edge){this.edge=edge;}
    public double getEdge(){return edge;}
    @Override
    public double getArea(){
        return 6*Math.pow(getEdge(),2);
    }
    @Override
    public double getVolume(){
        return Math.pow(getEdge(),3);
    }
}
