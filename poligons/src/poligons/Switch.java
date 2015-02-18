package poligons;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		int cas = 1;
		while (cas !=0) {
			int costats = 0;
			String nom = " ";
			double costat = 0;

			System.out.println("0- Per sortir");
			System.out.println("1- Per entrar Polígon al fitxer");
			System.out.println("2- Per entrar Circumferencia al fitxer");

			cas = llegir();
			switch (cas) {
			case 1:

				break;
			case 2:

				double radi = 0;

				break;

			default:
				break;
			}
		}
	}

	private static int llegir() {
		Scanner llegir = new Scanner(System.in);
		return llegir.nextInt();
	}

}
