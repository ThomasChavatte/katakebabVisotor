package fr.unilim.iut.kebab.ingredients;

import java.util.List;

import visitor.VisiteurDeRegime;


public abstract class Ingredient implements Kebab {

	protected String nom;
	protected Kebab kebab;

	public Ingredient(String nom, Kebab kebab) {
		this.nom = nom;
		this.kebab = kebab;
	}

	public List<Ingredient> getIngredients() {
		List<Ingredient> ingredients = kebab.getIngredients();
		ingredients.add(this);
		return ingredients;
	}

	public boolean isVegetarien() {
		return kebab.isVegetarien();
		// Il faut déléguer conformément à la documentation du pattern Decorator
	}

	public boolean isPescetarien() {
		return kebab.isPescetarien();
	}
	
	public abstract void accept(VisiteurDeRegime vis);

}
