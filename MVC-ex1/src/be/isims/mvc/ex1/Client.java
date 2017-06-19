package be.isims.mvc.ex1;

public class Client {

	public static void main(String[] args) {
	    Texte txt = new Texte("AAbbbCd12GG9");
	    Controleur ctrl = new Controleur(txt);

	    Fenetre fen = new Fenetre(ctrl);
	    fen.setVisible(true);

	    Console cons = new Console(ctrl);

	    txt.ajouter(fen);
	    txt.ajouter(cons);
	}
}
