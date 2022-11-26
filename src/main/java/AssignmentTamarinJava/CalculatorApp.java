package AssignmentTamarinJava;


import java.util.Scanner;


public class CalculatorApp {

    public static void main(String[] args)
    {
        // stores two numbers
        double num1, num2;

        // Take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first numbers");

        while(!sc.hasNextInt()){
            sc.next();
            System.err.print("Invalid input please enter a number: ");
        }

        // take the inputs
        num1 = sc.nextInt();

        System.out.println("Enter the second numbers");

        while(!sc.hasNextInt()){
            sc.next();
            System.err.print("Invalid input please enter a number:");
        }

        num2 = sc.nextInt();

        System.out.println("Enter the operator (+,-,*,/)");

        char op = sc.next().charAt(0);

        double o = 0;

        switch (op) {

        // case to add two numbers
        case '+':

            o = num1 + num2;

            break;

        // case to subtract two numbers
        case '-':

            o = num1 - num2;

            break;

        // case to multiply two numbers
        case '*':

            o = num1 * num2;

            break;

        // case to divide two numbers
        case '/':

            o = num1 / num2;

            break;

        default:

            System.out.println("You enter wrong input");

            break;
        }

        System.out.println("The final result:");

        System.out.println();

        // print the final result
        System.out.println(num1 + " " + op + " " + num2
                           + " = " + o);

        sc.close();
    }

}