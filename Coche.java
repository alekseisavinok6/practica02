//practica02_v01_1;

public class Coche {
	private String marca;
	private String modelo;
	private String color;
	private int anio;
	private int id;
	private boolean borrado;

	public Coche( String marca, String modelo, int anio, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
		this.anio = anio;
		this.id = 0;
        this.borrado = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
    public String toStr() {
        // Asumiendo anchos de campo fijos, ajusta los números según sea necesario
        return String.format("%-4d %-20s %-15s %-6d %-10s", id, marca, modelo, anio, color);
    }
}


