/*
  Faça um program que pergunte o preço de três produtos e informe qual produto você deve comprar,
  sabendo que a decisão é sempre pelo mais barato.
  
*/

package com.loiane.curso.aula15;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.println("Liquitificador eletro lux 220v, Preço: R$ ");
			double eletroLux = input.nextDouble();
			
			System.out.println("Liquitificador Consul 110v, Preço: R$ ");
			double consul = input.nextDouble();
			
			System.out.println("Liquitificador Brasstemp Bivolt, Preço: R$ ");
			double brasstemp = input.nextDouble();
			
			if(eletroLux < consul && eletroLux < brasstemp) {
				System.out.println("O Liquitificador da Eletro Lux é mais barato R$ " + eletroLux);
			} else if(consul < eletroLux && consul < brasstemp) {
				System.out.println("O liquitificador da Consul é mais barato R$ " + consul);
			} else {
				System.out.println("O liquitificador da Brasstemp é mais barato R$ " + brasstemp);
			}
		}

	}

}
