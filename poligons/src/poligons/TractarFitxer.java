package poligons;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;




public class TractarFitxer {
	
	//ESCRIURE FITXERS////////////////////////////////////////////////////////////////////////////////////
	public static void EntrarP(Poligon p) throws IOException {
		File arxiu = new File("poligons.txt");
		FileWriter fw = new FileWriter(arxiu,true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("1");
		bw.write(" ");
		bw.write(p.getNom());
		bw.write(" ");
		bw.write(String.valueOf(p.getNumCostats()));
		bw.newLine();		
		bw.close();
		}

	public static void EntrarC(Circumferencia c) throws IOException {
		File arxiu = new File("poligons.txt");
		FileWriter fw = new FileWriter(arxiu,true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("2");
		bw.write(" ");
		bw.write(c.getNom());
		bw.write(" ");
		bw.write(String.valueOf(c.getNumCostats()));
		bw.write(" ");
		bw.write(String.valueOf(c.getRadi()));
		bw.newLine();			
		bw.close();
		}
	
	public static void EntrarT(Triangle t) throws IOException {
		File arxiu = new File("poligons.txt");
		FileWriter fw = new FileWriter(arxiu,true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("4");
		bw.write(" ");
		bw.write(t.getNom());
		bw.write(" ");
		bw.write(String.valueOf(t.getNumCostats()));
		bw.write(" ");
		bw.write(String.valueOf(t.getAltura()));
		bw.write(" ");
		bw.write(String.valueOf(t.getBase()));
		bw.newLine();	
		bw.close();
		}
	
	public static void EntrarQ(Quadrat q) throws IOException {
		File arxiu = new File("poligons.txt");
		FileWriter fw = new FileWriter(arxiu,true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("3");
		bw.write(" ");
		bw.write(q.getNom());
		bw.write(" ");
		bw.write(String.valueOf(q.getNumCostats()));
		bw.write(" ");
		bw.write(String.valueOf(q.getCostat()));
		bw.newLine();	
		bw.close();
		}
	
	
	public static void EntrarPent(Pentagon Pent) throws IOException{
		File fitxer = new File("poligons.txt");
		FileWriter fw = new FileWriter(fitxer,true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("5");
		bw.write(" ");
		bw.write(Pent.getNom());
		bw.write(" ");
		bw.write(String.valueOf(Pent.getNumCostats()));
		bw.write(" ");
		bw.write(String.valueOf(Pent.getCostat()));
		bw.write(" ");
		bw.write(String.valueOf(Pent.getApotema()));
		bw.newLine();
		bw.close();
	}
	
	public static void EntrarRect(Rectangle Rect) throws IOException{
		File fitxer = new File("poligons.txt");
		FileWriter fw = new FileWriter(fitxer,true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("6");
		bw.write(" ");
		bw.write(Rect.getNom());
		bw.write(" ");
		bw.write(String.valueOf(Rect.getNumCostats()));
		bw.write(" ");
		bw.write(String.valueOf(Rect.getCostatCurt()));
		bw.write(" ");
		bw.write(String.valueOf(Rect.getCostatLlarg()));
		bw.newLine();
		bw.close();
	}
	
	
	
	
	//CONTAR POLÍGONS////////////////////////////////////////////////////////////////////////////////////
	public static void ContarPoligons(){
		try {
			
			File arxiu = new File("poligons.txt");
            BufferedReader in = new BufferedReader(new FileReader( arxiu ));
            String linia;
            int general=0;
            int P=0;
            int C=0;
            int Q=0;
            int T=0;
            int Pent=0;
            int Rect=0;
            while ((linia = in.readLine()) != null) {
            	general++;
                String[] cadena = linia.split(" ");
                if(cadena[0].equals("1")){
                	P++;
                }
                if(cadena[0].equals("2")){
	              C++;
	            }
                if(cadena[0].equals("3")){
  	              Q++;
  	            }
                if(cadena[0].equals("4")){
  	              T++;
  	            }
                if(cadena[0].equals("5")){
    	              Pent++;
    	            }
                if(cadena[0].equals("6")){
  	              Rect++;
  	            }
                
            }
            in.close();
            System.out.println("Quantitat de Polígons en general al fitxer: "+general);
            System.out.println("Quantitat de polígons al fitxer: "+P);
            System.out.println("Quantitat de Circumferencies al fitxer: "+C);
            System.out.println("Quantitat de Quadrats al fitxer: "+Q);
            System.out.println("Quantitat de Triangles al fitxer: "+T);
            System.out.println("Quantitat de Pentàgons al fitxer: "+Pent);
            System.out.println("Quantitat de Rectangles al fitxer: "+Rect);
        } catch (IOException e) {
        	
        	System.out.println("No he pogut obrir el fitxer");
        }
		
		
	}
	//LLISTAR UN FITXER////////////////////////////////////////////////////////////////////////////////////
	public static void LlistarPoligons(){
		try {
			
			File arxiu = new File("poligons.txt");
            BufferedReader in = new BufferedReader(new FileReader( arxiu ));
            String linia;
          
            while ((linia = in.readLine()) != null) {
             
                String[] cadena = linia.split(" ");
                if(cadena[0].equals("1")){
                	Poligon P = new Poligon();
                	
                	P.setNom(cadena[1]);
                	P.setNumCostats(Integer.parseInt(cadena[2]));
                	System.out.println(P.toString());
                }
                if(cadena[0].equals("2")){
                	Circumferencia C = new Circumferencia();
                	C.setNom(cadena[1]);
                	C.setNumCostats(Integer.parseInt(cadena[2]));
                	C.setRadi(Double.parseDouble(cadena[3]));
                	System.out.println(C.toString());
	            }
                
                if(cadena[0].equals("3")){
  	              Quadrat Q = new Quadrat();
	  	            Q.setNom(cadena[1]);
	            	Q.setNumCostats(Integer.parseInt(cadena[2]));
	            	Q.setCostat(Double.parseDouble(cadena[3]));
	            	System.out.println(Q.toString());
  	              
  	            }
                if(cadena[0].equals("4")){
                	 Triangle T = new Triangle();
 	  	            T.setNom(cadena[1]);
 	            	T.setNumCostats(Integer.parseInt(cadena[2]));
 	            	T.setBase(Double.parseDouble(cadena[3]));
 	            	T.setAltura(Double.parseDouble(cadena[4]));
 	            	System.out.println(T.toString());
  	            }
                if(cadena[0].equals("5")){
               	 	Pentagon Pent = new Pentagon();
               	 Pent.setNom(cadena[1]);
               	Pent.setNumCostats(Integer.parseInt(cadena[2]));
               	Pent.setCostat(Double.parseDouble(cadena[3]));
               	Pent.setApotema(Double.parseDouble(cadena[4]));
	            	System.out.println(Pent.toString());
 	            }
                if(cadena[0].equals("6")){
                	Rectangle Rect = new Rectangle();
                	Rect.setNom(cadena[1]);
                	Rect.setNumCostats(Integer.parseInt(cadena[2]));
                	Rect.setCostatCurt(Double.parseDouble(cadena[3]));
                	Rect.setCostatLlarg(Double.parseDouble(cadena[4]));
                	System.out.println(Rect.toString());
                	
                }
            
                
            }
            in.close();
          
        } catch (IOException e) {
        	
        	System.out.println("No he pogut obrir el fitxer");
        }
		
		
	}
	//CALCULAR AREA LLEGINT XITXER////////////////////////////////////////////////////////////////////////////////////
	public static void MostrarArea() throws IOException{
		
		File arxiu = new File("poligons.txt");
        BufferedReader in = new BufferedReader(new FileReader( arxiu ));
        String linia;
		
        while((linia = in.readLine())!=null){
        	
        	String[] cadena = linia.split(" ");
            
            if(cadena[0].equals("2")){
            	Circumferencia C = new Circumferencia();
            	C.setNom(cadena[1]);
            	C.setNumCostats(Integer.parseInt(cadena[2]));
            	C.setRadi(Double.parseDouble(cadena[3]));
            	System.out.println("L'area de la circumferencia es: "+C.CalcularArea());
            }
            
            if(cadena[0].equals("3")){
	              Quadrat Q = new Quadrat();
  	            Q.setNom(cadena[1]);
            	Q.setNumCostats(Integer.parseInt(cadena[2]));
            	Q.setCostat(Double.parseDouble(cadena[3]));
            	System.out.println("L'area del Quadrat és: "+Q.CalcularArea());
	              
	            }
            if(cadena[0].equals("4")){
            	 Triangle T = new Triangle();
	  	            T.setNom(cadena[1]);
	            	T.setNumCostats(Integer.parseInt(cadena[2]));
	            	T.setBase(Double.parseDouble(cadena[3]));
	            	T.setAltura(Double.parseDouble(cadena[4]));
	            	System.out.println("L'area del Triangle és: "+T.CalcularArea());
	            }
            
            if(cadena[0].equals("6")){
		           	 Rectangle R = new Rectangle();
		           	 R.setNom(cadena[1]);
		           	 R.setNumCostats(Integer.parseInt(cadena[2]));
		           	 R.setCostatCurt(Double.parseDouble(cadena[3]));
			         R.setCostatLlarg(Double.parseDouble(cadena[4]));
			         System.out.println("L'area del Rectangle és: "+R.CalcularArea());
	            }
        }
	}

	}


