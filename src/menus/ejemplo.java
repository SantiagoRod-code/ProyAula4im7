
package menus;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ejemplo extends javax.swing.JFrame {

    String mensaje = "Seguro que quieres abandonar la leccion";
    
    public ejemplo() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/logo.png")).getImage()); 
        
        
        txtNomTem.setEditable(false);
        txtNomMat.setEditable(false);
        
        imgCalDif.setVisible(false); imgFis.setVisible(false); imgQuim.setVisible(false); imgCalFin.setVisible(false);
        
        if (materias.materias == 1){ // Detector materia
            jPanel2.setBackground(new Color(144, 12, 63));
            txtNomMat.setBackground(new Color(144, 12, 63));
            txtNomTem.setBackground(new Color(144, 12, 63));
            
            txtNomMat.setText("Calculo diferencial");
            imgCalDif.setVisible(true);
            
            if (Parcial.parcial == 1){  // Detector parcial
                
                if (temas1.tema == 1){   // Detector tema
                    txtNomTem.setText("Tema 1"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 2){
                    txtNomTem.setText("Tema 2"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 3){
                    txtNomTem.setText("Tema 3"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 4){
                    txtNomTem.setText("Tema 4"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 5){
                    txtNomTem.setText("Tema 5"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 6){
                    txtNomTem.setText("Tema 6"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 7){
                    txtNomTem.setText("Tema 7"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 8){
                    txtNomTem.setText("Tema 8"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }
            }
        }else if (materias.materias == 2){
            jPanel2.setBackground(new Color(4, 27, 135));
            txtNomMat.setBackground(new Color(4, 27, 135));
            txtNomTem.setBackground(new Color(4, 27, 135));
            
            txtNomMat.setText("Fisica");
            imgFis.setVisible(true);
            
            if (Parcial.parcial == 1){
                    
                if (temas1.tema == 1){   // Detector tema
                    txtNomTem.setText("Tema 1"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 2){
                    txtNomTem.setText("Tema 2"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 3){
                    txtNomTem.setText("Tema 3"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 4){
                    txtNomTem.setText("Tema 4"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 5){
                    txtNomTem.setText("Tema 5"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 6){
                    txtNomTem.setText("Tema 6"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 7){
                    txtNomTem.setText("Tema 7"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 8){
                    txtNomTem.setText("Tema 8"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }
        }
        }else if (materias.materias == 4){
            jPanel2.setBackground(new Color(210, 121, 0));
            txtNomMat.setBackground(new Color(210, 121, 0));
            txtNomTem.setBackground(new Color(210, 121, 0));
            
            txtNomMat.setText("Calculos financieros");
            imgCalFin.setVisible(true);
            
            if (Parcial.parcial == 1){
                if (temas1.tema == 1){   // Detector tema
                    txtNomTem.setText("Tema 1"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 2){
                    txtNomTem.setText("Tema 2"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 3){
                    txtNomTem.setText("Tema 3"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 4){
                    txtNomTem.setText("Tema 4"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 5){
                    txtNomTem.setText("Tema 5"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 6){
                    txtNomTem.setText("Tema 6"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 7){
                    txtNomTem.setText("Tema 7"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 8){
                    txtNomTem.setText("Tema 8"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }
            }
        }else if (materias.materias == 3){
            jPanel2.setBackground(new Color(22, 86, 35));
            txtNomMat.setBackground(new Color(22, 86, 35));
            txtNomTem.setBackground(new Color(22, 86, 35));
            
            txtNomMat.setText("Quimica");
            imgQuim.setVisible(true);
            
            if (Parcial.parcial == 1){
                if (temas1.tema == 1){   // Detector tema
                    txtNomTem.setText("Tema 1"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 2){
                    txtNomTem.setText("Tema 2"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 3){
                    txtNomTem.setText("Tema 3"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 4){
                    txtNomTem.setText("Tema 4"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 5){
                    txtNomTem.setText("Tema 5"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 6){
                    txtNomTem.setText("Tema 6"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 7){
                    txtNomTem.setText("Tema 7"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 8){
                    txtNomTem.setText("Tema 8"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("informacion del ejemplo 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("informacion del ejemplo 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtNomTem = new javax.swing.JTextField();
        imgCalDif = new javax.swing.JLabel();
        imgFis = new javax.swing.JLabel();
        imgQuim = new javax.swing.JLabel();
        imgCalFin = new javax.swing.JLabel();
        txtNomMat = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JLabel();
        txtTexto = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        btnSiguiente = new javax.swing.JLabel();
        txtInstru = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(txtNomMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 230, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 130));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        btnVolver.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVolver.setText("Salir");
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

        txtTexto.setEditable(false);
        txtTexto.setColumns(20);
        txtTexto.setRows(5);
        txtTexto.setBorder(null);

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        btnSiguiente.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnSiguiente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSiguiente.setText("Siguiente");
        btnSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiguienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        txtInstru.setBackground(new java.awt.Color(255, 255, 255));
        txtInstru.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtInstru.setForeground(new java.awt.Color(0, 0, 0));
        txtInstru.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtInstru.setText(".");
        txtInstru.setBorder(null);
        txtInstru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInstruActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 582, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(txtInstru, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(56, Short.MAX_VALUE)
                    .addComponent(txtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(58, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtInstru, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(118, Short.MAX_VALUE)
                    .addComponent(txtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(67, Short.MAX_VALUE)))
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
        Object[] opciones = {"Cancelar", "Salir"};
        int seleccion = JOptionPane.showOptionDialog(
            null,
            mensaje,
            "Alerta",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE,
            getIcon("/imagenes/alerta.png", 40, 40),
            opciones,
            opciones[0] 
        );

        if (seleccion == 0) {
            
        } else if (seleccion == 1) {
            teoria.avance = 0;
            
            temas1 abrir = new temas1();
            abrir.setVisible(true);
            dispose();
        } else if (seleccion == JOptionPane.CLOSED_OPTION) {
            
        } else {
            
        }
    }//GEN-LAST:event_btnVolverMouseClicked

    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked
        teoria.avance++;
        
        if (teoria.avance == 2){
            ejemplo abrir = new ejemplo();
            abrir.setVisible(true);
            dispose();
        } else {
            ejercicio abrir = new ejercicio();
            abrir.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnSiguienteMouseClicked

    private void txtInstruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInstruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInstruActionPerformed

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
            java.util.logging.Logger.getLogger(ejemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejemplo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnSiguiente;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JLabel imgCalDif;
    private javax.swing.JLabel imgCalFin;
    private javax.swing.JLabel imgFis;
    private javax.swing.JLabel imgQuim;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtInstru;
    private javax.swing.JTextField txtNomMat;
    private javax.swing.JTextField txtNomTem;
    private javax.swing.JTextArea txtTexto;
    // End of variables declaration//GEN-END:variables

    private Icon getIcon(String path, int w, int h) {
        return new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(w, h, 0));
    }
}
