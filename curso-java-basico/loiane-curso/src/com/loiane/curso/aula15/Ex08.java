/*
  Fa�a um program que pergunte o pre�o de tr�s produtos e informe qual produto voc� deve comprar,
  sabendo que a decis�o � sempre pelo mais barato.
  
*/

package com.loiane.curso.aula15;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.println("Liquitificador eletro lux 220v, Pre�o: R$ ");
			double eletroLux = input.nextDouble();
			
			System.out.println("Liquitificador Consul 110v, Pre�o: R$ ");
			double consul = input.nextDouble();
			
			System.out.println("Liquitificador Brasstemp Bivolt, Pre�o: R$ ");
			double brasstemp = input.nextDouble();
			
			if(eletroLux < consul && eletroLux < brasstemp) {
				System.out.println("O Liquitificador da Eletro Lux � mais barato R$ " + eletroLux);
			} else if(consul < eletroLux && consul < brasstemp) {
				System.out.println("O liquitificador da Consul � mais barato R$ " + consul);
			} else {
				System.out.println("O liquitificador da Brasstemp � mais barato R$ " + brasstemp);
			}
		}

	}

}
