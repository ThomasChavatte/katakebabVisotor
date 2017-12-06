package unilim;

public class kebabMain {
	
	public static void main(String[] args){
		Kebab oui = new Kebab();
		System.out.println(oui);
		
		oui = new kebabAvecOeuf(new kebabAvecViande(oui));
		System.out.println(oui);
		oui = new kebabAvecViande(oui);
		System.out.println(oui);
		oui = new kebabAvecLegumes(oui);
		System.out.println(oui);
	}
	

}
