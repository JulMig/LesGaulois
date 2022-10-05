package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}


	public String getNom() {
		return nom;
	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup((force / 3) * effetPotion);
	}

    @Override
 	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
    
    public void boirePotion(int forcePotion) {
    	effetPotion = forcePotion;
    	parler("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée.");
    }
	
	public static void main(String[] args) {
		Gaulois asterix;
		asterix = new Gaulois("Astérix", 8);
		Romain romain;
		romain = new Romain("Minus", 6);
		
		
		System.out.println(asterix.getNom());
		System.out.println(asterix);
		System.out.println(asterix.prendreParole());
		asterix.parler("Bonjour!");
		asterix.frapper(romain);
		asterix.frapper(romain);
		asterix.frapper(romain);
		
		asterix.boirePotion(3);
		asterix.boirePotion(7);
		asterix.boirePotion(8);
		
		
	}
	
	
}
