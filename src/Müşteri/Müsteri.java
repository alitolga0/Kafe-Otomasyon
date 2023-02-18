package Müþteri;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Müsteri {

	int masano;
	String siparis;
	double hesap;
	
	
	
	public static void siparisal() throws FileNotFoundException {
		Masalar m = new Masalar ();
		Scanner scan = new Scanner(System.in);
		System.out.println("masa no kaç");
		int c =scan.nextInt();
		if(c==1) {
			Menü.Menn.masa();
			
		}else if (c==2) {
			Müþteri.Masalar.masa2();
			
		}else if (c==3) {
			Müþteri.Masalar.masa3();
		}else if (c==4) {
			Müþteri.Masalar.masa4();
		}
		else {
			Müþteri.Masalar.masa5();
	}
	}
}

	
	

