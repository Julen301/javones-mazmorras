package personajes;

public class Guerrero extends Personaje {
    private Personaje companeroProtegido;

    public Guerrero(String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
        this.companeroProtegido = null;
    }

    public void proteger(Personaje companero) {
        if (companeroProtegido != null) {
            dejarDeProteger();
        }
        this.companeroProtegido = companero;
        companero.setProtegido(true);
        System.out.println("🛡 " + nombre + " ahora protege a " + companero.getNombre());
    }

    public void dejarDeProteger() {
        if (companeroProtegido != null) {
            companeroProtegido.setProtegido(false);
            System.out.println("🛡 " + nombre + " deja de proteger a " + companeroProtegido.getNombre());
            companeroProtegido = null;
        } else {
            System.out.println("⚠ " + nombre + " no está protegiendo a nadie");
        }
    }

    public Personaje estaProtegiendo() {
        return companeroProtegido;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        if (companeroProtegido != null) {
            System.out.println("  🛡 Protegiendo a: " + companeroProtegido.getNombre());
        }
        System.out.println("═══════════════════════════════");
    }
}
