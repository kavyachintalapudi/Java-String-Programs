package String_Programs;

public class Vowels_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java selenium classes";
		char[] vowels= {'a','e','i','o','u'};
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<vowels.length;j++)
			{
				if(str.charAt(i)==vowels[j])
				{
					count=count+1;
					break;
				}
			}
		}
		System.out.println("Vowels count:"+count);
		int consonantscount=str.length()-count;
		System.out.println("Consonants count:"+consonantscount);
		

	}

}
