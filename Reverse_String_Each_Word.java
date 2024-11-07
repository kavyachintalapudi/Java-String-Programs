package String_Programs;

public class Reverse_String_Each_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="My Name is Bond James Bond";
		String [] s2 = s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			for(int j = s2[i].length()-1;j>=0;j--)
			{
				System.out.print(s2[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}
