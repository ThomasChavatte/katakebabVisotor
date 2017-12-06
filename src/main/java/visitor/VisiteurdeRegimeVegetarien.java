package visitor;

import fr.unilim.iut.kebab.ingredients.*;


public class VisiteurdeRegimeVegetarien {

	public boolean visit(Agneau indegrientAgneau){
		return false;
	}
	
	public boolean visit(Boeuf ingredient){
		return false;
	}
	
	public boolean visit(Crevette ingredient){
		return false;
	}
	
	public boolean visit(Fromage ingredient){
		return true;
	}
	public boolean visit(Oignon ingredient){
		return true;
	}
	
	public boolean visit(Pain ingredient){
		return true;
	}
	public boolean visit(Salade ingredient){
		return true;
	}
	public boolean visit(Sauce ingredient){
		return true;
	}
	public boolean visit(Thon ingredient){
		return false;
	}
	public boolean visit(Tomate ingredient){
		return true;
	}
	public boolean visit(Assiette ingredient){
		return true;
	}
	
	
}
