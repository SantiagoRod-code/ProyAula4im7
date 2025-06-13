
package menus;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ejercicio extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    String[] opciones = {"Aceptar"};
    String mensaje = "Seguro que quieres abandonar la leccion";
    String correct = "Respuesta correcta";
    
    public static int tem1Fin1;
    public static int tem1Fin2;
    public static int tem1Fin3;
    public static int tem1Fin4;
    public static int tem1Fin5;
    public static int tem1Fin6;
    public static int tem1Fin7;
    public static int tem1Fin8;
    
    //FIsica 1 parcial
    public static int tem2p1Fin1;
    public static int tem2p1Fin2;
    public static int tem2p1Fin3;
    public static int tem2p1Fin4;
    public static int tem2p1Fin5;
    public static int tem2p1Fin6;
    public static int tem2p1Fin7;
    public static int tem2p1Fin8;
    
    //FIsica 2 parcial
    public static int tem2p2Fin1;
    public static int tem2p2Fin2;
    public static int tem2p2Fin3;
    public static int tem2p2Fin4;
    public static int tem2p2Fin5;
    public static int tem2p2Fin6;
    public static int tem2p2Fin7;
    public static int tem2p2Fin8;
    
    //FIsica 3 parcial
    public static int tem2p3Fin1;
    public static int tem2p3Fin2;
    public static int tem2p3Fin3;
    public static int tem2p3Fin4;
    public static int tem2p3Fin5;
    public static int tem2p3Fin6;
    public static int tem2p3Fin7;
    public static int tem2p3Fin8;
    
    public static int tem3Fin1;
    public static int tem3Fin2;
    public static int tem3Fin3;
    public static int tem3Fin4;
    public static int tem3Fin5;
    public static int tem3Fin6;
    public static int tem3Fin7;
    public static int tem3Fin8;
    
    public static int tem4Fin1;
    public static int tem4Fin2;
    public static int tem4Fin3;
    public static int tem4Fin4;
    public static int tem4Fin5;
    public static int tem4Fin6;
    public static int tem4Fin7;
    public static int tem4Fin8;
    
    public ejercicio() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/logo.png")).getImage()); 
        
        
        txtNomTem.setEditable(false);
        txtNomMat.setEditable(false);
        
        imgCalDif.setVisible(false); imgFis.setVisible(false); imgQuim.setVisible(false); imgCalFin.setVisible(false);
        
        if (materias.materias == 1){ // Detector materia
            barraTa.setBackground(new Color(144, 12, 63));
            cerrar.setBackground(new Color(144, 12, 63));
            jPanel2.setBackground(new Color(144, 12, 63));
            txtNomMat.setBackground(new Color(144, 12, 63));
            txtNomTem.setBackground(new Color(144, 12, 63));
            
            txtNomMat.setText("Cálculo diferencial");
            imgCalDif.setVisible(true);
            
            if (Parcial.parcial == 1){  // Detector parcial
                
                if (temas1.tema == 1){   // Detector tema
                    txtNomTem.setText("Definición de una Función"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio");  
                        txtTexto.setText("Determina si la siguiente relación es una función:\n\n" +
                        "(3,9),(6,12),(3,−1)");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio");  
                        txtTexto.setText("Clasifica el tipo de función:\n\n" +
                        "f(x) = |x − 2|");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 2){
                    txtNomTem.setText("Tema 2"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 3){
                    txtNomTem.setText("Tema 3"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 4){
                    txtNomTem.setText("Tema 4"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 5){
                    txtNomTem.setText("Tema 5"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 6){
                    txtNomTem.setText("Tema 6"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 7){
                    txtNomTem.setText("Tema 7"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 8){
                    txtNomTem.setText("Tema 8"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }
            }
        }else if (materias.materias == 2){
            barraTa.setBackground(new Color(4, 27, 135));
            cerrar.setBackground(new Color(4, 27, 135));
            jPanel2.setBackground(new Color(4, 27, 135));
            txtNomMat.setBackground(new Color(4, 27, 135));
            txtNomTem.setBackground(new Color(4, 27, 135));
            
            txtNomMat.setText("Física");
            imgFis.setVisible(true);
            
            if (Parcial.parcial == 1){
                    
                if (temas1.tema == 1){   // Detector tema
                    txtNomTem.setText("Ley de hooke"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1");  
                        txtTexto.setText("Un resorte con k = 100 N/m se alarga 0.05 m. ¿Cual es la Fuerza?");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2");  
                        txtTexto.setText("F = 12 N y k = 300 N/m. ¿Cuál es el alargamiento?");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 2){
                    txtNomTem.setText("Módulo de Young"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1");  
                        txtTexto.setText("F = 100 N, L = 0.5 m, A = 0.001 m², ΔL = 0.001 m");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2");  
                        txtTexto.setText("E = 2×10¹¹ Pa, A = 0.0005 m², L = 1 m, ΔL = 0.001 m");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 3){
                    txtNomTem.setText("Densidad"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1");  
                        txtTexto.setText("m = 1500 g, V = 300 cm³. ¿Densidad?");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2");  
                        txtTexto.setText("ρ = 0.8 g/cm³, V = 250 cm³. ¿Masa?");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 4){
                    txtNomTem.setText("Tema 4"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 5){
                    txtNomTem.setText("Tema 5"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 6){
                    txtNomTem.setText("Tema 6"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 7){
                    txtNomTem.setText("Tema 7"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 8){
                    txtNomTem.setText("Tema 8"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }
        }
        }else if (materias.materias == 4){
            barraTa.setBackground(new Color(210, 121, 0));
            cerrar.setBackground(new Color(210, 121, 0));
            jPanel2.setBackground(new Color(210, 121, 0));
            txtNomMat.setBackground(new Color(210, 121, 0));
            txtNomTem.setBackground(new Color(210, 121, 0));
            
            txtNomMat.setText("Calculos financieros");
            imgCalFin.setVisible(true);
            
            if (Parcial.parcial == 1){
                if (temas1.tema == 1){   // Detector tema
                    txtNomTem.setText("Tema 1"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 2){
                    txtNomTem.setText("Tema 2"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 3){
                    txtNomTem.setText("Tema 3"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 4){
                    txtNomTem.setText("Tema 4"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 5){
                    txtNomTem.setText("Tema 5"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 6){
                    txtNomTem.setText("Tema 6"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 7){
                    txtNomTem.setText("Tema 7"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 8){
                    txtNomTem.setText("Tema 8"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                }
            }
        }else if (materias.materias == 3){
            barraTa.setBackground(new Color(22, 86, 35));
            cerrar.setBackground(new Color(22, 86, 35));
            jPanel2.setBackground(new Color(22, 86, 35));
            txtNomMat.setBackground(new Color(22, 86, 35));
            txtNomTem.setBackground(new Color(22, 86, 35));
            
            txtNomMat.setText("Contabilidad");
            imgQuim.setVisible(true);
            
            if (Parcial.parcial == 1){
                if (temas1.tema == 1){   // Detector tema
                    txtNomTem.setText("Tema 1"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 2){
                    txtNomTem.setText("Tema 2"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 3){
                    txtNomTem.setText("Tema 3"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 4){
                    txtNomTem.setText("Tema 4"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 5){
                    txtNomTem.setText("Tema 5"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 6){
                    txtNomTem.setText("Tema 6"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 7){
                    txtNomTem.setText("Tema 7"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 8){
                    txtNomTem.setText("Tema 8"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }
            }
        }else if (materias.materias == 5){
            barraTa.setBackground(new Color(85, 36, 160));
            cerrar.setBackground(new Color(85, 36, 160));
            jPanel2.setBackground(new Color(85, 36, 160));
            txtNomMat.setBackground(new Color(85, 36, 160));
            txtNomTem.setBackground(new Color(85, 36, 160));
            
            txtNomMat.setText("Contabilidad");
            imgQuim.setVisible(true);
            
            if (Parcial.parcial == 1){
                if (temas1.tema == 1){   // Detector tema
                    txtNomTem.setText("Tema 1"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 2){
                    txtNomTem.setText("Tema 2"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 3){
                    txtNomTem.setText("Tema 3"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 4){
                    txtNomTem.setText("Tema 4"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 5){
                    txtNomTem.setText("Tema 5"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 6){
                    txtNomTem.setText("Tema 6"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 7){
                    txtNomTem.setText("Tema 7"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 8){
                    txtNomTem.setText("Tema 8"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 (1)");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 (2)");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barraTa = new javax.swing.JPanel();
        cerrar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
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
        txtRespuesta = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

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

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout cerrarLayout = new javax.swing.GroupLayout(cerrar);
        cerrar.setLayout(cerrarLayout);
        cerrarLayout.setHorizontalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        cerrarLayout.setVerticalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        barraTa.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        jPanel1.add(barraTa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

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
        jPanel2.add(txtNomTem, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 400, 40));

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
        jPanel2.add(txtNomMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 250, 40));

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
        txtTexto.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
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

        txtRespuesta.setBackground(new java.awt.Color(255, 255, 255));
        txtRespuesta.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtRespuesta.setForeground(new java.awt.Color(153, 153, 153));
        txtRespuesta.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtRespuesta.setText(".");
        txtRespuesta.setBorder(null);
        txtRespuesta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRespuestaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtRespuestaMouseEntered(evt);
            }
        });
        txtRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespuestaActionPerformed(evt);
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(txtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
    String respuestaTexto = txtRespuesta.getText().trim();

    boolean esNumero = false;
    double respuestaNumero = -1;

    try {
        if (respuestaTexto.matches("^\\d+(\\.\\d+)?$")) {
            // número puro
            respuestaNumero = Double.parseDouble(respuestaTexto);
            esNumero = true;
        } else {
            // Intenta extraer número inicial si hay letras después
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("^\\d+(\\.\\d+)?").matcher(respuestaTexto);
            if (matcher.find()) {
                String numeroExtraido = matcher.group();
                respuestaNumero = Double.parseDouble(numeroExtraido);
                esNumero = true;
            }
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showOptionDialog(null, "La respuesta no es válida", "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
    }

    if (materias.materias == 1) {
        if (Parcial.parcial == 1) {
            if (temas1.tema == 1) {
                if (teoria.avance == 3) {
                    if (esNumero && respuestaNumero == 1234512345) {
                        teoria.avance++;
                        JOptionPane.showOptionDialog(null, correct, "Correcto", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/correct.png", 40, 40), opciones, opciones[0]);
                        new ejercicio().setVisible(true);
                        dispose();
                    } else if (respuestaTexto.equalsIgnoreCase("No") || respuestaTexto.equals("No se pongan lo que quieran")) {
                        teoria.avance++;
                        JOptionPane.showOptionDialog(null, correct, "Correcto", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/correct.png", 40, 40), opciones, opciones[0]);
                        new ejercicio().setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                } else if (teoria.avance == 4) {
                    if (esNumero && respuestaNumero == 1234512345) {
                        tem1Fin1 = 1;
                        teoria.avance = 0;
                        JOptionPane.showOptionDialog(null, correct, "Correcto", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/correct.png", 40, 40), opciones, opciones[0]);
                        JOptionPane.showMessageDialog(null, "Felicidades, terminaste la lección", "Lección terminada", JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/final.png", 40, 40));
                        new temas1().setVisible(true);
                        dispose();
                    } else if (respuestaTexto.equalsIgnoreCase("valor absoluto") || respuestaTexto.equals("segunda respuesta")) {
                        tem1Fin1 = 1;
                        teoria.avance = 0;
                        JOptionPane.showOptionDialog(null, correct, "Correcto", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/correct.png", 40, 40), opciones, opciones[0]);
                        JOptionPane.showMessageDialog(null, "Felicidades, terminaste la lección", "Lección terminada", JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/final.png", 40, 40));
                        new temas1().setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }
            }
        }
    }

    }//GEN-LAST:event_btnSiguienteMouseClicked

    private void txtRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespuestaActionPerformed

    private void txtRespuestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRespuestaMouseClicked
        txtRespuesta.setText("");
        txtRespuesta.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_txtRespuestaMouseClicked

    private void txtRespuestaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRespuestaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespuestaMouseEntered

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        cerrar.setBackground(Color.red);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        if (materias.materias == 1){
            cerrar.setBackground(new Color(144, 12, 63));
        }else if (materias.materias == 2){
            cerrar.setBackground(new Color(4, 27, 135));
        }else if (materias.materias == 3){
            cerrar.setBackground(new Color(22, 86, 35));
        }else if (materias.materias ==4){
            cerrar.setBackground(new Color(210, 121, 0));
        }
    }//GEN-LAST:event_jLabel2MouseExited

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
            java.util.logging.Logger.getLogger(ejercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraTa;
    private javax.swing.JLabel btnSiguiente;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JPanel cerrar;
    private javax.swing.JLabel imgCalDif;
    private javax.swing.JLabel imgCalFin;
    private javax.swing.JLabel imgFis;
    private javax.swing.JLabel imgQuim;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtNomMat;
    private javax.swing.JTextField txtNomTem;
    private javax.swing.JTextField txtRespuesta;
    private javax.swing.JTextArea txtTexto;
    // End of variables declaration//GEN-END:variables

    private Icon getIcon(String path, int w, int h) {
        return new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(w, h, 0));
    }
}
