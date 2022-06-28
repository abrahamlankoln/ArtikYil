import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int yil;
		Scanner deger = new Scanner(System.in);
		System.out.print("lutfen bir yil giriniz: ");
		yil = deger.nextInt();
		if (yil % 4 == 0 && yil % 100 == 0 && yil % 400 == 0) {
			System.out.println("girelen yil artik yil");
		} else {
			System.out.println("girelen yil artik yil degildir");
		}
	}

}
