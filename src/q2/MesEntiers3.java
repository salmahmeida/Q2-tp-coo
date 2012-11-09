package q2;

public class MesEntiers3  {
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

