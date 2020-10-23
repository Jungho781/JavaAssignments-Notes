import java.util.ArrayList;
import java.util.NoSuchElementException;

/*Generic Classes provide a means for describing the concept of a class in a type-independent manner.
* We can then instantiate type-specific objects of the generic class
*
* A generic class declaration looks like a regular one, but the name is followed by a type-parameter selection
* Same with generic methods, the type selection of a generic class can have multiple type parameters separated by commas.
* */

public class Stack <E>{
    //E represents the element type the Stack will manipulate
    private final ArrayList<E> elements;//ArrayList stores stack elements
    //No argument constructor creates stack of default size
    public Stack(){
        this(10);//default stack size
        /*can also be called directly to create a Stack with a specified initial capacity.*/
    }
    public Stack(int capacity){
        int initCapacity=capacity>0 ? capacity:10;//validate constructor argument
        elements=new ArrayList<E>(initCapacity);//create ArrayList of specified capacity or 10 if invalid capacity.
    }
    //push element onto stack
    public void push(E pushValue){
        elements.add(pushValue); //place pushValue on Stack
    }
    //return the top element if not empty; else throw exception
    public E pop(){
        if(elements.isEmpty()){
            throw new NoSuchElementException("Stack is empty, cannot pop");
        }
        //remove and return top element of Stack
        return elements.remove(elements.size()-1);
    }
}
