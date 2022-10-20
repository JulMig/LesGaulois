package villagegaulois;

import personnages.Gaulois;
import personnages.Equipement;

public class Musee {
	Trophee[] trophees = new Trophee[200];
	int nbTrophee = 0;
	
	public void donnerTrophees(Gaulois gaulois, Equipement equipement) {
		assert nbTrophee < 200;
		trophees[nbTrophee] = new Trophee(gaulois, equipement);
		nbTrophee += 1;
		
	}
	
	public String extraireInstructionsCaml() {
		
		String let = "let musee = [\n";
		
		for(int i = 0; i < nbTrophee; i++) {
			
			let += "	\"" + trophees[i].donnerNom() + "\", \"" + trophees[i].getEquipement() + "\";\n";
		}
		
		
		return let + "]";
	}

}
