/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paquete;

import Conexion.ConexionDB;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ReservasAdmin extends javax.swing.JPanel {

    /**
     * Creates new form SalasAdmins
     */
    public ReservasAdmin() {
        DefaultTableModel model = new DefaultTableModel();
        initComponents();
        Consulta();
    }

    /** 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panelRound1 = new Clases.PanelRound();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        BCancelar = new javax.swing.JButton();
        BAceptar = new javax.swing.JButton();
        TexVal = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TexDes = new javax.swing.JTextArea();
        BotSan = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(450, 430));
        setPreferredSize(new java.awt.Dimension(490, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Fecha", "Hora", "Estado", "Ubicación"
            }
        ));
        jScrollPane2.setViewportView(Tabla);

        panelRound1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 350));

        jScrollPane1.setViewportView(panelRound1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 360));

        BCancelar.setText("Cancelar");
        BCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BCancelarMouseClicked(evt);
            }
        });
        BCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarActionPerformed(evt);
            }
        });
        add(BCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 50, -1, -1));

        BAceptar.setText(" Aceptar ");
        BAceptar.setMaximumSize(new java.awt.Dimension(76, 23));
        BAceptar.setMinimumSize(new java.awt.Dimension(76, 23));
        BAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BAceptarMouseClicked(evt);
            }
        });
        BAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAceptarActionPerformed(evt);
            }
        });
        add(BAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 10, -1, -1));

        TexVal.setForeground(new java.awt.Color(153, 153, 153));
        TexVal.setText("Valor");
        TexVal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TexValMouseClicked(evt);
            }
        });
        add(TexVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 254, 80, -1));

        TexDes.setColumns(6);
        TexDes.setForeground(new java.awt.Color(153, 153, 153));
        TexDes.setRows(5);
        TexDes.setText("Descripcion");
        TexDes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TexDesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TexDes);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 284, 80, -1));

        BotSan.setText("Aceptar");
        BotSan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotSanMouseClicked(evt);
            }
        });
        add(BotSan, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 224, 80, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BCancelarActionPerformed

    private void BAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BAceptarActionPerformed

    private void BAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BAceptarMouseClicked
        actualizarEstadoReserva("Aceptado");
    }//GEN-LAST:event_BAceptarMouseClicked

    private void BCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCancelarMouseClicked
        actualizarEstadoReserva("Cancelado");
    }//GEN-LAST:event_BCancelarMouseClicked

    private void BotSanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotSanMouseClicked
        int filaSeleccionada = Tabla.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar una reserva de la tabla.");
            return;
        }

        String valorTexto = TexVal.getText().trim();
        String descripcion = TexDes.getText().trim();

        if (valorTexto.isEmpty() || descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
            return;
        }

        double multa;
        try {
            multa = Double.parseDouble(valorTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El valor de la multa debe ser un número.");
            return;
        }

        try {
            // Suponiendo que:
            // columna 0: Ubi_sala
            // columna 1: Fecha_reserva
            // columna 4: Documento_usu (debes agregar esta columna a tu modelo si no está)
            String ubicacion = Tabla.getValueAt(filaSeleccionada, 4).toString();
            java.util.Date fecha = (java.util.Date) Tabla.getValueAt(filaSeleccionada, 1);
            java.sql.Date fechaSql = new java.sql.Date(fecha.getTime());
            int documento = Integer.parseInt(Tabla.getValueAt(filaSeleccionada, 0).toString());

            String sql = "INSERT INTO Sanciones (Fecha, Multa, Descripcion, ID_documento, Ubi_sala) VALUES (?, ?, ?, ?, ?)";

            try (Connection conn = ConexionDB.obtenerConexion();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {

                pstmt.setDate(1, fechaSql);
                pstmt.setDouble(2, multa);
                pstmt.setString(3, descripcion);
                pstmt.setInt(4, documento);
                pstmt.setString(5, ubicacion);

                int filas = pstmt.executeUpdate();

                if (filas > 0) {
                    JOptionPane.showMessageDialog(null, "Sanción registrada correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo registrar la sanción.");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al insertar sanción: " + e.getMessage());
                e.printStackTrace();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos de la tabla: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_BotSanMouseClicked

    private void TexValMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TexValMouseClicked
        if(TexDes.getText().isEmpty()){
            TexDes.setText("Descripcion");
            TexDes.setForeground(Color.gray);
        }
        if(TexVal.getText().equals("Valor")){
            TexVal.setText("");
            TexVal.setForeground(Color.black);
        }
    }//GEN-LAST:event_TexValMouseClicked

    private void TexDesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TexDesMouseClicked
        if(TexVal.getText().isEmpty()){
            TexVal.setText("Valor");
            TexVal.setForeground(Color.gray);
        }
        if(TexDes.getText().equals("Descripcion")){
            TexDes.setText("");
            TexDes.setForeground(Color.black);
        }
    }//GEN-LAST:event_TexDesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAceptar;
    private javax.swing.JButton BCancelar;
    private javax.swing.JButton BotSan;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextArea TexDes;
    private javax.swing.JTextField TexVal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private Clases.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables

    private void Consulta() {
        String sql = "SELECT Documento_usu, Fecha_reserva, Hora_reserva, Estado, Ubi_sala FROM Reservas";

        try {
            Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Documento");
            modelo.addColumn("Fecha");
            modelo.addColumn("Hora");
            modelo.addColumn("Estado");
            modelo.addColumn("Ubicación");

            while (rs.next()) {
                Object[] fila = new Object[5];
                fila[0] = rs.getString("Documento_usu");
                fila[1] = rs.getDate("Fecha_reserva");      // Solo si es tipo DATE en BD
                fila[2] = rs.getString("Hora_reserva");     // Porque es VARCHAR en BD
                fila[3] = rs.getString("Estado");
                fila[4] = rs.getString("Ubi_sala");
                modelo.addRow(fila);
            }

            Tabla.setModel(modelo);

            rs.close();
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }
    
    private void actualizarEstadoReserva(String nuevoEstado) {
    int filaSeleccionada = Tabla.getSelectedRow();
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(null, "Seleccione una reserva de la tabla.");
        return;
    }

    
    Object documento = Tabla.getValueAt(filaSeleccionada, 0); // Columna 0: Documento
    java.sql.Date fecha = (java.sql.Date) Tabla.getValueAt(filaSeleccionada, 1); // Fecha_reserva
    String hora = Tabla.getValueAt(filaSeleccionada, 2).toString(); // Hora_reserva

    String sql = "UPDATE Reservas SET Estado = ? WHERE Documento_usu = ? AND Fecha_reserva = ? AND Hora_reserva = ?";

    try {
        Connection conn = ConexionDB.obtenerConexion();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, nuevoEstado);
        pstmt.setObject(2, documento);
        pstmt.setDate(3, fecha);
        pstmt.setString(4, hora);

        int actualizado = pstmt.executeUpdate();
        if (actualizado > 0) {
            JOptionPane.showMessageDialog(null, "Estado actualizado a: " + nuevoEstado);
            Consulta(); // Vuelve a cargar los datos en la tabla
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el estado.");
        }

        pstmt.close();
        conn.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al actualizar: " + e.getMessage());
    }
}

}
