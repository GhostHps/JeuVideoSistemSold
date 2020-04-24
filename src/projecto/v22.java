
package projecto;

import Objetos.Gender;
import Objetos.Marca;
import Objetos.Provider;
import Objetos.TipeProd;
import Objetos.User;
import static projecto.PGenero.arre;


//static String nom_usu;
//jTextField1.setText(nom_usu);



public class v22 extends javax.swing.JFrame {

    public v22() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

        
        int posicion=0;
        
        static Gender[] arreg = PGenero.arre;
        static Marca[] arrem = PMarca.arre;
        static Provider[] arreprov = PProveedor.arre;
        static TipeProd[] arretp = PTipo_prod.arre;
        Gender g=new Gender();
        
        
        
        
        public Gender[] llenargenero(Gender[] arreg){
        Gender g=new Gender();
        g=g.nuevo(0, "ninguno", 1);
        arreg[0]=g;
        Gender g2=new Gender();
        g2=g2.nuevo(1, "Estrategia", 1);
        arreg[1]=g2;
        
        return arreg;
        }
    public Marca[] llenarmarca(Marca[] arrem){
        Marca g=new Marca();
        g=g.nuevo(posicion, "X BOX", 1);
        arrem[0]=g;
        Marca g2=new Marca();
        g2=g2.nuevo(posicion, "PLAY STATION", 1);
        arrem[1]=g2;
        return arrem;
        }
        public Provider[] llenarprov(Provider[] arreprov){
        Provider g=new Provider();
        g=g.newprov(0, "Miguel","Cervantes","Godinez","4422341036","Godind23@gmail.com","las rosas",200,121,67148,1);
        arreprov[0]=g;
        Provider g2=new Provider();
        g2=g2.newprov(1,"Juan","Padilla","Castillo","4425876437","illo12@gmail.com","el coime",1,124,86544,1);
        arreprov[1]=g2;
        return arreprov;
        }
      public TipeProd[] llenartp(TipeProd[] arretp){
        TipeProd g=new TipeProd();
        g=g.nuevo(0, "Consola", 1);
        arretp[0]=g;
        TipeProd g2=new TipeProd();
        g2=g2.nuevo(1, "videojuegos", 1);
        arretp[1]=g2;
        return arretp;
        } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Gestionar = new javax.swing.JMenu();
        genero = new javax.swing.JMenuItem();
        marca = new javax.swing.JMenuItem();
        tipo = new javax.swing.JMenuItem();
        proveedor = new javax.swing.JMenuItem();
        producto = new javax.swing.JMenuItem();
        cliente = new javax.swing.JMenuItem();
        Emp = new javax.swing.JMenuItem();
        Cofiguración = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();
        login = new javax.swing.JMenuItem();
        bienvenido = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(204, 204, 204));
        desktopPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 255, 255), null, null));
        desktopPane.setForeground(new java.awt.Color(255, 204, 0));
        desktopPane.setDragMode(javax.swing.JDesktopPane.OUTLINE_DRAG_MODE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Jeu Video Main big.png"))); // NOI18N
        desktopPane.add(jLabel2);
        jLabel2.setBounds(70, 220, 420, 180);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Welcome.png"))); // NOI18N
        desktopPane.add(jLabel1);
        jLabel1.setBounds(170, 80, 209, 90);

        Gestionar.setMnemonic('f');
        Gestionar.setText("Gestionar");
        Gestionar.setToolTipText("");
        Gestionar.setFont(new java.awt.Font("Broadway", 0, 14)); // NOI18N

        genero.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        genero.setMnemonic('o');
        genero.setText("Genero");
        genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoActionPerformed(evt);
            }
        });
        Gestionar.add(genero);

        marca.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        marca.setMnemonic('o');
        marca.setText("Marca");
        marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaActionPerformed(evt);
            }
        });
        Gestionar.add(marca);

        tipo.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        tipo.setMnemonic('o');
        tipo.setText("Tipo de producto");
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });
        Gestionar.add(tipo);

        proveedor.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        proveedor.setMnemonic('o');
        proveedor.setText("Proveedor");
        proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorActionPerformed(evt);
            }
        });
        Gestionar.add(proveedor);

        producto.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        producto.setMnemonic('o');
        producto.setText("Producto");
        producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoActionPerformed(evt);
            }
        });
        Gestionar.add(producto);

        cliente.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        cliente.setMnemonic('o');
        cliente.setText("Cliente");
        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });
        Gestionar.add(cliente);

        Emp.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        Emp.setMnemonic('o');
        Emp.setText("Empleado");
        Emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpActionPerformed(evt);
            }
        });
        Gestionar.add(Emp);

        jMenuBar1.add(Gestionar);

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
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoActionPerformed
        PGenero g = new PGenero();
        g.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_generoActionPerformed

    private void marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaActionPerformed
        PMarca m = new PMarca();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_marcaActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        PTipo_prod t = new PTipo_prod();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tipoActionPerformed

    private void proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedorActionPerformed
        PProveedor p = new PProveedor();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_proveedorActionPerformed

    private void productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoActionPerformed
        PProducto prod = new PProducto();
        prod.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_productoActionPerformed

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        PCliente cli = new PCliente();
        cli.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_clienteActionPerformed

    private void EmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpActionPerformed
        PEmpleado emp = new PEmpleado();
        emp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EmpActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        PLogin l = new PLogin();
        l.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loginActionPerformed

    private void bienvenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bienvenidoActionPerformed
        v22 v = new v22();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bienvenidoActionPerformed

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
            java.util.logging.Logger.getLogger(v22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        v22 v = new v22();
        arreg=v.llenargenero(arreg);
        arrem=v.llenarmarca(arrem);
        arreprov=v.llenarprov(arreprov);
        arretp=v.llenartp(arretp);
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v22().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cofiguración;
    private javax.swing.JMenuItem Emp;
    private javax.swing.JMenu Gestionar;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuItem bienvenido;
    private javax.swing.JMenuItem cliente;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem genero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem login;
    private javax.swing.JMenuItem marca;
    private javax.swing.JMenuItem producto;
    private javax.swing.JMenuItem proveedor;
    private javax.swing.JMenuItem tipo;
    // End of variables declaration//GEN-END:variables

}
