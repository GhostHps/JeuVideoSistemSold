
package projecto;
import Objetos.OVenta;
import Objetos.Product;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Consulta extends javax.swing.JFrame {

    DefaultTableModel modelo;
    static String nom_usu;
    
    public Consulta() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo=new DefaultTableModel();
        modelo.addColumn("clave vta");
        modelo.addColumn("Usuario");
        modelo.addColumn("status");
        modelo.addColumn("producto");
        modelo.addColumn("cantidad");
        modelo.addColumn("subtotales");
        this.Tablaa.setModel(modelo);
        
        llenar_tabla1();
    }
    
        int clave;
        String nombre;
        int status;
        //posiblemente lo cambiaremos a un arraylist
         OVenta[] ventas =new OVenta[100];
        OVenta venta =new OVenta();
        
         Product[] productos = new Product[100];
        Product producto= new Product();

        
         public void llenar_tabla1(){
       
            String  Sclave_vta, SUsuario, Sstatus, Sproducto="", Scantidad="", Ssubtotales="";
            
            
                                ventas=venta.retornArre();
                                
                                String[] info =new String[6];
                                for(int ii=0;ii<ventas.length;ii++){
                                    venta=ventas[ii];
                                    if(venta!=null){
                                        if(venta.getNomusu_cli().equals(nom_usu)){
                                            
                                            Sclave_vta=String.valueOf(venta.getCve_vta());
                                            SUsuario=venta.getNomusu_cli();
                                            Sstatus=String.valueOf(venta.getSta_vta());
                                            producto=venta.getProducto();
                                            Sproducto=producto.getName_prod();
                                            Scantidad=String.valueOf(venta.getCantidad());
                                            Ssubtotales=String.valueOf(venta.getSubtotal());

                                            info[0]=Sclave_vta;
                                            info[1]=SUsuario;
                                            info[2]=Sstatus;
                                            info[3]=Sproducto;
                                            info[4]=Scantidad;
                                            info[5]=Ssubtotales;
                                            modelo.addRow(info);
                                        }
                                    }
                                }
    } 
    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Eliminar4 = new javax.swing.JButton();
        Actualizar2 = new javax.swing.JButton();
        Guardar2 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablaa = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        Cofiguración = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();
        login = new javax.swing.JMenuItem();
        bienvenido = new javax.swing.JMenuItem();
        ConsulReali = new javax.swing.JMenuItem();

        Eliminar4.setText("Elimimar");
        Eliminar4.setToolTipText("");
        Eliminar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar4ActionPerformed(evt);
            }
        });

        Actualizar2.setText("Actializar");
        Actualizar2.setToolTipText("");
        Actualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actualizar2ActionPerformed(evt);
            }
        });

        Guardar2.setText("Guardar");
        Guardar2.setToolTipText("");
        Guardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));
        jDesktopPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setToolTipText("Datos Personales");
        jPanel2.setName(""); // NOI18N

        jLabel5.setFont(new java.awt.Font("Gungsuh", 3, 36)); // NOI18N
        jLabel5.setText("Compras realizadas ");

        Tablaa.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tablaa);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 347, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        Cofiguración.setMnemonic('h');
        Cofiguración.setText("Cofiguracion");
        Cofiguración.setFont(new java.awt.Font("Broadway", 0, 14)); // NOI18N

        Salir.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Cofiguración.add(Salir);

        login.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        Cofiguración.add(login);

        bienvenido.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        bienvenido.setText("Pantalla");
        bienvenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bienvenidoActionPerformed(evt);
            }
        });
        Cofiguración.add(bienvenido);

        ConsulReali.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        ConsulReali.setText("Compras realizadas");
        ConsulReali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsulRealiActionPerformed(evt);
            }
        });
        Cofiguración.add(ConsulReali);

        jMenuBar1.add(Cofiguración);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Eliminar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Eliminar4ActionPerformed

    private void Actualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Actualizar2ActionPerformed

    private void Guardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Guardar2ActionPerformed

    
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        PLogin l = new PLogin();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loginActionPerformed

    private void bienvenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bienvenidoActionPerformed
        v2 v = new v2();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bienvenidoActionPerformed

    private void ConsulRealiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsulRealiActionPerformed
        Consulta con = new Consulta();
        con.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ConsulRealiActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
        PMarca pm = new PMarca();
        Marca marc1=new Marca();
        marc1=instanciando();
        marc1=marc1.nuevo(posicion, "X BOX", 1);
        arre[posicion]=marc1;
        posicion++;
        
        marc1=instanciando();
        marc1=marc1.nuevo(posicion, "PLAY STATION", 1);
        arre[posicion]=marc1;
        posicion++;
        */
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta().setVisible(true);
                
            }
        });
        
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar2;
    private javax.swing.JMenu Cofiguración;
    private javax.swing.JMenuItem ConsulReali;
    private javax.swing.JButton Eliminar4;
    private javax.swing.JButton Guardar2;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JTable Tablaa;
    private javax.swing.JMenuItem bienvenido;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem login;
    // End of variables declaration//GEN-END:variables
}
