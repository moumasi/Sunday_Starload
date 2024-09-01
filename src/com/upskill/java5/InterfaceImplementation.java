package com.upskill.java5;

public class InterfaceImplementation implements Interface {
	@Override
	public  void iDoor() {
		System.out.println("My car is Tesla");
	}
	@Override
	public String icity() {
		return "NewYork";
	}
	@Override
	public  int iwheel() {
		return 4;
		
	}
	@Override
	public  void iDoor(int door) {
		System.out.println("My car has door "+ door);
	}
	@Override
	public void iDoor(String glass) {
		System.out.println("My car has door "+ glass);
	}
	

}
