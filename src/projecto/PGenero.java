package projecto;
import Objetos.Gender;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class PGenero extends javax.swing.JFrame {

    DefaultTableModel modelo;
    
    public PGenero() {
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
        public static Gender[] arre = new Gender[100];
        private static int posicion=2;

        private static Gender instanciando() {
        Gender g=new Gender();
        return g;
        }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Eliminar4 = new javax.swing.JButton();
        Actualizar2 = new javax.swing.JButton();
        Guardar2 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textclav = new javax.swing.JTextField();
        textnomb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textstat = new javax.swing.JTextField();
        BGuardar = new javax.swing.JButton();
        BActualizar = new javax.swing.JButton();
        BEliminar = new javax.swing.JButton();
        BBuscar = new javax.swing.JButton();
        BMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablaa = new javax.swing.JTable();
        BBuscar2 = new javax.swing.JButton();
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

        jLabel4.setFont(new java.awt.Font("Gungsuh", 3, 36)); // NOI18N
        jLabel4.setText("Genero");

        jLabel2.setFont(new java.awt.Font("Gungsuh", 0, 24)); // NOI18N
        jLabel2.setText("Clave");

        textclav.setBackground(new java.awt.Color(204, 204, 204));
        textclav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textclavActionPerformed(evt);
            }
        });

        textnomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnombActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gungsuh", 0, 24)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel1.setFont(new java.awt.Font("Gungsuh", 0, 24)); // NOI18N
        jLabel1.setText("Status");

        textstat.setBackground(new java.awt.Color(204, 204, 204));
        textstat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textstatActionPerformed(evt);
            }
        });

        BGuardar.setText("Guardar");
        BGuardar.setToolTipText("");
        BGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGuardarActionPerformed(evt);
            }
        });

        BActualizar.setText("Actualizar");
        BActualizar.setToolTipText("");
        BActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActualizarActionPerformed(evt);
            }
        });

        BEliminar.setText("Eliminar");
        BEliminar.setToolTipText("");
        BEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarActionPerformed(evt);
            }
        });

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

        BBuscar2.setText("Buscar por nombre");
        BBuscar2.setToolTipText("");
        BBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BMostrar)))
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(328, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BBuscar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(137, 137, 137))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jLabel2)
                            .addGap(19, 19, 19)
                            .addComponent(textclav, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textstat, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textnomb, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(BGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(BActualizar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(BEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(268, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(BBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(BMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(textclav, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(textnomb, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(textstat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(168, Short.MAX_VALUE)))
        );

        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
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

    private void textnombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textnombActionPerformed

    private void textstatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textstatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textstatActionPerformed

    private void textclavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textclavActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textclavActionPerformed

    private void BEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarActionPerformed
        Gender gene = new Gender();
        clave=Integer.parseInt(textclav.getText());
        arre=gene.delete(arre, clave);
    }//GEN-LAST:event_BEliminarActionPerformed

    private void BActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActualizarActionPerformed
        Gender gene = new Gender();
        clave=Integer.parseInt(textclav.getText());
        nombre=textnomb.getText();
        status=Integer.parseInt(textstat.getText());
        gene.Update(arre, clave,nombre,status);  
    }//GEN-LAST:event_BActualizarActionPerformed

    private void BGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuardarActionPerformed
        
        for (int i = 0; i <Tablaa.getRowCount(); i++) {
                                    modelo.removeRow(i);
                                    i-=1;
                                    }
        
        Gender gen = new Gender();
        //clave=Integer.parseInt(textclave.getText());
        clave=posicion;
        nombre=textnomb.getText();
        status=1;
        
         if(posicion<arre.length){
        gen=gen.nuevo(clave, nombre, status);
        arre[posicion]=gen;
        posicion++;
        JOptionPane.showMessageDialog(null, "esta guardo el genero");
        }else{
          JOptionPane.showMessageDialog(null, "no se guardo");
         }
         
         
                                String Sclave, Snom, Ssta;
                                String[] info =new String[3];
                                for(int i=0;i<posicion;i++){
                                    Gender marc1 =new Gender();
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
                                textclav.setText(null);
                                textnomb.setText(null);
                                textstat.setText(null);
         
    }//GEN-LAST:event_BGuardarActionPerformed

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

        Gender gen = new Gender();
        clave=Integer.parseInt(textclav.getText());
        gen=gen.Search(arre, clave);
        //mostrar en los cuadros
        clave=gen.getClave();
        nombre=gen.getNombre();
        status=gen.getStatus();
        
        textclav.setText(String.valueOf(clave));
        textnomb.setText(nombre);
        textstat.setText(String.valueOf(status));
    }//GEN-LAST:event_BBuscarActionPerformed

    private void BMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMostrarActionPerformed
        textclav.setText(null);
        textnomb.setText(null);
        textstat.setText(null);

    }//GEN-LAST:event_BMostrarActionPerformed

    private void BBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscar2ActionPerformed
        Gender gen = new Gender();
        nombre=textnomb.getText();
        gen=gen.SearchNombre(arre, nombre);
        //mostrar en los cuadros
        clave=gen.getClave();
        nombre=gen.getNombre();
        status=gen.getStatus();
        
        textclav.setText(String.valueOf(clave));
        textnomb.setText(nombre);
        textstat.setText(String.valueOf(status));
    }//GEN-LAST:event_BBuscar2ActionPerformed

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
            java.util.logging.Logger.getLogger(PGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /*PGenero pg = new PGenero();
        Gender g=new Gender();
        g=instanciando();
        g=g.nuevo(posicion, "Aventura", 1);
        arre[posicion]=g;
        posicion++;
        
        g=instanciando();
        g=g.nuevo(posicion, "Estrategia", 1);
        arre[posicion]=g;
        posicion++;
        */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PGenero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar2;
    private javax.swing.JButton BActualizar;
    private javax.swing.JButton BBuscar;
    private javax.swing.JButton BBuscar2;
    private javax.swing.JButton BEliminar;
    private javax.swing.JButton BGuardar;
    private javax.swing.JButton BMostrar;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem login;
    private javax.swing.JMenuItem marca;
    private javax.swing.JMenuItem producto;
    private javax.swing.JMenuItem proveedor;
    private javax.swing.JTextField textclav;
    private javax.swing.JTextField textnomb;
    private javax.swing.JTextField textstat;
    private javax.swing.JMenuItem tipo;
    // End of variables declaration//GEN-END:variables
}
