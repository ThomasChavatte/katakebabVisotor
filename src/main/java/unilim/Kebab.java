package unilim;

public class Kebab {
	
	private boolean vege;
	private boolean pesce;
	private String ingredients;
	
	public Kebab(){
		this.vege=true;
		this.pesce = true;
		this.ingredients="";
	}
	
	
	@Override
	public String toString() {
		return "Kebab [vege=" + this.estVege() + ", pesce=" + this.estPesce() + ", ingredients=" + ingredients + "]";
	}


	public boolean estVege(){
		return this.vege;
	}
	
	public boolean estPesce(){
		return this.pesce;
	}
	
	public String getIngrediants(){
		return this.ingredients;
	}
	
	protected void setVege(boolean vege) {this.vege = vege;}
	protected void setPesce(boolean pesce) {this.pesce = pesce;}
	

}
