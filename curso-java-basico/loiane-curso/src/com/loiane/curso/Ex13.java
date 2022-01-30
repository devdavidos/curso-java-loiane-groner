/*
 	Faça um program que pergunte quanto você ganha por hora e o número de horas trabalhadas no 
 	mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 
 	11% para o importo de renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos 
 	dê:
 	
 	. Salário Bruto
 	A: Quanto pagou ao INSS
 	B: quanto pagou ao sindicato
 	C: O salário líquido
 	D: Calcule os descontos e o salário líquido:
 */
package com.loiane.curso;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex13 {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			DecimalFormat decimal = new DecimalFormat("0.00");
			
			
			System.out.println("Quanto você ganha por hora: ");
			double valorHora = input.nextDouble();
			
			System.out.println("O número de horas trabalhadas esse mês: ");
			double horasTrabalhadas = input.nextDouble();
			
			double salarioBruto = horasTrabalhadas * valorHora;
			double impostoRenda = (salarioBruto / 100) * 11;
			double inss = (salarioBruto / 100) * 8;
			double sindicato = (salarioBruto / 100) * 5;
			double descontos = impostoRenda + inss + sindicato;
			double salarioLiquido = salarioBruto - descontos;
			
			System.out.println("Salário Bruto: R$ " + salarioBruto);
			System.out.println("Desconto Imposto de Renda: R$ " + impostoRenda);
			System.out.println("Desconto INSS: R$ " + inss);
			System.out.println("Desconto Sindicato: R$ " + sindicato);
			System.out.println("Total de imposto pagos: R$ " + descontos);
			System.out.println("Salário Líquido: " + salarioLiquido);
		}
		

	}

}
