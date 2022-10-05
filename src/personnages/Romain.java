package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		assert force >= 0 : "Pas de force négative!";
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert force >= 0 : "La force est négative";
		int forceInitiale = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert force < forceInitiale : "la force n'a pas diminué";
	}
	
	public static void main(String[] args) {
		Romain romain;
		romain = new Romain("Minus",6);
		
		System.out.println(romain.prendreParole());
		romain.parler("Bonjour...");
		romain.recevoirCoup(2);
		romain.recevoirCoup(3);
		romain.recevoirCoup(1);
	}
	
	

}
