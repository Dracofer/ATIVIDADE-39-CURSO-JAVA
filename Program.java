package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		double mAlta = 0;
		double mBaixa = 100;
		double nHomens = 0;
		double mAltura = 0;
		double altura = 0;
		double nMulheres = 0;

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Altura da " + "%d" + "a pessoa: ", i + 1);
			altura = sc.nextDouble();
			System.out.printf("Genero da " + "%d" + "a pessoa: ", i + 1);
			char genero = sc.next().charAt(0);
			if (genero == 'M') {
				nHomens = nHomens + 1;
			} else {
				mAltura += altura;
				nMulheres = nMulheres + 1;
			}
			if (altura < mBaixa) {
				mBaixa = altura;
			}
			if (altura > mAlta) {
				mAlta = altura;
			}
			vect[i] = new Product(altura, genero, mAlta, mBaixa, nHomens, mAltura, nMulheres);
		}

		double mediaAlturaMulher = mAltura / nMulheres;

		System.out.printf("Menor Altura: %.2f%n", mBaixa);
		System.out.printf("Maior Altura: %.2f%n", mAlta);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulher);
		System.out.printf("Numero de homens = %.0f%n", nHomens);
		sc.close();
	}
}
