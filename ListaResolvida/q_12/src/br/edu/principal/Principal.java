package br.edu.principal;
//Lista resolvida questão 12 - cargo e aumento de um funcionário

import java.util.*;


public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   
		Double sal, aumento, novoSal = 0.0;
		int cargo = 0;
		
	    System.out.println("1 - Escrituário / 2 - Secretário / 3 - Caixa / 4 - Gerente / 5 - Diretor");
	    
	    System.out.println(" ");
	    
	    System.out.print("Digite o cargo do funcionário: ");
	    cargo = sc.nextInt();
	    
	    System.out.print("Digite o salário: ");
	    sal = sc.nextDouble();
	    
	    System.out.println(" ");
	    
	    if (cargo == 1) {
	        System.out.println("O cargo é Escrituário.");
	        aumento = sal*50 /100.0;
	        System.out.println("O aumento será de: R$ "+aumento);
	        novoSal = sal + aumento;
	        System.out.println("O novo salário será de: R$ "+ novoSal);
	    }
	    
	    else if (cargo == 2) {
	        System.out.println("O cargo é Secretário.");
	        aumento = sal*35 /100.0;
	        System.out.println("O aumento será de: R$ "+aumento);
	        novoSal = sal + aumento;
	        System.out.println("O novo salário será de: R$ "+ novoSal);
	    }
	    
	    else if (cargo == 3) {
	        System.out.println("O cargo é Caixa.");
	        aumento = sal*20 /100.0;
	        System.out.println("O aumento será de: R$ "+aumento);
	        novoSal = sal + aumento;
	        System.out.println("O novo salário será de: R$ "+ novoSal);
	    }
	    
	    else if (cargo == 4) {
	        System.out.println("O cargo é Gerente.");
	        aumento = sal*10 /100.0;
	        System.out.println("O aumento será de: R$ "+aumento);
	        novoSal = sal + aumento;
	        System.out.println("O novo salário será de: R$ "+ novoSal);
	    }
	    
	    else if (cargo == 5) {
	        System.out.println("O cargo é Diretor.");
	        System.out.println("Não recebe aumento.");


	        System.out.println("O salário será de: R$ "+ sal);
	    }
	    
	    else {
	        System.out.println("Cargo inêxistente.");
	    }
	  
		}

	}


