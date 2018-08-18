package com.personal;



public class PaviProfile implements IProfile {

	@Override
	public void myBasicInofo() {
		System.out.println( ProfileConstants.FIRSTNAME+ "  pavithra");
		System.out.println(ProfileConstants.LASTNAME+" palanisamy");
		System.out.println(ProfileConstants.AGE+" 21");
	}

	@Override
	public void myHobbies() {

		System.out.println("My Hobbies is  cooking");
	}

}
