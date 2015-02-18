package poligons;

public class Poligon {
	
	private String nom;
	private int NumCostats;
	
	
	public int getNumCostats() {
		return NumCostats;
	}

	public void setNumCostats(int numCostats) {
		NumCostats = numCostats;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * CONSTRUCTOR PER DEFECTE
	 */
	public Poligon() {
	
		this.NumCostats = 0;
		this.nom="sense";
	}
	
	
	/**
	 * CONSTRUCTOR PER PARÀMETRES
	 * @param num_costats
	 */
	public Poligon(int num_costats, String nom){
		this.NumCostats=num_costats;
		this.nom=nom;
	}
	
	

	
	@Override
	public String toString() {
		
		return "Nom: "+this.nom+" Costats: "+NumCostats+" ";

    }
	
	
}