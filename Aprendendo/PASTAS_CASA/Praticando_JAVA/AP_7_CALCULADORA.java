package Praticando_JAVA;

import java.util.Scanner;

public class AP_7_CALCULADORA {

	public static void main(String[] args) {
		// CALCULADORA
		int opcao;
		double numero1;
		double numero2;
		Scanner op = new Scanner(System.in);
		Scanner n1 = new Scanner(System.in);
		Scanner n2 = new Scanner(System.in);
		
System.out.println("Digite um numero");
 numero1 = n1.nextDouble();
 System.out.println("Digite o segundo numero");
 numero2 = n2.nextDouble();
   System.out.println("****** MENU ******");
   System.out.println(" ");
   System.out.println("DIGITE O N�MERO CORRESPONDENTE A OPERA��O DESEJADA;");
   System.out.println("1- ADI��O.");
   System.out.println("2- SUBTRA��O.");
   System.out.println("3- DIVIS�O.");
   System.out.println("4- MULTIPLICA��O.");
   opcao = op.nextInt();
   switch(opcao) {
   case 1:
	   System.out.println("OPERA��O ESCOLHIDA = SOMA");
       System.out.println(numero1 +"+"+ numero2 +"="+ (numero1 + numero2));
       break;
   case 2:
	   System.out.println("OPERA��O ESCOLHIDA = SUBTRA��O");
       System.out.println(numero1 +"-"+ numero2 +"="+ (numero1 - numero2));
       break;
   case 3:
	   System.out.println("OPERA��O ESCOLHIDA = DIVIS�O");
       System.out.println(numero1 +"/"+ numero2 +"="+ (numero1 / numero2));
       break;
   case 4:
	   System.out.println("OPERA��O ESCOLHIDA = MULTIPLICA��O");
       System.out.println(numero1 +"x"+ numero2 +"="+ (numero1 * numero2));
       break;
       default:
    	   System.out.println("OP��O INV�LIDA");
    	   break;
	}
	}
}
