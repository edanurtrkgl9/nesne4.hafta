package arrays;

import java.util.Scanner;

public class kureselIsinmaSoru {
	public static void main (String[] args) {
		
		String s1;
		String s2;
		String s3;
		String s4;
		String s5;
		int dogru;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lutfen cevaplarinizi buyuk harfle giriniz.");
		
		System.out.println("Hangi ulke en cok sera gazi yaymaktadir?");
		String s1s[] ={"A-Cin", "B-Hindistan", "C-Amerika","D-Japonya"};
		
		for(int counter = 0; counter < s1s.length; counter++) {
			System.out.println(s1s[counter]);
		}
		System.out.print("Cevabinizi giriniz..");
		s1=sc.nextLine();
		
		if(s1s[0].equals("A-Cin")) {
			System.out.println("Dogru");
		}
		else {
			System.out.println("Yanlis");
		}
		
		
		
		
		System.out.println("Hangi gezegenin atmosferi kuresel isinma ile yok edilmektedir?");
		String s2s[] ={"A-Jupiter", "B-Venus", "C-Mars", "D-Merkur"};
		
		for(int counter = 0; counter < s2s.length; counter++) {
			System.out.println(s2s[counter]);
		}
		System.out.print("Cevabinizi giriniz..");
		s2=sc.nextLine();
		
		if(s2s[1].equals("B-Venus")) {
			System.out.println("Dogru");
		}
		else {
			System.out.println("Yanlis");
		}
				
		
		
		System.out.println("Hangi tur ampul en az enerji tuketir?");
		String s3s[] ={"A-Akkor Ampul", "B-Halojen Ampul", "C-Kompakt Floresan Ampul","D-Hepsi"};
		
		for(int counter = 0; counter < s3s.length; counter++) {
			System.out.println(s3s[counter]);
		}
		System.out.print("Cevabinizi giriniz..");
		s3=sc.nextLine();
		
		if(s3s[2].equals("C-Kompakt Floresan Ampul")) {
			System.out.println("Dogru");
		}
		else {
			System.out.println("Yanlis");
		}
		
		
		
		
		System.out.println("Iklim degisikiligi nedeniyle yilda kac kisi olmektedir?");
		String s4s[] ={"A-1500", "B-100000", "C-150000","D-500000"};
		
		for(int counter = 0; counter < s1s.length; counter++) {
			System.out.println(s4s[counter]);
		}
		System.out.print("Cevabinizi giriniz..");
		s4=sc.nextLine();
		
		if(s4s[2].equals("C-150000")) {
			System.out.println("Dogru");
		}
		else {
			System.out.println("Yanlis");
		}
		
		
		
		System.out.println("Kuresel isinmaya karsi en savunmasiz hayvan hangisidir?");
		String s5s[] ={"A-Kar Leopari", "B-Kutup Ayisi", "C-Deniz Gergedani","D-Tukan"};
		
		for(int counter = 0; counter < s5s.length; counter++) {
			System.out.println(s1s[counter]);
		}
		System.out.print("Cevabinizi giriniz..");
		s5=sc.nextLine();
		
		if(s5s[2].equals("C-Deniz Gergedani")) {
			System.out.println("Dogru");
		}
		else {
			System.out.println("Yanlis");
		}
		
		System.out.print("Dogru sayinizi giriniz.");
		dogru = sc.nextInt();
		
		if(dogru == 5) {
			System.out.print("Mukemmelll");
		}
		else if(dogru == 4) {
			System.out.print("Cok iyi");
		}
		else if (dogru <= 3 && dogru >= 0){
			System.out.print("Kuresel isinma hakkindaki bilgilerinizi tazeleyin");
		}
		else {
			System.out.print("Yanlis giris yaptiniz.");
		}
		
		

		
	}

}
