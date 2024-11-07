package String_Programs;

import java.util.Scanner;

public class Reverse_String_Keyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String obj=sc.nextLine();
        int n=obj.length();
         
        for(int i= n-1;i>=0;i--)
        {
        	System.out.print(obj.charAt(i));
        }
        
        
        
        
        sc.close();
	}

}
