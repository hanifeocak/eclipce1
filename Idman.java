package pazarProjem;

public class Idman {
	private int burpee_sayisi;
	private int pushup_sayisi;
	private int situp_sayisi;
	private int squat_sayisi;


	
	
	

	public Idman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
		super();
		this.burpee_sayisi = burpee_sayisi;
		this.pushup_sayisi = pushup_sayisi;
		this.situp_sayisi = situp_sayisi;
		this.squat_sayisi = squat_sayisi;
	}

	public void hareketYap(String hareketTuru, int sayi) {
		if (hareketTuru.equals("Burpee")) {
			burpeeYap(sayi);
		} else if (hareketTuru.equals("Pushup")) {
			pushupYap(sayi);

		} else if (hareketTuru.equals("Situp")) {
			situpYap(sayi);
		} else if (hareketTuru.equals("Squat")) {
			squatYap(sayi);
			{

			}
		} else {
			System.out.println("Gecersiz hareket turu...");
		}
	}

	public void burpeeYap(int sayi) {

		if (burpee_sayisi == 0) {
			System.out.println("Yapacak burpee kalmadi ...");
		}
		if (burpee_sayisi - sayi < 0) {
			System.out.println("Hedefledigin burpeesayisini gectin.Tebrikler..");
			burpee_sayisi = 0;
			System.out.println("Kalan burpee sayisi : " + burpee_sayisi);
		} else {

			burpee_sayisi -= sayi;
			System.out.println("Kalan burpee sayisi : " + burpee_sayisi);
		}

	}

	public void pushupYap(int sayi) {

		if (pushup_sayisi == 0) {
			System.out.println("Yapacak pushup kalmadi ...");
		}
		if (pushup_sayisi - sayi < 0) {
			System.out.println("Hedefledigin pushupsayisini gectin.Tebrikler..");
			pushup_sayisi = 0;
			System.out.println("Kalan pushup sayisi : " + pushup_sayisi);
		} else {

			pushup_sayisi -= sayi;
			System.out.println("Kalan pushup sayisi : " + pushup_sayisi);
		}

	}

	public void situpYap(int sayi) {

		if (situp_sayisi == 0) {
			System.out.println("Yapacak situp kalmadi ...");
		}
		if (situp_sayisi - sayi < 0) {
			System.out.println("Hedefledigin situp sayisini gectin.Tebrikler..");
			situp_sayisi = 0;
			System.out.println("Kalan situp sayisi : " + situp_sayisi);
		} else {

			situp_sayisi -= sayi;
			System.out.println("Kalan situpsayisi : " + situp_sayisi);
		}
	}
	public void squatYap(int sayi) {

		if (squat_sayisi == 0) {
			System.out.println("Yapacak squat kalmadi ...");
		}
		if (squat_sayisi - sayi < 0) {
			System.out.println("Hedefledigin squatsayisini gectin.Tebrikler..");
			squat_sayisi = 0;
			System.out.println("Kalan squatsayisi : " + squat_sayisi);
		} else {

			squat_sayisi -= sayi;
			System.out.println("Kalan squatsayisi : " + squat_sayisi);
		}
	}
	public boolean idmanBittiMi() {
		return ( burpee_sayisi==0) && (pushup_sayisi==0) && (situp_sayisi==0) && (squat_sayisi==0);
}
	}
