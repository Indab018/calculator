import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = calculateBMI(weight, height);

        System.out.println("Your BMI is: " + bmi);
        interpretBMI(bmi);

        scanner.close();
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static void interpretBMI(double bmi) {
        if (bmi < 17.5) {
            System.out.println("Underweight");
        } else if (bmi < 28) {
            System.out.println("Normal weight");
        } else if (bmi < 29) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}