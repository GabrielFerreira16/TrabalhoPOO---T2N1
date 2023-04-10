package br.edu.principal;
//Lista resolvida questão 16 - reajuste de preço do supermercado

import java.util.*;


public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   
		Double pre, venda, novoPre = 0.0;
		
		System.out.print("Digite o preço do produto: ");
		pre = sc.nextDouble();
		System.out.print("Digite a média de vendas mensal do produto: ");
		venda = sc.nextDouble();
		
		System.out.println(" ");
		
		if (venda < 500 || pre < 30) {
		    novoPre = pre + (pre * 10 /100);
		    System.out.println("O novo preço deve ser de: R$ "+novoPre);
		}
		
		else if ((venda >= 500 && venda < 1200) || (pre >= 30 && pre < 80)) {
		    novoPre = pre + (pre * 15 / 100);
		    System.out.println("O novo preço deve ser de: R$ "+ novoPre);
		}
		
		else if (venda > 1200 || pre >= 80) {
		    novoPre = pre - (pre * 20 / 100);
		    System.out.println("O novo preço deve ser de: R$ "+ novoPre);
		}

		}

	}

