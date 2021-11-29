package tutorial1;
import java.util.*;
public class secondsamllestelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;     
        System.out.println("Enter the size of the array");
        n=sc.nextInt();  
        
        int arr[]=new int[n];   
       System.out.println("Enter the array");  
       for(int i=0;i<n;i++)     
       {
           arr[i]=sc.nextInt();
       }
              
       for(int i=0;i<n;i++)    
       {
           for(int j=i+1;j<n;j++)     
           {
               if(arr[i]<arr[j])     
               {
                   int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
       }
       
       System.out.println("Second Largest element is "+arr[n-2]);   
       sc.close();
   }
	
  
}  
  