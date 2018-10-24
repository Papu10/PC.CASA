import java.util.Scanner;

public class TESTE_SWITCH {

	public static void main(String[] args) {
		// TESTANDO SWITCH.
		// DEU CERTO!!!!
		// TOO HAPPY
       
		Scanner op = new Scanner(System.in);
        
        System.out.println("1-CAGAR");
        System.out.println("2-MIJAR");
        System.out.println("0-SAIR");
        int opcao = op.nextInt();
 switch(opcao) {
	 case 1 :
		 System.out.println("CAGUE!");
		 break;
	 case 2 :
		 System.out.println("MIJE");
		 break;
	 case 3 :
		 System.out.println("OK TCHAU");
		 break;
 default:
	 System.out.println ("Inválido");
 
 }

	}

}
