package br.edu.principal;
//Lista proposta questão 18 - verificação de maioridade

import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   
		int idade = 0;
		System.out.print("Digite a sua idade: ");
		idade = sc.nextInt();
		
		System.out.println(" ");
		
		if (idade >= 18) {
		    System.out.println("Você é maior de idade.");
		}
		
		else {
		    System.out.println("Você é menor de idade.");
		}
		
		}

	}


