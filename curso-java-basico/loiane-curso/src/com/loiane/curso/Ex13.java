/*
 	Fa�a um program que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no 
 	m�s. Calcule e mostre o total do seu sal�rio no referido m�s, sabendo-se que s�o descontados 
 	11% para o importo de renda, 8% para o INSS e 5% para o sindicato, fa�a um programa que nos 
 	d�:
 	
 	. Sal�rio Bruto
 	A: Quanto pagou ao INSS
 	B: quanto pagou ao sindicato
 	C: O sal�rio l�quido
 	D: Calcule os descontos e o sal�rio l�quido:
 */
package com.loiane.curso;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex13 {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			DecimalFormat decimal = new DecimalFormat("0.00");
			
			
			System.out.println("Quanto voc� ganha por hora: ");
			double valorHora = input.nextDouble();
			
			System.out.println("O n�mero de horas trabalhadas esse m�s: ");
			double horasTrabalhadas = input.nextDouble();
			
			double salarioBruto = horasTrabalhadas * valorHora;
			double impostoRenda = (salarioBruto / 100) * 11;
			double inss = (salarioBruto / 100) * 8;
			double sindicato = (salarioBruto / 100) * 5;
			double descontos = impostoRenda + inss + sindicato;
			double salarioLiquido = salarioBruto - descontos;
			
			System.out.println("Sal�rio Bruto: R$ " + salarioBruto);
			System.out.println("Desconto Imposto de Renda: R$ " + impostoRenda);
			System.out.println("Desconto INSS: R$ " + inss);
			System.out.println("Desconto Sindicato: R$ " + sindicato);
			System.out.println("Total de imposto pagos: R$ " + descontos);
			System.out.println("Sal�rio L�quido: " + salarioLiquido);
		}
		

	}

}
