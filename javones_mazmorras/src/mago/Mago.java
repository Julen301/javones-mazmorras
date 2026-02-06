package mago;

public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre, int nivel, int puntosVida, int mana) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
    }

    public void lanzarHechizo(int costeMana) {
        if (mana >= costeMana) {
            mana -= costeMana;
            System.out.println("✨ " + nombre + " lanza un hechizo! Maná gastado: " + costeMana + " | Maná restante: " + mana);
        } else {
            System.out.println("❌ " + nombre + " no tiene suficiente maná. Maná actual: " + mana + " | Necesario: " + costeMana);
        }
    }

    public void recargarMana(int cantidad) {
        mana += cantidad;
        System.out.println("🔵 " + nombre + " recarga " + cantidad + " de maná. Maná actual: " + mana);
    }

    public int getMana() {
        return mana;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("  🔵 Maná: " + mana);
        System.out.println("═══════════════════════════════");
    }
}
