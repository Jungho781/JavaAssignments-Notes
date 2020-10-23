public abstract class Shape {
    @Override
    public String toString(){
        return String.format("%s\n",getClass().getName());
    }
    public String getName(){
        return String.format("%s\n",getClass().getName());
    }

}
