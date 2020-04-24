
package projecto;

import Objetos.Gender;
import Objetos.Marca;
import Objetos.OVenta;
import Objetos.Product;
import Objetos.TipeProd;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import projecto.PProducto;
import projecto.v22;

public class Venta extends javax.swing.JFrame {
   DefaultTableModel modelo2;
   DefaultTableModel modelo;
     static Product[] arrep = PProducto.arreprod;
     
     
     
     static String nom_usu;
     
     int cant, cant2, i; 
     String nom;
     double product;
     
    public Venta() {
        initComponents();
       
        this.setLocationRelativeTo(null);
        modelo2=new DefaultTableModel();
        modelo2.addColumn("nombe del producto");
        modelo2.addColumn("cantidad");
        modelo2.addColumn("subtotal");
        this.tabla.setModel(modelo2);
        
        
        modelo=new DefaultTableModel();
        modelo.addColumn("clave");
        modelo.addColumn("producto");
        modelo.addColumn("precio");
        modelo.addColumn("Stock");
        modelo.addColumn("potencia");
        modelo.addColumn("tipo de consola");
        modelo.addColumn("Clasificacion");
        modelo.addColumn("Estudio");
        modelo.addColumn("Genero");
        modelo.addColumn("Marca");
        modelo.addColumn("Tipo de pord");
        this.Sold.setModel(modelo);
        
        UserText.setText(nom_usu);
        
        llenar_tabla1();
    }
    int clave,status,cantidad,leernum=0;
    String producto;
    double precio,total;
    
    int stock;
    
    public void llenar_tabla1(){
       
        String  Skey_prod, Sname_prod, Sprice, Sstock, Spower, Stipe_con, Sclass_game, Sest_game,Sgenero, Smarca, Stipo_prod;
                                
                                String[] info =new String[11];
                                for(int ii=0;ii<arrep.length;ii++){
                                    Product marc1 =new Product();
                                    marc1=arrep[ii];
                                    
                                    if(marc1!=null){
                                        Skey_prod=String.valueOf(marc1.getKey_prod());
                                        Sname_prod=marc1.getName_prod();
                                        Sprice=String.valueOf(marc1.getPrice());
                                        Sstock=String.valueOf(marc1.getStock());
                                        Spower=String.valueOf(marc1.getPower());
                                        Stipe_con=marc1.getTipe_con();
                                        Sclass_game=marc1.getClass_game();
                                        Sest_game=marc1.getEst_game();
                                                    Gender genero = new Gender();
                                                    genero=marc1.getGenero();
                                        Sgenero=genero.getNombre();
                                                    Marca marca = new Marca();
                                                    marca=marc1.getMarca();
                                        Smarca=marca.getNombre();
                                                    TipeProd tp = new TipeProd();
                                                    tp=marc1.getTipo_prod();
                                        Stipo_prod=tp.getName();

                                        info[0]=Skey_prod;
                                        info[1]=Sname_prod;
                                        info[2]=Sprice;
                                        info[3]=Sstock;
                                        info[4]=Spower;
                                        info[5]=Stipe_con;
                                        info[6]=Sclass_game;
                                        info[7]=Sest_game;
                                        info[8]=Sgenero;
                                        info[9]=Smarca;
                                        info[10]=Stipo_prod;
                                        modelo.addRow(info);
                                    }
                                }
    } 
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Return = new javax.swing.JButton();
        JV = new javax.swing.JLabel();
        SearchButton = new javax.swing.JButton();
        Searchtxt = new javax.swing.JLabel();
        Key = new javax.swing.JLabel();
        Tclave = new javax.swing.JTextField();
        Remove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Sold = new javax.swing.JTable();
        Bagregar = new javax.swing.JButton();
        User = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        TotalText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        AddButon1 = new javax.swing.JButton();
        Searchtxt1 = new javax.swing.JLabel();
        UserText = new javax.swing.JLabel();
        Searchtxt2 = new javax.swing.JLabel();
        Tcant = new javax.swing.JTextField();
        Searchtxt4 = new javax.swing.JLabel();
        Searchtxt3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        Return.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Return.setText("Return");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });

        JV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Jeu Video main.png"))); // NOI18N

        SearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lupa1_1.png"))); // NOI18N
        SearchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchButtonMouseClicked(evt);
            }
        });
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        Searchtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Searchtxt.setText("Ingresa la clave del producto");

        Key.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/12.png"))); // NOI18N

        Tclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TclaveActionPerformed(evt);
            }
        });

        Remove.setBackground(new java.awt.Color(153, 0, 0));
        Remove.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Remove.setText("Remove #");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });

        Sold.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Status", "Clave", "Producto", "Cantidad", "Precio", "Total"
            }
        ));
        jScrollPane1.setViewportView(Sold);

        Bagregar.setBackground(new java.awt.Color(0, 153, 0));
        Bagregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Bagregar.setText("Agregar");
        Bagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagregarActionPerformed(evt);
            }
        });

        User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_User_96px_2.png"))); // NOI18N

        Total.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Total.setText("Total a Pagar");

        TotalText.setBackground(new java.awt.Color(0, 0, 0));
        TotalText.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        TotalText.setForeground(new java.awt.Color(0, 204, 0));
        TotalText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TotalText.setText("0.00");
        TotalText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalTextActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        jLabel1.setText("$");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Status", "Clave", "Producto", "Cantidad", "Precio", "Total"
            }
        ));
        jScrollPane2.setViewportView(tabla);

        AddButon1.setBackground(new java.awt.Color(0, 153, 0));
        AddButon1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddButon1.setText("Generar compra");
        AddButon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButon1ActionPerformed(evt);
            }
        });

        Searchtxt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Searchtxt1.setText("Carrito de compras");

        UserText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UserText.setText("Cliente");

        Searchtxt2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Searchtxt2.setText("+");

        Tcant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TcantActionPerformed(evt);
            }
        });

        Searchtxt4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Searchtxt4.setText("Cantidad a comprar");

        Searchtxt3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Searchtxt3.setText("=");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JV)
                        .addGap(18, 18, 18)
                        .addComponent(User)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Total)
                                .addGap(131, 131, 131)
                                .addComponent(Return))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TotalText, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AddButon1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Key)
                                        .addGap(18, 18, 18)
                                        .addComponent(Tclave, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Searchtxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Searchtxt))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Tcant, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Searchtxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(Bagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(Searchtxt4)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Searchtxt1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Remove)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Return)
                        .addGap(26, 26, 26)
                        .addComponent(AddButon1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JV)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Total)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TotalText, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(UserText)))
                            .addComponent(User))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Searchtxt4)
                    .addComponent(Searchtxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Bagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Tclave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Searchtxt2)
                        .addComponent(Tcant, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Searchtxt3))
                    .addComponent(Key, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SearchButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Searchtxt1)
                    .addComponent(Remove))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButon1ActionPerformed
        
        //devuelve 3 datos          nombre. cantidad, subtotales 
        //ciclo que guarde cada valor en su respectivo arreglo
                Product product =new Product();
                Product[] productos =new Product[100];

                double Total=0;
                
        for(int i=0; i<tabla.getRowCount(); i++){
            
                //leer datos de la tabla hasta que ya no haya
                String Datos[]= new String[3];
                
                nom=tabla.getValueAt(i, 0).toString();
                    
                String Scant;
                Scant=tabla.getValueAt(i, 1).toString();
                cant=Integer.parseInt(Scant);
                    
                String Ssubtotal;
                Ssubtotal=tabla.getValueAt(i, 2).toString();
                double dsubtotal=Double.parseDouble(Ssubtotal);

                //se busca un producto por su nombre
                product=product.SearchNombre(arrep, nom);

                
                Total=Total+dsubtotal;
                OVenta venta = new OVenta();
                venta.nuevaVenta(i, nom_usu, 1, product, cant, dsubtotal);
                venta.llenarArre(venta);
                
                }
              
            JOptionPane.showMessageDialog(null, "se genero su compra");
        
        
        
    
    }//GEN-LAST:event_AddButon1ActionPerformed

    private void TotalTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalTextActionPerformed

    private void BagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagregarActionPerformed
        String  Sprod, Scant, Ssubt;
        double subsub;
        int Sclave;

                                String[] info =new String[3];
                                Product produc = new Product();
                                        
                                
                                        Scant=Tcant.getText();
                                        cant2=Integer.valueOf(Scant);
                                        
                                    if(leernum==0){
                                                Sclave=Integer.parseInt(Tclave.getText());
                                                produc=arrep[Sclave];
                                                stock=produc.getStock();
                                                leernum=1;
                                                //stock=stockini;
                                    }
                                        
                                        if(cant2<=stock){
                                                Sclave=Integer.parseInt(Tclave.getText());
                                                produc=arrep[Sclave];
                                                Sprod=produc.getName_prod();

                                                Scant=Tcant.getText();
                                                    cant2=Integer.parseInt(Scant);
                                                 stock=stock-cant2;

                                                produc=arrep[Sclave];    
                                                subsub=cant2*produc.getPrice();
                                                Ssubt=String.valueOf(subsub);


                                                info[0]=Sprod;
                                                info[1]=Scant;
                                                info[2]=Ssubt;
                                                modelo2.addRow(info);

                                                Tclave.setText(null);
                                                Tcant.setText(null);
                                        }else{
                                            JOptionPane.showMessageDialog(null, "la cantidad que solicita no esta disponible");
                                        }
        
    }//GEN-LAST:event_BagregarActionPerformed

    private void TclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TclaveActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_TclaveActionPerformed

    private void SearchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchButtonMouseClicked
        // TODO add your handling code here:
        PProducto prod= new PProducto();
        prod.setVisible(true);
    }//GEN-LAST:event_SearchButtonMouseClicked

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        // TODO add your handling code here:
        v2 main=new v2();
        main.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_ReturnActionPerformed

    private void TcantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TcantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TcantActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
            int fila=tabla.getSelectedRow();
            if(fila>=0){
               String Scant = modelo2.getValueAt(fila, 1).toString();
               int elicant =Integer.valueOf(Scant);
               modelo2.removeRow(fila);
               stock=stock+elicant;
                
            }else{
                JOptionPane.showMessageDialog(null, "Selecciona una fila");
            }
            
    }//GEN-LAST:event_RemoveActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        Product prod = new Product();
        
    }//GEN-LAST:event_SearchButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButon1;
    private javax.swing.JButton Bagregar;
    private javax.swing.JLabel JV;
    private javax.swing.JLabel Key;
    private javax.swing.JButton Remove;
    private javax.swing.JButton Return;
    private javax.swing.JButton SearchButton;
    private javax.swing.JLabel Searchtxt;
    private javax.swing.JLabel Searchtxt1;
    private javax.swing.JLabel Searchtxt2;
    private javax.swing.JLabel Searchtxt3;
    private javax.swing.JLabel Searchtxt4;
    private javax.swing.JTable Sold;
    private javax.swing.JTextField Tcant;
    private javax.swing.JTextField Tclave;
    private javax.swing.JLabel Total;
    private javax.swing.JTextField TotalText;
    private javax.swing.JLabel User;
    private javax.swing.JLabel UserText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
