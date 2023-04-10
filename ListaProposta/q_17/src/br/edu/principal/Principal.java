package br.edu.principal;
//Lista proposta questão 17 - permissão de acesso com senha

import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   
		Double senha = 0.0;
		
		System.out.println("A senha é 4531");
		System.out.println(" ");
		
		System.out.print("Digite a senha: ");
		senha = sc.nextDouble();
		
		if (senha == 4531) {
		    System.out.println("Senha correta - Acesso permitido.");
		}
		
		else {
		    System.out.println("Senha incorreta - Acesso negado.");
		}
		
		}
	
	}

