package String_Programs;

public class Retain_Spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is java program of String";
		String s1=str.replace(" "," ");
		String rev=" ";
		for(int i=s1.length()-1;i>-0;i--)
		{
			rev=rev+s1.charAt(i);
			
		}
		System.out.println(rev);
		String temp=" ";
		int j=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				temp=temp+' ';
			}
			else
			{
				temp=temp+rev.charAt(j);
				j=j+1;
			}
		}
		System.out.println(temp);

	}

}
