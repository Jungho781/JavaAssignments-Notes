public class InvalidNumberException extends Exception{
    public InvalidNumberException(){
        super("Invalid input. Enter a positive number");
    }
    public InvalidNumberException(String message){
        super(message);
    }
}

