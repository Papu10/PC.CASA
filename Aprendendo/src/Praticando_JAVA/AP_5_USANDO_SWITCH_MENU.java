package Praticando_JAVA;

import java.util.Scanner;

public class AP_5_USANDO_SWITCH_MENU {

	public static void main(String[] args) {
		// Usando switch pra fazer menu
		double hora;
		int opcao;
		Scanner op = new Scanner (System.in);
		Scanner hr = new Scanner (System.in);
		System.out.println("Ol�, digite quantas horas voce tranalha por m�s:");
	    hora = hr.nextDouble();
		System.out.println("******MENU******");
		System.out.println(" ");
		System.out.println("DIGITE O NUMERO CORRESPONDENTE A SUA FUN��O:");
		System.out.println(" ");
		System.out.println("1-PRODU��O.");
		System.out.println("2-ADMINISTRATIVO");
		opcao = op.nextInt();
		switch(opcao) {
		case 1 :
			System.out.println("SAL�RIO FINAL"+hora *10);
		break;
		case 2 :
			System.out.println("Sal�rio FINAL"+ hora * 12);
			break;
		}

	}

}
