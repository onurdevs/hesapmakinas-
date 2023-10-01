package hesapmakinesi;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c;

		double d = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("Birinci sayıyı giriniz: ");
		a = scan.nextInt();

		System.out.print("İkinci sayıyı giriniz: ");
		b = scan.nextInt();

		System.out.println("İşlem giriniz: \n 1- Toplama \n 2- Çıkarma \n 3- Çarpma \n 4- Bölme");
		c = scan.nextInt();

		switch (c) {
		case 1:
			d = a + b;
			break;

		case 2:
			d = a - b;
			break;

		case 3:
			d = a * b;
			break;
		case 4:
			if (b == 0) {
				System.err.println("Bir sayı 0 a bölünemez");
				break;
			}
			d = a / b;
			break;

		default:
			System.out.println("Lütfen geçerli bir işlem numarası giriniz!");
			break;
		}

		System.out.println("Sonuç: " + d);

	}

}
