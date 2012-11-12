package q2;

/* Cet Objet pourrait �tre un fils d'"Empilable".
 * Cependant, il n'a pas �t� d�finit comme tel.
 * Donc si on fait appelle � lui, il devra �tre rejet�.
 */
public class MesEntiers3 {
	
	Integer val;

	public MesEntiers3(){
    	val=null;
    }
	public void init(int nb) {
		val = new Integer(nb);
	}

	public int compareTo(Object v) {
		MesEntiers3 m = (MesEntiers3) v;
		return val.compareTo(m.val);
	}

	public String toString() {
		return "MesEntiers3[" + val.intValue() +"]";
	}
}

