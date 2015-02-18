package poligons;

public class Quadrat extends Poligon{

	private double costat;


	public double getCostat() {
		return costat;
	}

	public void setCostat(double costat) {
		this.costat = costat;
	}
	
	
	
	/**
	 * CONSTRUCTOR PER DEFECTE
	 */
	public Quadrat(){
		super();
		this.costat=1;
		
	}

	
	/**
	 * CONSTRUCTOR PER PARÀMETRES
	 * @param num_costats
	 * @param nom
	 * @param costat
	 */
	public Quadrat(int num_costats, String nom, double costat) {
		super(num_costats, nom);
		this.costat=costat;
		
	}

	/**
	 * CALCULAR L'AREA DEL QUADRAT
	 * @return
	 */
	public double CalcularArea(){
			
			
		 double resultat =this.costat*this.costat;
		 return resultat;
		}
	

	@Override
	public String toString() {
		return super.toString()+"Costat "+this.costat;
	}
	
	
	
	
}
