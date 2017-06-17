package be.isims.coo.tp4.ex1;

/**
* CahierNotesTest
*/
public class CahierNotesTest {

    public static void main(String[] args) {
        int[] t = new int[]{87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        CahierNotes cahierNotes = new CahierNotes("Info", t);
        cahierNotes.traitementNotes();
    }
}