package br.edu.principal;
//Lista proposta questão 11 - salário do funcionário e aumento 

import java.util.*;


public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   
		Double sal, aumento, novoSal = 0.0;
		
		System.out.print("Digite o salário do funcionário: ");
		sal = sc.nextDouble();
		
		System.out.println(" ");
		
		if (sal <= 300) {
		    aumento = sal * 15 / 100;
		    novoSal = sal + aumento;
		    System.out.println("O aumento será de: R$ "+aumento);
		    System.out.println("O novo salário será de: R$ "+novoSal);
		}
		
		if (sal > 300  && sal <= 600) {
		    aumento = sal * 10 / 100;
		    novoSal = sal + aumento;
		    System.out.println("O aumento será de: R$ "+aumento);
		    System.out.println("O novo salário será de: R$ "+novoSal);
		}
		
		if (sal > 600  && sal <= 900) {
		    aumento = sal * 5 / 100;
		    novoSal = sal + aumento;
		    System.out.println("O aumento será de: R$ "+aumento);
		    System.out.println("O novo salário será de: R$ "+novoSal);
		}
		
		if (sal > 900) {
		    System.out.println("Não recebe aumento.");
		    System.out.println("O salário continuará sendo de: R$ "+sal);
		}
		
		}
	}


