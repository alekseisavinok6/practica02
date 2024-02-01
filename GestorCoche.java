//practica02_v01_1;

import java.util.ArrayList;

public class GestorCoche {
	private ArrayList<Coche> coches = new ArrayList<Coche>();
    private int id = 1;
    public void agregarCoche(Coche coche) {
        coche.setId(id++);
        coches.add(coche);
    }
    public ArrayList<Coche> listarCoches() {
        ArrayList<Coche> cochesNoBorrados = new ArrayList<Coche>();
        for (Coche coche : coches) {
            if (!coche.isBorrado()) {
                cochesNoBorrados.add(coche);
            }
        }
        return cochesNoBorrados;
    }
}
