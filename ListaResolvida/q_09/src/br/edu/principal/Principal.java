package br.edu.principal;
//Lista resolvida questão 9 - data e hora do sistema
import java.util.*;
import java.time.*;

public class Principal {

	public static void main(String[] args) {
	    LocalDate localDate = LocalDate.now();
	    LocalTime localTime = LocalTime.now();
	    LocalDateTime localDateTime = LocalDateTime.now();
	    ZonedDateTime zonedDatetimeSP = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
	    
	    if (localDateTime.getMonthValue() == 1) {
	        System.out.println("Data atual: " + zonedDatetimeSP.getDayOfMonth() + " / Janeiro / " + localDateTime.getYear());
	    }
	    
	    if (localDateTime.getMonthValue() == 2) {
	        System.out.println("Data atual: " + zonedDatetimeSP.getDayOfMonth() + " / Fevereiro / " + localDateTime.getYear());
	    }
	    
	    if (localDateTime.getMonthValue() == 3) {
	        System.out.println("Data atual: " + zonedDatetimeSP.getDayOfMonth() + " / Março / " + localDateTime.getYear());
	    }
	    
	    if (localDateTime.getMonthValue() == 4) {
	        System.out.println("Data atual: " + zonedDatetimeSP.getDayOfMonth() + " / Abril / " + localDateTime.getYear());
	    }
	    
	    if (localDateTime.getMonthValue() == 5) {
	        System.out.println("Data atual: " + zonedDatetimeSP.getDayOfMonth() + " / Maio / " + localDateTime.getYear());
	    }
	    
	    if (localDateTime.getMonthValue() == 6) {
	        System.out.println("Data atual: " + zonedDatetimeSP.getDayOfMonth() + " / Junho / " + localDateTime.getYear());
	    }
	    
	    if (localDateTime.getMonthValue() == 7) {
	        System.out.println("Data atual: " + zonedDatetimeSP.getDayOfMonth() + " / Julho / " + localDateTime.getYear());
	    }
	    
	    if (localDateTime.getMonthValue() == 8) {
	        System.out.println("Data atual: " + zonedDatetimeSP.getDayOfMonth() + " / Agosto / " + localDateTime.getYear());
	    }
	    
	    if (localDateTime.getMonthValue() == 9) {
	        System.out.println("Data atual: " + zonedDatetimeSP.getDayOfMonth() + " / Setembro / " + localDateTime.getYear());
	    }
	    
	    if (localDateTime.getMonthValue() == 10) {
	        System.out.println("Data atual: " + zonedDatetimeSP.getDayOfMonth() + " / Outubro / " + localDateTime.getYear());
	    }
	    
	    if (localDateTime.getMonthValue() == 11) {
	        System.out.println("Data atual: " + zonedDatetimeSP.getDayOfMonth() + " / Novembro / " + localDateTime.getYear());
	    }
	    
	    if (localDateTime.getMonthValue() == 12) {
	        System.out.println("Data atual: " + zonedDatetimeSP.getDayOfMonth() + " / Dezembro / " + localDateTime.getYear());
	    }
	    
	    System.out.println("Hora atual: " + zonedDatetimeSP.getHour() + ":" + zonedDatetimeSP.getMinute());
	}


	}


