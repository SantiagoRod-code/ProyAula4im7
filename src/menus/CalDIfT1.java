/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menus;

/**
 *
 * @author PC
 */
public class CalDIfT1 extends javax.swing.JFrame {

    /**
     * Creates new form CalDIfT1
     */
    public CalDIfT1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnEj1 = new javax.swing.JButton();
        btnEj2 = new javax.swing.JButton();
        btnEj3 = new javax.swing.JButton();
        btnEj4 = new javax.swing.JButton();
        btnEj5 = new javax.swing.JButton();
        btnEj6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(80, 0, 40));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Elige un tema a estudiar");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Calculo DIferencial");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 215, 33));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige un tema", "Tema 1", "Tema 2", "Tema 3" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 140, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CalDif.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 130));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setToolTipText("");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEj1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/star.64.png"))); // NOI18N
        btnEj1.setContentAreaFilled(false);
        btnEj1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEj1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEj1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/star.64.png"))); // NOI18N
        btnEj1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/star.96.png"))); // NOI18N
        btnEj1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEj1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnEj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 93, 93));

        btnEj2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/star.64.png"))); // NOI18N
        btnEj2.setContentAreaFilled(false);
        btnEj2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEj2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEj2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/star.64.png"))); // NOI18N
        btnEj2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/star.96.png"))); // NOI18N
        btnEj2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(btnEj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 93, 93));

        btnEj3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/star.64.png"))); // NOI18N
        btnEj3.setContentAreaFilled(false);
        btnEj3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEj3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEj3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/star.64.png"))); // NOI18N
        btnEj3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/star.96.png"))); // NOI18N
        btnEj3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEj3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEj3ActionPerformed(evt);
            }
        });
        jPanel3.add(btnEj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 100, 93));

        btnEj4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/star.64.png"))); // NOI18N
        btnEj4.setContentAreaFilled(false);
        btnEj4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEj4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEj4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/star.64.png"))); // NOI18N
        btnEj4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/star.96.png"))); // NOI18N
        btnEj4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEj4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEj4ActionPerformed(evt);
            }
        });
        jPanel3.add(btnEj4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 93, 93));

        btnEj5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/star.64.png"))); // NOI18N
        btnEj5.setContentAreaFilled(false);
        btnEj5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEj5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEj5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/star.64.png"))); // NOI18N
        btnEj5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/star.96.png"))); // NOI18N
        btnEj5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEj5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEj5ActionPerformed(evt);
            }
        });
        jPanel3.add(btnEj5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 93, 93));

        btnEj6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/star.64.png"))); // NOI18N
        btnEj6.setContentAreaFilled(false);
        btnEj6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEj6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEj6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/star.64.png"))); // NOI18N
        btnEj6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/star.96.png"))); // NOI18N
        btnEj6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEj6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEj6ActionPerformed(evt);
            }
        });
        jPanel3.add(btnEj6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 93, 93));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Volver");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 80, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 800, 380));

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
    }// </editor-fold>//GEN-END:initComponents

    private void btnEj3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEj3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEj3ActionPerformed

    private void btnEj4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEj4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEj4ActionPerformed

    private void btnEj5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEj5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEj5ActionPerformed

    private void btnEj6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEj6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEj6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnEj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEj1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEj1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        materias abrir = new materias();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(CalDIfT1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalDIfT1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalDIfT1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalDIfT1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalDIfT1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEj1;
    private javax.swing.JButton btnEj2;
    private javax.swing.JButton btnEj3;
    private javax.swing.JButton btnEj4;
    private javax.swing.JButton btnEj5;
    private javax.swing.JButton btnEj6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
