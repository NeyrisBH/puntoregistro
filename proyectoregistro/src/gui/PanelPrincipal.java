package gui;

public class PanelPrincipal extends javax.swing.JFrame {

    public PanelPrincipal() {
        initComponents();
        btnEditarFrutasVerduras.setVisible(false);
        btnEliminarFrutasVerduras.setVisible(false);
        btnEditarGrasas.setVisible(false);
        btnEliminarGrasas.setVisible(false);
        btnEditarHidratosCarbono.setVisible(false);
        btnEliminarHidratosCarbono.setVisible(false);
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JTabMenu = new javax.swing.JTabbedPane();
        JPanelFrutasVerduras = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSabor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmbColor = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtProteinas = new javax.swing.JTextField();
        btnRegistrarFrutasVerduras = new javax.swing.JButton();
        btnEditarFrutasVerduras = new javax.swing.JButton();
        btnEliminarFrutasVerduras = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        TituloRegistro2 = new javax.swing.JLabel();
        JPanelGrasas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSabor1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPeso1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtOrigen1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cmbClase = new javax.swing.JComboBox<>();
        btnRegistrarGrasas = new javax.swing.JButton();
        btnEditarGrasas = new javax.swing.JButton();
        btnEliminarGrasas = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        TituloRegistro = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtNombreBuscar = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        TituloRegistro1 = new javax.swing.JLabel();
        btnBuscarGrasas = new javax.swing.JButton();
        JPanelHidratosCarbono = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        TituloRegistro3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPeso2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtSabor2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtOrigen2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cmbTipo1 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        cmbFuentes = new javax.swing.JComboBox<>();
        btnRegistrarHidratosCarbono = new javax.swing.JButton();
        btnEditarHidratosCarbono = new javax.swing.JButton();
        btnEliminarHidratosCarbono = new javax.swing.JButton();
        JPanelEditarUsuario = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        JTabMenu.setBackground(new java.awt.Color(255, 255, 255));
        JTabMenu.setForeground(new java.awt.Color(102, 102, 255));
        JTabMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTabMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        JPanelFrutasVerduras.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Peso:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sabor:");

        txtSabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaborActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Origen:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo:");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Drupa", "Baya", "Hesperidio", "Pepónide", "Heterio", "Pomo", "Sorosis", "Sicono", "Cenocarpo", "Otro.." }));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Color");

        cmbColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Rojo", "Amarillo", "Naranja", "Verde", "Azul", "Morado", "Violeta", "Blanco", "Otro.." }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Proteinas:");

        btnRegistrarFrutasVerduras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarFrutasVerduras.setForeground(new java.awt.Color(102, 102, 255));
        btnRegistrarFrutasVerduras.setText("Registrar");
        btnRegistrarFrutasVerduras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarFrutasVerdurasActionPerformed(evt);
            }
        });

        btnEditarFrutasVerduras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditarFrutasVerduras.setForeground(new java.awt.Color(102, 102, 255));
        btnEditarFrutasVerduras.setText("Editar");
        btnEditarFrutasVerduras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarFrutasVerdurasActionPerformed(evt);
            }
        });

        btnEliminarFrutasVerduras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminarFrutasVerduras.setForeground(new java.awt.Color(102, 102, 255));
        btnEliminarFrutasVerduras.setText("Eliminar");
        btnEliminarFrutasVerduras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFrutasVerdurasActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        TituloRegistro2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TituloRegistro2.setForeground(new java.awt.Color(102, 102, 255));
        TituloRegistro2.setText("REGISTRAR FRUTAS Y VERDURAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(TituloRegistro2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloRegistro2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JPanelFrutasVerdurasLayout = new javax.swing.GroupLayout(JPanelFrutasVerduras);
        JPanelFrutasVerduras.setLayout(JPanelFrutasVerdurasLayout);
        JPanelFrutasVerdurasLayout.setHorizontalGroup(
            JPanelFrutasVerdurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelFrutasVerdurasLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(JPanelFrutasVerdurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelFrutasVerdurasLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(JPanelFrutasVerdurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelFrutasVerdurasLayout.createSequentialGroup()
                                .addGroup(JPanelFrutasVerdurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(JPanelFrutasVerdurasLayout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addGroup(JPanelFrutasVerdurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbColor, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbTipo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtProteinas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(JPanelFrutasVerdurasLayout.createSequentialGroup()
                                .addGroup(JPanelFrutasVerdurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(JPanelFrutasVerdurasLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(JPanelFrutasVerdurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtOrigen)
                                            .addComponent(txtSabor)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelFrutasVerdurasLayout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPeso))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelFrutasVerdurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(JPanelFrutasVerdurasLayout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addGroup(JPanelFrutasVerdurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRegistrarFrutasVerduras, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(btnEditarFrutasVerduras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminarFrutasVerduras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(58, 58, 58))))
                    .addGroup(JPanelFrutasVerdurasLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JPanelFrutasVerdurasLayout.setVerticalGroup(
            JPanelFrutasVerdurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelFrutasVerdurasLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                .addGroup(JPanelFrutasVerdurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelFrutasVerdurasLayout.createSequentialGroup()
                        .addGroup(JPanelFrutasVerdurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelFrutasVerdurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(JPanelFrutasVerdurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSabor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(JPanelFrutasVerdurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JPanelFrutasVerdurasLayout.createSequentialGroup()
                        .addComponent(btnRegistrarFrutasVerduras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarFrutasVerduras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarFrutasVerduras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(JPanelFrutasVerdurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(JPanelFrutasVerdurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbColor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(JPanelFrutasVerdurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtProteinas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        JTabMenu.addTab("Frutas y Verduras", JPanelFrutasVerduras);

        JPanelGrasas.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sabor:");

        txtSabor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSabor1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Peso:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Origen:");

        txtOrigen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrigen1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Clase:");

        cmbClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Saturada", "Monoinsaturada", "Poliinsaturada Omega-3", "Poliinsaturada Omega-6", "Trans" }));

        btnRegistrarGrasas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarGrasas.setForeground(new java.awt.Color(102, 102, 255));
        btnRegistrarGrasas.setText("Registrar");
        btnRegistrarGrasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarGrasasActionPerformed(evt);
            }
        });

        btnEditarGrasas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditarGrasas.setForeground(new java.awt.Color(102, 102, 255));
        btnEditarGrasas.setText("Editar");
        btnEditarGrasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarGrasasActionPerformed(evt);
            }
        });

        btnEliminarGrasas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminarGrasas.setForeground(new java.awt.Color(102, 102, 255));
        btnEliminarGrasas.setText("Eliminar");
        btnEliminarGrasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarGrasasActionPerformed(evt);
            }
        });

        TituloRegistro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TituloRegistro.setForeground(new java.awt.Color(102, 102, 255));
        TituloRegistro.setText("REGISTRAR GRASAS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(TituloRegistro)
                .addGap(193, 193, 193))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(TituloRegistro)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Nombre:");

        TituloRegistro1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TituloRegistro1.setForeground(new java.awt.Color(102, 102, 255));
        TituloRegistro1.setText("BUSCAR REGISTRO");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(TituloRegistro1)
                .addGap(193, 193, 193))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(TituloRegistro1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnBuscarGrasas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarGrasas.setText("Buscar");
        btnBuscarGrasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarGrasasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(btnBuscarGrasas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(52, 52, 52))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtNombreBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarGrasas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JPanelGrasasLayout = new javax.swing.GroupLayout(JPanelGrasas);
        JPanelGrasas.setLayout(JPanelGrasasLayout);
        JPanelGrasasLayout.setHorizontalGroup(
            JPanelGrasasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JPanelGrasasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPanelGrasasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelGrasasLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOrigen1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelGrasasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(JPanelGrasasLayout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtSabor1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelGrasasLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JPanelGrasasLayout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1)
                            .addComponent(cmbClase, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelGrasasLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPeso1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 94, 94)
                .addGroup(JPanelGrasasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrarGrasas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarGrasas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarGrasas, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JPanelGrasasLayout.setVerticalGroup(
            JPanelGrasasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelGrasasLayout.createSequentialGroup()
                .addGroup(JPanelGrasasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelGrasasLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(JPanelGrasasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSabor1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(JPanelGrasasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPeso1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelGrasasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(JPanelGrasasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrarGrasas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JPanelGrasasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addComponent(btnEliminarGrasas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnEditarGrasas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGroup(JPanelGrasasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOrigen1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(35, 35, 35)
                .addGroup(JPanelGrasasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cmbClase, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        JTabMenu.addTab("Grasas", JPanelGrasas);

        JPanelHidratosCarbono.setBackground(new java.awt.Color(153, 153, 153));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        TituloRegistro3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TituloRegistro3.setForeground(new java.awt.Color(102, 102, 255));
        TituloRegistro3.setText("REGISTRAR HIDRATOS DE CARBONO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TituloRegistro3)
                .addGap(97, 97, 97))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloRegistro3)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nombre:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Peso:");

        txtPeso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPeso2ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Sabor:");

        txtSabor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSabor2ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Origen:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Tipo:");

        cmbTipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Drupa", "Baya", "Hesperidio", "Pepónide", "Heterio", "Pomo", "Sorosis", "Sicono", "Cenocarpo", "Otro.." }));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Fuente:");

        cmbFuentes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cereales", "Azúcares", "Tubérculos", "Legumbres", "Frutas y verduras" }));

        btnRegistrarHidratosCarbono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarHidratosCarbono.setForeground(new java.awt.Color(102, 102, 255));
        btnRegistrarHidratosCarbono.setText("Registrar");
        btnRegistrarHidratosCarbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarHidratosCarbonoActionPerformed(evt);
            }
        });

        btnEditarHidratosCarbono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditarHidratosCarbono.setForeground(new java.awt.Color(102, 102, 255));
        btnEditarHidratosCarbono.setText("Editar");
        btnEditarHidratosCarbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarHidratosCarbonoActionPerformed(evt);
            }
        });

        btnEliminarHidratosCarbono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminarHidratosCarbono.setForeground(new java.awt.Color(102, 102, 255));
        btnEliminarHidratosCarbono.setText("Eliminar");
        btnEliminarHidratosCarbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarHidratosCarbonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelHidratosCarbonoLayout = new javax.swing.GroupLayout(JPanelHidratosCarbono);
        JPanelHidratosCarbono.setLayout(JPanelHidratosCarbonoLayout);
        JPanelHidratosCarbonoLayout.setHorizontalGroup(
            JPanelHidratosCarbonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JPanelHidratosCarbonoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(JPanelHidratosCarbonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelHidratosCarbonoLayout.createSequentialGroup()
                        .addGroup(JPanelHidratosCarbonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelHidratosCarbonoLayout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanelHidratosCarbonoLayout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbFuentes, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JPanelHidratosCarbonoLayout.createSequentialGroup()
                        .addGroup(JPanelHidratosCarbonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelHidratosCarbonoLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPeso2))
                            .addGroup(JPanelHidratosCarbonoLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanelHidratosCarbonoLayout.createSequentialGroup()
                                .addGroup(JPanelHidratosCarbonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(JPanelHidratosCarbonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSabor2)
                                    .addComponent(txtOrigen2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(JPanelHidratosCarbonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrarHidratosCarbono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarHidratosCarbono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarHidratosCarbono, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))))
        );
        JPanelHidratosCarbonoLayout.setVerticalGroup(
            JPanelHidratosCarbonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelHidratosCarbonoLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(JPanelHidratosCarbonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelHidratosCarbonoLayout.createSequentialGroup()
                        .addGroup(JPanelHidratosCarbonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(JPanelHidratosCarbonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPeso2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(JPanelHidratosCarbonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSabor2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(JPanelHidratosCarbonoLayout.createSequentialGroup()
                        .addComponent(btnRegistrarHidratosCarbono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarHidratosCarbono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarHidratosCarbono, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)))
                .addGroup(JPanelHidratosCarbonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtOrigen2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(JPanelHidratosCarbonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(31, 31, 31)
                .addGroup(JPanelHidratosCarbonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFuentes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(32, 32, 32))
        );

        JTabMenu.addTab("Hidratos de Carbno", JPanelHidratosCarbono);

        JPanelEditarUsuario.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout JPanelEditarUsuarioLayout = new javax.swing.GroupLayout(JPanelEditarUsuario);
        JPanelEditarUsuario.setLayout(JPanelEditarUsuarioLayout);
        JPanelEditarUsuarioLayout.setHorizontalGroup(
            JPanelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );
        JPanelEditarUsuarioLayout.setVerticalGroup(
            JPanelEditarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
        );

        JTabMenu.addTab("Editar Usuario", JPanelEditarUsuario);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabMenu)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabMenu, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaborActionPerformed
        
    }//GEN-LAST:event_txtSaborActionPerformed

    private void btnRegistrarFrutasVerdurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarFrutasVerdurasActionPerformed
        
    }//GEN-LAST:event_btnRegistrarFrutasVerdurasActionPerformed

    private void btnEditarFrutasVerdurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarFrutasVerdurasActionPerformed
        
    }//GEN-LAST:event_btnEditarFrutasVerdurasActionPerformed

    private void btnEliminarFrutasVerdurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFrutasVerdurasActionPerformed
        
    }//GEN-LAST:event_btnEliminarFrutasVerdurasActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        
    }//GEN-LAST:event_txtPesoActionPerformed

    private void txtPeso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPeso2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPeso2ActionPerformed

    private void txtSabor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSabor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSabor2ActionPerformed

    private void btnRegistrarHidratosCarbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarHidratosCarbonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarHidratosCarbonoActionPerformed

    private void btnEditarHidratosCarbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarHidratosCarbonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarHidratosCarbonoActionPerformed

    private void btnEliminarHidratosCarbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarHidratosCarbonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarHidratosCarbonoActionPerformed

    private void btnEliminarGrasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarGrasasActionPerformed

    }//GEN-LAST:event_btnEliminarGrasasActionPerformed

    private void btnEditarGrasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarGrasasActionPerformed

    }//GEN-LAST:event_btnEditarGrasasActionPerformed

    private void btnRegistrarGrasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarGrasasActionPerformed

    }//GEN-LAST:event_btnRegistrarGrasasActionPerformed

    private void txtSabor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSabor1ActionPerformed

    }//GEN-LAST:event_txtSabor1ActionPerformed

    private void btnBuscarGrasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarGrasasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarGrasasActionPerformed

    private void txtOrigen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrigen1ActionPerformed

    }//GEN-LAST:event_txtOrigen1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelEditarUsuario;
    private javax.swing.JPanel JPanelFrutasVerduras;
    private javax.swing.JPanel JPanelGrasas;
    private javax.swing.JPanel JPanelHidratosCarbono;
    private javax.swing.JTabbedPane JTabMenu;
    private javax.swing.JLabel TituloRegistro;
    private javax.swing.JLabel TituloRegistro1;
    private javax.swing.JLabel TituloRegistro2;
    private javax.swing.JLabel TituloRegistro3;
    private javax.swing.JButton btnBuscarGrasas;
    private javax.swing.JButton btnEditarFrutasVerduras;
    private javax.swing.JButton btnEditarGrasas;
    private javax.swing.JButton btnEditarHidratosCarbono;
    private javax.swing.JButton btnEliminarFrutasVerduras;
    private javax.swing.JButton btnEliminarGrasas;
    private javax.swing.JButton btnEliminarHidratosCarbono;
    private javax.swing.JButton btnRegistrarFrutasVerduras;
    private javax.swing.JButton btnRegistrarGrasas;
    private javax.swing.JButton btnRegistrarHidratosCarbono;
    private javax.swing.JComboBox<String> cmbClase;
    private javax.swing.JComboBox<String> cmbColor;
    private javax.swing.JComboBox<String> cmbFuentes;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JComboBox<String> cmbTipo1;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtNombreBuscar;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JTextField txtOrigen1;
    private javax.swing.JTextField txtOrigen2;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPeso1;
    private javax.swing.JTextField txtPeso2;
    private javax.swing.JTextField txtProteinas;
    private javax.swing.JTextField txtSabor;
    private javax.swing.JTextField txtSabor1;
    private javax.swing.JTextField txtSabor2;
    // End of variables declaration//GEN-END:variables
}
