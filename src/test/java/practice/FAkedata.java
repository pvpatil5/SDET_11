package practice;

import com.github.javafaker.Faker;

public class FAkedata {

	public static void main(String[] args) {

		Faker faker = new Faker();
		String fname=faker.name().firstName();
		System.out.println(fname);
		String bgroup=faker.name().bloodGroup();
		System.out.println(bgroup);
		System.out.println(faker.phoneNumber().cellPhone());
		System.out.println(faker.address().fullAddress());

	}

}
