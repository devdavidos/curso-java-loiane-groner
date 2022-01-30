/*
 	As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus colaboradores e lhe
 	contraram para desenvolver o programa que calcular� os reajustes.
 	- Fa�a um programa que recebe o sal�rio de um colaborador e o reajuste segundo o seguinte
 	crit�rio, baseado no sal�rio atual:
 	- Sal�rios at� R$ 280,00 (incluindo) : aumento de 20%
 	- sal�rios entre R$ 280,00 e R$ 700,00 : aumento de 15%
 	- sal�rios entre R$ 700,00 e R$ 1500,00 : aumento de 10%
 	- sal�rios de R$ 1500,00 em diante : aumento de 5% Ap�s o aumento ser realizado, informe na
 	tela.
 	- o sal�rio antes do reajuste;
 	- o percentual de aumento aplicado;
 	- o valor do aumento;
 	- o novo sal�rio, ap�s o aumento.
 */
package com.loiane.curso.aula15;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner (System.in)) {
			
			System.out.println("Digite seu sal�rio atual: R$ ");
			double salario = scan.nextDouble();
			
			if(salario <= 280) {
				System.out.println("Aumento de 20%! \nSeu novo sal�rio: R$ " + ((salario / 100) * 120) + "\nAumento de R$: " + ((salario / 100) * 20));
			} else if(salario > 280 && salario <= 700) {
				System.out.println("Aumento de 15%! \nSeu novo sal�rio: R$ " + ((salario / 100) * 115) + "\nAumento de R$: " + ((salario / 100) * 15));
			} else if(salario > 700 && salario <= 1500) {
				System.out.println("Aumento de 10%! \nSeu novo sal�rio: R$ " + ((salario / 100) * 110) + "\nAumento de R$: " + ((salario / 100) * 10));
			} else {
				System.out.println("Aumento de 5%! \nSeu novo sal�rio: R$ " + ((salario / 100) * 105) + "\nAumento de R$: " + ((salario / 100) * 5));
			}
		}

	}

}
