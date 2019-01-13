package com.tcs.generic;

public class AngleBtwTimeAndMin {

	public static void main(String[] args) {

		AngleBtwTimeAndMin ang = new AngleBtwTimeAndMin();
		System.out.println(ang.angleFinder(12, 30));
	}
	
	public int angleFinder(int hour,int min){
		
		int hourAngle = (int)((hour*60+min)*0.5);
		int minAngle = min*6;
		int angle = Math.abs(hourAngle-minAngle);
		return Math.min(360-angle, angle);
	}

}
