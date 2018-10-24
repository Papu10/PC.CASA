package Praticando_JAVA;

import java.util.Scanner;

public class AP_4_CALCULAR_MEDIA {

	public static void main(String[] args) {
		// Calcular a media e dizer se foi aprovado ou não
		Scanner s = new Scanner (System.in);
		System.out.println("Digite sua primeira nota:");
		double n1 = s.nextDouble();
		System.out.println("Digite sua segunda nota;");
		double n2 = s.nextDouble();
	    System.out.println("Digite sua terceira nota.");
	    double n3 = s.nextDouble();
	    double media = (n1+n2+n3)/3;
	    		if (media >= 7) {
	    			System.out.println ("Aprovado");
	    		}
	    		if (media <7) {
	    			System.out.println("Reprovado");
	    		}
	    
	}

}
