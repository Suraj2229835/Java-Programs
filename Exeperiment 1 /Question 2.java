Question 2 : Write a program to use switch case operator

  import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first no:");
        int a = sc.nextInt();

        System.out.println("Enter second no:");
        int b = sc.nextInt();

        System.out.println("Enter operator: +, -, *, /");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Addition: " + (a + b));
                break;

            case '-':
                System.out.println("Subtraction: " + (a - b));
                break;

            case '*':
                System.out.println("Product: " + (a * b));
                break;

            case '/':
                System.out.println("Modulus: " + (a % b));
                break;

            default:
                System.out.println("Invalid no");
                break;
        }
    }
}

Output:
Enter first no: 20
Enter second no: 2
Enter operator: +, -, *, / : +
Addition: 22
