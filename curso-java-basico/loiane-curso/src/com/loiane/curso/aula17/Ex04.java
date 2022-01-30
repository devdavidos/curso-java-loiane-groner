package com.loiane.curso.aula17;

public class Ex04 {

	public static void main(String[] args) {
		
		int popA, popB, anos;
		double atualiA, atualiB;
		
		popA = 80000; popB = 200000;
		anos = 0;
		
		while(popA <= popB) {
			popA += (popA / 100) * 3;
			popB += (popB / 100) * 1.5;
			anos++;
		}
		
		System.out.println("Vai demorar: " + anos + " anos.");
	}

}
