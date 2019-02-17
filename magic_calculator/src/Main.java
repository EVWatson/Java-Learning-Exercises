import java.util.Scanner;

public class Main {

    public static int calculateMonthlySalary(int annualSalary) {
        return annualSalary / 12;
    };

    public static int calculateMagicYear(int workStartYear) {
        return workStartYear + 65;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the magic year calculator! ");

        Scanner getInput = new Scanner(System.in);


        System.out.println("Enter First Name: ");

        String firstName = getInput.nextLine();


        System.out.println("Enter Last Name: ");

        String lastName = getInput.nextLine();


        String fullName = firstName + " " + lastName;


        System.out.println("Enter annual salary: ");

        int mySalary = getInput.nextInt();

        mySalary = calculateMonthlySalary(mySalary);


        System.out.println("Enter work start year: ");

        int startWork = getInput.nextInt();

        startWork = calculateMagicYear(startWork);


        System.out.println("Your magic age details are: ");

        System.out.println("Name: " + fullName);
        System.out.println("Monthly salary: " + mySalary);
        System.out.println("Magic Year: " + startWork);
    }
}



//enter first name
//enter last name
// PRINT full name
//enter annual salary
// >> divide annual salary by 12, then print monthly salary
// enter work start year
// add 65 to work start year, then print magic year



//Magic year = start year + 65
//Monthly salary = annual salary / 12 (rounded up)
//Round to whole dollar, >+50 c round up, otherwise round down
