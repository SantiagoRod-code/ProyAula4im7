
package menus;

import java.awt.Color;
import javax.swing.ImageIcon;

public class temas1 extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    public static int tema;

    public temas1() {
        initComponents();
        
        if (materias.materias == 1){
            if (ejercicio.tem1Fin1 == 1){
                btnTema.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                btnTema.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                btnTema.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
            } else if (ejercicio.tem1Fin2 == 1 ){
                btnTema1.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                btnTema1.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                btnTema1.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
            } else if (ejercicio.tem1Fin3 == 1 ){
                btnTema2.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                btnTema2.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                btnTema2.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
            } else if (ejercicio.tem1Fin4 == 1 ){
                btnTema3.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                btnTema3.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                btnTema3.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
            } else if (ejercicio.tem1Fin5 == 1 ){
                btnTema4.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                btnTema4.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                btnTema4.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
            } else if (ejercicio.tem1Fin6 == 1 ){
                btnTema5.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                btnTema5.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                btnTema5.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
            } else if (ejercicio.tem1Fin7 == 1 ){
                btnTema6.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                btnTema6.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                btnTema6.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
            } else if (ejercicio.tem1Fin8 == 1 ){
                btnTema7.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                btnTema7.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                btnTema7.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
            }
        } else if (materias.materias == 2){
            if (Parcial.parcial == 1){
                if (ejercicio.tem2p1Fin1 == 1){
                    btnTema.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                    btnTema.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                    btnTema.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
                } else if (ejercicio.tem2p1Fin2 == 1 ){
                    btnTema1.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                    btnTema1.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                    btnTema1.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
                } else if (ejercicio.tem2p1Fin3 == 1 ){
                    btnTema2.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                    btnTema2.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                    btnTema2.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
                } else if (ejercicio.tem2p1Fin4 == 1 ){
                    btnTema3.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                    btnTema3.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                    btnTema3.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
                } else if (ejercicio.tem2p1Fin5 == 1 ){
                    btnTema4.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                    btnTema4.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                    btnTema4.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
                } else if (ejercicio.tem2p1Fin6 == 1 ){
                    btnTema5.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                    btnTema5.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                    btnTema5.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
                } else if (ejercicio.tem2p1Fin7 == 1 ){
                    btnTema6.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                    btnTema6.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                    btnTema6.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
                } else if (ejercicio.tem2p1Fin8 == 1 ){
                    btnTema7.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                    btnTema7.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                    btnTema7.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
                }
            }else if (Parcial.parcial ==2){
                if (ejercicio.tem2p2Fin1 ==1){
                    btnTema.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                    btnTema.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                    btnTema.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
                } else if (ejercicio.tem2p2Fin2 == 1 ){
                    btnTema1.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                    btnTema1.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                    btnTema1.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
                } else if (ejercicio.tem2p2Fin3 == 1 ){
                    btnTema2.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                    btnTema2.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                    btnTema2.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
                } else if (ejercicio.tem2p2Fin4 == 1 ){
                    btnTema3.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                    btnTema3.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                    btnTema3.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
                } else if (ejercicio.tem2p2Fin5 == 1 ){
                    btnTema4.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                    btnTema4.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                    btnTema4.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
                } else if (ejercicio.tem2p2Fin6 == 1 ){
                    btnTema5.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                    btnTema5.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                    btnTema5.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
                } else if (ejercicio.tem2p2Fin7 == 1 ){
                    btnTema6.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                    btnTema6.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                    btnTema6.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
                } else if (ejercicio.tem2p2Fin8 == 1 ){
                    btnTema7.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                    btnTema7.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                    btnTema7.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
                }
            }else if (Parcial.parcial ==3){
                if (ejercicio.tem2p3Fin1 ==1){
                    btnTema.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                    btnTema.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                    btnTema.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
                } else if (ejercicio.tem2p3Fin2 == 1 ){
                    btnTema1.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                    btnTema1.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                    btnTema1.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
                } else if (ejercicio.tem2p3Fin3 == 1 ){
                    btnTema2.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                    btnTema2.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                    btnTema2.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
                } else if (ejercicio.tem2p3Fin4 == 1 ){
                    btnTema3.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                    btnTema3.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                    btnTema3.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
                } else if (ejercicio.tem2p3Fin5 == 1 ){
                    btnTema4.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                    btnTema4.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                    btnTema4.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
                } else if (ejercicio.tem2p3Fin6 == 1 ){
                    btnTema5.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                    btnTema5.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                    btnTema5.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
                } else if (ejercicio.tem2p3Fin7 == 1 ){
                    btnTema6.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                    btnTema6.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                    btnTema6.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
                } else if (ejercicio.tem2p3Fin8 == 1 ){
                    btnTema7.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                    btnTema7.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                    btnTema7.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
                }
            }
        } else if (materias.materias == 3){
            if (ejercicio.tem3Fin1 == 1){
                btnTema.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                btnTema.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                btnTema.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
            } else if (ejercicio.tem3Fin2 == 1 ){
                btnTema1.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                btnTema1.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                btnTema1.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
            } else if (ejercicio.tem3Fin3 == 1 ){
                btnTema2.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                btnTema2.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                btnTema2.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
            } else if (ejercicio.tem3Fin4 == 1 ){
                btnTema3.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                btnTema3.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                btnTema3.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
            } else if (ejercicio.tem3Fin5 == 1 ){
                btnTema4.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                btnTema4.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                btnTema4.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
            } else if (ejercicio.tem3Fin6 == 1 ){
                btnTema5.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                btnTema5.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                btnTema5.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
            } else if (ejercicio.tem3Fin7 == 1 ){
                btnTema6.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                btnTema6.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                btnTema6.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
            } else if (ejercicio.tem3Fin8 == 1 ){
                btnTema7.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                btnTema7.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                btnTema7.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
            }
        }else if (materias.materias == 4){
            if (ejercicio.tem4Fin1 == 1){
                btnTema.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                btnTema.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                btnTema.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
            } else if (ejercicio.tem4Fin2 == 1 ){
                btnTema1.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                btnTema1.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                btnTema1.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
            } else if (ejercicio.tem4Fin3 == 1 ){
                btnTema2.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                btnTema2.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                btnTema2.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
            } else if (ejercicio.tem4Fin4 == 1 ){
                btnTema3.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                btnTema3.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                btnTema3.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
            } else if (ejercicio.tem4Fin5 == 1 ){
                btnTema4.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                btnTema4.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                btnTema4.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
            } else if (ejercicio.tem4Fin6 == 1 ){
                btnTema5.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                btnTema5.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                btnTema5.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
            } else if (ejercicio.tem4Fin7 == 1 ){
                btnTema6.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                btnTema6.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                btnTema6.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
            } else if (ejercicio.tem4Fin8 == 1 ){
                btnTema7.setIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));          
                btnTema7.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF72.png"))); 
                btnTema7.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/imgTemaF.png")));
            }
        }
        
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/logo.png")).getImage()); 
        txtNomPar.setEditable(false);
        txtNomMat.setEditable(false);
        
        imgConta.setVisible(false);imgCalDif.setVisible(false); imgFis.setVisible(false); imgQuim.setVisible(false); imgCalFin.setVisible(false);
        
        if (materias.materias == 1){
            barraTa.setBackground(new Color(144, 12, 63));
            cerrar.setBackground(new Color(144, 12, 63));
            jPanel2.setBackground(new Color(144, 12, 63));
            txtNomMat.setBackground(new Color(144, 12, 63));
            txtNomPar.setBackground(new Color(144, 12, 63));
            
            txtNomMat.setText("Cálculo diferencial");
            imgCalDif.setVisible(true);
            
            if (Parcial.parcial==1){
                txtNomPar.setText("Parcial 1");
            }
            
        }else if (materias.materias == 2){
            barraTa.setBackground(new Color(4, 27, 135));
            cerrar.setBackground(new Color(4, 27, 135));
            jPanel2.setBackground(new Color(4, 27, 135));
            txtNomMat.setBackground(new Color(4, 27, 135));
            txtNomPar.setBackground(new Color(4, 27, 135));
            
            txtNomMat.setText("Fìsica");
            imgFis.setVisible(true);
            
            if (Parcial.parcial==1){
                txtNomPar.setText("Parcial 1");
            }else if (Parcial.parcial==2){
                txtNomPar.setText("Parcial 2");
            }else if (Parcial.parcial==3){
                txtNomPar.setText("Parcial 3");
            }
            
        }else if (materias.materias == 3){
            barraTa.setBackground(new Color(22, 86, 35));
            cerrar.setBackground(new Color(22, 86, 35));
            jPanel2.setBackground(new Color(22, 86, 35));
            txtNomMat.setBackground(new Color(22, 86, 35));
            txtNomPar.setBackground(new Color(22, 86, 35));
            
            txtNomMat.setText("Quìmica");
            imgQuim.setVisible(true);
            
            if (Parcial.parcial==1){
                txtNomPar.setText("Parcial 1");
            }
            
        }else if (materias.materias == 4){
            barraTa.setBackground(new Color(210, 121, 0));
            cerrar.setBackground(new Color(210, 121, 0));
            jPanel2.setBackground(new Color(210, 121, 0));
            txtNomMat.setBackground(new Color(210, 121, 0));
            txtNomPar.setBackground(new Color(210, 121, 0));
            
            txtNomMat.setText("Càlculos financieros");
            imgCalFin.setVisible(true);
            
            if (Parcial.parcial==1){
                txtNomPar.setText("Parcial 1");
            }
            
        }else if (materias.materias == 5){
            barraTa.setBackground(new Color(85, 36, 160));
            cerrar.setBackground(new Color(85, 36, 160));
            jPanel2.setBackground(new Color(85, 36, 160));
            txtNomMat.setBackground(new Color(85, 36, 160));
            txtNomPar.setBackground(new Color(85, 36, 160));
            
            txtNomMat.setText("Contabilidad");
            //imgConta.setVisible(true);
            
            if (Parcial.parcial==1){
                txtNomPar.setText("Parcial 1");
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barraTa = new javax.swing.JPanel();
        cerrar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNomMat = new javax.swing.JTextField();
        txtNomPar = new javax.swing.JTextField();
        imgCalDif = new javax.swing.JLabel();
        imgFis = new javax.swing.JLabel();
        imgQuim = new javax.swing.JLabel();
        imgCalFin = new javax.swing.JLabel();
        imgConta = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JLabel();
        btnTema = new javax.swing.JButton();
        btnTema1 = new javax.swing.JButton();
        btnTema2 = new javax.swing.JButton();
        btnTema3 = new javax.swing.JButton();
        btnTema4 = new javax.swing.JButton();
        btnTema5 = new javax.swing.JButton();
        btnTema6 = new javax.swing.JButton();
        btnTema7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraTa.setBackground(new java.awt.Color(80, 0, 40));
        barraTa.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraTaMouseDragged(evt);
            }
        });
        barraTa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraTaMousePressed(evt);
            }
        });
        barraTa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cerrar.setBackground(new java.awt.Color(80, 0, 40));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("X");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout cerrarLayout = new javax.swing.GroupLayout(cerrar);
        cerrar.setLayout(cerrarLayout);
        cerrarLayout.setHorizontalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        cerrarLayout.setVerticalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        barraTa.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        jPanel1.add(barraTa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

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

        txtNomPar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtNomPar.setForeground(new java.awt.Color(255, 255, 255));
        txtNomPar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNomPar.setText(".");
        txtNomPar.setBorder(null);
        txtNomPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomParActionPerformed(evt);
            }
        });
        jPanel2.add(txtNomPar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 170, 40));

        imgCalDif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CalDif.png"))); // NOI18N
        jPanel2.add(imgCalDif, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, -1));

        imgFis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconFis (2).png"))); // NOI18N
        jPanel2.add(imgFis, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, -1));

        imgQuim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconQuim.png"))); // NOI18N
        jPanel2.add(imgQuim, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, -1));

        imgCalFin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconCalFin.png"))); // NOI18N
        jPanel2.add(imgCalFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, -1));

        imgConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconConta.png"))); // NOI18N
        jPanel2.add(imgConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, -1));

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

        btnTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgTema.png"))); // NOI18N
        btnTema.setContentAreaFilled(false);
        btnTema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgTema.png"))); // NOI18N
        btnTema.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgTema72.png"))); // NOI18N
        btnTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemaActionPerformed(evt);
            }
        });

        btnTema1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgTema.png"))); // NOI18N
        btnTema1.setContentAreaFilled(false);
        btnTema1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgTema.png"))); // NOI18N
        btnTema1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgTema72.png"))); // NOI18N
        btnTema1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTema1ActionPerformed(evt);
            }
        });

        btnTema2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgTema.png"))); // NOI18N
        btnTema2.setContentAreaFilled(false);
        btnTema2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgTema.png"))); // NOI18N
        btnTema2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgTema72.png"))); // NOI18N
        btnTema2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTema2ActionPerformed(evt);
            }
        });

        btnTema3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgTema.png"))); // NOI18N
        btnTema3.setContentAreaFilled(false);
        btnTema3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgTema.png"))); // NOI18N
        btnTema3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgTema72.png"))); // NOI18N
        btnTema3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTema3ActionPerformed(evt);
            }
        });

        btnTema4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgTema.png"))); // NOI18N
        btnTema4.setContentAreaFilled(false);
        btnTema4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgTema.png"))); // NOI18N
        btnTema4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgTema72.png"))); // NOI18N
        btnTema4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTema4ActionPerformed(evt);
            }
        });

        btnTema5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgTema.png"))); // NOI18N
        btnTema5.setContentAreaFilled(false);
        btnTema5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgTema.png"))); // NOI18N
        btnTema5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgTema72.png"))); // NOI18N
        btnTema5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTema5ActionPerformed(evt);
            }
        });

        btnTema6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgTema.png"))); // NOI18N
        btnTema6.setContentAreaFilled(false);
        btnTema6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgTema.png"))); // NOI18N
        btnTema6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgTema72.png"))); // NOI18N
        btnTema6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTema6ActionPerformed(evt);
            }
        });

        btnTema7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgTema.png"))); // NOI18N
        btnTema7.setContentAreaFilled(false);
        btnTema7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTema7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgTema.png"))); // NOI18N
        btnTema7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgTema72.png"))); // NOI18N
        btnTema7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTema7ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechaR.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechaR.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechaR.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechaL.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechaL.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechaL.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnTema7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTema6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTema5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTema)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTema1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTema2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnTema3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTema4)
                        .addGap(93, 93, 93))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTema3)
                            .addComponent(btnTema)
                            .addComponent(btnTema1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTema2)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnTema4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnTema5)
                                .addComponent(btnTema6)
                                .addComponent(btnTema7)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 800, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomMatActionPerformed

    }//GEN-LAST:event_txtNomMatActionPerformed

    private void txtNomParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomParActionPerformed

    }//GEN-LAST:event_txtNomParActionPerformed

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        Parcial abrir = new Parcial();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverMouseClicked

    private void btnTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemaActionPerformed
        tema = 1;
        
        teoria abrir = new teoria();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTemaActionPerformed

    private void btnTema1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTema1ActionPerformed
        tema = 2;
        
        teoria abrir = new teoria();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTema1ActionPerformed

    private void btnTema2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTema2ActionPerformed
        tema = 3;
        
        teoria abrir = new teoria();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTema2ActionPerformed

    private void btnTema3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTema3ActionPerformed
        tema = 4;
        
        teoria abrir = new teoria();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTema3ActionPerformed

    private void btnTema4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTema4ActionPerformed
        tema = 5;
        
        teoria abrir = new teoria();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTema4ActionPerformed

    private void btnTema5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTema5ActionPerformed
        tema = 6;
        
        teoria abrir = new teoria();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTema5ActionPerformed

    private void btnTema6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTema6ActionPerformed
        tema = 7;
        
        teoria abrir = new teoria();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTema6ActionPerformed

    private void btnTema7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTema7ActionPerformed
        tema = 8;
        
        teoria abrir = new teoria();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTema7ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        cerrar.setBackground(Color.red);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        if (materias.materias == 1){
            cerrar.setBackground(new Color(144, 12, 63));
        }else if (materias.materias == 2){
            cerrar.setBackground(new Color(4, 27, 135));
        }else if (materias.materias == 3){
            cerrar.setBackground(new Color(22, 86, 35));
        }else if (materias.materias ==4){
            cerrar.setBackground(new Color(210, 121, 0));
        }else if (materias.materias ==5){
            cerrar.setBackground(new Color(60, 20, 80));
        }
    }//GEN-LAST:event_jLabel7MouseExited

    private void barraTaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraTaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraTaMouseDragged

    private void barraTaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraTaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraTaMousePressed


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
            java.util.logging.Logger.getLogger(temas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(temas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(temas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(temas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new temas1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraTa;
    private javax.swing.JButton btnTema;
    private javax.swing.JButton btnTema1;
    private javax.swing.JButton btnTema2;
    private javax.swing.JButton btnTema3;
    private javax.swing.JButton btnTema4;
    private javax.swing.JButton btnTema5;
    private javax.swing.JButton btnTema6;
    private javax.swing.JButton btnTema7;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JPanel cerrar;
    private javax.swing.JLabel imgCalDif;
    private javax.swing.JLabel imgCalFin;
    private javax.swing.JLabel imgConta;
    private javax.swing.JLabel imgFis;
    private javax.swing.JLabel imgQuim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtNomMat;
    private javax.swing.JTextField txtNomPar;
    // End of variables declaration//GEN-END:variables
}
