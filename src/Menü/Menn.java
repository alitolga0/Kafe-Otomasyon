package Men�;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Menn {
	
	static Ur�nler[] menu = new Ur�nler[10];
	
	public static void ekle() throws IOException {
		Scanner scan = new Scanner(System.in);
		int k =0;
		System.out.println("ka� �r�n ekleyeceksiniz");
		int j = scan.nextInt();
	
		for(k=0;k<j;k++) {
		System.out.println("�r�n kodu");
		int a = scan.nextInt();
	     System.out.println("�e�n ismi");
	     String e = scan.next();
		System.out.println("�r�n fiyat� ");
		int b = scan.nextInt();
		System.out.println("�r�n maliyeti ");
		int c = scan.nextInt();
		System.out.println("�r�n kalorisi");
		int d = scan.nextInt();
		Ur�nler u = new Ur�nler(a, e, b, c, d);
		
		menu[k] = u;
		try {
			File file = new File( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klas�r\\Kafe\\Dosyalar\\men�.txt");
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
	 File file = new File( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klas�r\\Kafe\\Dosyalar\\men�.txt");

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
System.out.println("hangi masadas�n�z");
		int masa =scan.nextInt();
		Menn m = new Menn();
		
	if(masa==1) {
		
			try {
			
				
				
				File file = new File( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klas�r\\Kafe\\Dosyalar\\masalar\\masa1.txt");
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
		File file = new File( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klas�r\\Kafe\\Dosyalar\\masalar\\masa2.txt");
		FileWriter fw = new FileWriter(file,true);
		BufferedWriter buffer = new BufferedWriter(fw);
		System.out.println("hangi �r�n� eklemek istiyorsan�z numaras�n� giriniz");
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
			File file = new File( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klas�r\\Kafe\\Dosyalar\\masalar\\masa3.txt");
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
			File file = new File( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klas�r\\Kafe\\Dosyalar\\masalar\\masa4.txt");
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
			File file = new File( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klas�r\\Kafe\\Dosyalar\\masalar\\masa5.txt");
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
		System.out.println("masa no ka�");
		int ay = scan.nextInt();
		if(ay==1) {
			
			
			
		}
	}
	
	
	public static  String okuma() throws IOException {
		File file = new File("C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klas�r\\Kafe\\Dosyalar\\men�.txt");
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(file));
		Scanner scan = new Scanner(System.in);
		String satir = reader.readLine();
		 System.out.println(" ne al�rs�n�z");
		 int j =scan.nextInt();
		 if(j!=0)
			{
			 satir = reader.readLine();
			System.out.println(satir);
			
			}
		 return satir;
	}

}
