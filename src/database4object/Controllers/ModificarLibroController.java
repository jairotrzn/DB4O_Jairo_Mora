/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database4object.Controllers;

import com.db4o.ObjectSet;
import database4object.Classes.Tematica;
import database4object.Services.LibroServices;
import database4object.Services.TematicaServices;
import java.util.ArrayList;

/**
 *
 * @author jairo
 */
public class ModificarLibroController extends javax.swing.JFrame {

    LibroServices libroServices;

    /**
     * Creates new form ModificarLibroController
     */
    public ModificarLibroController() {
        initComponents();
        libroServices = new LibroServices();
        jLabelErrorAño.setVisible(false);
        jLabelErrorLibro.setVisible(false);
        super.setResizable(false);
        llenarJcombox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldAutor = new javax.swing.JTextField();
        jTextFieldFechaPublicacion = new javax.swing.JTextField();
        jComboBoxListaTematicas = new javax.swing.JComboBox<>();
        jTextFieldEditorial = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jLabelErrorAño = new javax.swing.JLabel();
        jLabelErrorLibro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Biblioteca | Modificar Libro");

        jTextFieldNombre.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNombre.setText("Nombre");
        jTextFieldNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldNombreMouseClicked(evt);
            }
        });
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jTextFieldAutor.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAutor.setText("Autor");
        jTextFieldAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldAutorMouseClicked(evt);
            }
        });

        jTextFieldFechaPublicacion.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldFechaPublicacion.setText("Año de publicacion");
        jTextFieldFechaPublicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldFechaPublicacionMouseClicked(evt);
            }
        });

        jComboBoxListaTematicas.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxListaTematicas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxListaTematicas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxListaTematicasMouseClicked(evt);
            }
        });
        jComboBoxListaTematicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxListaTematicasActionPerformed(evt);
            }
        });

        jTextFieldEditorial.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEditorial.setText("Editorial");
        jTextFieldEditorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldEditorialMouseClicked(evt);
            }
        });

        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jLabelErrorAño.setBackground(new java.awt.Color(204, 204, 204));
        jLabelErrorAño.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorAño.setText("Error");

        jLabelErrorLibro.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorLibro.setText("Libro no encontrado");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jTextFieldAutor)
                            .addComponent(jTextFieldFechaPublicacion, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addComponent(jComboBoxListaTematicas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldEditorial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelErrorAño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelErrorLibro)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(74, 221, Short.MAX_VALUE)
                        .addComponent(jButtonModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelErrorLibro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFechaPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelErrorAño))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxListaTematicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButtonModificar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jComboBoxListaTematicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxListaTematicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxListaTematicasActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        super.dispose();
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton3ActionPerformed
    public void llenarJcombox() {
        jComboBoxListaTematicas.removeAllItems();
        TematicaServices tematicaServices = new TematicaServices();
        ArrayList<Tematica> tematicas = tematicaServices.almacenarTematicas();
        if (tematicas.isEmpty()) {
            jComboBoxListaTematicas.addItem("No existen tematicas encontradas");
        } else {
            for (Tematica tematicaAlmacenada : tematicas) {
                jComboBoxListaTematicas.addItem(tematicaAlmacenada.getNombre());
            }
        }
    }
    private void jTextFieldNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNombreMouseClicked
        // TODO add your handling code here:
        jTextFieldNombre.setText("");
    }//GEN-LAST:event_jTextFieldNombreMouseClicked

    private void jTextFieldAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldAutorMouseClicked
        // TODO add your handling code here:
        jTextFieldAutor.setText("");
    }//GEN-LAST:event_jTextFieldAutorMouseClicked

    private void jTextFieldFechaPublicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldFechaPublicacionMouseClicked
        // TODO add your handling code here:
        jTextFieldFechaPublicacion.setText("");
    }//GEN-LAST:event_jTextFieldFechaPublicacionMouseClicked

    private void jTextFieldEditorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldEditorialMouseClicked
        // TODO add your handling code here:
        jTextFieldEditorial.setText("");
    }//GEN-LAST:event_jTextFieldEditorialMouseClicked

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        // TODO add your handling code here:
        String nombre = almacenarNombre();
        String autor = almacenarAutor();
        String fechaPublicacion = String.valueOf(almacenarFechaPublicacion());
        String tematica = almacenarTematica();
        String editorial = almacnarEditorial();

        if (libroServices.exixteLibro(nombre)) {

        } else {
            jLabelErrorLibro.setVisible(true);
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jComboBoxListaTematicasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxListaTematicasMouseClicked
        // TODO add your handling code here:

        String lista = "";
        lista = lista + jComboBoxListaTematicas.getSelectedItem();
        System.out.println(lista);
    }//GEN-LAST:event_jComboBoxListaTematicasMouseClicked
    public String almacenarTematica() {
        return jComboBoxListaTematicas.getSelectedItem().toString();

    }

    public String almacnarEditorial() {
        return jTextFieldEditorial.getText();
    }

    public String almacenarNombre() {
        return jTextFieldNombre.getText();
    }

    public String almacenarAutor() {
        return jTextFieldAutor.getText();
    }

    public int almacenarFechaPublicacion() {
        int fecha = 0000;
        if (comprobarFecha() == true && isNumeric() == true) {
            fecha = Integer.valueOf(jTextFieldFechaPublicacion.getText());
        } else {
            jTextFieldFechaPublicacion.setVisible(true);
        }
        return fecha;
    }

    public boolean comprobarFecha() {
        boolean respuesta = false;

        if ((jTextFieldFechaPublicacion.getText().length() == 4)) {
            respuesta = true;
        }
        return true;
    }

    public boolean isNumeric() {
        try {
            Integer.parseInt(jTextFieldFechaPublicacion.getText());
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

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
            java.util.logging.Logger.getLogger(ModificarLibroController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarLibroController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarLibroController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarLibroController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarLibroController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JComboBox<String> jComboBoxListaTematicas;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelErrorAño;
    private javax.swing.JLabel jLabelErrorLibro;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldEditorial;
    private javax.swing.JTextField jTextFieldFechaPublicacion;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
