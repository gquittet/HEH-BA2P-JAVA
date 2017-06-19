package be.isims.mvc.ex1;


public class Controleur {

    private Texte texte;
    private Modele modele;

    public Controleur(Texte texte) {
	this.texte = texte;
	modele = new Modele(texte);
    }

    public Modele getModele() {
	return modele;
    }

    public void notifie() {
	texte.notifie();
	modele.updateData();
    }
}
