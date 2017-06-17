package be.isims.coo.tp4.ex1;

/**
 * CahierNotes
 */
public class CahierNotes {
    private String nomDuCours;
    private int[] tableauDeNotes;
    private int noteMinimale;
    private int noteMaximale;
    private float moyenne;
    private Ordinogramme ordinogramme;

    /**
     * Crée un cahier de notes
     * @param nomDuCours Le nom du cours
     * @param tableauDeNotes Le tableau avec les notes
     */
    public CahierNotes(String nomDuCours, int[] tableauDeNotes) {
        this.nomDuCours = nomDuCours;
        this.tableauDeNotes = tableauDeNotes;
        ordinogramme = new Ordinogramme();
    }

    /**
     * S'occupe de l'affichage et d'appeler la fonction qui parcoure le tableau des notes
     */
    public void traitementNotes() {
        System.out.println("Bienvenue au cahier de note du cours : " + nomDuCours);
        System.out.println("Voici les notes sur 100 obtenues par les etudiants :");
        parcourirTableau();
        System.out.println("La moyenne de la classe : " + Float.toString(moyenne));
        System.out.println("La note la plus basse : " + Integer.toString(noteMinimale));
        System.out.println("La note la plus haute : " + Integer.toString(noteMaximale));
        System.out.println("Repartition des notes :");
        ordinogramme.print();
    }

    /**
     * Parcoure le tableau pour afficher les notes, calculer le minimum, maximum, la moyenne et s'occuper de l'organigramme
     */
    private void parcourirTableau() {
        for (int i = 0; i < tableauDeNotes.length; i++) {
            afficherNotes(i);
            computeMinimum(tableauDeNotes[i], i);
            computeMaximum(tableauDeNotes[i], i);
            computeMoyenne(tableauDeNotes, i);
            ordinogramme.add(tableauDeNotes[i]);
        }
        computeMoyenne(tableauDeNotes, tableauDeNotes.length);
    }

    /**
     * Affiche les notes de l'étudiant i+1
     * @param i Un entier correspondant à la place de l'étudiant dans le tableau des notes
     */
    private void afficherNotes(int i) {
        System.out.println("Etudiant " + Integer.toString(i + 1) + 
                            " : " + 
                            Integer.toString(tableauDeNotes[i]));
    }

    /**
     * Calcule la moyenne d'un tableau t
     * @param t Le tableau des notes
     * @param i L'indice où l'on se trouve actuellement dans le tableau
     */
    private void computeMoyenne(int[] t, int i) {
        if (i < t.length)
            moyenne += t[i];
        else
            moyenne = (float) (moyenne / t.length);
    }

    /**
     * Calcule la note minimale
     * @param n Un entier correspondant à une note
     * @param i Correspondant à la position dans le tableau 
     */
    private void computeMinimum(int n, int i) {
        if (i > 0) {
            if (noteMinimale > n)
                noteMinimale = n;
        } else {
            noteMinimale = n;
        }
    }

    /**
     * Calcule la note maximale
     * @param n Un entier correspondant à une note
     * @param i Correspondant à la position dans le tableau 
     */
    private void computeMaximum(int n, int i) {
         if (i > 0) {
            if (noteMaximale < n)
                noteMaximale = n;
        } else {
            noteMaximale = n;
        }
    }
}