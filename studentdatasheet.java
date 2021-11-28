package tutorial1;
import java.util.Scanner;

public class studentdatasheet {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int no = sc.nextInt();
		int r[]=new int[no];
		
		int m1[]=new int[no];
		int m2[]=new int[no];
		int m3[]=new int[no];
		
		for (int i=0; i<no; i++)
		{
			System.out.print("\nEnter roll num: ");
			r[i] = sc.nextInt();
			System.out.print("Enter marks in subject1: ");
			m1[i] = sc.nextInt();
			System.out.print("Enter marks in subject2: ");
			m2[i] = sc.nextInt();
			System.out.print("Enter marks in subject3: ");
			m3[i] = sc.nextInt();
		}
	
		 
		sc.close();
	}
}
