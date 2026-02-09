import items.Equipamiento;
import personajes.Guerrero;
import personajes.Ladron;
import personajes.Mago;

public class Main {

	public static void pausa(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		System.out.println("╔═══════════════════════════════════════════╗");
		System.out.println("║             JAVONES Y MAZMORRAS           ║");
		System.out.println("╚═══════════════════════════════════════════╝");
		pausa(2);

		System.out.println("---CREANDO GRUPO DE AVENTUREROS---");

		Guerrero guerrero = new Guerrero("Thorin", 5, 150);

		Mago mago = new Mago("Gandalf", 5, 80, 100);

		Ladron ladron = new Ladron("Bilbo", 5, 100);

		System.out.println();

		pausa(2);
		guerrero.mostrarInfo();
		pausa(2);

		mago.mostrarInfo();
		pausa(2);

		ladron.mostrarInfo();
		pausa(3);

		System.out.println();

		System.out.println("--- EQUIPANDO GRUPO DE AVENTUREROS ---");

		guerrero.agregarEquipamiento(new Equipamiento("Espada", "Arma"));
		mago.agregarEquipamiento(new Equipamiento("Báculo", "Arma"));
		ladron.agregarEquipamiento(new Equipamiento("Dagas", "Arma"));
		pausa(3);

		System.out.println();

		System.out.println("--- INVENTARIOS ---");
		guerrero.getInventarios().mostrarInventario();
		pausa(1);

		mago.getInventarios().mostrarInventario();
		pausa(1);
		ladron.getInventarios().mostrarInventario();
		pausa(1);
		pausa(3);
		System.out.println();

		System.out.println("╔═══════════════════════════════════════════╗");
		System.out.println("║            ESCENARIO: COMBATE             ║");
		System.out.println("╚═══════════════════════════════════════════╝");
		pausa(2);
		System.out.println();

		System.out.println("Ataque de Goblins");
		pausa(3);
		System.out.println();

		guerrero.proteger(mago);
		pausa(3);
		System.out.println();

		mago.bajarVida(40);
		guerrero.bajarVida(30);
		pausa(3);
		System.out.println();

		mago.lanzarHechizo(30);
		pausa(3);
		System.out.println();

		ladron.hacerelInvisible();
		ladron.robar();
		pausa(3);
		System.out.println();

		System.out.println("--- DESCANSO ---");
		pausa(3);
		System.out.println();

		guerrero.dejarDeProteger();
		guerrero.curar(20);
		mago.curar(15);
		mago.recargarMana(40);
		pausa(3);
		System.out.println();

		System.out.println("╔═══════════════════════════════════════════╗");
		System.out.println("║               ESTADO FINAL                ║");
		System.out.println("╚═══════════════════════════════════════════╝");
		System.out.println();

		guerrero.mostrarInfo();
		mago.mostrarInfo();
		ladron.mostrarInfo();

		System.out.println("╔═══════════════════════════════════════════╗");
		System.out.println("║                VICTORIA!!                 ║");
		System.out.println("╚═══════════════════════════════════════════╝");
	}

}
