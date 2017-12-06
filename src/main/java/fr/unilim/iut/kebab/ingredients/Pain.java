package fr.unilim.iut.kebab.ingredients;

import visitor.VisiteurDeRegime;

public class Pain extends Ingredient {

	public Pain(String nom, Kebab kebab) {
		super(nom, kebab);
	}

	@Override
	public boolean isVegetarien() {
		return super.isVegetarien();
	}

	@Override
	public boolean isPescetarien() {
		return super.isPescetarien();
	}
	
	public void accept(VisiteurDeRegime vis){
    	vis.visit(this);    	
    }

}
