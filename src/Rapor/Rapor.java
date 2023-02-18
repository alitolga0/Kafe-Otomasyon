package Rapor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Rapor {
int gelir ,maas;
static int fatura;
int gider;


public int getGelir() {
	return gelir;
}

public void setGelir(int gelir) {
	this.gelir = gelir;
}

public int getMaas() {
	return maas;
}

public void setMaas(int maas) {
	this.maas = maas;
}

public int getFatura() {
	return fatura;
}

public void setFatura() {
	this.fatura = fatura;
}

public int getGider() {
	return gider;
}

public void setGider(int gider) {
	this.gider = gider;
}


public static int  fatura ( int elektrik,int su) {
	
fatura = su + elektrik;
String fatura1 = " "+fatura;
try {
	File file = new File( "C:\\Users\\Tolga\\Documents\\odev3\\Calisma\\Yeni klasör\\Kafe\\Dosyalar\\rapor.txt");
	FileWriter fw = new FileWriter(file,true);
	BufferedWriter buffer = new BufferedWriter(fw);
	

	buffer.newLine();
buffer.append(fatura1);
buffer.close();
}catch (IOException e1) {
e1.printStackTrace();
}
return fatura;
}

}




