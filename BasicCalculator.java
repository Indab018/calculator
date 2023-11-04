package into.java.basics;

import java.math.BigDecimal;
import java.util.Scanner;

public class BasicCalculator {
    
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        BigDecimal diff;
        float a, b, total;
        char Operator;
        char YN;
        
            System.out.print("Do you wanna Proceed using the Calculator? ");
            System.out.println("Y/N");
            YN = input.next().charAt(0);
            
            switch (YN) {
                case 'Y':
                    break;
                case 'y':
                    break;
                case 'N':
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                case 'n':
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect Character.");
            }
            
            System.out.println("Input your first number: ");
            a = input.nextFloat();
            System.out.print("Select the operator you wanna use: ");
            System.out.println("+, -, *, or /.");
            Operator = input.next().charAt(0);
            System.out.println("Input your second number: ");
            b = input.nextFloat();
            if (a > b) 
                System.out.println("The first number is greater than the second number.");
            else
                System.out.println("The first number is less than the second number.");
            
            BigDecimal input1 = new BigDecimal(a);
            BigDecimal input2 = new BigDecimal(b);
            
            switch (Operator) {
                case '+':
                    total = a + b;
                    System.out.println(a + "+" + b + "=" + total);
                    break;
                case '-':
                    total = a - b;
                    System.out.println(a + " - " + b + " = " + total);
                    diff = input1.subtract(input2);
                    System.out.println("The difference is: " + diff);
                    break;
                case '*':
                    total = a * b;
                    System.out.println(a + "*" + b + "=" + total);
                    break;
                case '/':
                    total = a / b;
                    System.out.println(a + "/" + b + "=" + total);
                    total = a % b;
                    System.out.println("The remainder is: " + total);
                    break;
            }
    }
    
}









