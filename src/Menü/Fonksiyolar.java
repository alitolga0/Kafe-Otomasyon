package Menü;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Scanner;

public class Fonksiyolar {
	





public static  Urünler menu() throws FileNotFoundException { /* menü */
	BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klasör\\Kafe\\Dosyalar\\menü.txt"));
	Scanner reader = new Scanner(bf) ;
		while(reader.hasNextLine()) {
			String Line = reader.nextLine();
			System.out.println(Line);
		}
	reader.close();
	
return menu();

}


}


