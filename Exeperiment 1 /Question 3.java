Write a program to find greatest of between 3 numbers :

import java.util.Scanner;
public class GreatNo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first no.:");
        int a = sc.nextInt();
        
        System.out.println("Enter second no.:");
        int b = sc.nextInt();
        
        System.out.println("Enter third no.:");
        int c = sc.nextInt();
        
        if (a >= b && a >= c) {
            System.out.println("Greatest no is"+a);
        } else if (b >= a && b >= c) {
            System.out.println("Greatest no is"+b);
        } else {
            System.out.println("Greatest no is"+c);
        }
        
        sc.close();
    }
}


Output : 
Enter first no.: 2
Enter second no.: 5
Enter third no.: 7
Greatest no is 7
