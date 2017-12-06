package unilim;

public class kebabAvecLegumes extends kebabDecorateur {

	
	public kebabAvecLegumes(Kebab k){
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
