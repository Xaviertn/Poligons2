package poligons;

public class Pentagon extends Poligon{
	
	
	private double costat;
	private double apotema;
	
	
	
	
	
	public double getCostat() {
		return costat;
	}

	public void setCostat(double costat) {
		this.costat = costat;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	/**
	 * CONSTRUCTOR PER PARÀMETRES
	 * @param num_costats
	 * @param nom
	 * @param costat
	 * @param apotema
	 */
	public Pentagon(int num_costats, String nom ,double costat, double apotema) {
		
		
		super(num_costats, nom);
		this.costat = costat;
		this.apotema = apotema;
	}
	
	/**
	 * CONSTRUCOTR PER DEFECTE
	 */
	public Pentagon(){
		super();
		this.apotema=0;
		this.costat=0;
	}
	
	
	public double CalcularArea(){
		
		return (this.apotema*this.costat)/2;
	}

	@Override
	public String toString() {
	
		return super.toString()+"Costat: "+this.costat+" apotema: "+this.apotema;
		
		
		
	}
	
	

	
	

}
