
package projecto;
import Objetos.Gender;
import Objetos.Marca;
import Objetos.Product;
import Objetos.Provider;
import Objetos.TipeProd;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class PProducto extends javax.swing.JFrame {

    DefaultComboBoxModel modelogenero, modelomarca, modeloprov,modelotipoprod;
    int tg,tm,tpv,ttp;
    public PProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        tg=CargarGenero();
        tm=CargarMarca();
        tpv=CargarProv();
        ttp=CargarTipoProd();
        
        
    }

    public int CargarGenero(){
            //llamo al arreglo con objetos de genero
            PGenero pgep = new PGenero(); 
            Gender[] arreg = pgep.arre;
            String llenarg="";
            int tamarre = 0;
            //llenar el arreglo arregs con los getters de nombre de genero
            Gender g = new Gender();
            //medir el arreglo
            for(int i=0;i<arreg.length; i++){
                if(arreg[i]!=null){
                    tamarre++;
                }
            }
            String[] arregs= new String[tamarre];
            for(int i=0;i<tamarre; i++){
                if(arreg[i]!=null){
                    llenarg=arreg[i].getNombre();
                    arregs[i]=llenarg;
                }
            }
            modelogenero=new DefaultComboBoxModel(arregs);
            Cgenero.setModel(modelogenero);
            return tamarre;
    }
    
    public int CargarMarca(){
            PMarca pgep = new PMarca(); 
            Marca[] arreg = pgep.arre;
            String llenarg="";
            int tamarre = 0;
            Marca g = new Marca();
            for(int i=0;i<arreg.length; i++){
                if(arreg[i]!=null){
                    tamarre++;
                }
            }
            String[] arregs= new String[tamarre];
            for(int i=0;i<tamarre; i++){
                if(arreg[i]!=null){
                    llenarg=arreg[i].getNombre();
                    arregs[i]=llenarg;
                }
            }
            modelomarca=new DefaultComboBoxModel(arregs);
            Cmarca.setModel(modelomarca);
            return tamarre;
    }
        
    public int CargarProv(){
            PProveedor pgep = new PProveedor(); 
            Provider[] arreg = pgep.arre;
            String llenarg="";
            int tamarre = 0;
            Provider g = new Provider();
            for(int i=0;i<arreg.length; i++){
                if(arreg[i]!=null){
                    tamarre++;
                }
            }
            String[] arregs= new String[tamarre];
            for(int i=0;i<tamarre; i++){
                if(arreg[i]!=null){
                    llenarg=arreg[i].getName_prov();
                    arregs[i]=llenarg;
                }
            }
            modeloprov=new DefaultComboBoxModel(arregs);
            Cprov.setModel(modeloprov);
            return tamarre;
    }
        
    public int CargarTipoProd(){
            PTipo_prod pgep = new PTipo_prod(); 
            TipeProd[] arreg = pgep.arre;
            String llenarg="";
            int tamarre = 0;
            TipeProd g = new TipeProd();
            for(int i=0;i<arreg.length; i++){
                if(arreg[i]!=null){
                    tamarre++;
                }
            }
            String[] arregs= new String[tamarre];
            for(int i=0;i<tamarre; i++){
                if(arreg[i]!=null){
                    llenarg=arreg[i].getName();
                    arregs[i]=llenarg;
                }
            }
            modelotipoprod=new DefaultComboBoxModel(arregs);
            Ctip.setModel(modelotipoprod);
            return tamarre;
    }        
        
        int key_prod,stock,power, status;
	Gender gen; 
        Marca mar;
        Provider prov;
        TipeProd tip_prod;
	String name_prod,tipe_con,class_game,est_game;
	double price,cost;

    //ARRAYS
        static public Product[] arreprod = new Product[100];
        //llamo al arreglo con objetos de genero
        PGenero pgep = new PGenero(); 
        Gender[] arreg = pgep.arre;
        //llamo al arreglo con objetos de genero
        PMarca pmarc = new PMarca(); 
        Marca[] arrem = pmarc.arre;
        //llamo al arreglo con objetos de genero
        PProveedor pprov = new PProveedor(); 
        Provider[] arreprov = pprov.arre;
        //llamo al arreglo con objetos de genero
        PTipo_prod ptp = new PTipo_prod(); 
        TipeProd[] arretp = ptp.arre;
        
        static private int posicion=0;
       
    //METODOS    
        private static Product instanciando() {
        Product prod=new Product();
        return prod;
        }

        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Eliminar4 = new javax.swing.JButton();
        Actualizar2 = new javax.swing.JButton();
        Guardar2 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tprec = new javax.swing.JTextField();
        tnom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Eliminar = new javax.swing.JButton();
        BActualizar = new javax.swing.JButton();
        BGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tstock = new javax.swing.JTextField();
        tcost = new javax.swing.JTextField();
        tstatus = new javax.swing.JTextField();
        Ctip = new javax.swing.JComboBox<>();
        tpoten = new javax.swing.JTextField();
        testu = new javax.swing.JTextField();
        ttipconsol = new javax.swing.JTextField();
        tclasif = new javax.swing.JTextField();
        tclave = new javax.swing.JTextField();
        Cprov = new javax.swing.JComboBox<>();
        Cmarca = new javax.swing.JComboBox<>();
        Cgenero = new javax.swing.JComboBox<>();
        BMostrar = new javax.swing.JButton();
        BBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
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

        jLabel1.setFont(new java.awt.Font("Gungsuh", 0, 24)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Gungsuh", 0, 24)); // NOI18N
        jLabel3.setText("Clave");

        tprec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tprecActionPerformed(evt);
            }
        });

        tnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnomActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Gungsuh", 0, 24)); // NOI18N
        jLabel2.setText("Status");

        Eliminar.setText("Eliminar");
        Eliminar.setToolTipText("");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        BActualizar.setText("Actualizar");
        BActualizar.setToolTipText("");
        BActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActualizarActionPerformed(evt);
            }
        });

        BGuardar.setText("Guardar");
        BGuardar.setToolTipText("");
        BGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGuardarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Gungsuh", 3, 36)); // NOI18N
        jLabel4.setText("Producto ");

        jLabel9.setFont(new java.awt.Font("Gungsuh", 0, 24)); // NOI18N
        jLabel9.setText("costo");

        jLabel10.setFont(new java.awt.Font("Gungsuh", 0, 24)); // NOI18N
        jLabel10.setText("precio");

        jLabel11.setFont(new java.awt.Font("Gungsuh", 0, 24)); // NOI18N
        jLabel11.setText("stock");

        jLabel12.setFont(new java.awt.Font("Gungsuh", 0, 24)); // NOI18N
        jLabel12.setText("tipo de consola");

        jLabel13.setFont(new java.awt.Font("Gungsuh", 0, 24)); // NOI18N
        jLabel13.setText("clasificacion");

        jLabel14.setFont(new java.awt.Font("Gungsuh", 0, 24)); // NOI18N
        jLabel14.setText("potencia");

        jLabel15.setFont(new java.awt.Font("Gungsuh", 0, 24)); // NOI18N
        jLabel15.setText("genero");

        jLabel16.setFont(new java.awt.Font("Gungsuh", 0, 24)); // NOI18N
        jLabel16.setText("proveedor");

        jLabel17.setFont(new java.awt.Font("Gungsuh", 0, 24)); // NOI18N
        jLabel17.setText("tipo de producto");

        jLabel18.setFont(new java.awt.Font("Gungsuh", 0, 24)); // NOI18N
        jLabel18.setText("estudio");

        jLabel19.setFont(new java.awt.Font("Gungsuh", 0, 24)); // NOI18N
        jLabel19.setText("marca");

        tstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tstockActionPerformed(evt);
            }
        });

        tcost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcostActionPerformed(evt);
            }
        });

        tstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tstatusActionPerformed(evt);
            }
        });

        Ctip.setFont(new java.awt.Font("Gungsuh", 0, 18)); // NOI18N
        Ctip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CtipActionPerformed(evt);
            }
        });

        tpoten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpotenActionPerformed(evt);
            }
        });

        testu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testuActionPerformed(evt);
            }
        });

        ttipconsol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttipconsolActionPerformed(evt);
            }
        });

        tclasif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tclasifActionPerformed(evt);
            }
        });

        tclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tclaveActionPerformed(evt);
            }
        });

        Cprov.setFont(new java.awt.Font("Gungsuh", 0, 18)); // NOI18N
        Cprov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CprovActionPerformed(evt);
            }
        });

        Cmarca.setFont(new java.awt.Font("Gungsuh", 0, 18)); // NOI18N
        Cmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmarcaActionPerformed(evt);
            }
        });

        Cgenero.setFont(new java.awt.Font("Gungsuh", 0, 18)); // NOI18N
        Cgenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CgeneroActionPerformed(evt);
            }
        });

        BMostrar.setText("Borrar");
        BMostrar.setToolTipText("");
        BMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMostrarActionPerformed(evt);
            }
        });

        BBuscar.setText("Buscar");
        BBuscar.setToolTipText("");
        BBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarActionPerformed(evt);
            }
        });

        jLabel5.setText("*Si algun producto no necesita que se llene algun campo, favor de poner un 0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel2))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tprec, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tnom, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tcost, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tstock, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tclave, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(Cprov, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(81, 81, 81)
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(testu, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(tclasif)
                                                        .addComponent(Cgenero, 0, 163, Short.MAX_VALUE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(77, 77, 77)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel12)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel15)
                                                        .addComponent(jLabel18))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel14)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(tpoten, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(BGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(BActualizar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(35, 35, 35)
                                            .addComponent(BMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(ttipconsol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ctip, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(tpoten, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(5, 5, 5)
                                .addComponent(ttipconsol, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(testu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(Cgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tclasif, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addGap(8, 8, 8)
                                    .addComponent(Cprov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel19)
                                    .addGap(34, 34, 34))
                                .addComponent(Cmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(Ctip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tnom, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tprec, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tcost, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(tstock, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tclave, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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

    private void tprecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tprecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tprecActionPerformed

    private void tnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnomActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        Product prod = new Product();
        key_prod=Integer.parseInt(tclave.getText());
        arreprod=prod.delete(arreprod, key_prod);
    }//GEN-LAST:event_EliminarActionPerformed

    private void BActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActualizarActionPerformed

        Product prod = new Product();
        Gender g =new Gender();
        Marca m =new Marca();
        Provider p =new Provider();
        TipeProd tp = new TipeProd();
        key_prod=Integer.parseInt(tclave.getText());;
        name_prod=tnom.getText();
        price=Double.parseDouble(tprec.getText());
        cost=Double.parseDouble(tcost.getText());
        stock=Integer.parseInt(tstock.getText());
        power=Integer.parseInt(tpoten.getText());
        tipe_con=ttipconsol.getText();
        class_game=tclasif.getText();
        est_game=testu.getText();
        
        //leo el campo seleccionado
        String strcomg=Cgenero.getSelectedItem().toString();
        //leo el arreglo de genero
        for(int i=0;i<tg;i++){
            //y comparo que si el getnmbredelgenero == String del "combobox"
            if(arreg[i].getNombre().equals(strcomg)){
                g=arreg[i];
            }
        }
        gen=g;
        
        strcomg=Cmarca.getSelectedItem().toString();
        //leo el arreglo de genero
        for(int i=0;i<tm;i++){
            if(arrem[i].getNombre().equals(strcomg)){
                m=arrem[i];
            }
        }
        mar=m;
        strcomg=Cprov.getSelectedItem().toString();
        for(int i=0;i<tpv;i++){
            if(arreprov[i].getName_prov().equals(strcomg)){
                p=arreprov[i];
            }
        }
        prov=p;
        strcomg=Ctip.getSelectedItem().toString();
        for(int i=0;i<ttp;i++){
            if(arretp[i].getName().equals(strcomg)){
                tp=arretp[i];
            }
        }
        tip_prod=tp;
        status=Integer.parseInt(tstatus.getText());
        prod.Update(arreprod, key_prod, name_prod, price, cost, stock, power, tipe_con, class_game, est_game, gen, mar, prov, tip_prod, status);
        
    }//GEN-LAST:event_BActualizarActionPerformed

    private void BGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuardarActionPerformed
        Product prod = new Product();
        Gender g =new Gender();
        Marca m =new Marca();
        Provider p =new Provider();
        TipeProd tp = new TipeProd();
        key_prod=posicion;
        name_prod=tnom.getText();
        price=Double.parseDouble(tprec.getText());
        cost=Double.parseDouble(tcost.getText());
        stock=Integer.parseInt(tstock.getText());
        power=Integer.parseInt(tpoten.getText());
        tipe_con=ttipconsol.getText();
        class_game=tclasif.getText();
        est_game=testu.getText();
        
        //leo el campo seleccionado
        String strcomg=Cgenero.getSelectedItem().toString();
        //leo el arreglo de genero
        for(int i=0;i<tg;i++){
            //y comparo que si el getnmbredelgenero == String del "combobox"
            if(arreg[i].getNombre().equals(strcomg)){
                g=arreg[i];
            }
        }
        gen=g;
        
        strcomg=Cmarca.getSelectedItem().toString();
        //leo el arreglo de genero
        for(int i=0;i<tm;i++){
            if(arrem[i].getNombre().equals(strcomg)){
                m=arrem[i];
            }
        }
        mar=m;
        strcomg=Cprov.getSelectedItem().toString();
        for(int i=0;i<tpv;i++){
            if(arreprov[i].getName_prov().equals(strcomg)){
                p=arreprov[i];
            }
        }
        prov=p;
        strcomg=Ctip.getSelectedItem().toString();
        for(int i=0;i<ttp;i++){
            if(arretp[i].getName().equals(strcomg)){
                tp=arretp[i];
            }
        }
        tip_prod=tp;
        status=1;

	
	//nuevo objeto producto
        if(posicion<arreprod.length){
        prod=prod.newproduct(key_prod, name_prod, price, cost, stock, 
                power, tipe_con, class_game, est_game, 
                gen, mar, prov, tip_prod, status);
        if(prov!=null){
        JOptionPane.showMessageDialog(null, "se guardo el producto");
        }else{
          JOptionPane.showMessageDialog(null, "no se guardo");
        }
        arreprod[posicion]=prod;      
        posicion++;
        }
    }//GEN-LAST:event_BGuardarActionPerformed

    private void tstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tstockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tstockActionPerformed

    private void tcostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcostActionPerformed

    private void tstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tstatusActionPerformed

    private void CtipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CtipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CtipActionPerformed

    private void tpotenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpotenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpotenActionPerformed

    private void testuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testuActionPerformed

    private void tclasifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tclasifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tclasifActionPerformed

    private void tclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tclaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tclaveActionPerformed

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

    private void ttipconsolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttipconsolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttipconsolActionPerformed

    private void CprovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CprovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CprovActionPerformed

    private void CmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmarcaActionPerformed

    private void CgeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CgeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CgeneroActionPerformed

    private void BMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMostrarActionPerformed
        tclave.setText(null);
        tnom.setText(null);
        tprec.setText(null);
        tcost.setText(null);
        tstock.setText(null);
        tpoten.setText(null);
        ttipconsol.setText(null);
        tclasif.setText(null);
        testu.setText(null);
        tstatus.setText(null);

    }//GEN-LAST:event_BMostrarActionPerformed

    private void BBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarActionPerformed
        Product prod = new Product();
        key_prod=Integer.parseInt(tclave.getText());
        prod=prod.Search(arreprod, key_prod);

        key_prod=prod.getKey_prod();
        name_prod=prod.getName_prod();
        price=prod.getPrice(); 
        cost=prod.getCost();
        stock=prod.getStock();
        power=prod.getPower();
        tipe_con=prod.getTipe_con();
        class_game=prod.getClass_game();
        est_game=prod.getEst_game();
        gen=prod.getGenero();
        mar=prod.getMarca();
        prov=prod.getProveedor();
        tip_prod=prod.getTipo_prod();
        status=prod.getStatus();
       
        tclave.setText(String.valueOf(key_prod));
        tnom.setText(name_prod);
        tprec.setText(String.valueOf(price));
        tcost.setText(String.valueOf(cost));
        tstock.setText(String.valueOf(stock));
        tpoten.setText(String.valueOf(power));
        ttipconsol.setText(tipe_con);
        tclasif.setText(class_game);
        testu.setText(est_game);
        
        for(int numero = 0;numero<tg;numero++){
            if(gen.getNombre().equals(arreg[numero].getNombre())){
                Cgenero.setSelectedIndex(numero);
            }
        }
       
        for(int numero = 0;numero<tm;numero++){
            if(mar.getNombre().equals(arrem[numero].getNombre())){
                Cmarca.setSelectedIndex(numero);
            }
        }
        
        for(int numero = 0;numero<tpv;numero++){
            if(prov.getName_prov().equals(arreprov[numero].getName_prov())){
                Cprov.setSelectedIndex(numero);
            }
        }
        
        for(int numero = 0;numero<ttp;numero++){
            if(tip_prod.getName().equals(arretp[numero].getName())){
                Ctip.setSelectedIndex(numero);
            }
        }
        
        tstatus.setText(String.valueOf(status));
        
    }//GEN-LAST:event_BBuscarActionPerformed


    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(PProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar2;
    private javax.swing.JButton BActualizar;
    private javax.swing.JButton BBuscar;
    private javax.swing.JButton BGuardar;
    private javax.swing.JButton BMostrar;
    private javax.swing.JComboBox<String> Cgenero;
    private javax.swing.JComboBox<String> Cmarca;
    private javax.swing.JMenu Cofiguración;
    private javax.swing.JComboBox<String> Cprov;
    private javax.swing.JComboBox<String> Ctip;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Eliminar4;
    private javax.swing.JMenuItem Emp;
    private javax.swing.JMenu Gestionar;
    private javax.swing.JButton Guardar2;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuItem bienvenido;
    private javax.swing.JMenuItem cliente;
    private javax.swing.JMenuItem genero;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem login;
    private javax.swing.JMenuItem marca;
    private javax.swing.JMenuItem producto;
    private javax.swing.JMenuItem proveedor;
    private javax.swing.JTextField tclasif;
    private javax.swing.JTextField tclave;
    private javax.swing.JTextField tcost;
    private javax.swing.JTextField testu;
    private javax.swing.JMenuItem tipo;
    private javax.swing.JTextField tnom;
    private javax.swing.JTextField tpoten;
    private javax.swing.JTextField tprec;
    private javax.swing.JTextField tstatus;
    private javax.swing.JTextField tstock;
    private javax.swing.JTextField ttipconsol;
    // End of variables declaration//GEN-END:variables
}
