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
public class CompraC {
    int idP, idPr;
    String Proveedor, Producto, fecha;

    public CompraC(int idP,  String Proveedor,int idPr, String Producto, String fecha) {
        this.idP = idP;
        this.idPr = idPr;
        this.Proveedor = Proveedor;
        this.Producto = Producto;
        this.fecha = fecha;
    }

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public int getIdPr() {
        return idPr;
    }

    public void setIdPr(int idPr) {
        this.idPr = idPr;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
