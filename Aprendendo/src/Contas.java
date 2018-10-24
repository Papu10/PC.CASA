import java.util.Scanner;

public class Contas {

	public static void main(String[] args) {
		// APRENDENDO A MANIPULAR OPERAÇÕES NO JAVA
		Scanner s = new Scanner (System.in);
		System.out.println("EAE DIGITE UM NUMERO INTEIRO");
		int n1 = s.nextInt();
		System.out.println("Agora digite outro numero inteiro");
		int n2 = s.nextInt();
		System.out.println("DIVIDENDO="+n1);
		System.out.println("DIVISOR="+n2);
		System.out.println("QUOCIENTE="+n1/n2);
		System.out.println("RESTO="+n1%n2);
  //FUNCIONOU
	}

}
