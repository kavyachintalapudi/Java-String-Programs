package String_Programs;

public class Reprated_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="thisisajavaprogram";
		int count=0;
		for(int i=0;i<s1.length()-1;i++) 
		{
			if(s1.charAt(i)==' ')
				continue;
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					System.out.println(s1.charAt(i));
					count=1;
					break;
				}
				if(count==1)
					break;
			}
			
		}

	}

}
