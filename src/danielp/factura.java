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
public class factura {
    int idFactura;
    String date;
    int idCliente;
    float Total;

    public factura(int idFactura, String date, int idCliente) {
        this.idFactura = idFactura;
        this.date = date;
        this.idCliente = idCliente;
    }

    
    public factura(int idFactura, String date, int idCliente, float Total) {
        this.idFactura = idFactura;
        this.date = date;
        this.idCliente = idCliente;
        this.Total = Total;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float Total) {
        this.Total = Total;
    }
    
    @Override
    public String toString(){
        return ""+idFactura;
    }
}
