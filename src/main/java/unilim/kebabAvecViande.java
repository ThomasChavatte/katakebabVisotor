package unilim;

public class kebabAvecViande extends kebabDecorateur {

	public kebabAvecViande(Kebab k){
		kebab = k;
	}

	@Override
	public boolean estVege() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean estPesce() {
		// TODO Auto-generated method stub
		return false;
	}

}
