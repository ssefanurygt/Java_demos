package variables_;

import java.util.Scanner;

public class variable {
	
	//kullanıcı tarafından girilen 10 sayının ortalamasını hesapla
//rousability(kodun tekrar tekrar kullanılabilirliği)
	
	
	public static void main(String[] args) {
	 int toplam = 0;
	 int a;
	 
	Scanner scan= new Scanner(System.in);
	for (int i = 0; i<10  ; i++ ) {
	System.out.println("sayı giriniz");
	a= scan.nextInt();
	toplam+=a;

System.out.println("girilen sayıların ortalaması:" + ((float)toplam/10));
		}
		
	}
	
}
