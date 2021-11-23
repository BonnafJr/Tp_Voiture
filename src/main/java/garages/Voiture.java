package garages;

import java.io.PrintStream;
import java.util.*;

public class Voiture {

    private final String immatriculation;
    private final List<Stationnement> myStationnements = new LinkedList<>();

    public Voiture(String i) {
        if (null == i) {
            throw new IllegalArgumentException("Une voiture doit avoir une immatriculation");
        }

        this.immatriculation = i;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

   
    public void entreAuGarage(Garage g) throws Exception {
        if (myStationnements.get(myStationnements.size() - 1).estEnCours() && myStationnements.isEmpty() == false) {
            throw new IllegalArgumentException("Cette voiture est déjà dans un garage");
        }
        Stationnement s = new Stationnement(this, g);
        myStationnements.add(s);
    }

    
    public void sortDuGarage() throws Exception {
        if (myStationnements.get(myStationnements.size() - 1).estEnCours()== false || myStationnements.isEmpty() == false) {
            throw new IllegalArgumentException("Cette voiture n'est pas dans un garage");
        }
        myStationnements.get(myStationnements.size() - 1).terminer();
    }

    
    public Set<Garage> garagesVisites() {
        
        if (myStationnements.isEmpty()){
            throw new UnsupportedOperationException("Cette voiture n'a jamais visité de garage");
        }
        return null;
    }

	/**
	 * @return vrai si la voiture est dans un garage, faux sinon
	 */
    public boolean estDansUnGarage() {
        // TODO: Implémenter cette méthode
        throw new UnsupportedOperationException("Pas encore implémenté");
        // Vrai si le dernier stationnement est en cours
    }

    /**
     * Pour chaque garage visité, imprime le nom de ce garage suivi de la liste
     * des dates d'entrée / sortie dans ce garage
     * <br>Exemple :
     * <pre>
     * Garage Castres:
     *		Stationnement{ entree=28/01/2019, sortie=28/01/2019 }
     *		Stationnement{ entree=28/01/2019, en cours }
     *  Garage Albi:
     *		Stationnement{ entree=28/01/2019, sortie=28/01/2019 }
     * </pre>
     *
     * @param out l'endroit où imprimer (ex: System.out)
     */
    public void imprimeStationnements(PrintStream out) {
        // TODO: Implémenter cette méthode
        throw new UnsupportedOperationException("Pas encore implémenté");
    }

}
