/*
 	Fa�a um programa para o c�lculo de uma folha de pagamento, sabendo que os descontos s�o do
 	Imposto de renda, que depende do
 */
package com.loiane.curso.aula15;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Quando voc� ganha por hora: ");
			double valorHora = scan.nextDouble();
			
			System.out.println("Quantas horas voc� trabalhou esse m�s: ");
			double horasTrabalhadas = scan.nextDouble();
			
			double salarioBruto = horasTrabalhadas * valorHora;
			double impostoRenda = (salarioBruto / 100) * 5;
			double sindicato = (salarioBruto / 100) * 3;
			double fgts = (salarioBruto / 100) * 11;
			double inss = (salarioBruto / 100) * 10;
			
			double descontos = impostoRenda + sindicato + inss;
			double salarioLiquido = salarioBruto - descontos;
			
			if(salarioBruto <= 900) {
			
				System.out.println("Salario Bruto: R$ " + salarioBruto);
				System.out.println("IR: R$ Insento");
				System.out.println("Sindicato: " + sindicato);
				System.out.println("+ FGTS: R$ " + fgts);
				System.out.println("INSS: R$ " + inss);
				System.out.println("Total de descontos: R$ " + descontos);
				System.out.println("Sal�rio l�quido: R$ " + salarioLiquido);
			} else if(salarioBruto > 900 && salarioBruto <= 1500) {
				
				System.out.println("Salario Bruto: R$ " + salarioBruto);
				System.out.println("IR - 5%: R$ " + impostoRenda);
				System.out.println("Sindicato: " + sindicato);
				System.out.println("+ FGTS: R$ " + fgts);
				System.out.println("INSS: R$ " + inss);
				System.out.println("Total de descontos: R$ " + descontos);
				System.out.println("Sal�rio l�quido: R$ " + salarioLiquido);
			} else if(salarioBruto > 1500 && salarioBruto <= 2500) {
				
				System.out.println("Salario Bruto: R$ " + salarioBruto);
				System.out.println("IR -10%: R$ " + ((salarioBruto / 100) * 10));
				System.out.println("Sindicato: " + sindicato);
				System.out.println("+ FGTS: R$ " + fgts);
				System.out.println("INSS: R$ " + inss);
				System.out.println("Total de descontos: R$ " + descontos);
				System.out.println("Sal�rio l�quido: R$ " + salarioLiquido);
			} else {
				System.out.println("Salario Bruto: R$ " + salarioBruto);
				System.out.println("IR -20%: R$ " + ((salarioBruto / 100) * 20));
				System.out.println("Sindicato: " + sindicato);
				System.out.println("+ FGTS: R$ " + fgts);
				System.out.println("INSS: R$ " + inss);
				System.out.println("Total de descontos: R$ " + descontos);
				System.out.println("Sal�rio l�quido: R$ " + salarioLiquido);
			}

		}
	}
}
