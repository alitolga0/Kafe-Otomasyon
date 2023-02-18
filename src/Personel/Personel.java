package Personel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Personel {
String isim;
int maashesapla;


public String getIsim() {
	return isim;
}

public void setIsim(String isim) {
	this.isim = isim;
}


public int getMaashesapla() {
	return maashesapla;
}

public void setMaashesapla(int maashesapla) {
	this.maashesapla = maashesapla;
}


Scanner scan = new Scanner(System.in);

static String[] personel = new String[7];
public static   void personelekle () {
	Scanner scan = new Scanner(System.in);
	int a =0;
	int b =7;
	
	System.out.println("personelleri eklemek için 1 düzenlemek içi 2");
	int u = scan.nextInt();
	if(u==1) {
	for(a=0;a<b;a++) {
		System.out.println("eklemek için 1 e basýn ");
		int x =scan.nextInt();
		if(x==1){
			System.out.println("ismini giriniz");


personel[a]=scan.next();


try {
	File file = new File( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klasör\\Kafe\\Dosyalar\\personel.txt");
	FileWriter fw = new FileWriter(file,true);
	BufferedWriter buffer = new BufferedWriter(fw);
	
	buffer.newLine();
	System.out.println("kaçýncý sýraya personel eklemek istersiniz");
	int c =scan.nextInt();
buffer.append(personel[c-1]);
System.out.println("personel eklendi");
buffer.close();
}catch (IOException e) {
e.printStackTrace();
}
}else  {
	System.out.println("ekleme kapasitemiz dolmuþtur");
	a=8;

}
	}
}else {
}System.out.println("degiþtirmek istediginiz personel indexsini girini");
int y = scan.nextInt();
personel[y]=scan.next();
}


public  static void personeliste() {
	 File file = new File( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klasör\\Kafe\\Dosyalar\\personel.txt");

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
public  static void maashesapla(int saat) {
   
	int maas= saat*10;
	System.out.println("maaasýnýz "+ maas);
	try {
		BufferedWriter buffer = new BufferedWriter(new FileWriter("C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klasör\\Kafe\\Dosyalar\\maas.txt"));
	buffer.write(maas);
	
	buffer.close();
	}catch (IOException e) {
	e.printStackTrace();
	}
}


	
public static void cagir() throws IOException {
	File file = new File("C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klasör\\Kafe\\Dosyalar\\personel.txt");
	BufferedReader reader = null;
	reader = new BufferedReader(new FileReader(file));
	Scanner scan = new Scanner(System.in);
	String satir = reader.readLine();
	 System.out.println("kimi çagýrmak istiyorsunuyz");
	 int j =scan.nextInt();
	 while(satir!=null)
		{
		 
	
		satir = reader.readLine();
		System.out.println(satir);
		break;
		}
	 
	 
}

}







