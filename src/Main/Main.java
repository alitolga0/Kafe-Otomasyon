package Main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import Men�.Menn;
import M��teri.M�steri;

public class Main {

	
	public static void main(String[] args) throws IOException {
		
		
		int kontrol=0;
		do {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("1 men� \n 2 personel \n 3 m�steri \n 4 rapor");
		
		int x = scan.nextInt();
		if(x==1) {//men�
			System.out.println("1 men�y� listelemek \n 2 yeni �r�n eklemek");
			int abc =scan.nextInt();
			if(abc==1) {
		Men�.Menn.listele();
		
		
		
			}else {
        Men�.Menn.ekle();
			}
		}else if (x==2) { // personel
			System.out.println("hangi i�lemi yapmak istiyorsunuz ");
			System.out.println("1 giri� ��k�� \n 2 personel ile i�lemler \n 3 personel listesi \n 4 maas hesab� ");
	int a =scan.nextInt();
			if(a==1) {
				System.out.println("1 giri� \n 2 ��k��");
				int b =scan.nextInt();
				if(b==1) {
					Personel.Girc�k.gir();
				}else {
					Personel.Girc�k.c�k();
				}
			 
				
			} else  if(a==2) {
				Personel.Personel.personelekle();
			}else if(a==3) {
				Personel.Personel.personeliste();
			} else {
			System.out.println("ka� saat �al��t�n�z");
			int u = scan.nextInt();
				Personel.Personel.maashesapla(u);	
			}
				
		} else if(x==3) {// m��teri
			System.out.println("men�y� g�rmek i�in 1 \n sipari� i�in 2");
		  int yu=scan.nextInt();
		  if(yu==1) {
			  Men�.Menn.listele();
				
		  }else {
			  Men�.Menn.masa();
		  }
		
		
		}else {// rapor
			System.out.println("fatura bilgileirnizi girmek i�in 1");
			int xbc =scan.nextInt();
			Rapor.Main.fat();
		
		
			
		}
		
	
	}while(kontrol==0);
	}
}
