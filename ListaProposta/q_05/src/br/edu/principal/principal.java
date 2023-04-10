package br.edu.principal;
//Lista proposta questão 5 - tabela de operações entre dois números

import java.util.*;


public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   
		Double num1, num2 = 0.0;
		int op = 0;
		
		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		num2 = sc.nextDouble();
		
		System.out.println(" ");
		
		System.out.println("[ 1 - Média entre os números digitados / 2 - Diferença do maior pelo menor / 3 - Produto entre os números digitados / 4 - Divisão do primeiro pelo segundo ]");
	    System.out.print("Escolha uma das operações acima: ");
		op = sc.nextInt();
		
		System.out.println(" ");
		
		if (op == 1) {
		    System.out.println("A média entre os números digitados é: "+ (num1+num2)/2);
		}
		
		else if (op == 2) {
		    if (num1 > num2) {
		        System.out.println("A diferença do maior pelo menor é: "+ (num1 - num2));
		    }
		    
		    else if (num2 > num1) {
		        System.out.println("A diferença do maior pelo menor é: "+ (num2 - num1));
		    }
		    
		}
		
		else if (op == 3) {
		    System.out.println("O produto entre os números digitados é: "+ (num1 * num2));
		}
		
		else if (op == 4) {
		    if (num2 == 0) {
		        System.out.println("Nenhum número pode ser dividido por zero.");
		    }
		    
		    else {
		        System.out.println("o primeiro número dividido pelo segundo é igual à: "+ (num1 / num2));
		    }
		}  
		
		else {
		    System.out.println("ERRO - Operação inexistente");
		}
		    
		}


	}


