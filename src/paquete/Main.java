/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paquete;

import Conexion.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import static Conexion.ConexionDB.obtenerConexion;
import java.awt.Color;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import rsscalelabel.RSScaleLabel;


/**
 *
 * @author Usuario
 */
public class Main extends javax.swing.JFrame {

    //variables para almacenar la direccion del mouse
    int Xmouse, Ymouse;
    public Main() {
        initComponents();
        
        ImageIcon iconFondo = new ImageIcon(getClass().getResource("/Img/Fondo.jpg"));
        Image imgFondo = iconFondo.getImage().getScaledInstance(FondoImg.getWidth(), FondoImg.getHeight(), Image.SCALE_SMOOTH);
        // Escala
        FondoImg.setIcon(new ImageIcon(imgFondo)); // Asigna la imagen escalada al JLabel

        ImageIcon iconPerfil = new ImageIcon(getClass().getResource("/Img/Perfil.png"));
        Image imgPerfil = iconPerfil.getImage().getScaledInstance(Perfil.getWidth(), Perfil.getHeight(), Image.SCALE_SMOOTH);
        // Escala
        Perfil.setIcon(new ImageIcon(imgPerfil)); // Asigna la imagen escalada al JLabel


        //El jframe aparece en el centro
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        panelRound1 = new Clases.PanelRound();
        Perfil = new javax.swing.JLabel();
        NickUsuario = new javax.swing.JLabel();
        NickContraseña = new javax.swing.JLabel();
        CampoUsuario = new javax.swing.JTextField();
        CampoContraseña = new javax.swing.JPasswordField();
        BotonFon = new Clases.PanelRound();
        BotonEntrarTexto = new javax.swing.JLabel();
        NickContraseña2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        NickContraseña1 = new javax.swing.JLabel();
        FondoImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(6);
        setResizable(false);
        setState(6);

        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setVerifyInputWhenFocusTarget(false);

        Perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Perfil.png"))); // NOI18N

        NickUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NickUsuario.setText("DOCUMENTO");

        NickContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NickContraseña.setText("CONTRASEÑA");

        CampoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CampoUsuario.setForeground(new java.awt.Color(204, 204, 204));
        CampoUsuario.setText("Ingrese su usuario");
        CampoUsuario.setBorder(null);
        CampoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoUsuarioMousePressed(evt);
            }
        });
        CampoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoUsuarioActionPerformed(evt);
            }
        });

        CampoContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CampoContraseña.setForeground(new java.awt.Color(204, 204, 204));
        CampoContraseña.setText("**********");
        CampoContraseña.setBorder(null);
        CampoContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoContraseñaMousePressed(evt);
            }
        });

        BotonFon.setBackground(new java.awt.Color(102, 204, 255));
        BotonFon.setRoundBottomLeft(30);
        BotonFon.setRoundBottomRight(30);
        BotonFon.setRoundTopLeft(30);
        BotonFon.setRoundTopRight(30);
        BotonFon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonFonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonFonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonFonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonFonMousePressed(evt);
            }
        });

        BotonEntrarTexto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonEntrarTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonEntrarTexto.setText("Entrar");
        BotonEntrarTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BotonFonLayout = new javax.swing.GroupLayout(BotonFon);
        BotonFon.setLayout(BotonFonLayout);
        BotonFonLayout.setHorizontalGroup(
            BotonFonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonEntrarTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
        );
        BotonFonLayout.setVerticalGroup(
            BotonFonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonFonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonEntrarTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        NickContraseña2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NickContraseña2.setText("No tienes usuario? ");

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        NickContraseña1.setForeground(new java.awt.Color(51, 51, 255));
        NickContraseña1.setText("Click Aqui");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NickContraseña1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NickContraseña1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(NickUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(214, 214, 214))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(NickContraseña2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CampoContraseña, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NickContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(182, 182, 182))))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(BotonFon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NickUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NickContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CampoContraseña)
                .addGap(31, 31, 31)
                .addComponent(BotonFon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(NickContraseña2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        Fondo.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 260, 330));

        FondoImg.setBackground(new java.awt.Color(153, 204, 255));
        FondoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo.jpg"))); // NOI18N
        Fondo.add(FondoImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoUsuarioActionPerformed

    private void BotonFonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonFonMousePressed
        //Se almacena el valor del mouse en X y Y
        Xmouse = evt.getX();
        Ymouse = evt.getY();
    }//GEN-LAST:event_BotonFonMousePressed

    private void BotonFonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonFonMouseEntered
        //Cuando el mouse esta sobre el boton cambia el color a azul
        BotonFon.setBackground(Color.blue);
    }//GEN-LAST:event_BotonFonMouseEntered

    private void BotonFonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonFonMouseExited
        //Cuando el mouse deja de estar sobre el boton cambia el color al inicial
        BotonFon.setBackground(new Color(102,204,255));
    }//GEN-LAST:event_BotonFonMouseExited

    private void CampoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoUsuarioMousePressed
        //Cuando se presione el campo se vuelve vacio y cambia su color a negro
        //A su vez si el campo esta vacio se devuelve el campo con 
        if(CampoUsuario.getText().equals("Ingrese su usuario")){
            CampoUsuario.setText("");
            CampoUsuario.setForeground(Color.black);
        }
        if(String.valueOf(CampoContraseña.getPassword()).isEmpty()){
            CampoContraseña.setText("**********");
            CampoContraseña.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_CampoUsuarioMousePressed

    private void CampoContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoContraseñaMousePressed
        if(CampoUsuario.getText().isEmpty()){
            CampoUsuario.setText("Ingrese su usuario");
            CampoUsuario.setForeground(Color.gray);
        }
        if(String.valueOf(CampoContraseña.getPassword()).equals("**********")){
           CampoContraseña.setText("");
           CampoContraseña.setForeground(Color.black); 
        }
    }//GEN-LAST:event_CampoContraseñaMousePressed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        NuevoUsu newframe = new NuevoUsu();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void BotonFonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonFonMouseClicked
    //Guarda lo que escribe el usuario
    String documentoStr = CampoUsuario.getText();
    String contraseña = String.valueOf(CampoContraseña.getPassword());
    int documento;
    
    try {
        documento = Integer.parseInt(documentoStr);
        //hace la consulta a la base de datos
        String sql = "SELECT rol FROM usuarios WHERE documento = ? AND contrasena = ?";
    try (Connection conn = ConexionDB.obtenerConexion(); //si se genera un 1 se comprueba que el usuario existe
        PreparedStatement pstmt = conn.prepareStatement(sql)) {
    
        pstmt.setInt(1, documento);
        pstmt.setString(2, contraseña);
    
    try (ResultSet rs = pstmt.executeQuery()) {
        //comprueba el rol del usuario
        if (rs.next()) {
            String rol = rs.getString("rol"); 
            
            if ("admin".equalsIgnoreCase(rol)) {
                new SesionAdmins().setVisible(true);
            } else {
                new Sesion(documento).setVisible(true);
            }
            this.dispose();
        } else {
            //si no existe coincidencia se eniva una alerta
            JOptionPane.showMessageDialog(this, "Usuario/contraseña incorrectos");
        }
        }
    }
    } catch (NumberFormatException e) {
        //si tiene algo diferente a un numero se eniva una alerta
        JOptionPane.showMessageDialog(this, "Documento debe ser solo números");
    } catch (SQLException ex) {
        //si no se conecta a la base de datos se eniva una alerta
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Error de conexión a la base de datos");
    }
    }//GEN-LAST:event_BotonFonMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonEntrarTexto;
    private Clases.PanelRound BotonFon;
    private javax.swing.JPasswordField CampoContraseña;
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel FondoImg;
    private javax.swing.JLabel NickContraseña;
    private javax.swing.JLabel NickContraseña1;
    private javax.swing.JLabel NickContraseña2;
    private javax.swing.JLabel NickUsuario;
    private javax.swing.JLabel Perfil;
    private javax.swing.JPanel jPanel1;
    private Clases.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
