import java.util.ArrayList;

public class Sarkýcýlar {
	
	private ArrayList<String> sarkici_listesi =  new ArrayList<String>();
	
	public void sarkicilariBastir() {
		System.out.println("Þarkýcý listesinde "+ sarkici_listesi.size() + " kadar þarkýcý var");
		for(int i=0; i < sarkici_listesi.size();i++) {
			System.out.println((i+1) + " Þarkýcý : " + sarkici_listesi.get(i)  );
		}
	}
	
	public  void sarkiciEkle(String isim) {
		sarkici_listesi.add(isim);
		System.out.println("Þarkýcý listesi güncellendi.");
	}
	
	public void sarkiciGuncelle(String yeni_isim, int position) {
		sarkici_listesi.set(position, yeni_isim);
		System.out.println("Þarkýcý listesi güncellendi.");

	}
	public void sarkiciSil(int pozisyon) {
		String isim= sarkici_listesi.get(pozisyon);
		sarkici_listesi.remove(pozisyon);
		System.out.println(isim + "isimli þarkýcý listeden silindi.");

	}
	public void sarkiciAra(String sarkici_ismi) {
		int pozisyon = sarkici_listesi.indexOf(sarkici_ismi);
		if(pozisyon>=0) {
			System.out.println("Þarkýcý bulundu.");
			System.out.println(sarkici_ismi + "isimli þarkýcý "+ (pozisyon+1)+ " . pozisyonda");
		}
		else {
			System.out.println("Þarkýcý bulunamadý.");

		}
	}
	

}
