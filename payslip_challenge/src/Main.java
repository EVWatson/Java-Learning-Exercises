import java.util.Scanner;

public class Main {


    public static double calculateGrossIncome(double annualSalary) {
        return annualSalary / 12;
    }



    public static double calculateIncomeTax(double annualSalary) {

        if (annualSalary <= 18200)
        {
            return 0;
        } else if (annualSalary >= 18201 && annualSalary <= 37000)
        {
            return ((annualSalary - 18200) * 0.19) / 12;

        } else if (annualSalary >= 37001 && annualSalary <= 87000)
        {
            return (3572 + (annualSalary - 37000) * 0.325) / 12;

        } else if (annualSalary >= 87001 && annualSalary <= 180000)
        {
            return (19822 + (annualSalary - 87000) * 0.37) / 12;

        } else
        {
            return (54232 + (annualSalary - 180000) * 0.45) / 12;
        }
    }

    public static double calculateNetIncome (double grossIncome, double incomeTax) {
        return grossIncome - incomeTax;
    }

    public static double calculateSuper (double grossIncome, double superRate) {
        return grossIncome * (superRate / 100);
    }



    public static void main(String[] args) {

        System.out.println("\nWelcome to the Payslip Generator!\n");
        System.out.println();


        Scanner getInput = new Scanner(System.in);


        System.out.print("Please enter your first name: ");

        String firstName = getInput.nextLine();


        System.out.print("Please enter your surname: ");

        String surname = getInput.nextLine();

        String fullName = firstName + " " + surname;


        System.out.print("Please enter your annual salary: ");

        double annualSalary = getInput.nextDouble();


        System.out.print("Please enter your super rate: ");

        double superRate = getInput.nextDouble();

        getInput.nextLine();


        System.out.print("Please enter your payment start date: ");

        String payStartDate = getInput.nextLine();


        System.out.print("Please enter your payment end date: ");

        String payEndDate = getInput.nextLine();


        String payPeriod = payStartDate + " - " + payEndDate;

        Double grossIncome = calculateGrossIncome(annualSalary);
        Double incomeTax = calculateIncomeTax(annualSalary);
        Double netIncome = calculateNetIncome(grossIncome, incomeTax);
        Double superAnnuation = calculateSuper(grossIncome, superRate);


        System.out.println("\nYour payslip has been generated:\n");

        System.out.println("Name: " + fullName);
        System.out.println("Pay Period: " + payPeriod);
        System.out.println("Gross Income: " + "$" + Math.round(grossIncome));
        System.out.println("Income Tax: " + "$" + Math.round(incomeTax));
        System.out.println("Net Income: " + "$" + Math.round(netIncome));
        System.out.println("Super: " + "$" + Math.round(superAnnuation));

        System.out.println("\nThank you for using MYOB!");
    }
}
