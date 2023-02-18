package Müþteri;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Masalar {
	
	
	
	
	
  public  void menü() {
	
	  
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
  
  public static void masa1() throws FileNotFoundException {
	
	 Menü.Urünler.listele();
	  
	  try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klasör\\Kafe\\Dosyalar\\masalar\\masa1"));
		
	
		buffer.close();
		}catch (IOException e) {
	e.printStackTrace();
		}
	  
	  
  }
  public static void masa2() throws FileNotFoundException {
		 Menü.Urünler.listele();
	 
	  try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klasör\\Kafe\\Dosyalar\\masalar\\masa2"));

	

		
		buffer.close();
		}catch (IOException e) {
	e.printStackTrace();
		}
	  
  }
  public static void masa3() throws FileNotFoundException {
		 Menü.Urünler.listele();
	  try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klasör\\Kafe\\Dosyalar\\masalar\\masa3"));
	
		buffer.close();
		}catch (IOException e) {
	e.printStackTrace();
		}
	  
  }
  public static void masa4() throws FileNotFoundException {
		 Menü.Urünler.listele();
	  try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klasör\\Kafe\\Dosyalar\\masalar\\masa4"));
		
		
		buffer.close();
		}catch (IOException e) {
	e.printStackTrace();
		}
	  
  }
  public static void masa5() throws FileNotFoundException {
		 Menü.Urünler.listele();
	  try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klasör\\Kafe\\Dosyalar\\masalar\\masa5"));
		
	
		buffer.close();
		}catch (IOException e) {
	e.printStackTrace();
		}
	  
  
  }

  
}
  
	
	
	
	
	
	
	


