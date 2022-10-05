package personnages;

public class Romain {
	private String nom;
	private int force;
	Equipement equipements[] = new Equipement[2];
	int nbEquipement = 0;
	
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
	
	private void addEquipement(Equipement equipement) {
		equipements[nbEquipement] = equipement;
		nbEquipement += 1;
		System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + " !");
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;
		case 1:
			if(equipements[0] == equipement) {
				System.out.println("Le soldat " + nom + " possède déjà un " + equipement + " !");
				}
			else {
				addEquipement(equipement);
				}
			break;
		default:
			addEquipement(equipement);
			break;
		}
	}
	public static void main(String[] args) {
		Romain romain;
		romain = new Romain("Minus",6);
		
		Equipement equip = null;
		romain.sEquiper(equip.CASQUE);
		romain.sEquiper(equip.CASQUE);
		romain.sEquiper(equip.BOUCLIER);
		romain.sEquiper(equip.CASQUE);
		
		//System.out.println(romain.prendreParole());
		//romain.parler("Bonjour...");
		//romain.recevoirCoup(2);
		//romain.recevoirCoup(3);
		//romain.recevoirCoup(1);
		
		//for(Equipement equipement : Equipement.values()) {
		//	System.out.println(equipement);}
	}
	
	

}
