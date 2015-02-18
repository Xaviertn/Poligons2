package poligons;

public class Rectangle extends Poligon{
	
	private double costatCurt;
	private double costatLlarg;

	
	/**
	 * CONSTRUCTOR PER DEFECTE
	 */
	public Rectangle() {
		super();
		this.costatCurt=0;
		this.costatLlarg=0;
	}
	
	
	/**
	 * CONSTRUCTOR PER PARÀMETRES
	 * @param num_costats
	 * @param nom
	 * @param costatCurt
	 * @param costatLlarg
	 */
	public Rectangle(int num_costats, String nom, double costatCurt,
			double costatLlarg) {
		super(num_costats, nom);
		this.costatCurt = costatCurt;
		this.costatLlarg = costatLlarg;
	}
	//GETTERS I SETTERS
	public double getCostatCurt() {
		return costatCurt;
	}
	public void setCostatCurt(double d) {
		this.costatCurt = d;
	}
	public double getCostatLlarg() {
		return costatLlarg;
	}
	public void setCostatLlarg(double d) {
		this.costatLlarg = d;
	}
	
	/**
	 * CALCULAR L'AREA DEL RECTANGLE
	 * @return
	 */
	public double CalcularArea(){
		
		return this.costatCurt*this.costatLlarg;
	}
	
	
	@Override
	public String toString(){
		
		
		return super.toString()+"CostatCurt: "+this.costatCurt+" CostatLlarg: "+this.costatLlarg;
	}
	

	
	
	
	

}
