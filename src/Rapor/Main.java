package Rapor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


	}public static void  fat() {
		Rapor r = new Rapor();
		Scanner scan = new Scanner(System.in);
		System.out.println("elektrik faturas�");
		int elektrik=scan.nextInt();
		System.out.println("su faturas�");
		int su= scan.nextInt();
		r.fatura(elektrik, su);
	}

}
