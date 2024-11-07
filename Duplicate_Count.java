 package String_Programs;

public class Duplicate_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="javaseleniumclasses";
		for(int i=0;i<str.length();i++)
		{
			int count=1;
			char c1=str.charAt(i);
			if(c1!='#')
			{
				for(int j=i+1;j<str.length();j++)
				{
					char c2=str.charAt(j);
					if(c1==c2)
					{
						count=count+1;
					}
				}
			}
			if(count>1)
			{
				System.out.println(str.charAt(i)+" --> "+count);
			}
			str=str.replace(str.charAt(i),'#');
		}

	}

}
