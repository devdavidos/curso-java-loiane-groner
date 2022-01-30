/*
 	As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe
 	contraram para desenvolver o programa que calculará os reajustes.
 	- Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte
 	critério, baseado no salário atual:
 	- Salários até R$ 280,00 (incluindo) : aumento de 20%
 	- salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
 	- salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
 	- salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na
 	tela.
 	- o salário antes do reajuste;
 	- o percentual de aumento aplicado;
 	- o valor do aumento;
 	- o novo salário, após o aumento.
 */
package com.loiane.curso.aula15;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner (System.in)) {
			
			System.out.println("Digite seu salário atual: R$ ");
			double salario = scan.nextDouble();
			
			if(salario <= 280) {
				System.out.println("Aumento de 20%! \nSeu novo salário: R$ " + ((salario / 100) * 120) + "\nAumento de R$: " + ((salario / 100) * 20));
			} else if(salario > 280 && salario <= 700) {
				System.out.println("Aumento de 15%! \nSeu novo salário: R$ " + ((salario / 100) * 115) + "\nAumento de R$: " + ((salario / 100) * 15));
			} else if(salario > 700 && salario <= 1500) {
				System.out.println("Aumento de 10%! \nSeu novo salário: R$ " + ((salario / 100) * 110) + "\nAumento de R$: " + ((salario / 100) * 10));
			} else {
				System.out.println("Aumento de 5%! \nSeu novo salário: R$ " + ((salario / 100) * 105) + "\nAumento de R$: " + ((salario / 100) * 5));
			}
		}

	}

}
