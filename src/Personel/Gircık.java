package Personel;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Gircýk {
	public  static void gir() {
		
	
	SimpleDateFormat bicim2=new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
	Date tarihsaat= new Date();
	
	try {
		BufferedWriter buffer = new BufferedWriter(new FileWriter( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klasör\\Kafe\\Dosyalar\\personelgircýk.txt"));
		buffer.newLine();
	buffer.append(bicim2.format(tarihsaat));
	System.out.println("giriþ yapýldý" +  bicim2.format(tarihsaat));
	buffer.close();
	}catch (IOException e) {
e.printStackTrace();
	}
	}
	
	
	
	
	public static void cýk() {

		SimpleDateFormat bicim2=new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		Date tarihsaat= new Date();
		
		try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter("C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klasör\\Kafe\\Dosyalar\\personelgircýk.txt"));
			buffer.newLine();
		buffer.write(bicim2.format(tarihsaat));
		System.out.println("çýkýþ yapýldý" +  bicim2.format(tarihsaat));
				buffer.close();
		}catch (IOException e) {
	e.printStackTrace();
		}
		}
	
	}
	
	
