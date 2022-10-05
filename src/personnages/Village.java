package personnages;

import java.util.Iterator;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;

	public Village(String nom, int nbVillageoisMaximun) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximun];
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois += 1;
	}
	
	public Gaulois trouverHabitant(int num) {
		return villageois[num];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans village du chef " + chef.getNom() + " vivent les légendaires gaulois :");
		
		for (int i = 0; i < nbVillageois; i += 1) {
			System.out.println("- " + villageois[i].getNom());
			
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des irréductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30);
		//Index out of range : le village contient 30 habitant le premier en indice 0 et le dernier en 29 et non 30
	
		Chef abraracourcix = new Chef("Abraracourcix",6,village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Astérix",8);
		village.ajouterHabitant(asterix);
		Gaulois obelix = new Gaulois("Obélix",26);
		village.ajouterHabitant(obelix);
		
		village.afficherVillageois();
		
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		//On a null car le seul villageois est en indice 0 et pas en 1
	}
	
}
