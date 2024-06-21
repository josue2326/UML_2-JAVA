/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package yFrame;

import Class.Curso;
import Class.Estudiantes;
import Class.Profesor;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class CURSO extends javax.swing.JFrame {
    private static ArrayList<Curso> cursos = new ArrayList<>();
    private static ArrayList<String> estudiantes = new ArrayList<>();
    

    /**
     * Creates new form Curso
     */
    public CURSO() {
        initComponents();
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

        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jApellido = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jApellido1 = new javax.swing.JLabel();
        jTextFieldNombre1 = new javax.swing.JTextField();
        jButtonRegistrarse = new javax.swing.JButton();
        jButtonRegistrarse1 = new javax.swing.JButton();
        jButtonRegistrarse2 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Multiply_32px.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 50, 50));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_backOFF_64px.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_BACK_on_64px_1.png"))); // NOI18N
        jButton3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_BACK_on_64px_1.png"))); // NOI18N
        jButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_BACK_on_64px_1.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 60));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 10, 480));

        jApellido.setBackground(new java.awt.Color(255, 255, 255));
        jApellido.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jApellido.setForeground(new java.awt.Color(102, 102, 102));
        jApellido.setText("Nombre");
        jPanel1.add(jApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jTextFieldNombre.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldNombre.setFont(new java.awt.Font("Yu Gothic Medium", 0, 15)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(252, 98, 70));
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 98, 70)));
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 210, 40));

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(252, 98, 70));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 230, 60));

        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(252, 98, 70));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 420, 320));

        jApellido1.setBackground(new java.awt.Color(255, 255, 255));
        jApellido1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jApellido1.setForeground(new java.awt.Color(102, 102, 102));
        jApellido1.setText("Profesor");
        jPanel1.add(jApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        jTextFieldNombre1.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldNombre1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 15)); // NOI18N
        jTextFieldNombre1.setForeground(new java.awt.Color(252, 98, 70));
        jTextFieldNombre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 98, 70)));
        jPanel1.add(jTextFieldNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 210, 40));

        jButtonRegistrarse.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Enter_OFF.png"))); // NOI18N
        jButtonRegistrarse.setBorderPainted(false);
        jButtonRegistrarse.setContentAreaFilled(false);
        jButtonRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistrarse.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Enter_ON.png"))); // NOI18N
        jButtonRegistrarse.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Enter_ON.png"))); // NOI18N
        jButtonRegistrarse.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Enter_ON.png"))); // NOI18N
        jButtonRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegistrarseMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 130, 40));

        jButtonRegistrarse1.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRegistrarse1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrarse1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/buscar_OFf.png"))); // NOI18N
        jButtonRegistrarse1.setBorderPainted(false);
        jButtonRegistrarse1.setContentAreaFilled(false);
        jButtonRegistrarse1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistrarse1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/buscar_ON.png"))); // NOI18N
        jButtonRegistrarse1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/buscar_ON.png"))); // NOI18N
        jButtonRegistrarse1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/buscar_ON.png"))); // NOI18N
        jButtonRegistrarse1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegistrarse1MouseClicked(evt);
            }
        });
        jPanel1.add(jButtonRegistrarse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, 130, 40));

        jButtonRegistrarse2.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRegistrarse2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrarse2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/añadir_OFF.png"))); // NOI18N
        jButtonRegistrarse2.setBorderPainted(false);
        jButtonRegistrarse2.setContentAreaFilled(false);
        jButtonRegistrarse2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistrarse2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/añadir_ON.png"))); // NOI18N
        jButtonRegistrarse2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/añadir_ON.png"))); // NOI18N
        jButtonRegistrarse2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/añadir_ON.png"))); // NOI18N
        jButtonRegistrarse2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegistrarse2MouseClicked(evt);
            }
        });
        jPanel1.add(jButtonRegistrarse2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 130, 40));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 480, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try{
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "¿Desea Cerrar el Sistema?","EXIT",dialogButton);
            if(result == 0){
                System.exit(0);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Login login = new Login();
        dispose();
        login.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
         setState(Login.ICONIFIED);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButtonRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarseMouseClicked
        estudiantes.add((String) jComboBox2.getSelectedItem());
        JOptionPane.showMessageDialog(null, " Estudiante: " + (String) jComboBox2.getSelectedItem() + " al grupo: " + jTextFieldNombre.getText() );

    }//GEN-LAST:event_jButtonRegistrarseMouseClicked

    private void jButtonRegistrarse1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarse1MouseClicked
      // Limpiar el jTextArea antes de mostrar los cursos
    jTextArea1.setText("");

    // Recorrer la lista de cursos y agregar la información al jTextArea
    for (Curso curso : cursos) {
        String infoCurso = "Grupo: " + curso.getNombre() + ", Profesor: " + curso.getTitular() + "\n";
        jTextArea1.append(infoCurso);
    }
    }//GEN-LAST:event_jButtonRegistrarse1MouseClicked

    private void jButtonRegistrarse2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarse2MouseClicked
    String nombregrupo = jTextFieldNombre.getText();
    String profesor = jTextFieldNombre1.getText();

    // Verificar si los campos están vacíos
    if (nombregrupo.isEmpty() || profesor.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
    // Verificar si el usuario está registrado
    boolean cursoEncontrado = false;
    for (Curso curso : cursos) {
        if (curso.getNombre().equals(nombregrupo) && curso.getTitular().equals(profesor)) {
            cursoEncontrado = true;
            break;
        }
    }

    // Mostrar mensaje según el resultado
    if (cursoEncontrado) {
        JOptionPane.showMessageDialog(this, "grupo ya registrado");
    } else {
        Curso curso = new Curso(nombregrupo, profesor,estudiantes);
        cursos.add(curso);
        JOptionPane.showMessageDialog(this, "Grupo registrado " + "'" + nombregrupo + "'");
    }

    jTextFieldNombre.setText("");
    jTextFieldNombre1.setText("");
}
    }//GEN-LAST:event_jButtonRegistrarse2MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
      
    }//GEN-LAST:event_jPanel1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        
        // Agregar los estudiantes a jComboBox2
        for (Estudiantes estudiante : Login.getestudiantes()) {
            jComboBox2.addItem(estudiante.toString());
        }
        
            // Instancia 1
    ArrayList<String> estudiantes1 = new ArrayList<>();
    estudiantes1.add("Juan Pérez");
    estudiantes1.add("María González");
    estudiantes1.add("Carlos López");
    Curso curso1 = new Curso("Grupo A", "Alberto", estudiantes1);
    cursos.add(curso1);

    // Instancia 2
    ArrayList<String> estudiantes2 = new ArrayList<>();
    estudiantes2.add("Ana Ramírez");
    estudiantes2.add("Luis Torres");
    estudiantes2.add("Sofía Martínez");
    Curso curso2 = new Curso("Grupo B", "Juan", estudiantes2);
    cursos.add(curso2);

    // Instancia 3
    ArrayList<String> estudiantes3 = new ArrayList<>();
    estudiantes3.add("José Hernández");
    estudiantes3.add("Elena García");
    estudiantes3.add("Diego Fernández");
    Curso curso3 = new Curso("Grupo C", "Pepe", estudiantes3);
    cursos.add(curso3);

    }//GEN-LAST:event_formWindowOpened

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CURSO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CURSO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CURSO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CURSO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CURSO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jApellido;
    private javax.swing.JLabel jApellido1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonRegistrarse;
    private javax.swing.JButton jButtonRegistrarse1;
    private javax.swing.JButton jButtonRegistrarse2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNombre1;
    // End of variables declaration//GEN-END:variables
}
