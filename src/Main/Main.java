package Main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import Menü.Menn;
import Müþteri.Müsteri;

public class Main {

	
	public static void main(String[] args) throws IOException {
		
		
		int kontrol=0;
		do {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("1 menü \n 2 personel \n 3 müsteri \n 4 rapor");
		
		int x = scan.nextInt();
		if(x==1) {//menü
			System.out.println("1 menüyü listelemek \n 2 yeni ürün eklemek");
			int abc =scan.nextInt();
			if(abc==1) {
		Menü.Menn.listele();
		
		
		
			}else {
        Menü.Menn.ekle();
			}
		}else if (x==2) { // personel
			System.out.println("hangi iþlemi yapmak istiyorsunuz ");
			System.out.println("1 giriþ çýkýþ \n 2 personel ile iþlemler \n 3 personel listesi \n 4 maas hesabý ");
	int a =scan.nextInt();
			if(a==1) {
				System.out.println("1 giriþ \n 2 çýkýþ");
				int b =scan.nextInt();
				if(b==1) {
					Personel.Gircýk.gir();
				}else {
					Personel.Gircýk.cýk();
				}
			 
				
			} else  if(a==2) {
				Personel.Personel.personelekle();
			}else if(a==3) {
				Personel.Personel.personeliste();
			} else {
			System.out.println("kaç saat çalýþtýnýz");
			int u = scan.nextInt();
				Personel.Personel.maashesapla(u);	
			}
				
		} else if(x==3) {// müþteri
			System.out.println("menüyü görmek için 1 \n sipariþ için 2");
		  int yu=scan.nextInt();
		  if(yu==1) {
			  Menü.Menn.listele();
				
		  }else {
			  Menü.Menn.masa();
		  }
		
		
		}else {// rapor
			System.out.println("fatura bilgileirnizi girmek için 1");
			int xbc =scan.nextInt();
			Rapor.Main.fat();
		
		
			
		}
		
	
	}while(kontrol==0);
	}
}
