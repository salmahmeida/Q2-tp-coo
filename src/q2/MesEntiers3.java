package q2;

/* Cet Objet pourrait être un fils d'"Empilable".
 * Cependant, il n'a pas été définit comme tel.
 * Donc si on fait appelle à lui, il devra être rejeté.
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

