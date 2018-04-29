import java.util.Scanner;

public class Test {
	
	private static Sarkýcýlar sarkicilar = new Sarkýcýlar(); 
	private static Scanner scanner = new Scanner(System.in);
	
	public static void sarkiciGoruntule() {
		sarkicilar.sarkicilariBastir();
	}
	public static void sarkiciEkle2() {
		System.out.println("Eklemek istediðiniz þarkýcýnýn ismi: ");
		String isim = scanner.nextLine();
		sarkicilar.sarkiciEkle(isim);
	}
	public static void sarkiciGuncelle() {
		System.out.println("Güncellemek istediðiniz pozisyon(1,2,3...)");
		int position = scanner.nextInt();
		scanner.nextLine();
		String yeni_isim= scanner.nextLine();
		sarkicilar.sarkiciGuncelle(yeni_isim, (position-1));
		
	}
	public static void sil() {
		System.out.println("Silmek istediðiniz pozisyon(1,2,3...)");
		int pozisyon = scanner.nextInt();
		sarkicilar.sarkiciSil(pozisyon-1);

	}
	public static void sarkiciAra() {
		System.out.println("Aramak istediðiniz þarkýcý");
		String isim= scanner.nextLine();
		sarkicilar.sarkiciAra(isim);
	}
	
	
	public static void islemleriBastir() {
		System.out.println("\t 0-Ýþlemleri görüntüle.");
		System.out.println("\t 1-Þarkýcýlarý görüntüle.");
		System.out.println("\t 2-Þarkýcý ekle.");
		System.out.println("\t 3-Þarkýcý güncelle.");
		System.out.println("\t 4-Þarkýcý sil.");
		System.out.println("\t 5-Þarkýcý ara.");
		System.out.println("\t 6-Uygulamadan çýk .");



	}
	
	public static void main(String[] args) {
		System.out.println("\t Þarkýcý uygulamasýna hoþgeldiniz");
		islemleriBastir();
		
		boolean cikis = false;
		int islem;
		
		while(!cikis) {
			System.out.println("Bir iþlem seçiniz.");
			islem = scanner.nextInt();
			scanner.nextLine();
			
			switch(islem) {
			case 0: 
				islemleriBastir();
				break;
			case 1:
				sarkiciGoruntule();
				break;
			case 2:
				sarkiciEkle2();
				break;
			case 3:
				sarkiciGuncelle();
				break;
			case 4:
				sil();
				break;
			case 5:
				sarkiciAra();
				break;
			case 6:
				cikis=true;
				System.out.println("Uygulamadan çýkýlýyor..");
				break;
			}
			
		}
		
	}
}
