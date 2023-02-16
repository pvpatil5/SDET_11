package practice;

public class Reverse1 {

	public static void main(String[] args) {
		String name = "hyderabad";
		String revere="";
		
		char ch[]=name.toCharArray();
		
		for (int i = ch.length-1; i >=0 ; i--) 
		{
			revere=revere+ch[i];
		}
		System.out.println(revere);
	}

}
