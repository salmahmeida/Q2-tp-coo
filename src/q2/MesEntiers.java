package q2;

public class MesEntiers implements Empilable {

	/* L'entier sous-entendu par la fonction "setVal(int v)" */
	Integer val;

	public MesEntiers() {
		val = null;
	}

	public void init(int nb) {
		val = new Integer(nb);
	}

	/* Fonction d'un Empilable */
	@Override
	public void setVal(int v) {
		this.val = v;
	}

	/* Fonction d'un Empilable */
	public String toString() {
		return "MesEntiers[" + val.intValue() +"]";
	}

	/* Fonction d'un Comparable" */
	public int compareTo(Object v) {
		MesEntiers m = (MesEntiers) v;
		return val.compareTo(m.val);
	}

}

