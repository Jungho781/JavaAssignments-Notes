public class GenericMethodTest {
    public static void main (String args[]){
        Integer[] intArray={1,2,3,4,5,6};
        Double[] doubleArray={1.1,2.2,3.3,4.4,5.5,6.6,7.7};
        Character[] charArray={'H','E','L','L','O'};

        System.out.printf("Array intArray contains: ");
        printArray(intArray);
        System.out.printf("Array doubleArray contains: ");
        printArray(doubleArray);
        System.out.printf("Array charArray contains: ");
        printArray(charArray);

    }
    public static <T> void printArray(T[] inputArray){
        for(T element: inputArray){
            System.out.printf("%s ",element);
        }
        System.out.println();
    }
    /*If compiler can't match a method call to a (non)generic method declaration,
    * it will create a compilation error
    *
    * If the compiler can't find a method declaration that exactly matches a method call
    * but does find 2+ methods that can, a compilation error occurs
    *
    * Erasure: replacement of type-parameter section with the actual types. Defaults to type Object*/
}
