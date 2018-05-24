package com.cpochard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CodesFonctions {

	// Recuperer l'id
	public static String recupererId(Scanner clavier) {
		String id = null;
		System.out.println("Entrez votre id :");
		id = clavier.nextLine();
		return id;
	}

	// Recuperer le prénom
	public static String recupererPrenom(Scanner clavier) {
		String prenom;
		System.out.println("Entrez votre prénom :");
		prenom = clavier.nextLine();
		return prenom;
	}

	// Recuperer le nom
	public static String recupererNom(Scanner clavier) {
		String nom;
		System.out.println("Entrez votre nom :");
		nom = clavier.nextLine();
		return nom;
	}

	// Recuperer la date de naissance
	public static String recupererDateDeNaissance(Scanner clavier) {
		String dateDeNaissance;
		System.out.println("Entrez votre date de naissance (XX/XX/XXXX) :");
		dateDeNaissance = clavier.nextLine();
		return dateDeNaissance;
	}

	// Recuperer l'age
	public static String recupererAge(Scanner clavier) {
		String age;
		System.out.println("Entrez votre age :");
		age = clavier.nextLine();
		return age;
	}

	// Recuperer menu
	public static String recupererMenu(Scanner clavier) {
		String menu = null;
		System.out.println("Que voulez-vous faire ?" + "\n Pour ajouter tapez a " + "\n Pour supprimer tapez s"
				+ "\n Pour modifier tapez m" + "\n Pour faire l'appel tapez f" + "\n Pour quitter tapez q");
		menu = clavier.nextLine();
		return menu;
	}
	
	//Afficher liste
	public static void afficherListe(ArrayList<String> listeUtilisateurs) {
		Iterator<String> iterateur = listeUtilisateurs.iterator();
		while (iterateur.hasNext()) {
			System.out.println(iterateur.next());
		}
	}
}


