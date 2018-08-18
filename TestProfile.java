package com.personal;

public class TestProfile {
   public static void  printProfile(IProfile profile) {
	   profile.myBasicInofo();
	   profile.myHobbies();
   }
  public static void main (String arg[]) {
	  IProfile myProfile =new PaviProfile();
        printProfile(myProfile);
  }
}
 