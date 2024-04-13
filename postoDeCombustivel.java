package projetoPostoCombustivel;

import java.util.Scanner;

public class postoDeCombustivel {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double precoLitro = 0, qtdLitros = 0, desconto, total;
		
		System.out.println("Escolha o combustível: 1 gasolina, 2 álcool, 3 diesel.");
		int comb = scan.nextInt();
		
		System.out.println("Quantos litros? ");
		double litros = scan.nextDouble();
		
		if(comb == 1) {
			System.out.println(litros + " litros de gasolina! ");
			if(litros < 20) {
				precoLitro = 5.50;
			}else {
				precoLitro = 5.00;
			}
		}else if(comb == 2) {
			System.out.println(litros + " litros de álcool! ");
			if(litros < 20) {
				precoLitro = 4.90;
			}else {
				precoLitro = 4.40;
			}
		}else if(comb == 3) {
			System.out.println(litros + " litros de diesel! ");
			if(litros < 20) {
				precoLitro = 6.20;
			}else {
				precoLitro = 5.70;
			}
		}
		
		total = litros * precoLitro;
		System.out.println(litros + " litros x " + precoLitro + " = " + total);
		
		System.out.println();
		
		System.out.println("Forma de pagamento: 1 crédito, 2 débito, 3 dinheiro, 4 pix. ");
		int forma = scan.nextInt();
		
		if(forma == 1) {
			desconto = (total / 100)*0;
			System.out.println("Desconto de: " + desconto);
			System.out.println("Valor a pagar = " + (total - desconto));
		}else if(forma == 2) {
			desconto = (total / 100)*3;
			System.out.println("Desconto de: " + desconto);
			System.out.println("Valor a pagar = " + (total - desconto));
		}else if(forma == 3 || forma == 4) {
			desconto = (total / 100)*5;
			System.out.println("Desconto de: " + desconto);
			System.out.println("Valor a pagar = " + (total - desconto));
		}
		
		
		
	}

}
