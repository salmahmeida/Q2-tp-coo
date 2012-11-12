package q2;

public class MesEntiers2 implements Empilable {

	/* L'entier sous-entendu par la fonction "setVal(int v)" */
	Integer val;

	public MesEntiers2(){
		val=null;
	}

	public MesEntiers2(int v) {
		val = v;
	}

	public void init(int nb) {
		val = new Integer(nb);
	}

	/* Fonction d'un Empilable*/
	@Override
	public void setVal(int v) {
		this.val = v;
	}

	/* Fonction d'un Empilable*/
	public String toString() {
		return "MesEntiers2[" + val.intValue() +"]";
	}

	/* Fonction d'un Comparable" */
	public int compareTo(Object v) {
		MesEntiers2 m = (MesEntiers2) v;
		return val.compareTo(m.val);
	}

}
