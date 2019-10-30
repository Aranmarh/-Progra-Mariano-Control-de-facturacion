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
public class PrestamoC {
    int id;
    String monto;

    public PrestamoC(int id, String monto) {
        this.id = id;
        this.monto = monto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }
    
    
              @Override
    public String toString(){
        return ""+id;
    }
}
