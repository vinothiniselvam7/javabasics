package com.personal;

public class VinoProfile  implements IProfile{

	@Override
	public void myBasicInofo() {
		System.out.println(ProfileConstants.FIRSTNAME+" vinothini");
		System.out.println( ProfileConstants.LASTNAME+"selavam");
		System.out.println(ProfileConstants.AGE+" 21");

		
	}

	@Override
	public void myHobbies() {
		
		System.out.println("My Hobbies is  watching TV");
	}

}
