package be.isims.mvc.ex1;

import java.lang.Character;

public class Modele {

    private int nbrMinuscules;
    private int nbrMajuscules;
    private int nbrChiffres;
    private Texte texte;

    public Modele(Texte texte) {
	this.texte = texte;
    }

    public void updateData() {
	String texteString = texte.getTexte();
	nbrMinuscules = nbrMajuscules = nbrChiffres = 0;
	for (int i = 0; i < texteString.length(); i++) {
	    if (Character.isLowerCase(texteString.charAt(i)))
		nbrMinuscules++;
	    else if (Character.isUpperCase(texteString.charAt(i)))
		nbrMajuscules++;
	    else if (Character.isDigit(texteString.charAt(i)))
		nbrChiffres++;
	}
    }

    public int getNbrMinuscules() {
	return nbrMinuscules;
    }

    public int getNbrMajuscules() {
	return nbrMajuscules;
    }

    public int getNbrChiffres() {
	return nbrChiffres;
    }

    public Texte getTexte() {
	return texte;
    }
}
