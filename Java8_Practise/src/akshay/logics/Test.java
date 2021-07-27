package akshay.logics;

public class Test {
	
	static int getCount(String str) {
		
		int c=0;
		char ch[]= new char[str.length()];
		for(int i=0;i<str.length();i++) {
			ch[i]=str.charAt(i);
			if((i>0)&&(ch[i]!=' ') && (ch[i-1]==' ')|| ((ch[0]!=' ')&&(i==0))) {
				c++;
			}
			
		}
		
		
		return c;
		
	}

	public static void main(String[] args) {
		String str="hi hellow how r u    y";
		System.out.println(getCount(str));

	}

}
