import java.util.Scanner;

public class CalculatorBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.println("Enter height (m): ");
        double height = scanner.nextDouble();

        double bmi_c = height * height;
        double bmi = weight/bmi_c;

        System.out.println("BMI is : "+bmi);

        if (bmi < 18.5){
            System.out.println("Classification is: underweight");
        } else if (bmi < 24.9) {
            System.out.println("Classification is: normal weight");
        } else if (bmi < 29.9) {
            System.out.println("Classification is: overweight");
        } else if (bmi < 34.9){
            System.out.println("Classification is: Obesity grade 1");
        } else if (bmi < 39.9) {
            System.out.println("Classification is: Obesity grade 2");
        } else {
            System.out.println("Classification is: Obesity grade 3");
        }
        scanner.close();
    }
}