import java.util.Random;

public class RockNRollah {

    public static void main(String[] args) {
        Random die1=new Random();
        Random die2=new Random();
        int rolls=36000000;
        int[] frequency=new int[13];
        
        for (int roll=1;roll<=rolls;roll++){
            ++frequency[1+die1.nextInt(6)+1+die2.nextInt(6)];
        }
        System.out.println("Results after "+rolls+" rolls:");
        System.out.printf("%s%10s%n","Value","Frequency");
        for(int sum=2;sum<frequency.length;sum++){
            System.out.printf("%4d%10d%n",sum,frequency[sum]);
        }
    }
}
