package testes;
import java.util.Scanner;

public class Condicional1 {

	public static void main(String[] args) {
		// APRENDENDO CONDICIONAL IF
		Scanner s = new Scanner (System.in);
		System.out.println("Digite um numero");
		int n1 = s.nextInt();
		System.out.println("Digite outro numero");
		int n2 = s.nextInt();
		if (n1>n2) {
			System.out.println ("O numero  "+ n1 +"  � o maior");
		} else {
			System.out.println("O numero  "+ n1 +"   � o maior");
		}
// DEU CERTOOOOO
		// ACHO QUE O "else" � o senao
		
	}

}
