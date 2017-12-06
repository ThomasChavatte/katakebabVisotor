package visitor;

import fr.unilim.iut.kebab.ingredients.Agneau;
import fr.unilim.iut.kebab.ingredients.Assiette;
import fr.unilim.iut.kebab.ingredients.Boeuf;
import fr.unilim.iut.kebab.ingredients.Crevette;
import fr.unilim.iut.kebab.ingredients.Fromage;
import fr.unilim.iut.kebab.ingredients.Oignon;
import fr.unilim.iut.kebab.ingredients.Pain;
import fr.unilim.iut.kebab.ingredients.Salade;
import fr.unilim.iut.kebab.ingredients.Sauce;
import fr.unilim.iut.kebab.ingredients.Thon;
import fr.unilim.iut.kebab.ingredients.Tomate;

public interface VisiteurDeRegime {
	public void visit(Agneau indegrientAgneau);
	public void visit(Boeuf ingredient);
	public void visit(Crevette ingredient);
	public void visit(Fromage ingredient);
	public void visit(Oignon ingredient);
	public void visit(Pain ingredient);
	public void visit(Salade ingredient);
	public void visit(Sauce ingredient);
	public void visit(Thon ingredient);
	public void visit(Tomate ingredient);
	public void visit(Assiette ingredient);
}
