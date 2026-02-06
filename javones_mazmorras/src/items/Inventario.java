package items;

import java.util.ArrayList;


public class Inventario {
	private ArrayList<Equipamiento> equipamiento;
	
	public Inventario() {
		  this.equipamiento = new ArrayList<>();
	}
	
	public void agregarEquipamiento(Equipamiento equipamiento) {
		this.equipamiento.add(equipamiento);
		System.out.println(" " + equipamiento.getNombre() + " añadido al inventario");
	}
	
	public void mostrarInventario() {
		System.out.println(" INVENTARIO");
		if(equipamiento.isEmpty()) {
			System.out.println(" (vacio)");
		}else {
			for (int i = 0; i < equipamiento.size(); i++) {
				System.out.println(" " + (i + 1) + ". " + equipamiento.get(i));
			}
		}
		System.out.println("------------------");
	}
	
	
}
