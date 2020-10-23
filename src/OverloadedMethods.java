public class OverloadedMethods {
/*    public static void printArray(T[] inputArray){
        for(T element:inputArray){
            System.out.printf("%s ",element);
        }
        System.out.println();
    }
    will not compile
 */
    public static void printArray(Integer[] inputArray){
        for(Integer element: inputArray){
            System.out.printf("%s ",element);
        }
        System.out.println();
    }
    public static void printArray(Double[] inputArray){
        for(Double element: inputArray){
            System.out.printf("%s ",element);
        }
        System.out.println();
    }
    public static void printArray(Character[] inputArray){
        for(Character element:inputArray){
            System.out.printf("%s ",element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*Array initialization*/
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
}
