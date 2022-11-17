/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database4object.Controllers;

import database4object.Classes.Tematica;
import database4object.Recursos.Translations.Translations_ES;
import database4object.Services.LibroServices;
import database4object.Services.TematicaServices;
import java.util.ArrayList;

/**
 *
 * @author jairo
 */
public class NuevoLibroController extends javax.swing.JFrame {

    private static String nombre, autor, editorial, tematica;
    private static int yearPublicacion;
    private static LibroServices libroServices;

    /**
     * Creates new form NuevoLibroController
     */
    public NuevoLibroController() {
        this.libroServices = new LibroServices();
        initComponents();
        super.setResizable(false);
        jLabelErrorFecha.setVisible(false);
        llenarJcombox();
        jLabelErrorNombre.setVisible(false);
        jLabelErrorCamposVacios.setVisible(false);
        jTextAreaItems.setEditable(false);

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
        jLabelErrorNombre = new javax.swing.JLabel();
        jLabelErrorCamposVacios = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaItems = new javax.swing.JTextArea();

        jTextField2.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Biblioteca | Nuevo Libro");

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

        jTextFieldAñoPublicacion.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAñoPublicacion.setText("Año de publicacion");
        jTextFieldAñoPublicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldAñoPublicacionMouseClicked(evt);
            }
        });

        jComboBoxTematicas.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxTematicas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxTematicas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxTematicasMouseClicked(evt);
            }
        });
        jComboBoxTematicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTematicasActionPerformed(evt);
            }
        });

        jTextFieldEditorial.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEditorial.setText("Editorial");
        jTextFieldEditorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldEditorialMouseClicked(evt);
            }
        });

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

        jLabelErrorNombre.setForeground(new java.awt.Color(255, 0, 0));

        jLabelErrorCamposVacios.setBackground(new java.awt.Color(255, 255, 255));
        jLabelErrorCamposVacios.setForeground(new java.awt.Color(255, 0, 0));

        jTextAreaItems.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaItems.setColumns(20);
        jTextAreaItems.setRows(5);
        jScrollPane1.setViewportView(jTextAreaItems);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 369, Short.MAX_VALUE)
                        .addComponent(jButtonCrearLibro)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelErrorCamposVacios)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextFieldNombre)
                                    .addComponent(jTextFieldAutor)
                                    .addComponent(jTextFieldAñoPublicacion, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                    .addComponent(jComboBoxTematicas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldEditorial))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelErrorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelErrorNombre)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelErrorNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAñoPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelErrorFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBoxTematicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jTextFieldEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelErrorCamposVacios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
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
        crearLibro();

    }//GEN-LAST:event_jButtonCrearLibroActionPerformed

    private void jTextFieldNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNombreMouseClicked
        // TODO add your handling code here:
        jTextFieldNombre.setText("");
    }//GEN-LAST:event_jTextFieldNombreMouseClicked

    private void jTextFieldAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldAutorMouseClicked
        // TODO add your handling code here:
        jTextFieldAutor.setText("");
    }//GEN-LAST:event_jTextFieldAutorMouseClicked

    private void jTextFieldAñoPublicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldAñoPublicacionMouseClicked
        // TODO add your handling code here:
        jTextFieldAñoPublicacion.setText("");
        jLabelErrorFecha.setVisible(false);
    }//GEN-LAST:event_jTextFieldAñoPublicacionMouseClicked

    private void jTextFieldEditorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldEditorialMouseClicked
        // TODO add your handling code here:
        jTextFieldEditorial.setText("");
    }//GEN-LAST:event_jTextFieldEditorialMouseClicked

    /**
     * Con este metodo obteniendo los datos desde el Text area, compruebo si la
     * tematica que quiero añadir no existe en mi lista, asi como evito que se
     * creen libros con tematicas vacias, ya que no permite almacenar los
     * valores por defecto
     *
     * @return respuesta boolean
     */
    public boolean puedoAgregarrTematica() {
        boolean respuesta = true;

        if (jTextAreaItems.getText().contains(jComboBoxTematicas.getSelectedItem().toString()) || jComboBoxTematicas.getSelectedItem().toString().contains(Translations_ES.NO_EXISTEN_TEMATICAS_ENCONTRADAS)) {
            respuesta = false;
        }
        return respuesta;
    }

    /**
     * Metodo que inserta en el textArea las tematicas que voy clieckeando en el
     * combox y almacenando en un unico String para posteriormente usar ese
     * String como dato para crear libro introduciendo las tematicas.
     *
     * @param evt
     */
    private void jComboBoxTematicasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxTematicasMouseClicked
        // TODO add your handling code here:
        if (puedoAgregarrTematica() == true) {
            jTextAreaItems.setText(jTextAreaItems.getText() + jComboBoxTematicas.getSelectedItem().toString() + "-");
        }
    }//GEN-LAST:event_jComboBoxTematicasMouseClicked

    /**
     * Metodo para mostrar las tematicas existentes, y añadirlas a un combox
     */
    public void llenarJcombox() {

        jComboBoxTematicas.removeAllItems();
        TematicaServices tematicaServices = new TematicaServices();

        ArrayList<Tematica> tematicas = tematicaServices.almacenarTematicas();
        if (tematicas.isEmpty()) {
            jComboBoxTematicas.addItem(Translations_ES.NO_EXISTEN_TEMATICAS_ENCONTRADAS);
        } else {
            for (Tematica tematicaAlmacenada : tematicas) {
                jComboBoxTematicas.addItem(tematicaAlmacenada.getNombre());
            }
        }
    }

    /**
     * Metodo que comprueba los datos que quiero introducir para evitar que se
     * creen libros con datos vacios o datos con los textos por defecto que se
     * muestran
     *
     * @return
     */
    public boolean comprobarDatos() {
        boolean respuesta = true;
        if (nombre.length() < 1 || autor.length() < 1 || editorial.length() < 1 || tematica.length() < 1
                || nombre.equals(Translations_ES.NOMBRE) || autor.equals(Translations_ES.AUTOR) || editorial.equals(Translations_ES.EDITORIAL)) {

            respuesta = false;
        }
        return respuesta;

    }

    public void almacenarDatos() {
        nombre = almacenarNombre().toUpperCase();
        autor = almacenarAutor();
        yearPublicacion = almacenarFechaPublicacion();
        editorial = almacenarEditorial();
        tematica = almacenarTematica();
    }

    public void crearLibro() {
        almacenarDatos();
        if (comprobarDatos() == true) {
            if (libroServices.exixteLibro(nombre) == false) {
                libroServices.crearLibro(nombre, autor, String.valueOf(yearPublicacion), editorial, tematica);
                super.dispose();
                abrirMenu();

            } else {
                jLabelErrorNombre.setText(Translations_ES.LIBRO_YA_REGISTRADO);
                jLabelErrorNombre.setVisible(true);
            }
        } else {
            jLabelErrorCamposVacios.setText(Translations_ES.ES_NECESARIO_RELLENAR_TODOS_LOS_CAMPOS);
            jLabelErrorCamposVacios.setVisible(true);
        }

    }

    public void abrirMenu() {
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
    }

    /**
     *
     * @return String
     */
    public String almacenarTematica() {
        return (String) jTextAreaItems.getText();
    }

    /**
     *
     * @return String
     */
    public String almacenarEditorial() {
        return jTextFieldEditorial.getText();
    }

    /**
     *
     * @return String
     */
    public String almacenarNombre() {
        return jTextFieldNombre.getText();
    }

    /**
     *
     * @return String
     */
    public String almacenarAutor() {
        return jTextFieldAutor.getText();
    }

    /**
     * Controla que el formato de la fecha introducida unicamente sean numeros
     * enteros y con el formato yyyy ya que no admite letras ni numeros con una
     * longitud mayor o menor a 4 carcteres
     *
     * @return fecha int
     */
    public int almacenarFechaPublicacion() {
        int fecha = 0000;
        if (comprobarFecha() == true && isNumeric() == true) {
            fecha = Integer.valueOf(jTextFieldAñoPublicacion.getText());
        } else {
            jLabelErrorFecha.setText(Translations_ES.ERROR_EN_LA_FECHA);
            jLabelErrorFecha.setVisible(true);
        }
        return fecha;
    }

    /**
     *
     * @return respuesta boolean deuelve si cumple con la longitud establecida
     */
    public boolean comprobarFecha() {
        boolean respuesta = false;

        if ((jTextFieldAñoPublicacion.getText().length() == 4)) {
            respuesta = true;
        } else {
            jLabelErrorFecha.setText(Translations_ES.ERROR_EN_LA_FECHA);
            jLabelErrorFecha.setVisible(true);
            respuesta = false;
        }
        return true;
    }

    /**
     *
     * @return boolean devuelve la respuesta de si el dato introducido es
     * numerico
     */
    public boolean isNumeric() {
        try {
            Integer.parseInt(jTextFieldAñoPublicacion.getText());
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
    private javax.swing.JLabel jLabelErrorCamposVacios;
    private javax.swing.JLabel jLabelErrorFecha;
    private javax.swing.JLabel jLabelErrorNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaItems;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldAñoPublicacion;
    private javax.swing.JTextField jTextFieldEditorial;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables

}
