package q2;

/* Permet de détecter les erreurs faîtes seulement par la classe "Pile" */
public class ErreurPile extends Exception {

    public ErreurPile() {
    	super();
    }

    public ErreurPile(String msg) {
    	super(msg);
    }
}
