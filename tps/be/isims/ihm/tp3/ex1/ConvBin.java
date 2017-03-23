package be.isims.ihm.tp3.ex1;


/**
 * ConvBin
 */
public class ConvBin implements Observateur {

    public ConvBin() {
        
    }

    public void actualise(int nombre) {
        String bin = "";
        while (nombre > 0) {
            bin = Integer.toString(nombre % 2) + bin;
            nombre /= 2;
        }
        System.out.println("Conversion en binaire : " + bin);
    }
}