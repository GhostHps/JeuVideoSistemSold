package projecto;
import Objetos.TipeProd;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PTipo_prod extends javax.swing.JFrame {

     DefaultTableModel modelo;
     
    public PTipo_prod() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo=new DefaultTableModel();
        modelo.addColumn("clave");
        modelo.addColumn("nombre");
        modelo.addColumn("status");
        this.Tablaa.setModel(modelo);
    }
        
        String name;
	int status,key;
        static private int pos=2;
        public static TipeProd[] arre = new TipeProd[100];
        
        private static TipeProd instanciando() {
        TipeProd marc1=new TipeProd();
        return marc1;
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Eliminar4 = new javax.swing.JButton();
        Actualizar2 = new javax.swing.JButton();
        Guardar2 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textnombre = new javax.swing.JTextField();
        textclave = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textstat = new javax.swing.JTextField();
        Eliminar_C = new javax.swing.JButton();
        Actualizar_B = new javax.swing.JButton();
        Guardar_A = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        BBuscar = new javax.swing.JButton();
        BMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablaa = new javax.swing.JTable();
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

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setToolTipText("Datos Personales");
        jPanel1.setName(""); // NOI18N

        jLabel9.setFont(new java.awt.Font("Gungsuh", 0, 24)); // NOI18N
        jLabel9.setText("Nombre");

        jLabel10.setFont(new java.awt.Font("Gungsuh", 0, 24)); // NOI18N
        jLabel10.setText("Clave");

        textnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnombreActionPerformed(evt);
            }
        });

        textclave.setBackground(new java.awt.Color(204, 204, 204));
        textclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textclaveActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Gungsuh", 0, 24)); // NOI18N
        jLabel11.setText("Status");

        textstat.setBackground(new java.awt.Color(204, 204, 204));
        textstat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textstatActionPerformed(evt);
            }
        });

        Eliminar_C.setText("Elimimar");
        Eliminar_C.setToolTipText("");
        Eliminar_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_CActionPerformed(evt);
            }
        });

        Actualizar_B.setText("Actualizar");
        Actualizar_B.setToolTipText("");
        Actualizar_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actualizar_BActionPerformed(evt);
            }
        });

        Guardar_A.setText("Guardar");
        Guardar_A.setToolTipText("");
        Guardar_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar_AActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Gungsuh", 3, 36)); // NOI18N
        jLabel12.setText("Tipo de Producto ");

        BBuscar.setText("Buscar por clave");
        BBuscar.setToolTipText("");
        BBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarActionPerformed(evt);
            }
        });

        BMostrar.setText("Borrar");
        BMostrar.setToolTipText("");
        BMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMostrarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel12)
                        .addGap(131, 131, 131))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(Guardar_A, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Actualizar_B)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Eliminar_C, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textstat, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textclave, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BMostrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(textclave, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(textstat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Guardar_A, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Actualizar_B, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Eliminar_C, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(BBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

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
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textnombreActionPerformed

    private void textclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textclaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textclaveActionPerformed

    private void textstatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textstatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textstatActionPerformed

    private void Eliminar_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_CActionPerformed
        // TODO add your handling code here:
        TipeProd  TP = new TipeProd();
        key=Integer.parseInt(textclave.getText());
        arre=TP.delete(arre, key);
    }//GEN-LAST:event_Eliminar_CActionPerformed

    private void Actualizar_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar_BActionPerformed
        TipeProd TP = new TipeProd();
        key=Integer.parseInt(textclave.getText());
        name=textnombre.getText();
        status=Integer.parseInt(textstat.getText());
        arre=TP.Update(arre,key, name, status); 
    }//GEN-LAST:event_Actualizar_BActionPerformed

    private void Guardar_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar_AActionPerformed

        for (int i = 0; i <Tablaa.getRowCount(); i++) {
                                    modelo.removeRow(i);
                                    i-=1;
                                    }
        
        TipeProd TP = new TipeProd();
        key=pos;
        name=textnombre.getText();
        status=1;
        
        if(pos<arre.length){
        TP=TP.nuevo(key, name, status);
        if(TP!=null){
        JOptionPane.showMessageDialog(null, "esta guardo el proveedor");
        }else{
          JOptionPane.showMessageDialog(null, "no se guardo");
        }
        arre[pos]=TP;
        pos++;
        }
        
        
                                String Sclave, Snom, Ssta;
                                String[] info =new String[3];
                                for(int i=0;i<pos;i++){
                                    TipeProd marc1 =new TipeProd();
                                    marc1=arre[i];
                                    if(marc1!=null){
                                        Sclave=String.valueOf(marc1.getKey());
                                        Snom=marc1.getName();
                                        Ssta=String.valueOf(marc1.getStatus());

                                        info[0]=Sclave;
                                        info[1]=Snom;
                                        info[2]=Ssta;
                                        modelo.addRow(info);
                                    }
                                }
                                textclave.setText(null);
                                textnombre.setText(null);
                                textstat.setText(null);
        
        
    }//GEN-LAST:event_Guardar_AActionPerformed

    private void Eliminar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Eliminar4ActionPerformed

    private void Actualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Actualizar2ActionPerformed

    private void Guardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Guardar2ActionPerformed

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

    private void BBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarActionPerformed
        // TODO add your handling code here:

        TipeProd tp = new TipeProd();
        key=Integer.parseInt(textclave.getText());
        tp=tp.Search(arre, key);
        //mostrar en los cuadros
        key=tp.getKey();
        name=tp.getName();
        status=tp.getStatus();
        textclave.setText(String.valueOf(key));
        textnombre.setText(name);
        textstat.setText(String.valueOf(status));
    }//GEN-LAST:event_BBuscarActionPerformed

    private void BMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMostrarActionPerformed
        textclave.setText(null);
        textnombre.setText(null);
        textstat.setText(null);

    }//GEN-LAST:event_BMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(PTipo_prod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PTipo_prod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PTipo_prod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PTipo_prod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
/*
        PTipo_prod pg = new PTipo_prod();
        TipeProd g=new TipeProd();
        g=instanciando();
        g=g.nuevo(pos, "Consola", 1);
        arre[pos]=g;
        pos++;
        
        g=instanciando();
        g=g.nuevo(pos, "videojuegos", 1);
        arre[pos]=g;
        pos++;
        */
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PTipo_prod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar2;
    private javax.swing.JButton Actualizar_B;
    private javax.swing.JButton BBuscar;
    private javax.swing.JButton BMostrar;
    private javax.swing.JMenu Cofiguración;
    private javax.swing.JButton Eliminar4;
    private javax.swing.JButton Eliminar_C;
    private javax.swing.JMenuItem Emp;
    private javax.swing.JMenu Gestionar;
    private javax.swing.JButton Guardar2;
    private javax.swing.JButton Guardar_A;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JTable Tablaa;
    private javax.swing.JMenuItem bienvenido;
    private javax.swing.JMenuItem cliente;
    private javax.swing.JMenuItem genero;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem login;
    private javax.swing.JMenuItem marca;
    private javax.swing.JMenuItem producto;
    private javax.swing.JMenuItem proveedor;
    private javax.swing.JTextField textclave;
    private javax.swing.JTextField textnombre;
    private javax.swing.JTextField textstat;
    private javax.swing.JMenuItem tipo;
    // End of variables declaration//GEN-END:variables
}
