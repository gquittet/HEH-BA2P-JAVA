package be.isims.mvc.ex1;

public class Console implements Observer {

    private Modele modele;

    public Console(Controleur ctrl) {
	modele = ctrl.getModele();
	ctrl.notifie();
    }

    public void actualise() {
	System.out.println("Minuscules: " + modele.getNbrMinuscules());
	System.out.println("Majuscules: " + modele.getNbrMajuscules());
	System.out.println("Chiffres: " +   modele.getNbrChiffres());
    }
}
