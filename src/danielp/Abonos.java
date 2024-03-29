/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import static javafx.scene.input.KeyCode.P;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Aran
 */
public class Abonos extends javax.swing.JFrame {
DefaultComboBoxModel modeloPrestamo, modeloCliente;
SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
int abono;
Prestamo pe;
    /**
     * Creates new form Abonos
     */
    public Abonos(Prestamo pe) {
        initComponents();
        this.setVisible(true);
        this.setTitle("Abonar");
        refresh();
        getIdAbono();
        this.pe=pe;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        AbonoT = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Abono");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Id Prestamo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Id Cliente");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Abonar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Abono:");

        AbonoT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AbonoTKeyTyped(evt);
            }
        });

        jButton4.setText("Regresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Tipo de pago");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Q.", "$.", "Cheque Q.", "Cheque $." }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AbonoT, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBox3, 0, 98, Short.MAX_VALUE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addGap(65, 65, 65))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(AbonoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButton4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Object prestamo = jComboBox2.getSelectedItem();
        PrestamoC p = (PrestamoC)prestamo;
        double a = Double.parseDouble(AbonoT.getText());
        if(jComboBox3.getSelectedIndex()==1||jComboBox3.getSelectedIndex()==3){    
            if(updateMonto(p.getId(),a*7.5)){
                createA(p,jComboBox3.getSelectedIndex(), a*7.5);
            }
        }else{
            
            if(updateMonto(p.getId(),a)){
                createA(p,jComboBox3.getSelectedIndex(), a);
            }
            
        }
        refresh();
        AbonoT.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int itemCount = jComboBox2.getItemCount();

        for(int i=0;i<itemCount;i++){
            jComboBox2.removeItemAt(0);
         }
        Object cliente = jComboBox1.getSelectedItem();
        ClienteC c = (ClienteC)cliente;
        getPrestamo(c.getId());
        
   

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.pe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void AbonoTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AbonoTKeyTyped
          char caracter = evt.getKeyChar();
                    if (((caracter < '0') || (caracter > '9')) && (caracter != evt.VK_BACK_SPACE)
                            && (caracter != '.') ) {
                        evt.consume();
                    }
    }//GEN-LAST:event_AbonoTKeyTyped
    
    
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
    
    
    public void refresh(){
       
        modeloCliente =(DefaultComboBoxModel)this.jComboBox1.getModel();
        ArrayList<ClienteC> lista= readC();
        for (int i = 0; i < lista.size(); i++) {  
           modeloCliente.addElement(lista.get(i));
           // System.out.println(lista.get(i));
        }
        

  }
        
    public void getPrestamo(int idCliente){
        modeloPrestamo =(DefaultComboBoxModel)this.jComboBox2.getModel();
        ArrayList<PrestamoC> lista= readf(idCliente);
        for (int i = 0; i < lista.size(); i++) {  
           modeloPrestamo.addElement(lista.get(i));
           // System.out.println(lista.get(i));
        }
    }
    
     public void getIdAbono(){
        
      conexion c  = new conexion();
           
              try {
                    String sql = "SELECT MAX(idAbono) FROM abono";
                    PreparedStatement ps = c.connectDb().prepareStatement(sql);
                    ResultSet rs=ps.executeQuery();
                    rs.next();
                    abono=rs.getInt("MAX(idAbono)")+1;                    
                    ps.close();
                    ps=null;
                    c.desconectar();
                    System.out.println("se encontro abono");
              } catch (Exception e) {
                  System.out.println("no se encontro el abono");
              }
     
     }
     
    public boolean updateMonto(int idP,double abono){
    conexion c  = new conexion();
            try {
                    String sql = "UPDATE prestamo SET monto=monto-? WHERE idPrestamo=? and monto>0";
                    PreparedStatement ps = c.connectDb().prepareStatement(sql);
                    ps.setDouble(1, abono);
                    ps.setInt(2, idP);
                    ps.execute();
                    ps.close();
                    ps=null;
                    c.desconectar();
                    return true;
              } catch (Exception e) {
                  System.out.println(" no update monto");
                  return false;
              }

    }
    
    
    public boolean createA(PrestamoC p, int tipo, double Abono){
        conexion c= new conexion();
  
        try {
            String sql="INSERT INTO abono(idAbono,idTipo,idPrestamo,Cantidad,Fecha) VALUES("+abono+","+tipo+","+p.getId()+","+Abono+",'"+getFecha()+"')";
            PreparedStatement ps = c.connectDb().prepareStatement(sql);
            ps.execute();
            ps=null;
            c.desconectar();
            JOptionPane.showMessageDialog(this, "se realizo el Abono");
            
            return true;
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(this, "no se inserto el registro");
            System.out.println("no se realizo el Abono");
            return false;
        }
    
    }   
        
        
    /**
     * @param args the command line arguments
     */
        
        
    public String getFecha(){
        Date fecha =  new Date();
        //System.out.println(fecha);
        return formato.format(fecha);
     }
        public ArrayList<PrestamoC> readf(int idCliente){
        conexion c  = new conexion();
        ArrayList<PrestamoC> lista = new ArrayList<>();

          try {
                 String sql = "SELECT p.idPrestamo, p.monto FROM prestamo p join factura f on p.idFactura=f.idFactura WHERE f.idCliente="+idCliente+" and p.monto>0";
                PreparedStatement ps = c.connectDb().prepareStatement(sql);
                ResultSet rs=ps.executeQuery();
                while(rs.next()){
                PrestamoC p = new PrestamoC(rs.getInt("p.idPrestamo"), rs.getString("p.monto"));
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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AbonoT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
