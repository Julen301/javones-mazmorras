import items.Equipamiento;
import personajes.Guerrero;
import personajes.Ladron;
import personajes.Mago;

public class Main {

	public static void main(String[] args) {

		System.out.println("╔═══════════════════════════════════════════╗");
		System.out.println("║             JAVONES Y MAZMORRAS           ║");
		System.out.println("╚═══════════════════════════════════════════╝");

		System.out.println("---CREANDO GRUPO DE AVENTUREROS---");

		Guerrero guerrero = new Guerrero("Thorin", 5, 150);
		Mago mago = new Mago("Gandalf", 5, 80, 100);
		Ladron ladron = new Ladron("Bilbo", 5, 100);

		guerrero.mostrarInfo();
		mago.mostrarInfo();
		ladron.mostrarInfo();

		System.out.println("--- EQUIPANDO GRUPO DE AVENTUREROS ---");

		guerrero.agregarEquipamiento(new Equipamiento("Espada", "Arma"));
		mago.agregarEquipamiento(new Equipamiento("Báculo", "Arma"));
		ladron.agregarEquipamiento(new Equipamiento("Dagas", "Arma"));

		System.out.println("--- INVENTARIOS ---");
		guerrero.getInventarios().mostrarInventario();
		mago.getInventarios().mostrarInventario();
		ladron.getInventarios().mostrarInventario();

		System.out.println("╔═══════════════════════════════════════════╗");
		System.out.println("║            ESCENARIO: COMBATE             ║");
		System.out.println("╚═══════════════════════════════════════════╝");

		System.out.println("Ataque de Goblins");

		guerrero.proteger(mago);
		mago.bajarVida(40);
		guerrero.bajarVida(30);

		mago.lanzarHechizo(30);
		ladron.hacerelInvisible();
		ladron.robar();

		System.out.println("--- DESCANSO ---");

		guerrero.dejarDeProteger();
		guerrero.curar(20);
		mago.curar(15);
		mago.recargarMana(40);

		System.out.println("╔═══════════════════════════════════════════╗");
		System.out.println("║               ESTADO FINAL                ║");
		System.out.println("╚═══════════════════════════════════════════╝");

		guerrero.mostrarInfo();
		mago.mostrarInfo();
		ladron.mostrarInfo();

		System.out.println("╔═══════════════════════════════════════════╗");
		System.out.println("║                VICTORIA!!                 ║");
		System.out.println("╚═══════════════════════════════════════════╝");
	}

}
