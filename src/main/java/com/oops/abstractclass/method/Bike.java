package com.oops.abstractclass.method;

public abstract class Bike {
	
	
	public abstract void run();

}

class Honda extends Bike{

	@Override
	public void run() {
		System.out.println("Running Safely!!");
		
	}
	public static void main(String[] args) {
		
		Bike obj = new bike();
		
		
	}
}
