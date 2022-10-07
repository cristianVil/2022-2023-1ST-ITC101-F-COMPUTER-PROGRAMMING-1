import java.util.Scanner;
class  integers 
{
	public static void main(String[] args) 
    {
	            Scanner sc = new Scanner(System.in);
	      
	   
	       System.out.println("Enter first integer"); int n1 = sc.nextInt();
	      System.out.println("Enter second intger");
	      int n2 = sc.nextInt();
	      System.out.println("Enter third integer ");
	   int n3 = sc.nextInt();
	   
	    
	   int sum=0,average=0;
	   
	    System.out.println("the Sum is:"+(n1+n2+n3));
	    
	   
	      sum=(n1+n2+n3);
	      average=(sum/3);  
	     
	      System.out.println("the average is:"+ average);
	      System.out.println("the product is:"+(n1*n2*n3));
	      
	      int smallest = n1;
	      if(n2 < smallest)
	      {smallest=n2;}
	      if(n3 < smallest)
	      {smallest=n3;}
	      System.out.println("the smallest number is:"+smallest);
	      
	      int largest = n1;
	      if(largest < n2)
	      {largest=n2;}
	      if(n3 > largest)
	      {largest=n3;}
	      System.out.println("the largest number is:"+largest);
	      
	      sc.close();
	      
	}
}
