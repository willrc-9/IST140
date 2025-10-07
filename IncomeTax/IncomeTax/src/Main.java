import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Input your marital status (single/married):");

        String maritalStatus = scnr.nextLine();
        maritalStatus = maritalStatus.toLowerCase();

        System.out.println("Input your annual income:");
        double annualIncome = scnr.nextDouble();
        double taxRate = 0;

        if (maritalStatus.equals("single")){
            if (annualIncome <= 30000) {
                taxRate = 15;
            }
            else {
                taxRate = 25;
            }
        }
        else {
            if (annualIncome <= 30000) {
                taxRate = 12;
            }
            else{
                taxRate = 20;
            }
        }

        double resultTaxed = annualIncome * (taxRate / 100);

        System.out.print("Based on a status of \"" + maritalStatus + "\" and an annual income of $");
        System.out.printf("%.2f", annualIncome);
        System.out.print("\nthe income tax is ");
        System.out.printf("%.2f", taxRate);
        System.out.print("% of ");
        System.out.printf("%.2f", annualIncome);
        System.out.print(", which equals ");
        System.out.printf("%.2f", resultTaxed);
        System.out.println(".");
    }
}
