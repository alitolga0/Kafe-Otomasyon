package M��teri;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Masalar {
	
	
	
	
	
  public  void men�() {
	
	  
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
  
  public static void masa1() throws FileNotFoundException {
	
	 Men�.Ur�nler.listele();
	  
	  try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klas�r\\Kafe\\Dosyalar\\masalar\\masa1"));
		
	
		buffer.close();
		}catch (IOException e) {
	e.printStackTrace();
		}
	  
	  
  }
  public static void masa2() throws FileNotFoundException {
		 Men�.Ur�nler.listele();
	 
	  try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klas�r\\Kafe\\Dosyalar\\masalar\\masa2"));

	

		
		buffer.close();
		}catch (IOException e) {
	e.printStackTrace();
		}
	  
  }
  public static void masa3() throws FileNotFoundException {
		 Men�.Ur�nler.listele();
	  try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klas�r\\Kafe\\Dosyalar\\masalar\\masa3"));
	
		buffer.close();
		}catch (IOException e) {
	e.printStackTrace();
		}
	  
  }
  public static void masa4() throws FileNotFoundException {
		 Men�.Ur�nler.listele();
	  try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klas�r\\Kafe\\Dosyalar\\masalar\\masa4"));
		
		
		buffer.close();
		}catch (IOException e) {
	e.printStackTrace();
		}
	  
  }
  public static void masa5() throws FileNotFoundException {
		 Men�.Ur�nler.listele();
	  try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klas�r\\Kafe\\Dosyalar\\masalar\\masa5"));
		
	
		buffer.close();
		}catch (IOException e) {
	e.printStackTrace();
		}
	  
  
  }

  
}
  
	
	
	
	
	
	
	


