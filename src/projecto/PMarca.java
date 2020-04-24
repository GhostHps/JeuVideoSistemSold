
package projecto;
import Objetos.Marca;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PMarca extends javax.swing.JFrame {

    DefaultTableModel modelo;
    
    public PMarca() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo=new DefaultTableModel();
        modelo.addColumn("clave");
        modelo.addColumn("nombre");
        modelo.addColumn("status");
        this.Tablaa.setModel(modelo);
    }
    
        int clave;
        String nombre;
        int status;
        //posiblemente lo cambiaremos a un arraylist
        static public Marca[] arre = new Marca[100];
        static private int posicion=2;
       
        private static Marca instanciando() {
        Marca marc1=new Marca();
        return marc1;
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
        textclave = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textnombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textstatus = new javax.swing.JTextField();
        BEliminar = new javax.swing.JButton();
        BActializar = new javax.swing.JButton();
        BGuardar = new javax.swing.JButton();
        BBuscar = new javax.swing.JButton();
        BBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablaa = new javax.swing.JTable();
        BBuscar1 = new javax.swing.JButton();
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

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setToolTipText("Datos Personales");
        jPanel2.setName(""); // NOI18N

        jLabel5.setFont(new java.awt.Font("Gungsuh", 3, 36)); // NOI18N
        jLabel5.setText("Marca");

        textclave.setBackground(new java.awt.Color(204, 204, 204));
        textclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textclaveActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Gungsuh", 0, 24)); // NOI18N
        jLabel7.setText("Clave");

        textnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnombreActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Gungsuh", 0, 24)); // NOI18N
        jLabel8.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Gungsuh", 0, 24)); // NOI18N
        jLabel6.setText("Status");

        textstatus.setBackground(new java.awt.Color(204, 204, 204));
        textstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textstatusActionPerformed(evt);
            }
        });

        BEliminar.setText("Elimimar");
        BEliminar.setToolTipText("");
        BEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarActionPerformed(evt);
            }
        });

        BActializar.setText("Actualizar");
        BActializar.setToolTipText("");
        BActializar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActializarActionPerformed(evt);
            }
        });

        BGuardar.setText("Guardar");
        BGuardar.setToolTipText("");
        BGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGuardarActionPerformed(evt);
            }
        });

        BBuscar.setText("Buscar por clave");
        BBuscar.setToolTipText("");
        BBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarActionPerformed(evt);
            }
        });

        BBorrar.setText("Borrar");
        BBorrar.setToolTipText("");
        BBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBorrarActionPerformed(evt);
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

        BBuscar1.setText("Buscar por nombre");
        BBuscar1.setToolTipText("");
        BBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BActializar)
                                .addGap(18, 18, 18)
                                .addComponent(BEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textclave, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(BBuscar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 22, Short.MAX_VALUE)))
                        .addGap(30, 30, 30))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textclave, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(BBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BActializar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
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

    private void textstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textstatusActionPerformed

    private void textclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textclaveActionPerformed
        
    }//GEN-LAST:event_textclaveActionPerformed

    private void Eliminar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Eliminar4ActionPerformed

    private void Actualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Actualizar2ActionPerformed

    private void Guardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Guardar2ActionPerformed

    private void BEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarActionPerformed
        Marca marc = new Marca();
        clave=Integer.parseInt(textclave.getText());
        arre=marc.delete(arre, clave);
    }//GEN-LAST:event_BEliminarActionPerformed

    private void BActializarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActializarActionPerformed
        Marca marc = new Marca();
        clave=Integer.parseInt(textclave.getText());
        nombre=textnombre.getText();
        status=Integer.parseInt(textstatus.getText());
        
        arre=marc.Update(arre, clave,nombre,status);
        
    }//GEN-LAST:event_BActializarActionPerformed

    private void BGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuardarActionPerformed
        
        
                                    for (int i = 0; i <Tablaa.getRowCount(); i++) {
                                    modelo.removeRow(i);
                                    i-=1;
                                    }
        
        
        Marca marc = new Marca();
        //clave=Integer.parseInt(textclave.getText());
        clave=posicion;
        nombre=textnombre.getText();
        status=1;
        
        if(posicion<arre.length){
        marc=marc.nuevo(clave, nombre, status);
        if(marc!=null){
            JOptionPane.showMessageDialog(null, "se guardo la marca");
            arre[posicion]=marc;      
            posicion++;
        }else{
          JOptionPane.showMessageDialog(null, "no se guardo");
        }

        }
        
                                String Sclave, Snom, Ssta;
                                String[] info =new String[3];
                                for(int i=0;i<posicion;i++){
                                    Marca marc1 =new Marca();
                                    marc1=arre[i];
                                    if(marc1!=null){
                                        Sclave=String.valueOf(marc1.getClave());
                                        Snom=marc1.getNombre();
                                        Ssta=String.valueOf(marc1.getStatus());

                                        info[0]=Sclave;
                                        info[1]=Snom;
                                        info[2]=Ssta;
                                        modelo.addRow(info);
                                    }
                                }
                                textclave.setText(null);
                                textnombre.setText(null);
                                textstatus.setText(null);
        
        //login, v2, venta
        //v1
    }//GEN-LAST:event_BGuardarActionPerformed

    
    private void BBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarActionPerformed
        // TODO add your handling code here:
       
       Marca marc = new Marca();
       clave=Integer.parseInt(textclave.getText());
       marc=marc.Search(arre, clave);
       //mostrar en los cuadros
       clave=marc.getClave();
       nombre=marc.getNombre();
       status=marc.getStatus();
       textclave.setText(String.valueOf(clave));
       textnombre.setText(nombre);
       textstatus.setText(String.valueOf(status));
    }//GEN-LAST:event_BBuscarActionPerformed

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

    private void BBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBorrarActionPerformed
        // TODO add your handling code here:
        

        textclave.setText(null);
        textnombre.setText(null);
        textstatus.setText(null);
        
        for (int i = 0; i <Tablaa.getRowCount(); i++) {
        modelo.removeRow(i);
        i-=1;
        }
        
    }//GEN-LAST:event_BBorrarActionPerformed

    private void BBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscar1ActionPerformed
        Marca marc = new Marca();
       nombre=textnombre.getText();
       marc=marc.SearchNombre(arre, nombre);
       //mostrar en los cuadros
       clave=marc.getClave();
       nombre=marc.getNombre();
       status=marc.getStatus();
       textclave.setText(String.valueOf(clave));
       textnombre.setText(nombre);
       textstatus.setText(String.valueOf(status));
    }//GEN-LAST:event_BBuscar1ActionPerformed


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
            java.util.logging.Logger.getLogger(Marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PMarca().setVisible(true);
                
            }
        });
        
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar2;
    private javax.swing.JButton BActializar;
    private javax.swing.JButton BBorrar;
    private javax.swing.JButton BBuscar;
    private javax.swing.JButton BBuscar1;
    private javax.swing.JButton BEliminar;
    private javax.swing.JButton BGuardar;
    private javax.swing.JMenu Cofiguración;
    private javax.swing.JButton Eliminar4;
    private javax.swing.JMenuItem Emp;
    private javax.swing.JMenu Gestionar;
    private javax.swing.JButton Guardar2;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JTable Tablaa;
    private javax.swing.JMenuItem bienvenido;
    private javax.swing.JMenuItem cliente;
    private javax.swing.JMenuItem genero;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem login;
    private javax.swing.JMenuItem marca;
    private javax.swing.JMenuItem producto;
    private javax.swing.JMenuItem proveedor;
    private javax.swing.JTextField textclave;
    private javax.swing.JTextField textnombre;
    private javax.swing.JTextField textstatus;
    private javax.swing.JMenuItem tipo;
    // End of variables declaration//GEN-END:variables
}
