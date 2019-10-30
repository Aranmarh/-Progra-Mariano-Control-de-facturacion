/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import java.text.SimpleDateFormat;
import com.toedter.calendar.JDateChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aran
 */
public class Compras extends javax.swing.JFrame {
    AdPro e;
DefaultComboBoxModel modeloP, modeloProducto;
DefaultTableModel model =  new DefaultTableModel();
int idp,idpr=0;
String date;
    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
    /**
     * Creates new form Compras
     */
    public Compras(AdPro e) {
        this.e = e;
        initComponents();
        refresh();
        this.setVisible(true);
        model.addColumn("id Proveedor");
        model.addColumn("Proveedor");
        model.addColumn("id Producto");
        model.addColumn("Producto");
        model.addColumn("Fecha");
        jTable1.setModel(model);
        r();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        Date = new com.toedter.calendar.JDateChooser();
        cantidad = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Pago = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 50, 0, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ID Proveedor");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Pago");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("ID Producto");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Fecha");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Cantidad");

        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });

        jButton2.setText("Regresar");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Pagado");

        Pago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "Pagado" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Compra");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Pagar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(23, 23, 23)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7)))))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(Pago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cantidad)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(154, 154, 154))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 163, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(163, 163, 163))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
         if(c<'0'||c>'9') evt.consume();
    }//GEN-LAST:event_cantidadKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Object proveedor = jComboBox1.getSelectedItem();
       Object producto = jComboBox2.getSelectedItem();
       ProveedorC p = (ProveedorC)proveedor;
       productoC pr = (productoC)producto;
        System.out.println("Cantidad:"+cantidad.getText());
        System.out.println(pr.getProducto());
        System.out.println("________________________________________");
        if(updateMonto(pr.getProducto(), Integer.parseInt(cantidad.getText()))){
        createU(p.id, pr.producto,getFecha(Date), cantidad.getText(), Pago.getSelectedIndex());
        actualizarCantidad(cantidad.getText(), ""+pr.getProducto());
        }
        r();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int x = JOptionPane.showConfirmDialog(this, "Estas Seguro de que pagara?"); 
        if(x==0){

            
            if(update(""+idp, ""+idpr, date)){
                JOptionPane.showMessageDialog(this, "Se Pago");
                refresh();
                r();
            }else{
                JOptionPane.showMessageDialog(this, "Aun no se ha pagado");
            }
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int fila = jTable1.getSelectedRow();
        idp = Integer.parseInt(jTable1.getValueAt(fila, 0).toString());
        idpr = Integer.parseInt(jTable1.getValueAt(fila, 2).toString());
        date = jTable1.getValueAt(fila, 4).toString();
        System.out.println("idp"+idp+"idpr"+idpr+"d"+date);
        
    }//GEN-LAST:event_jTable1MouseClicked

    public void refresh(){
       
       modeloP =(DefaultComboBoxModel)this.jComboBox1.getModel();
       modeloProducto =(DefaultComboBoxModel)this.jComboBox2.getModel();
      ArrayList<ProveedorC> lista= readP();
        for (int i = 0; i < lista.size(); i++) {  
           modeloP.addElement(lista.get(i));
           // System.out.println(lista.get(i));
        }
        
      ArrayList<productoC> listap= read();
        for (int i = 0; i < listap.size(); i++) {    
           modeloProducto.addElement(listap.get(i));
           // System.out.println(lista.get(i));
        }

               
  }
   
    public void actualizarCantidad(String  cantidad, String idp){

        conexion c = new conexion();
        try {
            String sql= "UPDATE producto SET cantidad=cantidad+"+cantidad+" WHERE  idproducto = "+idp+" and cantidad ";
            PreparedStatement ps = c.connectDb().prepareStatement(sql);
            ps.execute();
            ps.close();
            ps=null;
            c.desconectar();
        } catch (Exception e) {
            
        }
    
    
    }
    
    public String getFecha(JDateChooser jd){
        if(jd.getDate()!=null){
        return formato.format(jd.getDate());
        }
        
    return null;
    }
    
    public ArrayList<ProveedorC> readP(){
            conexion c  = new conexion();
            ArrayList<ProveedorC> lista = new ArrayList<>();

              try {
                    String sql = "SELECT * FROM proveedor";
                    PreparedStatement ps = c.connectDb().prepareStatement(sql);
                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                    ProveedorC p= new ProveedorC(rs.getInt("idProveedor"), rs.getString("nombre"), rs.getString("direccion"),rs.getInt("telefono"));
                    lista.add(p);
                    }
                    ps.close();
                    ps=null;
                    c.desconectar();
              } catch (Exception e) {
                  System.out.println("Fallo metodo");
              }
              return lista;
  
  
  }
    
    public ArrayList<productoC> read(){
        conexion c  = new conexion();
        ArrayList<productoC> lista = new ArrayList<>();

          try {
                 String sql = "SELECT * FROM producto";
                PreparedStatement ps = c.connectDb().prepareStatement(sql);
                ResultSet rs=ps.executeQuery();
                while(rs.next()){
                productoC p= new productoC(rs.getInt("idProducto"), rs.getString("nombre"), rs.getDouble("precioVenta"), rs.getDouble("precioCompra"), rs.getInt("cantidad"));
                lista.add(p);
                }
                ps.close();
                ps=null;
                c.desconectar();
          } catch (Exception e) {
              System.out.println("Fallo metodo");
          }
          return lista;
  
  
  }
    
    public boolean createU(int proveedor, int producto, String fecha, String cantidad, int pago){
        conexion c= new conexion();
        try {
            String sql="INSERT INTO compraproducto (idproducto,idproveedor,cantidad,fecha,cancelado) VALUES ('"+producto+"','"+proveedor+"', '"+cantidad+"', '"+fecha+"', '"+pago+"');";
            PreparedStatement ps = c.connectDb().prepareStatement(sql);
            ps.execute();
            ps=null;
            c.desconectar();
            JOptionPane.showMessageDialog(this, "se agrego la compra");
            
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "no se inserto la compra");
            System.out.println("no se inserto el registro");
            return false;
        }
    
    }
      
    public boolean update(String idp, String idpr, String date){
        conexion c = new conexion();
        try {
            String sql= "UPDATE `compraproducto` SET `cancelado`='1' WHERE  `idproducto`="+idp+" AND `idproveedor`="+idpr+" AND  `fecha`='"+date+"'";
            PreparedStatement ps = c.connectDb().prepareStatement(sql);
            ps.execute();
            ps.close();
            ps=null;
            c.desconectar();
            return true;
        } catch (Exception e) {
            return false;
        }

}
    
    public boolean updateMonto(int idP, int ca){
        System.out.println(ca);
        System.out.println(idP);
        conexion c  = new conexion();
            try {
                    String sql = "UPDATE producto SET cantidad=cantidad+? WHERE idProducto=?";
                    PreparedStatement ps = c.connectDb().prepareStatement(sql);
                    ps.setInt(1, ca);
                    ps.setInt(2, idP);
                    ps.execute();
                    ps.close();
                    ps=null;
                    c.desconectar();
                    return true;
              } catch (Exception e) {
                  System.out.println(" no update Producto");
                  return false;
              }

    }
      
    public  void  r(){
        while(model.getRowCount()>0){
          model.removeRow(0);
      }
    conexion c  = new conexion();
    
    String cargar[]= new String[5];

      try {
            String sql = "select cp.idproveedor, p.nombre,cp.idproducto,pr.nombre,cp.fecha from proveedor p join compraproducto cp on p.idProveedor=cp.idproveedor join producto pr on cp.idproducto=pr.idProducto where cp.cancelado=0";
            PreparedStatement ps = c.connectDb().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                cargar[0]=rs.getString("cp.idproveedor");
                cargar[1]=rs.getString("p.nombre");
                cargar[2]=rs.getString("cp.idproducto");
                cargar[3]=rs.getString("pr.nombre");
                cargar[4]=rs.getString("cp.fecha");
                
                model.addRow(cargar);
            }
            ps.close();
            ps=null;
            c.desconectar();
      } catch (Exception e) {
          System.out.println("Fallo metodo");
      }
      cargar[0]="";
      cargar[1]="";
      cargar[2]="";
      cargar[3]="";
      cargar[4]="";
      model.addRow(cargar);
      jTable1.setModel(model);
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JComboBox<String> Pago;
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}