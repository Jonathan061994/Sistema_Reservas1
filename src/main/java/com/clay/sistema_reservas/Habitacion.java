public class Habitacion {
    private int id;
    private int capacidad;
    private String tipo;
    private int nivel;
    private float precio;
    private String estado;
 
    public Habitacion() {}
 
    public Habitacion(int id, int capacidad, String tipo, int nivel, float precio, String estado) 
	{
        this.id = id;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.nivel = nivel;
        this.precio = precio;
        this.estado = estado;
    }
 
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
 
    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }
 
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
 
    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }
 
    public float getPrecio() { return precio; }
    public void setPrecio(float precio) { this.precio = precio; }
 
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
