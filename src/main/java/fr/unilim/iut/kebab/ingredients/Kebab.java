package fr.unilim.iut.kebab.ingredients;

import java.util.List;


public interface Kebab {
	List<Ingredient> getIngredients();
	boolean isVegetarien();
	boolean isPescetarien();
}
