package com.cpochard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AjouterUnUtilisateur {
	static ArrayList<Object[]> listeUtilisateurs = new ArrayList<Object[]>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner clavier = new Scanner(System.in);
		String menu = null;
		int debut = 0;

		while (debut == 0) {

			menu = CodesFonctions.recupererMenu(clavier);

			if (menu.equals("a")) {
				listeUtilisateurs.add(new Object[] { CodesFonctions.recupererId(clavier), " ",
						CodesFonctions.recupererPrenom(clavier), " ", CodesFonctions.recupererNom(clavier), " ",
						CodesFonctions.recupererDateDeNaissance(clavier), " ", CodesFonctions.recupererAge(clavier) });
			}

			else if (menu.equals("s")) {
				System.out.println("Quel utilisateur voulez-vous supprimer ?");
				Iterator<Object[]> iterateur = listeUtilisateurs.iterator();
				while (iterateur.hasNext()) {
					Object[] etudiant = iterateur.next();
					for (Object info : etudiant) {
						System.out.print(info);
					}
					System.out.println();
				}
				int idToDelete = clavier.nextInt();
				for (int ligne = 0; ligne < listeUtilisateurs.size(); ligne++) {
					Object[] utilisateur = listeUtilisateurs.get(ligne);
					System.out.println(utilisateur[0].getClass());
					System.out.println(idToDelete);
					System.out.println((utilisateur[0] == (Object) idToDelete));
					if (utilisateur[0] == (Object) idToDelete) {
						listeUtilisateurs.remove(ligne);
					}
				}
			}

			else if (menu.equals("m")) {
				System.out.println("Quel utilisateur voulez-vous modifier ?");
				Iterator<Object[]> iterateur = listeUtilisateurs.iterator();
				while (iterateur.hasNext()) {
					Object[] etudiant = iterateur.next();
					for (Object info : etudiant) {
						System.out.print(info);
					}
					System.out.println();
				}
				int idToModify = clavier.nextInt();
				for (int ligne = 0; ligne < listeUtilisateurs.size(); ligne++) {
					Object[] newData = listeUtilisateurs.get(ligne);
					if (newData[0] == (Object) idToModify) {
						System.out.println(
								"Quel paramètre souhaitez-vous modifier ? id/nom/prenom/date de naissance/age");
						String champsAModifier = clavier.nextLine();
						switch (champsAModifier) {
						case "id":
							byte newId = clavier.nextByte();
							newData[0] = newId;
							break;
						case "nom":
							String newNom = clavier.next();
							newData[1] = newNom;
							break;
						case "prenom":
							String newPrenom = clavier.next();
							newData[2] = newPrenom;
							break;
						case "date de naissance":
							String newDateDeNaissance = clavier.next();
							newData[3] = newDateDeNaissance;
							break;
						case "age":
							String newAge = clavier.next();
							newData[4] = newAge;
							break;
							listeUtilisateurs.set(ligne, newData);

						}

					}

					else if (menu.equals("f")) {
						Object[] infosUtilisateurs = listeUtilisateurs.toArray();

					} else if (menu.equals("q")) {
						System.exit(0);
					}

				}

			}
		}
	}
}
