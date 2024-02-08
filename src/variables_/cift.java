package variables_;

import java.util.Scanner;

public class cift {

	public static void main(String[] args) {
		//kullanıcının girdiği 10 sayıdan kaç tanesi çifttir
		
	Scanner scan=new Scanner(System.in);
	int a;
	int c_sayısı=0;
	
	for(int i = 0; i<10  ; i++ ) {
	System.out.println("sayı giriniz");
	a= scan.nextInt();
	
	if (a%2==0){
	System.out.println("sayı çifttir");
	c_sayısı++;
	}
	else
		System.out.println("sayı tektir");
 }
	System.out.println(c_sayısı + "tane sayı cifttir");	
		
		
	}

}
