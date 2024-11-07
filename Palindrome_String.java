package String_Programs;


public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      String rev = "";
		       String str="madam";
		      int length = str.length();
		 
		      for ( int i = length - 1; i >= 0; i-- )
		         rev = rev + str.charAt(i);
		 
		      if (str.equals(rev))
		         System.out.println(" is a palindrome");
		      else
		         System.out.println(" is not a palindrome");
		
	}
}
