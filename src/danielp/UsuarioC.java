/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielp;

/**
 *
 * @author Aran
 */
public class UsuarioC {
    int id;
    int tipo;
    String nombre;
    String contraseña;

    public UsuarioC(int id, int tipo, String nombre, String contraseña) {
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.contraseña=contraseña;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
}
