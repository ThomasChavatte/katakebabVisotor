package fr.unilim.iut.kebab.ingredients;

import java.util.LinkedList;
import java.util.List;

import fr.unilim.iut.kebab.Kebab.Ingredient;

public class Assiette implements Kebab {

	public List<Ingredient> getIngredients() {
		return new LinkedList<>();
	}

	public boolean isVegetarien() {
		return true;
	}

	public boolean isPescetarien() {
		return true;
	}

}
