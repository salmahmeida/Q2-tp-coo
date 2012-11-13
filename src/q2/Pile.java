package q2;
import java.util.ArrayList;

public class Pile {

	private int capacite;
	// L'index 0 de "listObj" correspond au sommet de la pile
	private ArrayList listObj;

	public Pile(int capa) {
		this.capacite = capa; 
		this.listObj = new ArrayList();
	}

	/* Une pile ne prend pas en compte la relation d'ordre des objets !
	 * Il prend en compte que sa capacit� et sa hauteur.
	 */
	public void empiler(Object v) throws ErreurPile {
		if (this.listObj.size() == this.capacite) {
			throw new ErreurPile("Empilement : La Pile est pleine !");
		}
		else {
			/* On met l'objet sur le sommet de la pile, et non � sa queue*/
			this.listObj.add(0, v);
		}
	}

	/* La fonction "depiler()" ne depile que le premier element de la pile,
	 * c'est-�-dire celui qui est � l'indice 0.
	 */
	public void depiler() throws ErreurPile {
		if (this.estVide()) {
			throw new ErreurPile("D�pilement: La Pile est vide !");
		}
		this.listObj.remove(0);
	}

	public Object sommet() throws ErreurPile {
		if ( this.estVide() ) {
			throw new ErreurPile("Sommet : La Pile est vide !");
		}
		return this.listObj.get(0);
	}

	public boolean estVide() {
		if ( this.listObj.size() == 0 ) { return true;}
		return false;
	}

	public int hauteur() {
		return this.listObj.size();
	}

	public int capacite () {
		return this.capacite;
	}

	/* Affiche les elements de la pile dans l'ordre en commencant par le
	 * plus petit element.
	 * NOTE : Pile ne prend pas en compte la taille des Objet qu'elle porte.
	 * Ici, les �l�ments seront donc affich� que dans l'ordre o� ils ont �t� mis
	 * dans la liste.
	 */
	public void affiche () { 
		for (int i = 0; i < this.listObj.size(); i++) {
			System.out.println( this.listObj.get(i).toString());
		}
	}
}
