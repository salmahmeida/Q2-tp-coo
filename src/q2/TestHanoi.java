package q2;
import java.util.Scanner;

public class TestHanoi {
	static public void main (String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("Entrer le nom de la classe pour les objets a empiler: ");
		String name = scan.nextLine();
		Hanoi h = null;
		try {
			h = new Hanoi(6,Class.forName(name));//pour les class dans le repertoire(q2) le nom commencera tjrs par: q2.nomclass
			                                     // exemple: Pour la class Disque: q2.Disque
		} catch (ErreurPile e) {
			System.out.println(e.getMessage());
		} catch (ClassCastException e) {
			System.out.println("ClassCastException: " + e.getMessage());
		} catch(ClassNotFoundException e){
			System.out.println("Ops!!!, la class entree n'existe pas!!");
			e.printStackTrace();
		}
		if (h != null) {
			System.out.println("Situation initiale:");
			h.affiche();
			h.jouer();
			System.out.println("Situation finale:");
			h.affiche();
		}
	}
}
