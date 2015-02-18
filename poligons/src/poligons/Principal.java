package poligons;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		int cas=1;
	//prova del primer commit
		
		while(cas>=1 & cas<=9){
			int costats=0;
			String nom =" ";
			double costat=0;
			//qUE TAL
			System.out.println("1- entrar Polígon al fitxer");
			System.out.println("2- entrar Circumferencia al fitxer");
			System.out.println("3- entrar Quadrat al fitxer");
			System.out.println("4- entrar Triangle al fitxer");
			System.out.println("5- entrar Pentagon al fitxer");
			System.out.println("6- entrar Rectangle");
			System.out.println("7- Contar poligons");
			System.out.println("8- Llistar Polígons del fitxer");
			System.out.println("9- Calcular/ mostra area polígons");
			
			cas=llegir();
				switch (cas) {
				case 1:
					int tipus=1;
					nom="Polígon";
					System.out.println("Entra el num de costats");
					costats=llegir();
					Poligon p= new Poligon(costats,nom);
					TractarFitxer.EntrarP(p);
					
					
					break;
				case 2:
				
					double radi=0;
					nom="Circumferència";
					costats=0;
					System.out.println("Entra el radi");
					radi=llegirDouble();
					Circumferencia c= new Circumferencia(costats,nom,radi);
					TractarFitxer.EntrarC(c);
					
					break;
				case 3:
					
					
					nom="Quadrat";
					costats=4;
					System.out.println("Entra el costat");
					costat=llegirDouble();
					Quadrat q= new Quadrat(costats,nom,costat);
					TractarFitxer.EntrarQ(q);
					break;
				case 4:
					
					double base=0;
					double altura=0;
					nom="Triangle";
					costats=3;
					System.out.println("Entra la base");
					base=llegirDouble();
					System.out.println("Entra l'altura");
					altura=llegirDouble();
					Triangle t= new Triangle(costats,nom,base,altura);
					TractarFitxer.EntrarT(t);
					
					break;
					
				case 5:
					double apotema=0;
					nom="Pentàgon";
					costats=5;
					System.out.println("Entra el costat");
					costat=llegirDouble();
					System.out.println("Entra l'apotema");
					apotema=llegirDouble();
	
					Pentagon Pent = new Pentagon(costats,nom,costat,apotema);
					TractarFitxer.EntrarPent(Pent);
			
					
					break;
					
					case 6:
					nom = "Rectangle";
					double costatcurt=0;
					double costatllarg=0;
					costats=4;
					System.out.println("Entra el costat curt");
					costatcurt=llegirDouble();
					System.out.println("Entra el costat llarg");
					costatllarg=llegirDouble();
					Rectangle Rect= new Rectangle(costats,nom,costatcurt,costatllarg);
					TractarFitxer.EntrarRect(Rect);
					break;
					
				case 7:
					
					TractarFitxer.ContarPoligons();
					
					break;
				case 8:
					
					TractarFitxer.LlistarPoligons();
					
					break;
					
					
				case 9:
					
					TractarFitxer.MostrarArea();
					
					break;
				default:
					break;
				}
		}
		}
		
		private static int llegir(){
			Scanner llegir=new Scanner(System.in);
			return llegir.nextInt();}
		
		private static String llegirString(){
			Scanner llegir=new Scanner(System.in);
			return llegir.next();}
		
		private static double llegirDouble(){
			Scanner llegir=new Scanner(System.in);
			return llegir.nextDouble();}
	

}
