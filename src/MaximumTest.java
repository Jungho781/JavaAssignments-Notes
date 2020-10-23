public class MaximumTest {
    public static void main(String args[]){
        System.out.printf("Maximum of %d, %d and %d is %d%n",
                3,4,5,maximum(3,4,5));
        /**/

        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f%n",
                6.6,8.8,7.7,maximum(6.6,8.8,7.7));
        System.out.printf("Maximum of %s, %s and %s is %s%n",
                "pear","apple","orange",maximum("pear","apple","orange"));
    }
    public static <T extends Comparable<T>> T maximum(T x,T y,T z){

        /*only objects of classes that implement interface Comparable<T> can use this method
        * Comparable<T> is known as the type parameter's upper bound. Object is the upper bound
        * by default, so an object of any type can be used*/

        T max=x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        return max;
    }
    /*relational operator > can't be used with reference types
    * generic interfaces lets users specify with 1 interface declaration a set of related types.
    * ex. integer1 and integer2 can be compared with integer1.compareTo(integer2)
    *
    * generic methods can be overloaded like normal methods. A class can provide 2+ generic
    * methods that specify the same method name but different method parameters.
    * They can also be overloaded by non-generic methods. When the compiler encounters a method call,
    * it searches for the method declaration that best matches the method name and the argument types
    * specified in the call. An error occurs if 2+ overloaded methods could be considered best matches.
    * ex. printArray can be overloaded with a version specific to String
    * which outputs the String in a tabular format*/
}
