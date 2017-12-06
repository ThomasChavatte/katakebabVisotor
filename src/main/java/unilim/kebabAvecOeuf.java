package unilim;

public class kebabAvecOeuf extends kebabDecorateur{

	public kebabAvecOeuf(Kebab k){
		kebab = k;
	}
	
	@Override
	public boolean estVege() {
		// TODO Auto-generated method stub
		return kebab.estVege();
	}

	@Override
	public boolean estPesce() {
		// TODO Auto-generated method stub
		return kebab.estPesce();
	}

}
