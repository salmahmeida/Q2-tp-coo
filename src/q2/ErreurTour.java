package q2;

/* Permet de d�tecter les erreurs fa�tes seulement par la classe "Tour".
 * Il est le fils de "ErreurPile" car une "Tour" est une "Pile" !
 */
public class ErreurTour extends ErreurPile {
    public ErreurTour() {
    	super();
    }

    public ErreurTour(String msg) {
    	super(msg);
    }
}
