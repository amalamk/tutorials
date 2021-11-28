package tutorial1;
import java.util.Scanner;
public class swappingcharacters {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        String str = sc.nextLine(); 
        char[] ch = str.toCharArray(); 
        for (int i = 0; i < ch.length; i++) 
        { 
            int k = i; 
            while (i < ch.length && ch[i] != ' ')  
            {
                i++; 
            }  
            char temp = ch[k]; 
            ch[k] = ch[i - 1]; 
            ch[i - 1] = temp;
        }
        System.out.println(String.valueOf(ch)); 
        sc.close();
    } 
	 

} 