import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	static<T> void display(T element){
		System.out.println(element);
	}

	static void printSalaryReport(ArrayList<Employee> list) throws FileNotFoundException {
		FileOutputStream fos=new FileOutputStream("employee.csv",true);
		PrintWriter pw=new PrintWriter(fos);
		pw.println("Employee Name,Salary,Hours,Weekly Pay");
		for(int i=0;i<list.size();i++){
			pw.println(list.get(i).getFirstName()+" "+
					list.get(i).getLastName()+","+
					list.get(i).getHourlySalary()+","+
					list.get(i).getHoursWorked()+","+
					list.get(i).getHourlySalary()*list.get(i).getHoursWorked());
		}
		pw.close();
	}

	public static void main(String[] args) throws FileNotFoundException {

		int length = 0;
		/*typing a character will crash the program
		* a while loop covering the length block should prevent a crash*/

		Scanner input = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter number of employees: ");
		try{
		length = input.nextInt();
		if(length<=0) {
			throw new InvalidNumberException();
		}
		}catch (InvalidNumberException e){
			System.out.println(e.getMessage());
		}

		ArrayList<Employee> list = new ArrayList<Employee>();

		for (int counter = 0; counter < length; counter++) {

			System.out.print("enter first name of employee ");
			String firstName = keyboard.next();

			System.out.print("enter last name of employee ");
			String lastName = keyboard.next();

			System.out.print("enter employee hourly salary ");

			double salary = keyboard.nextDouble();

			System.out.print("enter hours employee worked ");
			int hours = keyboard.nextInt();
			System.out.println("");

			list.add(new Employee(firstName, lastName, salary, hours));

			/*probably need more catch try and while loops here to prevent crashes*/

		}
		for (int j=0;j<list.size();j++){
		display(list.get(j).getFirstName());
		}
		
		if(length>0){
			printSalaryReport(list);
		}
	}
}
