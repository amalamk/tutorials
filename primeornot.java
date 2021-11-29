package tutorial1;
import java.util.*;
public class primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the no");
   int n = sc.nextInt();
	 int i=1,c=0;
	 for(i=1;i<=n;i++) 
	 {            
	     if(n%i==0)
	  {
	    c++;
	 }       
	}
	 
	 if(c==2)
	 {
	      System.out.println(n+" is a prime no");
	 }
	 else
	 {
	      System.out.println(n+" is a not a prime no");
	       
	 }
	     
	 sc.close();        
   }
	 
    
}
