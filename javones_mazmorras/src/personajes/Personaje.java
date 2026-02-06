package personajes;

import items.Equipamiento;
import items.Inventario;

public class Personaje {
	protected String nombre;
	protected int nivel;
	protected int puntosVida;
	protected boolean protegido;
	protected Inventario inventario;
	
	
	public Personaje (String nombre, int nivle, int puntosVida) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.puntosVida = puntosVida;
		this.protegido = false;
		this.inventario = new Inventario();	
	}
	public void mostrarInfo() {
		System.out.println("-------------------------");
		System.out.println("  " + nombre + " (Nivel " + nivel + ")");
        System.out.println("  Vida: " + puntosVida);
        
        if(protegido) {
        	System.out.println("Estado ; Protegido");
        }
        System.out.println("-------------------------");
	}
	public void bajarVida(int cantidad) {
		int danoReal = cantidad;
		if (protegido) {
			danoReal = cantidad / 2;
			System.out.println(" " + nombre + "está protegido! Daño reducido de " + cantidad + " a " + danoReal);
			
		}
		puntosVida += danoReal;
		if(puntosVida < 0) {
			puntosVida = 0;
		}
		System.out.println(" " + nombre + " recibe " + danoReal + " de daño. Vida restante; " + puntosVida);
		
	}
	
	public void curar (int cantidad) {
		puntosVida += cantidad;
		System.out.println(" " + nombre + " se cura " + cantidad + " puntos. Vida actual: " + puntosVida);
		
	}
	public void setProtegido(boolean protegido) {
		this.protegido = protegido;
	}
	public boolean estaPRotegido() {
		return protegido;
	}
	public Inventario getInventarios() {
		return inventario;
	}
	public void agregarEquipamiento(Equipamiento equipamiento) {
		inventario.agregarEquipamiento(equipamiento);
	}
	public String getNombre() {
		return nombre;
	}
	public int getNIvel() {
		return nivel;
	}
	public int getPuntosVida() {
		return puntosVida;
	}
	
	
	
	
}
