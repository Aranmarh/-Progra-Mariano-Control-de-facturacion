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
public class ProveedorC {
    int id;
    String nombre;
    String direccion;
    int tel;

    public ProveedorC(int id, String nombre, String direccion, int tel) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
}
