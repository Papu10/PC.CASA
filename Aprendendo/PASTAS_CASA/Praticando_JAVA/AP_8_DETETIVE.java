package Praticando_JAVA;

import java.util.Scanner;

public class AP_8_DETETIVE {

	public static void main(String[] args) {
		//O SEGUINTE ALGORITMO FAZ 5 PERGUNTAS E O USUARIO RESPONDE SIM OU NAO. CASO O USUARIO RESPONDA 3 SIM ELE É CONSIDERADO CULPADO
		//CASO RESPONDA 2 SIM , SERA CONSIDERADO INOCENTE.
		//O CÓDIGO PERMITE APENAS RESPOSTAS COM NUMEROS 1 OU 0.
		int resultado = 0;
		int op1 , op2 , op3 , op4 , op5;
		Scanner opc = new Scanner(System.in);
		Scanner rs = new Scanner(System.in);
	
		System.out.println("TELEFONOU PARA A VÍTIMA? 1-SIM / 0-NÃO");
		op1 = opc.nextInt();
		switch(op1) {
		case 1:
			resultado++;
		break;
		case 0:
			System.out.println(" ");
			break;
		default:
			System.out.println("OPÇÃO INVÁLIDA");
			System.exit(0);
		}
		System.out.println ("ESTEVE NO LOCAL DO CRIME? 1-SIM / 0-NÃO");
		op2 = opc.nextInt();
		switch(op2) {
		case 1:
			resultado++;
			break;
		case 0:
			System.out.println(" ");
		break;
		default:
			System.out.println("OPÇÃO INVÁLIDA");
			System.exit(0);
		}
		System.out.println("MORA PERTO DA VÍTIMA? 1-SIM / 0-NÃO");
		op3 = opc.nextInt();
		switch(op3) {
		case 1:
			resultado++;
			break;
		case 0:
			System.out.println(" ");
		break;
		default:
			System.out.println("OPÇÃO INVÁLIDA");
			System.exit(0);
		}
		System.out.println("DEVIA PARA A VÍTIMA? 1-SIM / 2-NÃO");
		op4 = opc.nextInt();
		switch(op4) {
		case 1:
			resultado++;
		break;
		case 0:
			System.out.println(" ");
			break;
		default:
			System.out.println("OPÇÃO INVÁLIDA");
			System.exit(0);
		}
		System.out.println("JA TRABALHOU COM A VÍTIMA? 1-SIM / 2-NÃO");
		op5 = opc.nextInt();
		switch(op5) {
		case 1:
			resultado++;
			break;
		case 0:
			System.out.println(" ");
		break;
		default:
			System.out.println("OPÇÃO INVÁLIDA");
			System.exit(0);
		}
		if (resultado >= 3) {
			System.out.println("CULPADO!");
		}else {
			System.out.println("INOCENTE");
		}
		
	}
}

	
	

		
