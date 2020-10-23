public class Tetrahedron extends ThreeDimensionalShape {
    private double baseWidth,baseHeight,height;
    public Tetrahedron(double baseWidth,double baseHeight,double height){
        this.baseWidth=baseWidth;
        this.baseHeight=baseHeight;
        this.height=height;
    }
    public double getBaseWidth(){return baseWidth;}
    public double getBaseHeight(){return baseHeight;}
    public double getHeight(){return height;}
    @Override
    public double getArea(){
        return 4*getBaseWidth()*getBaseHeight()/2;
    }
    @Override
    public double getVolume(){
        return (getBaseWidth()*getBaseHeight()/2)*getHeight()/3;
    }

}
