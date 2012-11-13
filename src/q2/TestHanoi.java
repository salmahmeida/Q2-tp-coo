package q2;
import java.util.Scanner;

public class TestHanoi {
	static public void main (String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("Les classes acceptés sont des Empilable, les empilable inclus sont q2.Disque, q2.MesEntiers, q2.MesEntiers2.");
		System.out.println("La classe q2.MesEntiers3 sera rejeté !");
		System.out.print("Entrer le nom de la classe pour les objets a empiler: ");
		/* Pour les class dans le repertoire(q2), le nom commencera tjrs par: q2.nomclass
         * Exemple: Pour la class Disque: q2.Disque
		 * Seuls les "Empilables" sont acceptés. Ainsi, q2.MesEntiers3 est rejetés ! */		
		String name = scan.nextLine();
		Hanoi h = null;
		try {
			h = new Hanoi(6, Class.forName(name));
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
