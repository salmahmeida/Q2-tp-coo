package q2;

public class Tour extends Pile {

	public Tour(int capa) {
		super(capa);
	}

	public void remplir(int nb, Class C) throws ErreurPile, InstantiationException, IllegalAccessException, ClassNotFoundException {

		for(int i = nb; i > 0; i--) {
			try {
				Class cl = Class.forName(C.getName());
				Object d = cl.newInstance();
				/*Object d = C.getClass().newInstance();*/
				((Empilable)d).setVal(i);
				this.empiler(d);
			} catch (NullPointerException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				System.out.println("Oups!!!, la class entree n'existe pas !!!");
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassCastException e) {
				System.out.println("Les objets de la classe entree ne sont pas empilable !!!");
				e.printStackTrace();
				System.exit(0);
			}
		}
	}

	public void empiler(Object v) throws ErreurPile {
		try{
			/* On n'empile que si la tour estvide ou que la sommet est plus petit que l'Empilable. */ 
			if(this.estVide() || (((Empilable)this.sommet()).compareTo((Empilable)v)>0)) super.empiler(v);
			else throw new ErreurTour("Le sommet est plus petit que l'Empilable a empiler s!!");
		} catch(ClassCastException e) {
			System.out.println("Oups! l'objet a empiler n'est pas un Empilable !");
		}
	}

}
