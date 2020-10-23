
public class IntegerSet {

    private static final int SIZE = 101;
    private boolean set[];


    public IntegerSet() {
        set = new boolean[SIZE];
    }


    public static IntegerSet union(IntegerSet setA, IntegerSet setB) {
        IntegerSet result = new IntegerSet();
        for(int i = 0; i < SIZE; i++) {

            result.set[i] = (setA.set[i] || setB.set[i]);
        }
        return result;
    }


    public static IntegerSet intersection(IntegerSet setA, IntegerSet setB) {
        IntegerSet result = new IntegerSet();
        for(int i = 0; i < SIZE; i++) {

            result.set[i] = (setA.set[i] && setB.set[i]);
        }
        return result;
    }


    public boolean insertElement(int i) {
        if(i < 0 || i >= SIZE)
            return false;
        this.set[i] = true;
        return true;
    }


    public boolean deleteElement(int i) {
        if(i < 0 || i >= SIZE)
            return false;
        this.set[i] = false;
        return true;
    }


    @Override
    public String toString() {

        String result = "{ ";
        boolean empty = true;
        for(int i = 0; i < SIZE; i++) {
            if(this.set[i] == true) {
                if(empty == false) {

                    result += " ";
                }
                else {
                    empty = false;
                }

                result += i;
            }
        }
        if(empty) {

            result += "---";
        }

        result += " }";

        return result;
    }


    public boolean isEqualTo(IntegerSet that) {
        for(int i = 0; i < SIZE; i++) {
            if(this.set[i] != that.set[i]) {
                return false;
            }
        }
        return true;
    }
}
