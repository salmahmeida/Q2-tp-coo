package q2;

/* Permet de d�tecter les erreurs fa�tes seulement par la classe "Pile" */
public class ErreurPile extends Exception {

    public ErreurPile() {
    	super();
    }

    public ErreurPile(String msg) {
    	super(msg);
    }
}
