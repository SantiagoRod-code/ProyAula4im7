
package menus;

import java.awt.Color;
import javax.swing.ImageIcon;

public class teoria extends javax.swing.JFrame {

    
    
    public teoria() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/logo.png")).getImage()); 
        txtNomTem.setEditable(false);
        txtNomMat.setEditable(false);
        
        imgCalDif.setVisible(false); imgFis.setVisible(false); imgQuim.setVisible(false); imgCalFin.setVisible(false);
        
        if (materias.materias == 1){
            jPanel2.setBackground(new Color(144, 12, 63));
            txtNomMat.setBackground(new Color(144, 12, 63));
            txtNomTem.setBackground(new Color(144, 12, 63));
            
            txtNomMat.setText("Calculo diferencial");
            imgCalDif.setVisible(true);
            
            if (Parcial.parcial == 1){
                if (temas1.tema == 1){
                    txtNomTem.setText("Tema 1"); // Editar nombre de tema
                }else if (temas1.tema == 2){
                    txtNomTem.setText("Tema 2"); // Editar nombre de tema
                }else if (temas1.tema == 3){
                    txtNomTem.setText("Tema 3"); // Editar nombre de tema
                }else if (temas1.tema == 4){
                    txtNomTem.setText("Tema 4"); // Editar nombre de tema
                }else if (temas1.tema == 5){
                    txtNomTem.setText("Tema 5"); // Editar nombre de tema
                }else if (temas1.tema == 6){
                    txtNomTem.setText("Tema 6"); // Editar nombre de tema
                }else if (temas1.tema == 7){
                    txtNomTem.setText("Tema 7"); // Editar nombre de tema
                }else if (temas1.tema == 8){
                    txtNomTem.setText("Tema 8"); // Editar nombre de tema
                }
            }
        }else if (materias.materias == 2){
            jPanel2.setBackground(new Color(4, 27, 135));
            txtNomMat.setBackground(new Color(4, 27, 135));
            txtNomTem.setBackground(new Color(4, 27, 135));
            
            txtNomMat.setText("Fisica");
            imgFis.setVisible(true);
            
            if (Parcial.parcial == 1){
                if (temas1.tema == 1){
                    txtNomTem.setText("Tema 1"); // Editar nombre de tema
                }else if (temas1.tema == 2){
                    txtNomTem.setText("Tema 2"); // Editar nombre de tema
                }else if (temas1.tema == 3){
                    txtNomTem.setText("Tema 3"); // Editar nombre de tema
                }else if (temas1.tema == 4){
                    txtNomTem.setText("Tema 4"); // Editar nombre de tema
                }else if (temas1.tema == 5){
                    txtNomTem.setText("Tema 5"); // Editar nombre de tema
                }else if (temas1.tema == 6){
                    txtNomTem.setText("Tema 6"); // Editar nombre de tema
                }else if (temas1.tema == 7){
                    txtNomTem.setText("Tema 7"); // Editar nombre de tema
                }else if (temas1.tema == 8){
                    txtNomTem.setText("Tema 8"); // Editar nombre de tema
                }
            }
        }else if (materias.materias == 4){
            jPanel2.setBackground(new Color(210, 121, 0));
            txtNomMat.setBackground(new Color(210, 121, 0));
            txtNomTem.setBackground(new Color(210, 121, 0));
            
            txtNomMat.setText("Calculos financieros");
            imgCalFin.setVisible(true);
            
            if (Parcial.parcial == 1){
                if (temas1.tema == 1){
                    txtNomTem.setText("Tema 1"); // Editar nombre de tema
                }else if (temas1.tema == 2){
                    txtNomTem.setText("Tema 2"); // Editar nombre de tema
                }else if (temas1.tema == 3){
                    txtNomTem.setText("Tema 3"); // Editar nombre de tema
                }else if (temas1.tema == 4){
                    txtNomTem.setText("Tema 4"); // Editar nombre de tema
                }else if (temas1.tema == 5){
                    txtNomTem.setText("Tema 5"); // Editar nombre de tema
                }else if (temas1.tema == 6){
                    txtNomTem.setText("Tema 6"); // Editar nombre de tema
                }else if (temas1.tema == 7){
                    txtNomTem.setText("Tema 7"); // Editar nombre de tema
                }else if (temas1.tema == 8){
                    txtNomTem.setText("Tema 8"); // Editar nombre de tema
                }
            }
        }else if (materias.materias == 3){
            jPanel2.setBackground(new Color(22, 86, 35));
            txtNomMat.setBackground(new Color(22, 86, 35));
            txtNomTem.setBackground(new Color(22, 86, 35));
            
            txtNomMat.setText("Quimica");
            imgQuim.setVisible(true);
            
            if (Parcial.parcial == 1){
                if (temas1.tema == 1){
                    txtNomTem.setText("Tema 1"); // Editar nombre de tema
                }else if (temas1.tema == 2){
                    txtNomTem.setText("Tema 2"); // Editar nombre de tema
                }else if (temas1.tema == 3){
                    txtNomTem.setText("Tema 3"); // Editar nombre de tema
                }else if (temas1.tema == 4){
                    txtNomTem.setText("Tema 4"); // Editar nombre de tema
                }else if (temas1.tema == 5){
                    txtNomTem.setText("Tema 5"); // Editar nombre de tema
                }else if (temas1.tema == 6){
                    txtNomTem.setText("Tema 6"); // Editar nombre de tema
                }else if (temas1.tema == 7){
                    txtNomTem.setText("Tema 7"); // Editar nombre de tema
                }else if (temas1.tema == 8){
                    txtNomTem.setText("Tema 8"); // Editar nombre de tema
                }
            }
        }
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
        txtNomMat = new javax.swing.JTextField();
        txtNomTem = new javax.swing.JTextField();
        imgCalDif = new javax.swing.JLabel();
        imgFis = new javax.swing.JLabel();
        imgQuim = new javax.swing.JLabel();
        imgCalFin = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNomMat.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtNomMat.setForeground(new java.awt.Color(255, 255, 255));
        txtNomMat.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNomMat.setText(".");
        txtNomMat.setBorder(null);
        txtNomMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomMatActionPerformed(evt);
            }
        });
        jPanel2.add(txtNomMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 230, 40));

        txtNomTem.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtNomTem.setForeground(new java.awt.Color(255, 255, 255));
        txtNomTem.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNomTem.setText(".");
        txtNomTem.setBorder(null);
        txtNomTem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomTemActionPerformed(evt);
            }
        });
        jPanel2.add(txtNomTem, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 170, 40));

        imgCalDif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CalDif.png"))); // NOI18N
        jPanel2.add(imgCalDif, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, -1));

        imgFis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconFis (2).png"))); // NOI18N
        jPanel2.add(imgFis, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, -1));

        imgQuim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconQuim.png"))); // NOI18N
        jPanel2.add(imgQuim, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, -1));

        imgCalFin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconCalFin.png"))); // NOI18N
        jPanel2.add(imgCalFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 130));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        btnVolver.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 691, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(345, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 800, 370));

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

    private void txtNomMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomMatActionPerformed

    }//GEN-LAST:event_txtNomMatActionPerformed

    private void txtNomTemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomTemActionPerformed

    }//GEN-LAST:event_txtNomTemActionPerformed

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        
    }//GEN-LAST:event_btnVolverMouseClicked

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
            java.util.logging.Logger.getLogger(teoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnVolver;
    private javax.swing.JLabel imgCalDif;
    private javax.swing.JLabel imgCalFin;
    private javax.swing.JLabel imgFis;
    private javax.swing.JLabel imgQuim;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtNomMat;
    private javax.swing.JTextField txtNomTem;
    // End of variables declaration//GEN-END:variables
}
