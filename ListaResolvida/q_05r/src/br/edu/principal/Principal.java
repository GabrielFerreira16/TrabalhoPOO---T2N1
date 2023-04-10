package br.edu.principal;
// Lista resolvida questão 5 - ordem crescente e decrescente
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    
			System.out.println("Digite 3 números em ordem crescente. ");
			
			Double num1 = 0.0;
			System.out.print("Primeiro número: ");
			num1 = sc.nextDouble();
			
			Double num2 = 0.0;
			System.out.print("Segundo número: ");
			num2 = sc.nextDouble();
			
			Double num3 = 0.0;
			System.out.print("Terceiro número: ");
			num3 = sc.nextDouble();
			
			Double num4 = 0.0;
			System.out.print("Agora digite um número fora de ordem: ");
			num4 = sc.nextDouble();
			
			if (num4 > num3) { 
			    System.out.println("A ordem decrescente é: "+ (num4) +" - "+ (num3) +" - "+ (num2) +" - "+ (num1));
			}
			
			if (num4 > num2 && num4 < num3) {
			    System.out.println("A ordem decrescente é: "+ (num3) +" - "+ (num4) +" - "+ (num2) +" - "+ (num1));
			}
			
			if (num4 > num1 && num4 < num2) {
			    System.out.println("A ordem decrescente é: "+ (num3) +" - "+ (num2) +" - "+ (num4) +" - "+ (num1));
			}
			
			if (num4 < num1) { 
			    System.out.println("A ordem decrescente é:" + (num3) +" - "+ (num2) +" - "+ (num1) +" - "+ (num4));
			}
			
		}

	}


