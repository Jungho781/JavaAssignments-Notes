public class Triangle extends TwoDimensionalShape {
    private double base,height;
    public Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    public double getBase(){return base;}
    public double getHeight() {return height;}
    @Override
    public double getArea(){
        return getBase()*getHeight()/2;
    }
}
