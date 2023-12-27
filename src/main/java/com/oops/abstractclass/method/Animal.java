package com.oops.abstractclass.method;

public abstract class Animal {
	// Abstract method (does not have method body)
		public abstract void animalSoud();

		//Regular method
		public void sleep() {
			System.out.println("Zzz");
		}
		
		static class Pig extends Animal{

			@Override
			public void animalSoud() {
				// the body of Animal sound() is provided here
				System.out.println("The pig says : wee wee");
				
			}
			
			
		}
		public static void main(String[] args) {
			Pig pig = new Pig();
			pig.animalSoud();
			
		}

}
