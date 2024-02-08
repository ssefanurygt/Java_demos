package variables_;

import java.util.Scanner;

public class Asalsayı {


	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz");
        
        int sayı=scan.nextInt();
        int sayaç=0;
        for(int i = 2; i<sayı; i++ ) {
        	if (sayı%i==0) {
        		sayaç++;	
		}
	}
		if (sayaç==0) {
			System.out.println(sayı+ "asal sayıdır");
		}
		else {
			System.out.println(sayı+ "asal sayı değildir");
		}
	}
	
	
}
