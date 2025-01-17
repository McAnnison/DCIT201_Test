import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {

            //object for employee
            CommissionEmployee employee = new CommissionEmployee("Don", "Maskot", "111223", 10250, 0.1);


            //display
            System.out.println("Welcome. Check out your details");
            System.out.println("Your Initial Employee details: " + employee);
            System.out.println("Enter your new gross sales: ");
            double newGrossSales = input.nextDouble();
            employee.setGrossSales(newGrossSales);

            System.out.println("Enter your new commission rate: ");
            double newCommissionRate = input.nextDouble();
            employee.setCommissionRate(newCommissionRate);

            //updated details
            System.out.println("\nYour new employee details: \n" + employee);

            //to display calculated earnings
            System.out.printf("Your earnings: %.2f\n" , employee.Earnings());
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter a valid number.");
        } finally {
            input.close();
        }


    }
}

