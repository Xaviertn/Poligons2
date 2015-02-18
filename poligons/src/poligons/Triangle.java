package poligons;

public class Triangle extends Poligon {
	
	
	private double base;
	private double altura;
	
	//GETTERS I SETTERS
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	/**
	 * CONSTRUCTOR PER PARAMETRES
	 * @param num_costats
	 * @param base
	 * @param altura
	 */
	public Triangle(int num_costats,String nom, double base, double altura) {
		super(num_costats,nom);
		this.base = base;
		this.altura = altura;
	}
	
	/**
	 * 	CONSTRUCTOR PER DEFECTE
	 */
	public Triangle(){
		super();
		this.base=1;
		this.altura=1;
		
	}
	
	/**
	 * CALCULAR L'AREA DEL TRIANGLE
	 * @return
	 */
	public double CalcularArea(){
			
			
		 double resultat =(this.base*this.altura)/2;
		 return resultat;
		}
	
	@Override
	public String toString() {
		
		return super.toString()+"Base: "+this.base+" Altura: "+this.altura;
	}

}
