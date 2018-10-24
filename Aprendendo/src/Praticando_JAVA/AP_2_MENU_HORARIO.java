package Praticando_JAVA;

import java.util.Scanner;

public class AP_2_MENU_HORARIO {

	public static void main(String[] args) {
		 Scanner s = new Scanner (System.in);
		
		System.out.println ("DIGITE A LETRA CORRESPONDENTE AO TURNO QUE VOCÊ ESTUDA:");
		System.out.println("   ");
		System.out.println("1 - MATUTINO");
		System.out.println("2 - VESPERTINO");
		System.out.println("3 - NOTURNO");
	int opcao =  s.nextInt();
	if (opcao== 1){
		System.out.println ("BOM DIA");
	}
	if (opcao== 2){
		System.out.println ("BOA TARDE");
	
	}
	if (opcao== 3){
		System.out.println ("BOA NOITE");
	
	}
	}
}
