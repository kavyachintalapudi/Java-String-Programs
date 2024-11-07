package String_Programs;

public class UpperCase_LowerCse_SpecialSysmbols_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Thisisa**Java123Class&&982";
		int size=str.length();
		System.out.println("Size:"+size);
		int uc=0;
		int lc=0;
		int sc=0;
		for(int i=0;i<size;i++)
		{
			char c=str.charAt(i);
			if(Character.isUpperCase(c)) {
				uc=uc+1;
			}
			else if(Character.isLowerCase(c)) {
				lc=lc+1;
			}
			else {
				sc=sc+1;
			}
		}
		System.out.println("UpperCase Count:"+uc);
		System.out.println("LowerCase Count:"+lc);
		System.out.println("SpecialCharacter Count:"+sc);

	}

}
