package com.loiane.curso.aula19;

public class Ex01 {

	public static void main(String[] args) {
		
		
		double[][] nota = new double[3][4];
		
		nota[0][0] = 10;
		nota[0][1] = 10;
		nota[0][2] = 5;
		nota[0][3] = 6;
		
		nota[1][0] = 10;
		nota[1][1] = 10;
		nota[1][2] = 5;
		nota[1][3] = 6;
		
		nota[2][0] = 10;
		nota[2][1] = 10;
		nota[2][2] = 5;
		nota[2][3] = 6;
		
		for(int i = 0; i < nota.length; i++) {
			for(int j = 0; j < nota[i].length; j++) {
				System.out.println(nota[i][j]);
			}
			System.out.println("\n");
		}
	}
}
