/*
 *Interfaz que permite la gestion de las contraseñas
 *Registrar
 *Eliminar
 *Modificar
 *Listar
 */
//IMPORTACIONES
package Interfaz;
import Validaciones.*;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
  * @author felipe
  * @version 1.0
 */
public class GUI_Control extends javax.swing.JFrame {
     //creacion de objetos de las distintas clases con el fin de llamar sus atributos para ser utilizados en la interfaz
     TControl tControl=new TControl();
    
    public GUI_Control() {
         //metodo que sirve para cargar todos los objetos que se hallan puesto en el JFrame
        initComponents();
          //Codigo que impide que la aplicacion se expanda o se encoja , dejandola fija 
         setLocationRelativeTo(null);
         setResizable(false);       
          //codigo para agregar una imagen de icono a la aplicacion para esta ventana 
         setIconImage(new ImageIcon(getClass().getResource("/imagen/usuario.png")).getImage());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoDeBotones = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        txtPerfil = new javax.swing.JTextField();
        cmbPerfiles = new javax.swing.JComboBox();
        btnAgregar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtUsuarioBuscar = new javax.swing.JTextField();
        btnLimpiarEd = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        rbtUsuario = new javax.swing.JRadioButton();
        rbtAdmin = new javax.swing.JRadioButton();
        rbtSuper = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUsuarioEd = new javax.swing.JTextField();
        txtClaveEd = new javax.swing.JTextField();
        txtPerfilEd = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnRetornar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gestion Usuario");

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("USUARIO");

        jLabel2.setText("CLAVE");

        jLabel3.setText("PERFIL");

        txtPerfil.setEditable(false);
        txtPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerfilActionPerformed(evt);
            }
        });

        cmbPerfiles.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "usuario", "admin", "super" }));
        cmbPerfiles.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPerfilesItemStateChanged(evt);
            }
        });
        cmbPerfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPerfilesActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtUsuario)
                    .addComponent(cmbPerfiles, javax.swing.GroupLayout.Alignment.LEADING, 0, 115, Short.MAX_VALUE)
                    .addComponent(txtClave, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPerfil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbPerfiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar Usuarios", jPanel1);

        jLabel4.setText("FORMULARIO DE EDICION DE DATOS");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda de Usuarios"));

        jLabel5.setText("USUARIO");

        txtUsuarioBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioBuscarActionPerformed(evt);
            }
        });
        txtUsuarioBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioBuscarKeyReleased(evt);
            }
        });

        btnLimpiarEd.setText("Limpiar");
        btnLimpiarEd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarEdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(43, 43, 43)
                .addComponent(txtUsuarioBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnLimpiarEd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUsuarioBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarEd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Perfiles"));

        GrupoDeBotones.add(rbtUsuario);
        rbtUsuario.setText("USUARIOS");
        rbtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtUsuarioMouseClicked(evt);
            }
        });

        GrupoDeBotones.add(rbtAdmin);
        rbtAdmin.setText("ADMINISTRADOR");
        rbtAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtAdminMouseClicked(evt);
            }
        });

        GrupoDeBotones.add(rbtSuper);
        rbtSuper.setText("SUPERVISOR");
        rbtSuper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtSuperMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(rbtUsuario)
                .addGap(64, 64, 64)
                .addComponent(rbtAdmin)
                .addGap(44, 44, 44)
                .addComponent(rbtSuper)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtUsuario)
                    .addComponent(rbtAdmin)
                    .addComponent(rbtSuper))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("USUARIO SISTEMA");

        jLabel7.setText("CLAVE USUARIO");

        jLabel8.setText("PERFIL USUARIO");

        txtUsuarioEd.setEditable(false);

        txtPerfilEd.setEnabled(false);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(48, 48, 48)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPerfilEd, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(txtClaveEd)
                    .addComponent(txtUsuarioEd))
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtUsuarioEd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClaveEd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPerfilEd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Editar Usuarios", jPanel2);

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "USUARIO", "CLAVE", "PERFIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(btnLimpiar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListar)
                    .addComponent(btnLimpiar))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listar Usuarios", jPanel3);

        btnRetornar.setText("Retornar");
        btnRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRetornar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRetornar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarActionPerformed
         //metodo que AL accionar el boton redirige todo a la pestaña administrador la cual contiene el menu
        new Venta().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetornarActionPerformed

    private void cmbPerfilesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPerfilesItemStateChanged
        // COMBOX BOX QUE AL ELEGIR UNA OPCION ESTA SE REFLEJA EN UN JTextField
       txtPerfil.setText(String.valueOf(cmbPerfiles.getSelectedItem()));
    }//GEN-LAST:event_cmbPerfilesItemStateChanged

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       /*linea de codigo, le asigna una interfaz al boton btnEditarAsig
        *con un panel de seleccion YES,NO,CANCEL
        *esta es eviada a un arreglo*/                                            
int select=JOptionPane.showOptionDialog(btnAgregar,"DESEA REGISTRAR AL USUARIO: "+txtUsuarioBuscar.getText()+" ?","MENSAJE",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{"SI","NO","CANCELAR"},"CANCELAR");
 try {/*setencia que encapsula la respuesta del usuario , si la respuesta seleccionada es "yes" 
       *el sistema desplegara el evento , si es cualquiera de las otras dos opciones el programa no ejecutra nada*/
     if(select==0)
     {try{/*el metodo agregarDatosControl es llamado desde la clase TControl mediante el objeto "tControl" declarado al inicio de la clase GUI_control
         *toma los campos
         *Usuario
         *clave
         *Perfil
        */
         tControl.agregarDatosControl(new Control(txtUsuario.getText(),txtClave.getText(),txtPerfil.getText()));
            txtUsuario.setText("");
            txtClave.setText("");
            txtPerfil.setText("");}
      catch(Exception e){System.out.println(e);}}
     }catch(Exception e){}
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
       //contructo que se utiliza desde la api de java el cual permite manejar mejor las tabla
        DefaultTableModel modelo =  (DefaultTableModel)tblUsuarios.getModel();
        int fila=0;
        //Metodo que permite listar todo los usuarios registrados con su clave y perfil 
        try {
            for (Control control:tControl.listarDatosUsuarios())
            {  tblUsuarios.setValueAt(String.valueOf(control.getUsuario()), fila, 0);
               tblUsuarios.setValueAt(String.valueOf(control.getClave()), fila, 1);
               tblUsuarios.setValueAt(String.valueOf(control.getPerfil()), fila, 2);
               fila++;
                  Object [] filas= new Object[fila];
          for(int i = 0;i<fila;i++)
          {
               modelo.addRow( (Object[]) filas[i]);
          }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void rbtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtUsuarioMouseClicked
        //radio boton que al hacer click cambia el texto de un jtxtFiel
        txtPerfilEd.setText("usuario");
    }//GEN-LAST:event_rbtUsuarioMouseClicked

    private void rbtAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtAdminMouseClicked
          //radio boton que al hacer click cambia el texto de un jtxtFiel   
        txtPerfilEd.setText("admin");
    }//GEN-LAST:event_rbtAdminMouseClicked

    private void rbtSuperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtSuperMouseClicked
          //radio boton que al hacer click cambia el texto de un jtxtFiel
        txtPerfilEd.setText("super");
    }//GEN-LAST:event_rbtSuperMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
          /*linea de codigo, le asigna una interfaz al boton btnEditarAsig
           *con un panel de seleccion YES,NO,CANCEL
           *esta es eviada a un arreglo*/ 
        int select=JOptionPane.showOptionDialog(btnModificar,"DESEA EDITAR LOS DATOS DEL USUARIO: "+txtUsuarioBuscar.getText()+" ?","MENSAJE",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{"SI","NO","CANCELAR"},"CANCELAR");
        try {/*setencia que encapsula la respuesta del usuario , si la respuesta seleccionada es "yes" 
              *el sistema desplegara el evento , si es cualquiera de las otras dos opciones el programa no ejecutra nada*/
            if(select==0){
        try{//se tencia que indica que se deben completar todo los campos de esta manera no se podra editar
            if(txtUsuarioEd.getText().trim().length()>1 && txtClaveEd.getText().trim().length()>1 && txtPerfilEd.getText().trim().length()>1)
        { //metodo modificarDatosControl que encapsula los campos y los edita
            tControl.modificarDatosControl(new Control(txtUsuarioEd.getText(),
         txtClaveEd.getText(),txtPerfilEd.getText()));
         //metodo que limpia los campos
        limpiarDatos();       
        JOptionPane.showMessageDialog(null,"Se edito el usuario correctamente");}
        else{JOptionPane.showMessageDialog(null,"Falta ingresar un campo");}
        }catch(HeadlessException e){}}
        }catch(Exception e){}
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
           /*linea de codigo, le asigna una interfaz al boton btnEditarAsig
           *con un panel de seleccion YES,NO,CANCEL
           *esta es eviada a un arreglo*/ 
       
       int select=JOptionPane.showOptionDialog(btnEliminar,"DESEA ELIMINAR ELIMINAR AL USUARIO: "+txtUsuarioBuscar.getText()+" ?","Mensaje",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{"SI","NO","CANCELAR"},"CANCELAR");
        try {/*setencia que encapsula la respuesta del usuario , si la respuesta seleccionada es "yes" 
              *el sistema desplegara el evento , si es cualquiera de las otras dos opciones el programa no ejecutra nada*/
            if(select==0){boolean elim=false;
        try {
            //metodo eliminarDatosControl viene de la clase control , tomo como parametro el usuario y lo elimina
            elim=tControl.eliminarDatosControl(txtUsuarioBuscar.getText());
            if(elim)
            {JOptionPane.showMessageDialog(null,"USUARIO ELIMINADO",
                    "AVISO DE CONTROL" ,JOptionPane.PLAIN_MESSAGE); 
            limpiarDatos();}
             else
            {JOptionPane.showMessageDialog(null,"USUARIO NO ENCONTRADO",
                    "AVISO DE CONTROL" ,JOptionPane.PLAIN_MESSAGE); }             
        }catch (Exception ex) {
            Logger.getLogger(GUI_Control.class.getName()).log(Level.SEVERE, null, ex);
        }}}catch(Exception e){}
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerfilActionPerformed

    private void cmbPerfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPerfilesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPerfilesActionPerformed

    private void btnLimpiarEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarEdActionPerformed
    //limpia los campos
        limpiarDatos();
    }//GEN-LAST:event_btnLimpiarEdActionPerformed

    private void txtUsuarioBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioBuscarKeyReleased
    //metodo que sirve para iniciar una accion a traves de la tecla enter , para ello el cursor debe estar
    // en JtextField (txtUsuarioBuscar)     
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            {
      try { //metodo que llama los datos de control, para su uso dentro del programa
            String[] user=new String[3];
            user=tControl.buscarDatosUsuario(txtUsuarioBuscar.getText());
            txtUsuarioEd.setText(user[0]);
            txtClaveEd.setText(user[1]);
            txtPerfilEd.setText(user[2]);
            JOptionPane.showMessageDialog(null,"DATOS CARGADOS");
        } catch (Exception ex) {
            Logger.getLogger(GUI_Control.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
    }//GEN-LAST:event_txtUsuarioBuscarKeyReleased

    private void txtUsuarioBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    //funcion que comple con limpiar la tabla y luego agregar 5 filas 
        DefaultTableModel modeloTabla = (DefaultTableModel) tblUsuarios.getModel();
        modeloTabla.setRowCount(0);
        modeloTabla.setRowCount(5);
    }//GEN-LAST:event_btnLimpiarActionPerformed
//descripcion del metodo limpiarDatos
    public void limpiarDatos()
{
            txtUsuarioBuscar.setText("");
            txtUsuarioEd.setText("");
            txtClaveEd.setText("");
            txtPerfilEd.setText("");
}
    /**
     * metodo que permite visualizar la interfaz
     */
  
    public void GUI_Control() {        
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new GUI_Control().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoDeBotones;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiarEd;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRetornar;
    private javax.swing.JComboBox cmbPerfiles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rbtAdmin;
    private javax.swing.JRadioButton rbtSuper;
    private javax.swing.JRadioButton rbtUsuario;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtClaveEd;
    private javax.swing.JTextField txtPerfil;
    private javax.swing.JTextField txtPerfilEd;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtUsuarioBuscar;
    private javax.swing.JTextField txtUsuarioEd;
    // End of variables declaration//GEN-END:variables
}
