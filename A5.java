import java.util.Scanner;

 class Main 
 
 {
	
	public static void main(String[] args) 
    {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter number integer:");
		int n1 = sc.nextInt();
		
		String evenodd = (n1 % 2==0) ? "even" : "odd";
	System.out.println(n1 + " is " +  evenodd);
    
    sc.close();
 

	}
}