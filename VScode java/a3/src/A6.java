import java.util.Scanner;
 class Main 
{
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of values to input : 4");
		System.out.print("enter a integer:"); int n1 = sc.nextInt();
		System.out.print("enter a integer:"); int n2 = sc.nextInt();
		System.out.print("enter a integer:"); int n3 = sc.nextInt();
		System.out.print("enter a integer:"); int n4 = sc.nextInt();
		 
		 int Small = n1;
		 
		 if(n2 < Small){Small=n2;}
		 if(n3 < Small){Small=n3;}
		 if(n4 < Small){Small=n4;}
		 System.out.println('\n');
		
		 System.out.println("the smallest is: " + Small);
         sc.close();
		
		
	}
}