package Personel;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Girc�k {
	public  static void gir() {
		
	
	SimpleDateFormat bicim2=new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
	Date tarihsaat= new Date();
	
	try {
		BufferedWriter buffer = new BufferedWriter(new FileWriter( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klas�r\\Kafe\\Dosyalar\\personelgirc�k.txt"));
		buffer.newLine();
	buffer.append(bicim2.format(tarihsaat));
	System.out.println("giri� yap�ld�" +  bicim2.format(tarihsaat));
	buffer.close();
	}catch (IOException e) {
e.printStackTrace();
	}
	}
	
	
	
	
	public static void c�k() {

		SimpleDateFormat bicim2=new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		Date tarihsaat= new Date();
		
		try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter("C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klas�r\\Kafe\\Dosyalar\\personelgirc�k.txt"));
			buffer.newLine();
		buffer.write(bicim2.format(tarihsaat));
		System.out.println("��k�� yap�ld�" +  bicim2.format(tarihsaat));
				buffer.close();
		}catch (IOException e) {
	e.printStackTrace();
		}
		}
	
	}
	
	
