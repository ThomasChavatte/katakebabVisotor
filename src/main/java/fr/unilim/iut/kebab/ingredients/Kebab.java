package fr.unilim.iut.kebab.ingredients;

import java.util.List;

import fr.unilim.iut.kebab.Kebab.Ingredient;

public interface Kebab {
	List<Ingredient> getIngredients();
	boolean isVegetarien();
	boolean isPescetarien();
}
