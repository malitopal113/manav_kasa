
package Kasa;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Manav Kasa Programı");
		
		Scanner input = new Scanner(System.in);
		double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, total;
		int k_armut, k_elma, k_domates, k_muz, k_patlican;
		
		System.out.print("Armut Kaç Kilo ? : ");
		k_armut = input.nextInt();
		
		System.out.print("Elma Kaç Kilo ? : ");
		k_elma = input.nextInt();
		
		System.out.print("Domates Kaç Kilo ? : ");
		k_domates = input.nextInt();
		
		System.out.print("Muz Kaç Kilo ? : ");
		k_muz = input.nextInt();
		
		System.out.print("Patlıcan Kaç Kilo ? : ");
		k_patlican = input.nextInt();
		
		total = (k_armut * armut) + (k_elma * elma) + (k_domates * domates) + (k_muz * muz) + (k_patlican * patlican);
		
		
		System.out.print("Toplam Tutar : " + total + " TL");
	
	}

}
