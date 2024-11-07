package String_Programs;

public class First_Letter_UpperCase {

	public static void main(String[] args) {
		String str="this is java selenium class";
		String[] x = str.split(" ");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length();j++)
			{
				if(j==0)
				{
					System.out.print(Character.toUpperCase(x[i].charAt(j)));
				}
				else
				{
					System.out.print(x[i].charAt(j));
				}
			}
			System.out.print(" ");
		}

	}

}
