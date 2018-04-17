/**
 * Intefaz que permite la gestion del personal de aduana
 * gestiona, el ingreso , la modificacion, la eliminacion y el listado del personal
 */
package Interfaz;
//importaciones
import Clases.*;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.HeadlessException;
import java.awt.event.*;
import java.io.File;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
/**
  * @author felipe
  * @version 1.0
 */
public class GUI_Vendedor extends javax.swing.JFrame {
    Vendedor vdr = new Vendedor();
    DefaultTableModel modelo;
    public static int nPerfil = 0 ;
    public GUI_Vendedor() {
    initComponents();
    /*
    *sentencia que toma el perfil enviado desde el login, en este caso 2 seria Admin, y esto permite
    *restringir ciertos privilegios.
    */ 
        if(nPerfil==2)
        {
            btnEliminarPerso.setVisible(false);
        }
        this.modelo = (DefaultTableModel) tblListar.getModel();
       
      //Codigo que impide que la aplicacion se expanda o se encoja , dejandola fija      
       setLocationRelativeTo(null);
       setResizable(false);
       //codigo para agregar una imagen de icono a la aplicacion para esta ventana
         setIconImage(new ImageIcon(getClass().getResource("/imagen/usuario.png")).getImage());
         //CAMPOS QUE ESTARAN INVISIBLES DENTRO DEL POGRAMA
      
         /**
          *Metodo sacado de internet que permite la funcionalidad de crear un auto completador ,basandose en los elementos registrado en la base de datos
          *para este metodo se utilizo la tabla PERSONA que se implento en la pestaña LISTAR de esta forma 
          *cargara cada dato que se encuentre ,al momento de incresar una variable
          * toma los paramentros mediante un sql
          *nombre
          * apellido_paterno
          * Apellido_materno
     */
       TextAutoCompleter textAutoCompleter = new TextAutoCompleter (txtlistarNombre);
        this.txtlistarNombre.removeAll();
         try{
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bdinventario", "root", "");
             Statement sent=con.createStatement();
             ResultSet resul= sent.executeQuery("SELECT concat (nombre,' ',apellido_paterno,' ',apellido_materno)as nombre_completo FROM persona ");
             while(resul.next())
             textAutoCompleter.addItem((resul.getString("nombre_completo")));
             textAutoCompleter.setMode(0);
   }
catch(SQLException e){JOptionPane.showMessageDialog(null, e);} 
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        jtxtDv = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtFono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnRegisVen = new javax.swing.JButton();
        txtSueldo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbPorce = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtBuscarRut = new javax.swing.JTextField();
        txtNombreEdit = new javax.swing.JTextField();
        txtApellidoEdit = new javax.swing.JTextField();
        txtDireccionEdit = new javax.swing.JTextField();
        txtFonoEdit = new javax.swing.JTextField();
        dvBuscarRut = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnEditarPerso = new javax.swing.JButton();
        btnEliminarPerso = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtSueldoEdit = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbPorceEdit = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListar = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtlistarNombre = new javax.swing.JTextField();
        lblRut = new javax.swing.JLabel();
        btnGuardarTablaPersona = new javax.swing.JButton();
        Retornar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gestion Persona");

        jLabel2.setText("Rut:");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apeliidos:");

        jLabel5.setText("Fono:");

        jLabel6.setText("Direccion:");

        txtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutActionPerformed(evt);
            }
        });

        jtxtDv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDvActionPerformed(evt);
            }
        });
        jtxtDv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtDvKeyReleased(evt);
            }
        });

        btnRegisVen.setText("Registrar");
        btnRegisVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisVenActionPerformed(evt);
            }
        });
        btnRegisVen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnRegisVenKeyReleased(evt);
            }
        });

        txtSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoActionPerformed(evt);
            }
        });

        jLabel1.setText("-");

        jLabel9.setText("Porcentaje:");

        cmbPorce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPorceActionPerformed(evt);
            }
        });

        jLabel7.setText("Sueldo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(btnRegisVen))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtRut, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jtxtNombre)
                            .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtDv, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbPorce, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtDv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbPorce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(btnRegisVen)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("INGRESAR", jPanel1);

        txtNombreEdit.setEnabled(false);

        txtApellidoEdit.setEnabled(false);
        txtApellidoEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoEditActionPerformed(evt);
            }
        });

        txtDireccionEdit.setEnabled(false);

        txtFonoEdit.setEnabled(false);
        txtFonoEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFonoEditActionPerformed(evt);
            }
        });

        dvBuscarRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dvBuscarRutActionPerformed(evt);
            }
        });
        dvBuscarRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dvBuscarRutKeyReleased(evt);
            }
        });

        jLabel14.setText("Rut:");

        jLabel15.setText("Nombre:");

        jLabel16.setText("Apellidos:");

        jLabel17.setText("Direccion:");

        jLabel18.setText("Fono");

        jLabel19.setText("-");

        btnEditarPerso.setText("Editar");
        btnEditarPerso.setEnabled(false);
        btnEditarPerso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPersoActionPerformed(evt);
            }
        });

        btnEliminarPerso.setText("Eliminar");
        btnEliminarPerso.setEnabled(false);
        btnEliminarPerso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPersoActionPerformed(evt);
            }
        });

        jLabel11.setText("Porcentaje");

        txtSueldoEdit.setEnabled(false);

        jLabel8.setText("Sueldo");

        cmbPorceEdit.setEnabled(false);
        cmbPorceEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPorceEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscarRut, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDireccionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFonoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPorceEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSueldoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnEditarPerso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarPerso)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dvBuscarRut, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dvBuscarRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtNombreEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtApellidoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtFonoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cmbPorceEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSueldoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarPerso)
                    .addComponent(btnEliminarPerso))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("EDITAR", jPanel2);

        jScrollPane1.setViewportView(tblListar);

        jLabel10.setBackground(new java.awt.Color(0, 153, 153));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("Búsqueda");

        txtlistarNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtlistarNombreKeyReleased(evt);
            }
        });

        lblRut.setText("Rut:");

        btnGuardarTablaPersona.setText("Guardar Plantilla");
        btnGuardarTablaPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTablaPersonaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(lblRut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtlistarNombre)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(btnGuardarTablaPersona)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRut)
                    .addComponent(txtlistarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarTablaPersona)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LISTAR", jPanel4);

        Retornar.setText("Volver");
        Retornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetornarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Retornar)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Retornar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutActionPerformed

    private void txtApellidoEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoEditActionPerformed

    private void txtFonoEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFonoEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFonoEditActionPerformed

    private void RetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetornarActionPerformed
        //metodo que AL accionar el boton redirige todo a la pestaña administrador la cual contiene el menu
        new Venta().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RetornarActionPerformed

    private void btnRegisVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisVenActionPerformed
 int select=JOptionPane.showOptionDialog(btnRegisVen,"DESEA REGISTAR EL USUARIO?","MENSAJE",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{"SI","NO","CANCELAR"},"CANCELAR");
 try {if(select==0){ 
     try{/**
            pr.insertrPersona(txtRut.getText()+jtxtDv.getText(),jtxtNombre.getText(),jtxtPaterno.getText(),jtxtMaterno.getText(),jtxtCargo.getText(),txtCodigo.getText(),Integer.parseInt(txtIdAduana.getText()));
        /**
         * Limpia los campos
         */
       limpiarCampos();
       VerificarRut();
    }
     catch (NumberFormatException e) {
       
   }
     }
 }catch (Exception e){}       
             
    }//GEN-LAST:event_btnRegisVenActionPerformed

    private void jtxtDvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDvActionPerformed
    }//GEN-LAST:event_jtxtDvActionPerformed

    private void jtxtDvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDvKeyReleased
    
       
    }//GEN-LAST:event_jtxtDvKeyReleased

    private void btnEditarPersoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPersoActionPerformed
  /*linea de codigo, le asigna una interfaz al boton btnEditarAsig
        *con un panel de seleccion YES,NO,CANCEL
        *esta es eviada a un arreglo*/
   int select=JOptionPane.showOptionDialog(btnEliminarPerso,"DESEA EDITAR EL USUARIO?","MENSAJE",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{"SI","NO","CANCELAR"},"CANCELAR");
 try {/*setencia que encapsula la respuesta del usuario , si la respuesta seleccionada es "yes" 
       *el sistema desplegara el evento , si es cualquiera de las otras dos opciones el programa no ejecutra nada*/
     if(select==0){
   try {    /**
             *Encapsula los campos 
            
            pr.nombre = txtNombreEdit.getText();
            pr.apellido_paterno= txtApellidoPaterEdit.getText();
            pr.apellido_materno= txtApellidoMaterEdit.getText();
            pr.cargo= txtCargo.getText();
            pr.codigo= txtCodigoEdit.getText();
            pr.fk_aduana=Integer.parseInt(jIdAduanaEdit.getText());
          
            pr.actualizarPersona(txtBuscarRut.getText()+dvBuscarRut.getText());     
            //limpiar campos
            limpiarCampos2();
            //inhabilitarCampos
            inHabilitarCampos ();
            //inhabilita los botones eliminar e editar
            btnEditarPerso.setEnabled(false);
            btnEliminarPerso.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Se Editó el usuario!!");
             */
       } catch (HeadlessException | NumberFormatException e){System.out.println(e);}
  }
 }catch (Exception e){System.out.println(e);}
    }//GEN-LAST:event_btnEditarPersoActionPerformed

    private void btnEliminarPersoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPersoActionPerformed
  /*linea de codigo, le asigna una interfaz al boton btnEditarAsig
        *con un panel de seleccion YES,NO,CANCEL
        *esta es eviada a un arreglo*/
      int select=JOptionPane.showOptionDialog(btnEliminarPerso,"DESEA ELIMAR EL USUARIO?","MENSAJE",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{"SI","NO","CANCELAR"},"CANCELAR");
 try {/*setencia que encapsula la respuesta del usuario , si la respuesta seleccionada es "yes" 
       *el sistema desplegara el evento , si es cualquiera de las otras dos opciones el programa no ejecutra nada*/
     if(select==0){
     try {
         //metodo eliminarPersona que viene de la clase persona y resive como parametro el rut
       //     pr.eliminarPersona(txtBuscarRut.getText()+dvBuscarRut.getText());
            //limpia los campos
            limpiarCampos2();
            //inhabilita los campos
            inHabilitarCampos();
            //inhabilita los botones eliminar y editar
            btnEliminarPerso.setEnabled(false);
            btnEditarPerso.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Se ha eliminado de la tabla |!!");
    
  } catch (HeadlessException e) {JOptionPane.showMessageDialog(null, "No se puede eliminar el usuario!!");}
 }
}catch (HeadlessException e) {}
    }//GEN-LAST:event_btnEliminarPersoActionPerformed

    private void dvBuscarRutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dvBuscarRutKeyReleased
        /**
        * validador de rut que viene de la clase rut, toma los campos
        * rut
        * dv (utilizado como parametro local, que se une al rut
        */
        Rut rt=new Rut();
        int vale=rt.verifRUT(txtBuscarRut.getText(), dvBuscarRut.getText());
        if(vale==1)
        {    if(evt.getKeyCode()==KeyEvent.VK_ENTER)
             {
             //   buscarDatos();
             }
        }
        else
        { JOptionPane.showMessageDialog(null,"RUT NO CORRECTO, VERIFIQUE DATOS","AVISO DE SISTEMA", JOptionPane.PLAIN_MESSAGE);
        }
          
      
    }//GEN-LAST:event_dvBuscarRutKeyReleased

    private void txtlistarNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlistarNombreKeyReleased
     //metodo que sirve para iniciar una accion a traves de la tecla enter , para ello el cursor debe estar
    // en JtextField (txtnumInventarioM)
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            /**
             * metodo que carga los datos de las personas registradas en un jtable
             */
              // cargarDatosPersona();
             }
      else
      {
          //metodo que limpia los datos de el jtable cuando no encuentra un dato
          actualizarTabla();
      }
    }//GEN-LAST:event_txtlistarNombreKeyReleased

    private void cmbPorceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPorceActionPerformed
               
    }//GEN-LAST:event_cmbPorceActionPerformed

    private void cmbPorceEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPorceEditActionPerformed
      
       
    }//GEN-LAST:event_cmbPorceEditActionPerformed

    private void btnRegisVenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRegisVenKeyReleased
 
    }//GEN-LAST:event_btnRegisVenKeyReleased

    private void txtSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoActionPerformed

    private void btnGuardarTablaPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTablaPersonaActionPerformed
     // metodo que sirve para guardar los datos registrados en un jtable , a un archivo excel
      /* if(this.tblListar.getRowCount()==0)
       { JOptionPane.showMessageDialog(null,"no hay dtos en la tabla para exportar", "Persona",JOptionPane.INFORMATION_MESSAGE);
          this.txtlistarNombre.grabFocus();
          return;       
       }
        JFileChooser chooser =new JFileChooser();
        FileNameExtensionFilter Filter= new FileNameExtensionFilter("Archivos Excel","xls");
        chooser.setFileFilter(Filter);
        chooser.setDialogTitle("Guardar Archivo");
        chooser.setMultiSelectionEnabled(false);
        chooser.setAcceptAllFileFilterUsed(false);
        if(chooser.showSaveDialog(null)==JFileChooser.APPROVE_OPTION)
        {
            List<JTable> tb= new ArrayList<>();
            List<String>nom=new ArrayList<>();
            tb.add(tblListar);
            nom.add("Activo");
            String file=chooser.getSelectedFile().toString().concat(".xls");
            try{
                clases.Exporter e =new Exporter (new File(file),tb,nom);
                if(e.exportar())
                {
                   JOptionPane.showMessageDialog(null,"Los datos fueron exportados a excel.", "Persona",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"hubo un error"+e.getMessage(),"error",JOptionPane.ERROR_MESSAGE);
            }
        }
        */
    }//GEN-LAST:event_btnGuardarTablaPersonaActionPerformed

    private void dvBuscarRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dvBuscarRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dvBuscarRutActionPerformed
/********************************METODOS*********************************************/
   //metodo que busca los datos en la base de datos y los carga mediante el parametro rut
 /* public void buscarDatos()
  { try{try {String[] use = new String[7];
     use=pr.cargarPersona(txtBuscarRut.getText()+dvBuscarRut.getText());
     txtNombreEdit.setText(use[1]);
     txtApellidoPaterEdit.setText(use[2]);
     txtApellidoMaterEdit.setText(use[3]);
     txtCargo.setText (use[4]);
     txtCodigoEdit.setText(use[5]);
     jcmbAduanaEdit.setSelectedItem(use[6]);
     //habilita los campos
     habilitarCampos();
     //habilita los botones editar y eliminar
     btnEditarPerso.setEnabled(true);
     btnEliminarPerso.setEnabled(true); 
    
  }
catch(Exception ex) {}

}catch(Exception ex){}
  }
  //metodo que limpia la tabla
 */
 public void actualizarTabla ()
   {
      
        modelo.setRowCount(0);
        modelo.setRowCount(1);
   }
 //metodo que carga los datos en el jtable ´
 /*public void cargarDatosPersona()
{                 int cont = 0 ;
            try {
                for (persona Persona:pr.desplegarDatosPersona(txtlistarNombre.getText()))
                {   tblListar.setValueAt(String.valueOf(Persona.getRut()), cont, 0);
                    tblListar.setValueAt(String.valueOf(Persona.getNombre()), cont, 1);
                    tblListar.setValueAt(String.valueOf(Persona.getApellido_paterno()), cont,2);
                    tblListar.setValueAt(String.valueOf(Persona.getApellido_materno()), cont, 3);
                    tblListar.setValueAt(String.valueOf(Persona.getCargo()), cont, 4);
                    tblListar.setValueAt(String.valueOf(Persona.getCodigo()), cont, 5);
                    tblListar.setValueAt(String.valueOf(Persona.getAduana()), cont, 6);
                  
                    cont++;
                    Object [] fila;
                    fila = new Object[cont];
                    for(int i = 0;i<cont;i++)
                    {
                        modelo.addRow( (Object[]) fila[i]);
                    }

                }
            } catch (Exception e){
                System.out.println(e);
            }
        
}
 */
   //Descripcion de las lineas de codigo que limpiar campos los campos para la pestaña ingresar
public void limpiarCampos()
{
        txtRut.setText("");
        jtxtNombre.setText("");
        txtApellido.setText("");
        txtFono.setText("");
        txtDireccion.setText("");
        jtxtDv.setText("");
        txtSueldo.setText("");
}
   //Descripcion de las lineas de codigo que limpiar campos  los campos para la pestaña editar
public void limpiarCampos2()
{      
        txtBuscarRut.setText("");
        txtNombreEdit.setText("");
        txtApellidoEdit.setText("");
        txtDireccionEdit.setText("");
        txtFonoEdit.setText("");
        dvBuscarRut.setText("");
        txtSueldoEdit.setText("");
        cmbPorceEdit.setSelectedItem("Seleccione");
        
}
 //Descripcion de las lineas de codigo que habilitarCampos  los campos para la pestaña editar
public void habilitarCampos()
{
    txtNombreEdit.setEnabled(true);
    txtApellidoEdit.setEnabled(true);
    txtDireccionEdit.setEnabled(true);
    txtFonoEdit.setEnabled(true);
    txtSueldoEdit.setEnabled(true);
cmbPorceEdit.setEnabled(true);}
 //Descripcion de las lineas de codigo que inhabilitarCampos  los campos para la pestaña editar
public void inHabilitarCampos ()
{   txtNombreEdit.setEnabled(false);
    txtApellidoEdit.setEnabled(false);
    txtDireccionEdit.setEnabled(false);
    txtFonoEdit.setEnabled(false);
    txtSueldoEdit.setEnabled(false);
    cmbPorceEdit.setEnabled(false);}
public void VerificarRut ()
{
     Rut rt=new Rut();
        int vale=rt.verifRUT(txtRut.getText(), jtxtDv.getText());
        if(vale==1)
        { }
        else
        { JOptionPane.showMessageDialog(null,"RUT NO CORRECTO, VERIFIQUE DATOS","AVISO DE SISTEMA", JOptionPane.PLAIN_MESSAGE);
        }
}

    public void guipersona(int nPerfil) {   
        GUI_Vendedor.nPerfil=nPerfil;//Viene desde el Login
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
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new GUI_Vendedor().setVisible(true);
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Retornar;
    private javax.swing.JButton btnEditarPerso;
    private javax.swing.JButton btnEliminarPerso;
    private javax.swing.JButton btnGuardarTablaPersona;
    private javax.swing.JButton btnRegisVen;
    private javax.swing.JComboBox cmbPorce;
    private javax.swing.JComboBox cmbPorceEdit;
    private javax.swing.JTextField dvBuscarRut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jtxtDv;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JLabel lblRut;
    private javax.swing.JTable tblListar;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellidoEdit;
    private javax.swing.JTextField txtBuscarRut;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccionEdit;
    private javax.swing.JTextField txtFono;
    private javax.swing.JTextField txtFonoEdit;
    private javax.swing.JTextField txtNombreEdit;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtSueldoEdit;
    private javax.swing.JTextField txtlistarNombre;
    // End of variables declaration//GEN-END:variables

 
}
