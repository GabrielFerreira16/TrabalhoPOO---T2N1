package br.edu.principal;
//Lista proposta questão 22 - idade, peso e grupo de risco

import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade = 0;
		Double peso = 0.0;
		
		System.out.print("Digite a sua idade: ");
		idade = sc.nextInt();
		
		System.out.print("Digite o seu peso: ");
		peso = sc.nextDouble();
		
		System.out.println(" ");
		System.out.println("Quanto menor for o nível de risco, mais perigoso. ");
		
		if (idade < 20) {
		   
		    if (peso < 60) {
		        System.out.println("Risco 9.");
		    }
		    
		    else if (peso >= 60 && peso <=90) {
		        System.out.println("Risco 8.");
		    }
		    
		    else if (peso > 90) {
		        System.out.println("Risco 7.");
		    }
		}
		
		else if (idade >= 20 && idade <= 50) {
		    
		    if (peso < 60) {
		        System.out.println("Risco 6.");
		    }
		    
		    else if (peso >= 60 && peso <=90) {
		        System.out.println("Risco 5.");
		    }
		    
		    else if (peso > 90) {
		        System.out.println("Risco 4.");
		    }
		}
		
		else if (idade > 50) {
		   
		    if (peso < 60) {
		        System.out.println("Risco 3.");
		    }
		    
		    else if (peso >= 60 && peso <=90) {
		        System.out.println("Risco 2.");
		    }
		    
		    else if (peso > 90) {
		        System.out.println("Risco 1.");
		    }
		}
		    
		}

	}

