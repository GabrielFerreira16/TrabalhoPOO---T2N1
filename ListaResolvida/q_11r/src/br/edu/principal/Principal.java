package br.edu.principal;
//Lista resolvida questão 11 - horário inicial e final do jogo

import java.util.*;
public class Principal {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    
		int horaI, minI, horaF, minF, horaD, minD = 0;
		
		System.out.println("Digite o horário inicial do jogo: ");
		System.out.print("Hora - ");
		horaI = sc.nextInt();
		System.out.print("Minuto - ");
		minI = sc.nextInt();
		System.out.println("O horário inicial foi: "+horaI+":"+minI);
		
		System.out.println(" "); // meu pc não tem barra invertida, então estou usando isso para separar as linhas.
		
		System.out.println("Digite o horário final do jogo: ");
		System.out.print("Hora - ");
		horaF = sc.nextInt();
		System.out.print("Minuto - ");
		minF = sc.nextInt();
		System.out.println("O horário final foi: "+horaF+":"+minF);
		
		System.out.println(" ");
		
		if (minI > minF) {
		    minF = minF + 60;
		    horaF = horaF - 1;
		}
		
		if (horaI > horaF) {
		    horaF = horaF + 24;
		}
		
		minD = minF - minI;
		horaD = horaF - horaI;
		System.out.println("O jogo durou "+horaD+" hora(s) e "+minD+" minutos.");
		
	}


	}


