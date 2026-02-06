package personajes;

public class Ladron extends Personaje {
	private boolean invisible;

	public Ladron(String nombre, int nivel, int puntosVida) {
		super(nombre, nivel, puntosVida);
		this.invisible = false;
	}

	public void robar() {
		if (invisible) {
			System.out.println(nombre + " Roba sigilosamente sin ser detectado!");
		} else {
			System.out.println(nombre + " Intenta robar, pero es visible!");
		}
	}

	public void hacerelInvisible() {
		invisible = !invisible;
		if (invisible) {
			System.out.println(nombre + " se vuelve invisible!");
		} else {
			System.out.println(nombre + " vuelve a ser visible");
		}
	}

	public boolean estaInvisible() {
		return invisible;
	}

	@Override
	public void mostrarInfo() {

		super.mostrarInfo();
		if (invisible) {
			System.out.println("Estado: INVISIBLE");
		}
	}

}
