package Men�;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ur�nler {
	public int urunkod;
	String isim;
	public int fiyat;
	int kalori;
	int maliyet;
	
	public Ur�nler(int urunkod, String isim, int fiyat, int kalori, int maliyet) {
		
		this.urunkod = urunkod;
		this.isim = isim;
		this.fiyat = fiyat;
		this.kalori = kalori;
		this.maliyet = maliyet;
	}
	public static  Ur�nler olustur() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�r�n kodu");
		int urunkod=scan.nextInt();
		System.out.println("ad�");
		String isim = scan.next();
		System.out.println("fiyat");
		int fiyat = scan.nextInt();
		System.out.println("kalori"); 
		int kalori = scan.nextInt();
		System.out.println("maliyet");
      int maliyet =scan.nextInt();
      Ur�nler urun = new Ur�nler(urunkod , isim , fiyat , kalori , maliyet);
      return urun;
      
      
}
	
	public  static void listele() {
		File file = new File("C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klas�r\\Kafe\\Dosyalar\\men�.txt" );

		try {
			Scanner reader = new Scanner(file) ;
				while(reader.hasNextLine()) {
					String Line = reader.nextLine();
					System.out.println(Line);
				}
			reader.close();
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	public int getUrunkod() {
		return urunkod;
	}
	public void setUrunkod(int urunkod) {
		this.urunkod = urunkod;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getFiyat() {
		return fiyat;
	}
	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}
	public int getKalori() {
		return kalori;
	}
	public void setKalori(int kalori) {
		this.kalori = kalori;
	}
	public int getMaliyet() {
		return maliyet;
	}
	public void setMaliyet(int maliyet) {
		this.maliyet = maliyet;
	}
	public  void dosyaz() {
try {
	BufferedWriter bf = new BufferedWriter(new FileWriter("C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klas�r\\Kafe\\Dosyalar\\men�.txt"));
	bf.write(urunkod);
	bf.write(isim);
	bf.write(fiyat);
	bf.write(kalori);
	bf.write(maliyet);
	bf.close();
	
} catch (IOException e) {
	
	e.printStackTrace();
	
}

	


	
}
	@Override
	public String toString() {
		return "Ur�nler urunkod=" + urunkod + ", isim=" + isim + ", fiyat=" + fiyat + ", kalori=" + kalori
				+ ", maliyet=" + maliyet  ;
	}
	

		
}
