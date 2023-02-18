package Menü;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Liste {
Node bas;
Node son;
public Liste() {
bas=null;
son=null;
}

public void sonaekle(Urünler sayi) {
			Node my = new Node( sayi  );
if(dolumu()) {
	son.sonraki=my;
	son=my;
}else {
	bas=my;
	son=my;
}
	    }

public boolean dolumu() {

	if(bas!=null) {
		return true;
	}
	else {
		return false;
	}}
		
	/*
public void ekle(Urünler urun) throws IOException {
FileWriter fw = new FileWriter("menü.txt");
PrintWriter pw= new PrintWriter(fw);
Scanner scan = new Scanner(System.in);


	 
	 System.out.println("ürün kodu ");
	 urun.setUrunkod(scan.nextInt());
	 System.out.println("adý");
	 urun.setIsim(scan.next());
	 System.out.println("fiyat");
	 urun.setFiyat(scan.nextInt());
	 System.out.println("kalori");
	urun.setKalori(scan.nextInt());
	System.out.println("maliyet");
	urun.setMaliyet(scan.nextInt());
	pw.write(urun.getUrunkod());
	pw.write(urun.getIsim());
	pw.write(urun.getFiyat());
	pw.write(urun.getKalori());
	pw.write(urun.getMaliyet());
	pw.write("*******");
	pw.close();
	*/
}




