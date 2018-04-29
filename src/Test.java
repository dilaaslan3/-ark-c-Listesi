import java.util.Scanner;

public class Test {
	
	private static Sark�c�lar sarkicilar = new Sark�c�lar(); 
	private static Scanner scanner = new Scanner(System.in);
	
	public static void sarkiciGoruntule() {
		sarkicilar.sarkicilariBastir();
	}
	public static void sarkiciEkle2() {
		System.out.println("Eklemek istedi�iniz �ark�c�n�n ismi: ");
		String isim = scanner.nextLine();
		sarkicilar.sarkiciEkle(isim);
	}
	public static void sarkiciGuncelle() {
		System.out.println("G�ncellemek istedi�iniz pozisyon(1,2,3...)");
		int position = scanner.nextInt();
		scanner.nextLine();
		String yeni_isim= scanner.nextLine();
		sarkicilar.sarkiciGuncelle(yeni_isim, (position-1));
		
	}
	public static void sil() {
		System.out.println("Silmek istedi�iniz pozisyon(1,2,3...)");
		int pozisyon = scanner.nextInt();
		sarkicilar.sarkiciSil(pozisyon-1);

	}
	public static void sarkiciAra() {
		System.out.println("Aramak istedi�iniz �ark�c�");
		String isim= scanner.nextLine();
		sarkicilar.sarkiciAra(isim);
	}
	
	
	public static void islemleriBastir() {
		System.out.println("\t 0-��lemleri g�r�nt�le.");
		System.out.println("\t 1-�ark�c�lar� g�r�nt�le.");
		System.out.println("\t 2-�ark�c� ekle.");
		System.out.println("\t 3-�ark�c� g�ncelle.");
		System.out.println("\t 4-�ark�c� sil.");
		System.out.println("\t 5-�ark�c� ara.");
		System.out.println("\t 6-Uygulamadan ��k .");



	}
	
	public static void main(String[] args) {
		System.out.println("\t �ark�c� uygulamas�na ho�geldiniz");
		islemleriBastir();
		
		boolean cikis = false;
		int islem;
		
		while(!cikis) {
			System.out.println("Bir i�lem se�iniz.");
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
				System.out.println("Uygulamadan ��k�l�yor..");
				break;
			}
			
		}
		
	}
}
