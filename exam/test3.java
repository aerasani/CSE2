import java.util.Scanner;
public class test3{
public static void main (String [] argc){
	while (true){
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter a number from 1 - 7, 0 to quit");
	int user = input.nextInt();
	if (user == 0){
	System.out.println("Not a day");
	return;
	}
	System.out.println("The day you entered is: " +convertToDay(user));

}
}
	public static String convertToDay(int day){
	int yo = day;
	String days = "";
	switch (yo){
	case 1: days = "Monday";
					break;
	case 2: days = "Tuesday";
					break;
	case 3: days = "Wednesday";
					break;
	case 4: days = "Thursday";
						break;
	case 5: days = "Friday";
					break;
	case 6: days = "Saturday";
						break;
	case 7: days = "Sunday";
						break;
	}
	 return days;
	}
}
