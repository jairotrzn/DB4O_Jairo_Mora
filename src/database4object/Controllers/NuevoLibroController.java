/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database4object.Controllers;

import com.db4o.ObjectSet;
import database4object.Classes.Libro;
import database4object.Classes.Tematica;
import database4object.Services.TematicaServices;
import java.util.ArrayList;

/**
 *
 * @author jairo
 */
public class NuevoLibroController extends javax.swing.JFrame {
    private static String nombre,autor,editorial,tematica;
    private static int yearPublicacion;
    /**
     * Creates new form NuevoLibroController
     */
    public NuevoLibroController() {
       
        initComponents();
        super.setResizable(false);
        jLabelErrorFecha.setVisible(false);
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

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldAutor = new javax.swing.JTextField();
        jTextFieldAñoPublicacion = new javax.swing.JTextField();
        jComboBoxTematicas = new javax.swing.JComboBox<>();
        jTextFieldEditorial = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonCrearLibro = new javax.swing.JButton();
        jLabelErrorFecha = new javax.swing.JLabel();

        jTextField2.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Biblioteca | Nuevo Libro");

        jTextFieldNombre.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNombre.setText("Nombre");
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jTextFieldAutor.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAutor.setText("Autor");

        jTextFieldAñoPublicacion.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAñoPublicacion.setText("Año de publicacion");

        jComboBoxTematicas.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxTematicas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxTematicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTematicasActionPerformed(evt);
            }
        });

        jTextFieldEditorial.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEditorial.setText("Editorial");

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonCrearLibro.setText("Crear");
        jButtonCrearLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearLibroActionPerformed(evt);
            }
        });

        jLabelErrorFecha.setBackground(new java.awt.Color(255, 255, 255));
        jLabelErrorFecha.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorFecha.setText("Error en la fecha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNombre)
                    .addComponent(jTextFieldAutor)
                    .addComponent(jTextFieldAñoPublicacion, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(jComboBoxTematicas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldEditorial))
                .addGap(18, 18, 18)
                .addComponent(jLabelErrorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addComponent(jButtonCrearLibro)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAñoPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelErrorFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxTematicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButtonCrearLibro))
                .addContainerGap())
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

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jComboBoxTematicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTematicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTematicasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          super.dispose();
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonCrearLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearLibroActionPerformed
        // TODO add your handling code here:
        crearLirno();
       
    }//GEN-LAST:event_jButtonCrearLibroActionPerformed
    public void llenarJcombox(){
      
        jComboBoxTematicas.removeAllItems();
        TematicaServices tematicaServices = new TematicaServices();
      
        ArrayList<Tematica> tematicas = tematicaServices.almacenarTematicas();
         if (tematicas.isEmpty()) {
            jComboBoxTematicas.addItem("No existen tematicas encontradas"); 
        } else {
             for(Tematica tematicaAlmacenada : tematicas){
                   jComboBoxTematicas.addItem(tematicaAlmacenada.getNombre());
             }
        }
    }
    public void crearLirno(){
        nombre = almacenarNombre();
        autor = almacenarAutor();
        yearPublicacion = almacenarFechaPublicacion();
        editorial = almacenarEditorial();
        tematica = almacenarTematica();
        Libro libro = new Libro(nombre, autor, autor, editorial,tematica);
    }
    
    public String almacenarTematica(){
        return (String) jComboBoxTematicas.getSelectedItem();
    }
    public String almacenarEditorial(){
        return jTextFieldEditorial.getText();
    }
    public String almacenarNombre(){
        return jTextFieldNombre.getText();
    }
    
    public String almacenarAutor(){
        return jTextFieldAutor.getText();
    }
    
    public int almacenarFechaPublicacion(){
        int fecha = 0000;
        if(comprobarFecha() == true && isNumeric()== true){
            fecha = Integer.valueOf(jTextFieldAñoPublicacion.getText());
        }else{
            jLabelErrorFecha.setVisible(true);
        }
        return fecha;
    }
    
    public boolean comprobarFecha(){
        boolean respuesta = false;
        
        if((jTextFieldAñoPublicacion.getText().length() == 4)){
            respuesta= true;
        }
        return true;
    }
    
    public boolean isNumeric(){
	try {
		Integer.parseInt(jTextFieldAñoPublicacion.getText());
		return true;
	} catch (NumberFormatException nfe){
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
            java.util.logging.Logger.getLogger(NuevoLibroController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoLibroController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoLibroController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoLibroController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoLibroController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCrearLibro;
    private javax.swing.JComboBox<String> jComboBoxTematicas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelErrorFecha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldAñoPublicacion;
    private javax.swing.JTextField jTextFieldEditorial;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables


}
