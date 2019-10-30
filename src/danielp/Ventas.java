/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package danielp;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.toedter.calendar.JDateChooser;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Aran
 */
public class Ventas extends javax.swing.JFrame {
    Emp e;
 SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
 SimpleDateFormat formato2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 DefaultComboBoxModel modeloProducto, modeloC;
 int factura;
 double total=0;
 DefaultTableModel model =  new DefaultTableModel();
    /**
     * Creates new form Ventas
     */
    public Ventas(Emp e) {
        this.e=e;
        initComponents();
        this.setVisible(true);
        this.setTitle("Venta");
        model.addColumn("Id producto");
        model.addColumn("Producto");
        model.addColumn("Precio");
        Tot.setText("Total: "+total);
        
        jTable1.setModel(model);
        inicio();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        fact = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Tot = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(350, 100, 800, 500));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Factura No: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Id Cliente:");

        Date.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Date.setText("Fecha");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Producto:");

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
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        fact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fact.setText("N");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Comprar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Tot.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Tot.setText("Total:");

        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fact, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1)
                                    .addComponent(Tot, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(fact, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(Tot)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      boolean agregado= true;
      
        Object cliente = jComboBox1.getSelectedItem();
        Object producto = jComboBox2.getSelectedItem();
         productoC pr = (productoC)producto;
         ClienteC c = (ClienteC)cliente;
         
        if(agregado){
            jComboBox1.setEnabled(false);
            createF(factura, getFecha(), c.getId());
            agregado=false;

        }
        if(updateMonto(pr.getProducto())){
            createDetalle(factura, pr.getProducto(), getFecha2());
            model.addRow(new Object[]{pr.getProducto(), pr.getNombre(), pr.getPrecioCompra()});
            total=total+pr.getPrecioCompra();
            Tot.setText("Total: "+total);
        }
        refresh();
        
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       fact(factura);
       Ventas v= new Ventas(this.e);
       this.dispose();
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.e.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    
    public boolean createF(int nofactura,String date, int noCliente){
        conexion c= new conexion();
        try {
            String sql="INSERT INTO factura(idFactura,fecha,idCliente) VALUES('"+nofactura+"','"+date+"','"+noCliente+"')";
            PreparedStatement ps = c.connectDb().prepareStatement(sql);
            ps.execute();
            ps=null;
            c.desconectar();
            //JOptionPane.showMessageDialog(this, "se agrego el registro");
            
            return true;
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(this, "no se inserto el registro");
            System.out.println("no se inserto Factura");
            return false;
        }
    
    }
    
        public boolean createDetalle(int nofactura, int noProducto,String date){
        conexion c= new conexion();
        try {
            String sql="INSERT INTO detalle(idFactura,idproducto,cantidad) VALUES('"+nofactura+"','"+noProducto+"','"+date+"')";
            PreparedStatement ps = c.connectDb().prepareStatement(sql);
            ps.execute();
            ps=null;
            c.desconectar();
            //JOptionPane.showMessageDialog(this, "se agrego el registro");
            
            return true;
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(this, "no se inserto el registro");
            System.out.println("no se inserto el registro");
            return false;
        }
    
    }
    
    
     public String getFecha(){
        Date fecha =  new Date();
        //System.out.println(fecha);
        return formato.format(fecha);
     }
     public String getFecha2(){
        Date fecha =  new Date();
        //System.out.println(fecha);
        return formato2.format(fecha);
     }
     
     
     
     public void inicio(){
     Date.setText(getFecha());
     setfactura();
     refresh();
     
      while(model.getRowCount()>0){
          model.removeRow(0);
      }
     
     
     }
     
    public void refresh(){
       
       modeloC =(DefaultComboBoxModel)this.jComboBox1.getModel();
       modeloProducto =(DefaultComboBoxModel)this.jComboBox2.getModel();
      ArrayList<ClienteC> lista= readC();
        for (int i = 0; i < lista.size(); i++) {  
           modeloC.addElement(lista.get(i));
           // System.out.println(lista.get(i));
        }
        int itemCount = jComboBox2.getItemCount();
        for(int i=0;i<itemCount;i++){
              jComboBox2.removeItemAt(0);
           }  
        ArrayList<productoC> listap= read();
          for (int i = 0; i < listap.size(); i++) {    
             modeloProducto.addElement(listap.get(i));
             // System.out.println(lista.get(i));
          }

               
  }
    public ArrayList<ClienteC> readC(){
        conexion c  = new conexion();
        ArrayList<ClienteC> lista = new ArrayList<>();

          try {
                 String sql = "SELECT * FROM cliente";
                PreparedStatement ps = c.connectDb().prepareStatement(sql);
                ResultSet rs=ps.executeQuery();
                while(rs.next()){
                ClienteC p =  new  ClienteC(rs.getInt("idCliente"), rs.getString("nombre"), rs.getString("apellido"), rs.getInt("telefono"), rs.getString("direccion"));
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
                 String sql = "SELECT * FROM producto WHERE cantidad >0";
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
     
     public void setfactura(){
     
      conexion c  = new conexion();
           
              try {
                    String sql = "SELECT MAX(idFactura) FROM factura";
                    PreparedStatement ps = c.connectDb().prepareStatement(sql);
                    ResultSet rs=ps.executeQuery();
                    rs.next();
                    factura=rs.getInt("MAX(idFactura)")+1;
                    fact.setText(""+factura);
                    
                    ps.close();
                    ps=null;
                    c.desconectar();
              } catch (Exception e) {
                  System.out.println("Fallo metodo");
              }
     
     }
     
     
     
     public boolean updateMonto(int idP){
    conexion c  = new conexion();
            try {
                    String sql = "UPDATE producto SET cantidad=cantidad-1 WHERE idProducto=?";
                    PreparedStatement ps = c.connectDb().prepareStatement(sql);
                    ps.setInt(1, idP);
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
     
     
         public ArrayList<montoC> readM(int idFactura){
        conexion c  = new conexion();
        ArrayList<montoC> lista = new ArrayList<>();

          try {
                String select ="select c.nombre, p.nombre, count(p.idProducto), p.precioVenta, sum(p.precioVenta)";
                String from = " FROM detalle d JOIN factura f ON f.idFactura=d.idfactura join producto p on d.idproducto=p.idProducto join cliente c on f.idCliente=c.idCliente";
                String where = " where f.idFactura = "+idFactura+" group by d.idProducto";
                String sql = select+from+where;
                PreparedStatement ps = c.connectDb().prepareStatement(sql);
                ResultSet rs=ps.executeQuery();
                while(rs.next()){
                montoC p = new montoC(rs.getString("c.nombre"), rs.getString("p.nombre"), rs.getString("count(p.idProducto)"),rs.getString("p.precioVenta"), rs.getString("sum(p.precioVenta)"));
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
         
         
         public void fact(int factura) {
         ArrayList<montoC> lista =readM(factura);
          Object cliente = jComboBox1.getSelectedItem();
          ClienteC c = (ClienteC)cliente;
             try {
                 FileOutputStream archivo;
                 File file = new File("Factura.pdf");
                 archivo = new FileOutputStream(file);
                 Document doc = new Document();
                 PdfWriter.getInstance(doc, archivo);
                 doc.open();
                 
                 Paragraph p = new Paragraph(20);
                 Font negrita =  new Font(Font.FontFamily.TIMES_ROMAN, 12 , Font.BOLD, BaseColor.BLACK);
                 Font Title =  new Font(Font.FontFamily.TIMES_ROMAN, 18 , Font.BOLD, BaseColor.BLACK);
                 Font Tot =  new Font(Font.FontFamily.TIMES_ROMAN, 20 , Font.BOLD, BaseColor.BLACK);
                 p.add("[Empresa]");
                 p.add(Chunk.NEWLINE);
                 p.add("[Direccion]");
                 p.add(Chunk.NEWLINE);
                 p.add("[Telefono]");
                 p.add(Chunk.NEWLINE);
                 p.add(Chunk.NEWLINE);
                 p.setAlignment(Element.ALIGN_CENTER);
                 doc.add(p);
                 Paragraph p1 = new Paragraph(10);
                 p1.add("Fecha: "+getFecha());
                 p1.add(Chunk.NEWLINE);
                 p1.add(Chunk.NEWLINE);
                 p1.add("Factura No: "+factura);
                 p1.add(Chunk.NEWLINE);
                 p1.add(Chunk.NEWLINE);
                 p1.add("Nit  "+c.getId());
                 p1.add(Chunk.NEWLINE);
                 p1.add(Chunk.NEWLINE);
                 p1.add("Nombre "+c.getNombre()+" "+c.getApellido());
                 p1.add(Chunk.NEWLINE);
                 p1.add(Chunk.NEWLINE);
                 p1.setAlignment(Element.ALIGN_LEFT);
                 doc.add(p1);
                 
                 Paragraph titulo = new Paragraph("Producto comprado", Title);
                 titulo.setAlignment(Element.ALIGN_CENTER);
                 titulo.add(Chunk.NEWLINE);
                 titulo.add(Chunk.NEWLINE);
                 doc.add(titulo);
                 PdfPTable tabla = new PdfPTable(4);
                 tabla.setWidthPercentage(100);
                 PdfPCell c1= new PdfPCell(new Phrase("ID Producto",negrita));
                 PdfPCell c2= new PdfPCell(new Phrase("Precio",negrita));
                 PdfPCell c3= new PdfPCell(new Phrase("Cantidad",negrita));
                 PdfPCell c4= new PdfPCell(new Phrase("SubTotal",negrita));
                 c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                 c2.setHorizontalAlignment(Element.ALIGN_CENTER);
                 c3.setHorizontalAlignment(Element.ALIGN_CENTER);
                 c4.setHorizontalAlignment(Element.ALIGN_CENTER);
                 c1.setBackgroundColor(BaseColor.GRAY);
                 c2.setBackgroundColor(BaseColor.GRAY);
                 c3.setBackgroundColor(BaseColor.GRAY);
                 c4.setBackgroundColor(BaseColor.GRAY);
                 tabla.addCell(c1);
                 tabla.addCell(c2);
                 tabla.addCell(c3);
                 tabla.addCell(c4);
                 for(montoC l : lista ){
                 tabla.addCell(l.getProducto());
                 tabla.addCell(l.getPrecio());
                 tabla.addCell(l.getCantidad());
                 tabla.addCell(l.getMonto());
                 
                 }
                 
                 doc.add(tabla);
                 
                 Paragraph p3 = new Paragraph("", Tot);
                 p3.add(Chunk.NEWLINE);
                 p3.add("TOTAL "+total);
                 
                 p3.setAlignment(Element.ALIGN_RIGHT);
                 doc.add(p3);
                 doc.close();
                 archivo.close();
                 Desktop.getDesktop().open(file);
                
                 
                 
                         
                          
             } catch (Exception e) {
             }
 
         
         
         
         }
    /**
     * @param args the command line arguments
     */
  
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Tot;
    private javax.swing.JLabel fact;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
