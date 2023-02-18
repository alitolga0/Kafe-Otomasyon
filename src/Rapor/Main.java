package Rapor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


	}public static void  fat() {
		Rapor r = new Rapor();
		Scanner scan = new Scanner(System.in);
		System.out.println("elektrik faturasý");
		int elektrik=scan.nextInt();
		System.out.println("su faturasý");
		int su= scan.nextInt();
		r.fatura(elektrik, su);
	}

}
