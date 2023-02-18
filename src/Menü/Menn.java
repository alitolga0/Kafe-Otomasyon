package Menü;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Menn {
	
	static Urünler[] menu = new Urünler[10];
	
	public static void ekle() throws IOException {
		Scanner scan = new Scanner(System.in);
		int k =0;
		System.out.println("kaç ürün ekleyeceksiniz");
		int j = scan.nextInt();
	
		for(k=0;k<j;k++) {
		System.out.println("ürün kodu");
		int a = scan.nextInt();
	     System.out.println("üeün ismi");
	     String e = scan.next();
		System.out.println("ürün fiyatý ");
		int b = scan.nextInt();
		System.out.println("ürün maliyeti ");
		int c = scan.nextInt();
		System.out.println("ürün kalorisi");
		int d = scan.nextInt();
		Urünler u = new Urünler(a, e, b, c, d);
		
		menu[k] = u;
		try {
			File file = new File( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klasör\\Kafe\\Dosyalar\\menü.txt");
			FileWriter fw = new FileWriter(file,true);
			BufferedWriter buffer = new BufferedWriter(fw);
			
			
			buffer.newLine();
	buffer.append(menu[k].toString());
	
		buffer.close();
		}catch (IOException e1) {
	e1.printStackTrace();
		}
		}
		
	
	}
		
	
	
	
	
public static void listele() {
	 File file = new File( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klasör\\Kafe\\Dosyalar\\menü.txt");

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
	
	
	
		
	public static void masa() {
		Scanner scan = new Scanner(System.in);
System.out.println("hangi masadasýnýz");
		int masa =scan.nextInt();
		Menn m = new Menn();
		
	if(masa==1) {
		
			try {
			
				
				
				File file = new File( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klasör\\Kafe\\Dosyalar\\masalar\\masa1.txt");
				FileWriter fw = new FileWriter(file,true);
				BufferedWriter buffer = new BufferedWriter(fw);
				
				buffer.newLine();
				
				
				String g = okuma();
				buffer.append(g);
		
			buffer.close();
			}catch (IOException e) {
		e.printStackTrace();
			
		}
	}else if(masa==2) {try {
		File file = new File( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klasör\\Kafe\\Dosyalar\\masalar\\masa2.txt");
		FileWriter fw = new FileWriter(file,true);
		BufferedWriter buffer = new BufferedWriter(fw);
		System.out.println("hangi ürünü eklemek istiyorsanýz numarasýný giriniz");
		int c =scan.nextInt();
		buffer.newLine();
		String g = okuma();
		buffer.append(g);
	buffer.close();
	}catch (IOException e) {
e.printStackTrace();
	
}
		
	}else if(masa==3) {
		try {
			File file = new File( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klasör\\Kafe\\Dosyalar\\masalar\\masa3.txt");
			FileWriter fw = new FileWriter(file,true);
			BufferedWriter buffer = new BufferedWriter(fw);
						buffer.newLine();
			String g = okuma();
			buffer.append(g);
		buffer.close();
		}catch (IOException e) {
	e.printStackTrace();
		
	}
	}else if(masa==4) {
		try {
			File file = new File( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klasör\\Kafe\\Dosyalar\\masalar\\masa4.txt");
			FileWriter fw = new FileWriter(file,true);
			BufferedWriter buffer = new BufferedWriter(fw);
			
			
			buffer.newLine();
			String g = okuma();
			buffer.append(g);
	
		buffer.close();
		}catch (IOException e) {
	e.printStackTrace();
		
	}
	}else {
		try {
			File file = new File( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klasör\\Kafe\\Dosyalar\\masalar\\masa5.txt");
			FileWriter fw = new FileWriter(file,true);
			BufferedWriter buffer = new BufferedWriter(fw);
		
			buffer.newLine();
			
			String g = okuma();
			buffer.append(g);
		buffer.close();
		}catch (IOException e) {
	e.printStackTrace();
		
	}
	}
	
}
	public static void masabos() {
		Scanner scan = new Scanner(System.in);
		System.out.println("masa no kaç");
		int ay = scan.nextInt();
		if(ay==1) {
			
			
			
		}
	}
	
	
	public static  String okuma() throws IOException {
		File file = new File("C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klasör\\Kafe\\Dosyalar\\menü.txt");
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(file));
		Scanner scan = new Scanner(System.in);
		String satir = reader.readLine();
		 System.out.println(" ne alýrsýnýz");
		 int j =scan.nextInt();
		 if(j!=0)
			{
			 satir = reader.readLine();
			System.out.println(satir);
			
			}
		 return satir;
	}

}
