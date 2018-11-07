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
   System.out.println("DIGITE O NÚMERO CORRESPONDENTE A OPERAÇÃO DESEJADA;");
   System.out.println("1- ADIÇÃO.");
   System.out.println("2- SUBTRAÇÃO.");
   System.out.println("3- DIVISÃO.");
   System.out.println("4- MULTIPLICAÇÃO.");
   opcao = op.nextInt();
   switch(opcao) {
   case 1:
	   System.out.println("OPERAÇÃO ESCOLHIDA = SOMA");
       System.out.println(numero1 +"+"+ numero2 +"="+ (numero1 + numero2));
       break;
   case 2:
	   System.out.println("OPERAÇÃO ESCOLHIDA = SUBTRAÇÃO");
       System.out.println(numero1 +"-"+ numero2 +"="+ (numero1 - numero2));
       break;
   case 3:
	   System.out.println("OPERAÇÃO ESCOLHIDA = DIVISÃO");
       System.out.println(numero1 +"/"+ numero2 +"="+ (numero1 / numero2));
       break;
   case 4:
	   System.out.println("OPERAÇÃO ESCOLHIDA = MULTIPLICAÇÃO");
       System.out.println(numero1 +"x"+ numero2 +"="+ (numero1 * numero2));
       break;
       default:
    	   System.out.println("OPÇÃO INVÁLIDA");
    	   break;
	}
	}
}
