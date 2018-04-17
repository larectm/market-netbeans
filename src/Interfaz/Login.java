/**
 *Interfaz login que controla el ingreso mediante un usuario y una contraseña
 */

package Interfaz;
//importaciones
import Validaciones.*;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 * @author felipe
 * @version 1.0
 */
public class Login extends javax.swing.JFrame {

    /**
     * Declaracion de variables
     */
     static String usuario=null;
    static String clave=null;
    static String perfil=null;
    static int cont=0;
    //creacion de objetos de las distintas clases con el fin de llamar sus atributos para ser utilizados en la interfaz
    Control ctr = new Control ();
    TControl tControl;
   
    public Login() {
        //metodo que sirve para cargar todos los objetos que se hallan puesto en el JFrame
        initComponents();
        //valores de ingreso 
        usuario="usuario";
        clave="usuario";
        perfil="usuario";
        tControl=new TControl();
      
      //Codigo que impide que la aplicacion se expanda o se encoja , dejandola fija      
       setLocationRelativeTo(null);
       setResizable(false);
      //codigo para agregar una imagen de icono a la aplicacion para esta ventana 
        setIconImage(new ImageIcon(getClass().getResource("/imagen/ironman.jpg")).getImage());
        //cambia el tituto de la interfaz
        setTitle("Login");
  // codigo que permite agregar una imagen de fondo a la aplicacion a demas de determinar su tamaño
((JPanel)getContentPane()).setOpaque(false);
ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagen/aduana.jpg")); 
JLabel fondo= new JLabel(); fondo.setIcon(uno);
getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER); 
fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
setSize(635,355);  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtxtClaves = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel2.setText("CONTRASEÑA");

        jLabel1.setText("USUARIO");

        jtxtClaves.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtClavesKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtxtClaves))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtClaves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
      //cierra le sistema
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jtxtClavesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtClavesKeyReleased
         //metodo que sirve para iniciar una accion a traves de la tecla enter , para ello el cursor debe estar
        // en JtextField (jtxtClave)
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            /**
            * arreglo de tipo String que desde la base de datos llama los campos
            * Usuario
            * Clave
            * Perfil
            */
            String[] user=new String[3];
            try {
                user=tControl.buscarDatosUsuario(txtUsuario.getText());
                usuario=user[0];
                clave=user[1];
                perfil=user[2];

            } catch (Exception ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            //sentencia que indica que si uno de los 2 no coincide o no estan ingresados arrojara un error
            if (usuario.equals(txtUsuario.getText()) && clave.equals(jtxtClaves.getText()) )
            {
                //objeto creado de la clase administrador
                Venta vt=new Venta();
                /**
                * Segmentar aplicacion , la cual gestiona los perfiles
                */

                if (perfil.equals("usuario"))  vt.controlAdmin(1);
                if (perfil.equals("admin"))    vt.controlAdmin(2);
                if (perfil.equals("super"))    vt.controlAdmin(3);
                this.setVisible(false);
            }
            else
            {  //setencia que cuenta los errores al ingresar el usuario o la contraseña , si este supera los 3 intentos el programa se cierra
                cont++;
                if(cont==3)
                { JOptionPane.showMessageDialog(
                    null,"Demasiados intentos, Siga Participando", "AVISO DE ENLACE",
                    JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }
            else
            { JOptionPane.showMessageDialog(
                null,"Verifique credenciales :"+cont+" intentos", "AVISO DE ENLACE",
                JOptionPane.PLAIN_MESSAGE);
        }
        }
        }
    }//GEN-LAST:event_jtxtClavesKeyReleased
/**
 * 
 * @param args metodo que hace visible la aplicacion
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jtxtClaves;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
