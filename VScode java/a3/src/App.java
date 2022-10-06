import java.util.Scanner;

class Exp2

{

    public static void main(String args[])

    {

        int num1, num2;

        Scanner sc = new Scanner(System.in);

        {
            System.out.println("Enter first number: ");
        }

        num1 = sc.nextInt();

        {
            System.out.println("Enter second number: ");
        }

        num2 = sc.nextInt();

        if (num1 > num2)

        {
            System.out.println(num1 + " is larger");
        }

        else if (num2 > num1)

        {
            System.out.println(num2 + " is larger");
        }

        else if (num1 == num2)

        {
            System.out.println("This number is equal");
            
            
            sc.close();

        }

    }
}