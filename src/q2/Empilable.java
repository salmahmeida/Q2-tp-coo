package q2;

public interface Empilable extends Comparable {

	/* Un empilable contient un entier indiquant sa taille.
	 * Cependant, une interface ne permet pas d'implanter d'entier sans le
	 * d�terminer en "public", "static" ou "final".
	 * L'entier est donc sous-entendu par la fonction "setVal(int v)".
	 */
	public void setVal(int v);

	/* On doit pouvoir d�crire un empilable, d'o� la fonction "toString()" */
	public String toString();

}
