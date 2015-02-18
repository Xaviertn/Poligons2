package poligons;

public class Circumferencia extends Poligon {

	private double radi;
	
	
	
	
	public double getRadi() {
		return radi;
	}
	public void setRadi(double radi) {
		this.radi = radi;
	}
	/**
	 * CONSTRUCTOR PER DEFECTE
	 * @param num_costats
	 */
	public Circumferencia(){
		
		super();
		this.radi=1;
	}
	
	/**
	 * CONSTRUCTOR PER PARAMETRES
	 * @param num_costats
	 * @param nom
	 * @param radi
	 */
	public Circumferencia(int num_costats,String nom, double radi) {
		super(num_costats, nom);
		this.radi = radi;
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	/**
	 * CALCULAR L'AREA DE LA CIRCUMFERENCIA
	 * @return
	 */
	public double CalcularArea(){
			
			
		 double resultat = Math.PI*this.radi*this.radi;
		 return resultat;
		}


	
	@Override
	public String toString() {
		
		
		return super.toString()+"Radi "+this.radi;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
