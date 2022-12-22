package practice;

import java.util.Random;

public class RandomNUm {

	public static void main(String[] args) {


		// i have to create a account but i cannont create duplicate account
		// example : Pavan , Pavan123 PAvan 234, Pavan111
		
		String name ="pavan";
		int num = 123;
		
		Random random = new Random();
		int a=random.nextInt(999);
		System.out.println(a);
		String newname=name+a;
		System.out.println(newname);
		
	}

}
