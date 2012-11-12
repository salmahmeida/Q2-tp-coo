package q2;

public class Disque implements Empilable {

	/* L'entier sous-entendu par la fonction "setVal(int v)" */
	private int val;

	public Disque (int v) {
		val = v;
	}

	public Disque () {
		val = 0;
	}

	public int getVal() {
		return val;
	}

	/* Fonction d'un Empilable */
	@Override
	public void setVal(int v) {
		this.val = v;
	}

	/* Fonction d'un Empilable*/
	public String toString() {
		return "Disque[" + val + "]";
	}

	/* Fonction d'un Comparable" */
	public int compareTo(Object v) {
		try {
			Disque d = (Disque) v;
			if ( this.val < d.getVal() ) return -1;
			if ( this.val == d.getVal() ) return 0;
			return 1;
		} catch ( ClassCastException e) { throw e; }
	}

}
