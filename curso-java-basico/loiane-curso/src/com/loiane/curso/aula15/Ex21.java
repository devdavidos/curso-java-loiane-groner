package com.loiane.curso.aula15;

import java.util.Scanner;
public class Ex21 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
			
			System.out.println("1- Gasolina 2- Alcool");
			int escolhaCombustivel = scan.nextInt();
			
			System.out.print("Quantos litros vai por: ");
			double quantidade = scan.nextDouble(); 
			
			double valorAlcool = quantidade * 1.90;
			double descontoAlcoolBaixo = (valorAlcool / 100) * 3;
			double descontoAlcoolAlto = (valorAlcool / 100) * 5;
			
			double valorGasolina = quantidade * 2.50;
			double descontoGasolinaBaixo = (valorGasolina / 100) * 4;
			double descontoGasolinaAlto = (valorGasolina / 100) * 6;
			
			
			if(escolhaCombustivel == 1 && quantidade <= 20) {
				System.out.println("Total de gasolina: " + quantidade + " litros.");
				System.out.println("Valor total: R$ " + valorGasolina);
				System.out.println("Desconto: 4% R$ " + descontoGasolinaBaixo);
			} else if(escolhaCombustivel == 1 && quantidade > 20) {
				System.out.println("Total de gasolina: " + quantidade + " litros.");
				System.out.println("Valor total: R$ " + valorGasolina);
				System.out.println("Desconto: 6% R$ " + descontoGasolinaAlto);
			} else if(escolhaCombustivel == 2 && quantidade <= 20) {
				System.out.println("Total de alcool: " + quantidade + " litros.");
				System.out.println("Valor total: R$ " + valorAlcool);
				System.out.println("Desconto: 3% R$ " + descontoAlcoolBaixo);
			} else if(escolhaCombustivel == 2 && quantidade > 20) {
				System.out.println("Total de Alcool: " + quantidade + " litros.");
				System.out.println("Valor total: R$ " + valorAlcool);
				System.out.println("Desconto: 5% R$ " + descontoAlcoolAlto);
			} else {
				System.out.println("Invalido!");
			}
			
		}

	}

}
