import java.util.Scanner;

public class Annuity {
    public static void main (String[] args){
    /*Annuity payment calculator

    The formula for calculating the annuity payment (A) is the following ratio: A=K*(P/(1+P)-M-1),
    where K is the loan amount, P is the interest rate, and M is the number of months.
     */

        Scanner scanner = new Scanner(System.in);

        //Inputs
        System.out.println("What is the loan amount? ");
        int loan = scanner.nextInt();

        System.out.println("How many Years? ");
        int termInYears = scanner.nextInt();

        System.out.println("What is the interest rate? ");
        double interestRate = scanner.nextDouble();

        // Math for calculations

        interestRate /= 100.0;
        double monthlyRate = interestRate / 12.0;
        int termInMonths = termInYears * 12;

        //print results
        double monthlyPayment =
                (loan*monthlyRate) /
                        (1-Math.pow(1+monthlyRate, -termInMonths));

        System.out.print(monthlyPayment);
