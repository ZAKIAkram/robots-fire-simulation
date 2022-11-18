import java.awt.Color;
import java.io.FileNotFoundException;
import java.util.zip.DataFormatException;

import gui.GUISimulator;

public class TestElementaireMap4 {
	public static void main(String[] args) {
		try {
			String fichierName = "cartes/spiralOfMadness-50x50.map";
			DonneesSimulation donneesInit = NewLecteurDonnees.lire(fichierName);
			Carte carteToDraw = donneesInit.getCarte();
			
			GUISimulator gui = new GUISimulator(500, 500, Color.WHITE);
			
			
			ChefPompier chefElem = new ChefPompierSimple(carteToDraw, donneesInit);
			Simulateur simulateur = new Simulateur(gui, donneesInit, chefElem, fichierName);



		}catch (FileNotFoundException e) {
            System.out.println("fichier " + args[0] + " inconnu ou illisible");
        } catch (DataFormatException e) {
            System.out.println("\n\t**format du fichier qui correspond åa " + args[0] + " invalide: " + e.getMessage());
        
        }

	}
}
