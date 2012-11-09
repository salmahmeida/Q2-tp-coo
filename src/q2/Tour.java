package q2;
public class Tour extends Pile{
	public Tour(int capa) {
		super(capa);
	}

	public void remplir(int nb) throws ErreurPile {
		for(int i = nb; i > 0; i--){
			Object d=(Empilable)new Object();
			((Empilable)d).setVal(i);
			this.empiler(d);
		}
	}

	public void empiler(Empilable v) throws ErreurPile {
		try{		
			if(this.estVide() || (((Empilable)this.sommet()).compareTo((Empilable)v)>0)) super.empiler((Disque)v);
			else throw new ErreurTour("le sommet est plus petit que l'object a empiler!!");
		}catch(ClassCastException e){
			System.out.println("Ops! l'objet a empiler n'est pas un empilable, la tour rejete");//le cas ou la tour est vide et v#disque
		}

	}

}
