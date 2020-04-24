
package projecto;

import Objetos.User;
import projecto.PCliente;
import projecto.PEmpleado;
import projecto.PGenero;
import projecto.PLogin;
import projecto.PMarca;
import projecto.PProducto;
import projecto.PProveedor;
import projecto.PTipo_prod;

public class v2 extends javax.swing.JFrame {

    public v2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    User user =new User();

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        Venta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Cofiguración = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();
        login = new javax.swing.JMenuItem();
        ConsulReali = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        desktopPane.setBackground(new java.awt.Color(204, 204, 204));
        desktopPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 255, 255), null, null));
        desktopPane.setForeground(new java.awt.Color(255, 204, 0));
        desktopPane.setDragMode(javax.swing.JDesktopPane.OUTLINE_DRAG_MODE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Jeu Video Main big.png"))); // NOI18N
        desktopPane.add(jLabel2);
        jLabel2.setBounds(60, 70, 420, 180);

        Venta.setBackground(new java.awt.Color(153, 153, 153));
        Venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/realizar venta.png"))); // NOI18N
        Venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentaActionPerformed(evt);
            }
        });
        desktopPane.add(Venta);
        Venta.setBounds(110, 380, 350, 130);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Welcome.png"))); // NOI18N
        desktopPane.add(jLabel1);
        jLabel1.setBounds(170, 280, 209, 90);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton1);
        jButton1.setBounds(463, 0, 90, 40);

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
        login.setText("logout");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        Cofiguración.add(login);

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
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        PLogin l = new PLogin();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void VentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentaActionPerformed
        // TODO add your handling code here:
        Venta sold=new Venta();
        sold.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VentaActionPerformed

    private void ConsulRealiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsulRealiActionPerformed
        Consulta con = new Consulta();
        con.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ConsulRealiActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cofiguración;
    private javax.swing.JMenuItem ConsulReali;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JButton Venta;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem login;
    // End of variables declaration//GEN-END:variables

}
