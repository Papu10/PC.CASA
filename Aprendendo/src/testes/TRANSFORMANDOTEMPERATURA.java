package testes;
import java.util.Scanner;

public class TRANSFORMANDOTEMPERATURA {

	public static void main(String[] args) {
		// TRANSFORMAR A TEMPERATURA DE FARENHEIT PRA CELSIUS
		Scanner s = new Scanner (System.in);
		
		System.out.println("DIGITE A TEMPERATURA EM FARENHEIT");
		double tf = s.nextDouble();
		double conversao = (5*(tf-32)/9);
		System.out.println ("ESSA TEMPERATURA EM CELSIUS É="+conversao+"°C");
//DEU CERTO
		
	}

}
