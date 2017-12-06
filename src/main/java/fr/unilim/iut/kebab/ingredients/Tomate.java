package fr.unilim.iut.kebab.ingredients;

import visitor.VisiteurDeRegime;

public class Tomate extends Ingredient {

	public Tomate(String nom, Kebab kebab) {
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
