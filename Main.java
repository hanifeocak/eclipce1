package pazarProjem;

import java.util.Scanner;

public class Main {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Idman Programina Hosgeldiniz...");

		String idmanlar = "Gecerli Hareketler ..\n" + "Burpee\n" + "Pushup(Sinav)\n" + "Situp(Mekik)\n" + "Squat\n";
		System.out.println("Idmanlar : ");

		System.out.println("Bir idman olusturun ..... ");
		System.out.println("Burpee Sayisi : ");
		int burpee = scan.nextInt();
		System.out.println("Pushup Sayisi : ");
		int pushup = scan.nextInt();
		System.out.println("Situp Sayisi : ");
		int situp = scan.nextInt();
		System.out.println("Squat Sayisi : ");
		int squat = scan.nextInt();
		scan.nextLine();
		Idman idman = new Idman(burpee, pushup, situp, squat);
		System.out.println("Idmaniniz Basliyor....");

		while (idman.idmanBittiMi() == false) {
			System.out.println("Hareket turu(Burpee,Pushup,Situp,Squat) : ");
			String hareketTuru = scan.nextLine();
			System.out.println("Kac adet hareket yapacaksiniz");
			int sayi = scan.nextInt();
			scan.nextLine();

			idman.hareketYap(hareketTuru, sayi);

		}

	}
}
