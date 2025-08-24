package com.clay.sistema_reservas;


public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String nickName;
    private String clave;

    public Usuario() { }

    public Usuario(int id, String nombre, String apellido, String telefono, String nickName, String clave) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.nickName = nickName;
        this.clave = clave;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getNickName() { return nickName; }
    public void setNickName(String nickName) { this.nickName = nickName; }

    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }
}
