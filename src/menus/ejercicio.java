
package menus;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ejercicio extends javax.swing.JFrame {
    
    public void ejer1 (){
        teoria.avance++;
        JOptionPane.showOptionDialog(null, correct, "Correcto", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/correct.png", 40, 40), opciones, opciones[0]);
        new ejercicio().setVisible(true);
        dispose();
    }
    
    public void ejer2 (){
        teoria.avance = 0;
        JOptionPane.showOptionDialog(null, correct, "Correcto", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/correct.png", 40, 40), opciones, opciones[0]);
        JOptionPane.showMessageDialog(null, "Felicidades, terminaste la lección", "Lección terminada", JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/final.png", 40, 40));
        new temas1().setVisible(true);
        dispose();
    }

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
    
    public static int tem5Fin1;
    public static int tem5Fin2;
    public static int tem5Fin3;
    public static int tem5Fin4;
    public static int tem5Fin5;
    public static int tem5Fin6;
    public static int tem5Fin7;
    public static int tem5Fin8;
    
    public ejercicio() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/logo.png")).getImage()); 
        
        
        txtNomTem.setEditable(false);
        txtNomMat.setEditable(false);
        
        imgConta.setVisible(false);imgCalDif.setVisible(false); imgFis.setVisible(false); imgQuim.setVisible(false); imgCalFin.setVisible(false);
        
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
                        txtTexto.setText("¿Es {(1,2),(1,3)} una función?");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio");  
                        txtTexto.setText("Clasifica f(x) = |x| según su tipo.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 2){
                    txtNomTem.setText("Representación gráfica de funciones"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1");  
                        txtTexto.setText("Grafica f(x) = -x + 2.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2");  
                        txtTexto.setText("Aplica el criterio de la recta vertical. ");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 3){
                    txtNomTem.setText("Evaluación y operaciones con funciones "); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1");  
                        txtTexto.setText("Si f(x) = 2x + 1, encuentra f(4).");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2");  
                        txtTexto.setText("Si f(x) = x², g(x) = x, calcula (f · g)(x).");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 4){
                    txtNomTem.setText(" Noción de límite y sus teoremas"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1");  
                        txtTexto.setText("Calcula lim(x→1)(3x + 2). ");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2");  
                        txtTexto.setText("Resuelve lim(x→2)(x)(x + 1). ");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 5){
                    txtNomTem.setText("Tipos de límites y formas indeterminadas"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1");  
                        txtTexto.setText("Calcula lim(x→3)(x²−9)/(x−3). ");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2");  
                        txtTexto.setText("Identifica la forma indeterminada de lim(x→1)(x²−1)/(x−1). ");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 6){
                    txtNomTem.setText("Aplicación de los teoremas de límites "); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1");  
                        txtTexto.setText("Calcula lim(x→1)(x² + x). ");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2");  
                        txtTexto.setText("Resuelve lim(x→2)(x²−4)/(x−2). ");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 7){
                    txtNomTem.setText(" Continuidad y discontinuidad de una función "); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1");  
                        txtTexto.setText("Clasifica f(x) = |x| como continua o discontinua. ");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2");  
                        txtTexto.setText("¿f(x) = 1/(x−3) es continua? ");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 8){
                    txtNomTem.setText("Tema 8"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1");  
                        txtTexto.setText("Intervalo de continuidad de f(x) = √(x + 5). ");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2");  
                        txtTexto.setText("Dominio de f(x) = 1/(x²−1). ");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
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
                    txtNomTem.setText("Presión Hidrostática"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1");  
                        txtTexto.setText("Calcula la presión a 3 m bajo el agua.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2");  
                        txtTexto.setText("¿Qué pasa si duplicamos la profundidad?");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 5){
                    txtNomTem.setText("Principio de Pascal"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1");  
                        txtTexto.setText("Área chica = 2 cm², fuerza = 20 N\n" +
                        "Área grande = 10 cm²\n"+
                        "¿Cuàl es la fuerza transmitida?");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2");  
                        txtTexto.setText("Si duplico el área del pistón grande,\n" +
                        "¿qué pasa con la fuerza?");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 6){
                    txtNomTem.setText("Principio de Arquímedes"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1");  
                        txtTexto.setText("Un cuerpo desplaza 0.005 m³ de agua\n"
                                + "Calcula el empuje");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2");  
                        txtTexto.setText("Un objeto pesa 30 N y recibe un empuje\n" +
                        "de 35 N. ¿Flota?");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 7){
                    txtNomTem.setText("Viscosidad"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1");  
                        txtTexto.setText("Un líquido tiene una viscosidad de 0.89 Pa·s. ¿Qué tipo de fluido podría\n" +
                        "ser si se comporta como el agua a 25°C?");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2");  
                        txtTexto.setText("Se hace fluir glicerina (viscosidad 1.5 Pa·s) y agua (0.001 Pa·s) por un\n" +
                        "mismo tubo bajo la misma presión. ¿Cuál fluirá más rápido?");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 8){
                    txtNomTem.setText("Prensa Hidráulica"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1");  
                        txtTexto.setText("En una prensa hidráulica, el émbolo pequeño tiene un área de 10 cm² y\n" +
                        "se aplica una fuerza de 100 N. Si el émbolo grande tiene un área de 200 cm², ¿cuál\n" +
                        "es la fuerza generada en el émbolo grande?");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2");  
                        txtTexto.setText("Se necesita levantar una carga de 5000 N y el área del pistón mayor es\n" +
                        "de 250 cm². ¿Qué fuerza se debe aplicar en un pistón de 25 cm²?");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                }
            }else if (Parcial.parcial == 2){
                if (temas1.tema == 1){
                    txtNomTem.setText("Estado gaseoso"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1");  
                        txtTexto.setText(" Un gas ocupa 2 L a una presión de 1 atm. Si se comprime hasta 1 L sin\n" +
"cambiar la temperatura, ¿cuál será la nueva presión?");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2");  
                        txtTexto.setText("Un gas ocupa 3 L a 300 K. ¿Qué volumen ocupará a 400 K, si la presión\n" +
"es constante?");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                }else if (temas1.tema ==2){
                    txtNomTem.setText("Temperatura y escalas"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1");  
                        txtTexto.setText("Convierte 300 K a grados Celsius.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2");  
                        txtTexto.setText("Convierte 20 °C a Kelvin.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                }
            }
        }else if (materias.materias == 4){
            barraTa.setBackground(new Color(210, 121, 0));
            cerrar.setBackground(new Color(210, 121, 0));
            jPanel2.setBackground(new Color(210, 121, 0));
            txtNomMat.setBackground(new Color(210, 121, 0));
            txtNomTem.setBackground(new Color(210, 121, 0));
            
            txtNomMat.setText("Càlculos financieros");
            imgCalFin.setVisible(true);
            
            if (Parcial.parcial == 1){
                if (temas1.tema == 1){   // Detector tema
                    txtNomTem.setText("Interés compuesto"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1");  
                                txtTexto.setText("Calcula el interés compuesto para una inversión\nde $10,000 al 2% mensual\ndurante 6 meses.\n\nI = C[(1+t)^n – 1] = ?");

                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 ");  
                                txtTexto.setText("Inviertes $15,000 a una tasa de 1.5% mensual\npor 8 meses.\nCalcula el interés compuesto.\n\nI = C[(1+t)^n – 1] = ?");
                    }
                    
                }else if (temas1.tema == 2){
                    txtNomTem.setText("Tema 2"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 ");  
                                txtTexto.setText("Calcula el valor actual de pagos quincenales\nde $900 durante 24 quincenas\na una tasa del 1.3% quincenal.\n\nA = P[1 – (1+t)^-n]/t = ?");

                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 "); 
                                txtTexto.setText("¿Cuánto deberías tener hoy para obtener $50,000\nen 18 quincenas si se aplica\nuna tasa de 1.1% por quincena?\n\nA = P[1 – (1+t)^-n]/t = ?");

                    }
                    
                }else if (temas1.tema == 3){
                    txtNomTem.setText("Tema 3"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1 ");  
                                txtTexto.setText("Calcula el monto acumulado con depósitos\nde $4,000 cada trimestre\npor 16 periodos a una tasa de 2% trimestral.\n\nS = P[(1+t)^n – 1]/t = ?");

                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2 ");
                                txtTexto.setText("¿Cuál es el monto final si depositas $2,000 bimestrales\ndurante 30 bimestres a una tasa del 2.2% bimestral?\n\nS = P[(1+t)^n – 1]/t = ?");

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
            
            txtNomMat.setText("Quìmica");
            imgQuim.setVisible(true);
            
            if (Parcial.parcial == 1){
                if (temas1.tema == 1){   // Detector tema
                    txtNomTem.setText("Balanceo de ecuaciones químicas"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1");  
                        txtTexto.setText("(Ecuación no balanceada) H₂ + O₂ → H₂O ");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2");  
                        txtTexto.setText("(Ecuación no balanceada)  Al + O₂ → Al₂O₃ ");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 2){
                    txtNomTem.setText("Balanceo con múltiples compuestos"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1");  
                        txtTexto.setText("(Ecuación no balanceada) C₂H₆ + O₂ → CO₂ + H₂O ");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2");  
                        txtTexto.setText("(Ecuación no balanceada) CH₃OH + O₂ → CO₂ + H₂O");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
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
            imgConta.setVisible(true);
            
            if (Parcial.parcial == 1){
                if (temas1.tema == 1){   // Detector tema
                    txtNomTem.setText("PEPS"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1");  
                        txtTexto.setText("Compra: 8 a $20 y 6 a $25. Se venden 10.\n" +
"a) Costo total usando PEPS\n" +
"b) Inventario final (unidades y valor)");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2");  
                        txtTexto.setText("Compra: 12 a $14 y 10 a $16. Se venden 15.\n" +
"Calcula:\n" +
"a) Costo de venta con PEPS\n" +
"b) Inventario final");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 2){
                    txtNomTem.setText("Tema 2"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1");  
                        txtTexto.setText("iCompra: 8 a $20 y 6 a $25. Se venden 10.\n" +
"a) Costo total usando LIFO\n" +
"b) Inventario final");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2");  
                        txtTexto.setText("Compra: 12 a $14 y 10 a $16. Se venden 15.\n" +
"Calcula:\n" +
"a) Costo de venta con LIFO\n" +
"b) Inventario final");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 3){
                    txtNomTem.setText("Tema 3"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1");  
                        txtTexto.setText("Compra: 8 a $20 y 6 a $25. Se venden 10.\n"
                                + "a) Calcula el costo promedio\n" +
"b) Determina costo de venta e inventario");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2");  
                        txtTexto.setText("Compra: 12 a $14 y 10 a $16. Se venden 15.\n" +
"Calcula:\n" +
"a) Costo promedio\n" +
"b) Costo de venta\n" +
"c) Inventario final");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 4){
                    txtNomTem.setText("Tema 4"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2");  
                        txtTexto.setText("informacion del ejercicio 2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 5){
                    txtNomTem.setText("Tema 5"); // Editar nombre de tema
                    
                    if(teoria.avance == 3){   // Detector ejercicio
                        txtRespuesta.setText("Respuesta a ejercicio 1");  
                        txtTexto.setText("informacion del ejercicio 1");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else if (teoria.avance == 4){  
                        txtRespuesta.setText("Respuesta a ejercicio 2");  
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
        imgConta = new javax.swing.JLabel();
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
        jPanel2.add(txtNomTem, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 630, 40));

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
                        ejer1();
                    } else if (respuestaTexto.equalsIgnoreCase("No")) {
                        ejer1();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                } else if (teoria.avance == 4) {
                    if (esNumero && respuestaNumero == 1234512345) {
                        tem1Fin1 = 1;
                        ejer2();
                    } else if (respuestaTexto.equalsIgnoreCase("valor absoluto") || respuestaTexto.equals("segunda respuesta")) {
                        tem1Fin1 = 1;
                        ejer2();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }
           }else if (temas1.tema == 2){
               if (teoria.avance == 3) {
                    if (esNumero && respuestaNumero == 1234512345) {
                        ejer1();
                    } else if (respuestaTexto.equalsIgnoreCase("recta con pendiente")) {
                        ejer1();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }else if (teoria.avance == 4) {
                    if (esNumero && respuestaNumero == 1234512345) {
                        
                    } else if (respuestaTexto.equalsIgnoreCase("Si corta 2 veces no es funcion")) {
                        tem1Fin2 = 1;
                        ejer2();
                    } else {    
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }
            }else if (temas1.tema == 3){
               if (teoria.avance == 3) {
                    if (esNumero && respuestaNumero == 9) {
                        ejer1();
                    } else if (respuestaTexto.equalsIgnoreCase("res txt")) {
                        
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }else if (teoria.avance == 4) {
                    if (esNumero && respuestaNumero == 1234512345) {
                        
                    } else if (respuestaTexto.equalsIgnoreCase("x³")|| respuestaTexto.equals("x^3")) {
                        tem1Fin3 = 1;
                        ejer2();
                    } else {    
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }
            }else if (temas1.tema == 4){
               if (teoria.avance == 3) {
                    if (esNumero && respuestaNumero == 5) {
                        ejer1();
                    } else if (respuestaTexto.equalsIgnoreCase("res txt")) {
                        
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }else if (teoria.avance == 4) {
                    if (esNumero && respuestaNumero == 6) {
                        tem1Fin4 = 1;
                        ejer2();
                    } else if (respuestaTexto.equalsIgnoreCase("x³")|| respuestaTexto.equals("x^3")) {
                        
                    } else {    
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }
            }else if (temas1.tema == 5){
               if (teoria.avance == 3) {
                    if (esNumero && respuestaNumero == 6) {
                        ejer1();
                    } else if (respuestaTexto.equalsIgnoreCase("res txt")) {
                        
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }else if (teoria.avance == 4) {
                    if (esNumero && respuestaNumero == 6) {
                        
                    } else if (respuestaTexto.equalsIgnoreCase("forma indeterminada")|| respuestaTexto.equals("indeterminda")) {
                        tem1Fin5 = 1;
                        ejer2();
                    } else {    
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }
            }else if (temas1.tema == 6){
               if (teoria.avance == 3) {
                    if (esNumero && respuestaNumero == 2) {
                        ejer1();
                    } else if (respuestaTexto.equalsIgnoreCase("res txt")) {
                        
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }else if (teoria.avance == 4) {
                    if (esNumero && respuestaNumero == 4) {
                        tem1Fin6 = 1;
                        ejer2();
                    } else if (respuestaTexto.equalsIgnoreCase("forma indeterminada")|| respuestaTexto.equals("indeterminda")) {
                        
                    } else {    
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }
            }else if (temas1.tema == 7){
               if (teoria.avance == 3) {
                    if (esNumero && respuestaNumero == 2) {
                        
                    } else if (respuestaTexto.equalsIgnoreCase("continua")) {
                        ejer1();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }else if (teoria.avance == 4) {
                    if (esNumero && respuestaNumero == 4) {
                        
                    } else if (respuestaTexto.equalsIgnoreCase("no")) {
                        tem1Fin7 = 1;
                        ejer2();
                    } else {    
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }
            }else if (temas1.tema == 8){
               if (teoria.avance == 3) {
                    if (esNumero && respuestaNumero == 2) {
                        
                    } else if (respuestaTexto.equalsIgnoreCase("[−5, ∞)")) {
                        ejer1();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }else if (teoria.avance == 4) {
                    if (esNumero && respuestaNumero == 4) {
                        
                    } else if (respuestaTexto.equalsIgnoreCase("(−∞,−1)(−1,1)(1,∞)")) {
                        tem1Fin8 = 1;
                        ejer2();
                    } else {    
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }
            }
        } 
    }else if (materias.materias == 2){           //Fisica
        if (Parcial.parcial == 1) {              //Fisica parcial 1
            if (temas1.tema == 1) {
                if (teoria.avance == 3) {
                    if (esNumero && respuestaNumero == 23102008) {
                        ejer1();
                    } else if (respuestaTexto.equalsIgnoreCase("5N")) {
                        ejer1();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                } else if (teoria.avance == 4) {
                    if (esNumero && respuestaNumero == 23102008) {
                        tem2p1Fin1 = 1;
                        ejer2();
                    } else if (respuestaTexto.equalsIgnoreCase("0.04m") || respuestaTexto.equals("40mm")) {
                        tem2p1Fin1 = 1;
                        ejer2();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }
           }else if (temas1.tema == 2){
               if (teoria.avance == 3) {
                    if (esNumero && respuestaNumero == 23102008) {
                        ejer1();
                    } else if (respuestaTexto.equalsIgnoreCase("5×10⁷Pa")|| respuestaTexto.equals("5x10^7Pa")|| respuestaTexto.equals("50000000pa")) {
                        ejer1();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                } else if (teoria.avance == 4) {
                    if (esNumero && respuestaNumero == 23102008) {
                        tem2p1Fin2 = 1;
                        ejer2();
                    } else if (respuestaTexto.equalsIgnoreCase("1×10⁵N") || respuestaTexto.equals("1×10^5N")|| respuestaTexto.equals("100000N")) {
                        tem2p1Fin2 = 1;
                        ejer2();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }
           }else if (temas1.tema == 3){
               if (teoria.avance == 3) {
                    if (esNumero && respuestaNumero == 23082008) {
                        ejer1();
                    } else if (respuestaTexto.equalsIgnoreCase("5g/cm³")|| respuestaTexto.equals("5g/cm^3")) {
                        ejer1();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                } else if (teoria.avance == 4) {
                    if (esNumero && respuestaNumero == 23102008) {
                        tem2p1Fin3 = 1;
                        ejer2();
                    } else if (respuestaTexto.equalsIgnoreCase("200g")) {
                        tem2p1Fin2 = 1;
                        ejer2();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }
           }else if (temas1.tema == 4){
               if (teoria.avance == 3) {
                    if (esNumero && respuestaNumero == 23082008) {
                        ejer1();
                    } else if (respuestaTexto.equalsIgnoreCase("29430Pa")) {
                        ejer1();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                } else if (teoria.avance == 4) {
                    if (esNumero && respuestaNumero == 23102008) {
                        tem2p1Fin4 = 1;
                        ejer2();
                    } else if (respuestaTexto.equalsIgnoreCase("se duplica")|| respuestaTexto.equals("duplica")) {
                        tem2p1Fin4 = 1;
                        ejer2();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }
           }else if (temas1.tema == 5){
               if (teoria.avance == 3) {
                    if (esNumero && respuestaNumero == 23082008) {
                        ejer1();
                    } else if (respuestaTexto.equalsIgnoreCase("100N")) {
                        ejer1();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                } else if (teoria.avance == 4) {
                    if (esNumero && respuestaNumero == 23102008) {
                        tem2p1Fin5 = 1;
                        ejer2();
                    } else if (respuestaTexto.equalsIgnoreCase("se duplica")|| respuestaTexto.equals("duplica")) {
                        tem2p1Fin5 = 1;
                        ejer2();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }
           }else if (temas1.tema == 6){
               if (teoria.avance == 3) {
                    if (esNumero && respuestaNumero == 23082008) {
                        ejer1();
                    } else if (respuestaTexto.equalsIgnoreCase("49.05N")) {
                        ejer1();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                } else if (teoria.avance == 4) {
                    if (esNumero && respuestaNumero == 23102008) {
                        tem2p1Fin6 = 1;
                        ejer2();
                    } else if (respuestaTexto.equalsIgnoreCase("si")) {
                        tem2p1Fin6 = 1;
                        ejer2();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }
           }else if (temas1.tema == 7){
               if (teoria.avance == 3) {
                    if (esNumero && respuestaNumero == 23082008) {
                        ejer1();
                    } else if (respuestaTexto.equalsIgnoreCase("agua")|| respuestaTexto.equals("el agua")) {
                        ejer1();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                } else if (teoria.avance == 4) {
                    if (esNumero && respuestaNumero == 23102008) {
                        tem2p1Fin7 = 1;
                        ejer2();
                    } else if (respuestaTexto.equalsIgnoreCase("agua")|| respuestaTexto.equals("el agua")) {
                        tem2p1Fin7 = 1;
                        ejer2();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }
           }else if (temas1.tema == 8){
               if (teoria.avance == 3) {
                    if (esNumero && respuestaNumero == 23082008) {
                        ejer1();
                    } else if (respuestaTexto.equalsIgnoreCase("2000N")) {
                        ejer1();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                } else if (teoria.avance == 4) {
                    if (esNumero && respuestaNumero == 23102008) {
                        tem2p1Fin8 = 1;
                        ejer2();
                    } else if (respuestaTexto.equalsIgnoreCase("500N")) {
                        tem2p1Fin8 = 1;
                        ejer2();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }
            }
        }else if (Parcial.parcial == 2){
            if (temas1.tema == 1){
               if (teoria.avance == 3) {
                    if (esNumero && respuestaNumero == 23082008) {
                        ejer1();
                    } else if (respuestaTexto.equalsIgnoreCase("2atm")) {
                        ejer1();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                } else if (teoria.avance == 4) {
                    if (esNumero && respuestaNumero == 23102008) {
                        tem2p1Fin8 = 1;
                        ejer2();
                    } else if (respuestaTexto.equalsIgnoreCase("4L")) {
                        tem2p1Fin8 = 1;
                        ejer2();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }
            }else if (temas1.tema == 2){
               if (teoria.avance == 3) {
                    if (esNumero && respuestaNumero == 23082008) {
                        ejer1();
                    } else if (respuestaTexto.equalsIgnoreCase("26.85 °C")) {
                        ejer1();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                } else if (teoria.avance == 4) {
                    if (esNumero && respuestaNumero == 23102008) {
                        tem2p1Fin8 = 1;
                        ejer2();
                    } else if (respuestaTexto.equalsIgnoreCase("293.15 K")) {
                        tem2p1Fin8 = 1;
                        ejer2();
                    } else {
                        JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }
            }
        }
    }else if (materias.materias == 4){
        if (Parcial.parcial == 1) { // Finanzas parcial 1
    if (temas1.tema == 1) { // Interés compuesto
        if (teoria.avance == 3) {
            if (esNumero && respuestaNumero == 1236.0) {
                ejer1();
            } else if (respuestaTexto.equalsIgnoreCase("$1236") || respuestaTexto.equals("1236")) {
                ejer1();
            } else {
                JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
            }
        } else if (teoria.avance == 4) {
            if (esNumero && respuestaNumero == 1870.64) {
                tem4Fin1 = 1;
                ejer2();
            } else if (respuestaTexto.equalsIgnoreCase("$1870.64") || respuestaTexto.equals("1870.64")) {
                tem4Fin1 = 1;
                ejer2();
            } else {
                JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
            }
        }
    } else if (temas1.tema == 2) { // Valor actual
        if (teoria.avance == 3) {
            if (esNumero && respuestaNumero == 17602.93) {
                ejer1();
            } else if (respuestaTexto.equalsIgnoreCase("$17602.93") || respuestaTexto.equals("17602.93")) {
                ejer1();
            } else {
                JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
            }
        } else if (teoria.avance == 4) {
            if (esNumero && respuestaNumero == 35376.02) {
                tem4Fin2 = 1;
                ejer2();
            } else if (respuestaTexto.equalsIgnoreCase("$35376.02") || respuestaTexto.equals("35376.02")) {
                tem4Fin2 = 1;
                ejer2();
            } else {
                JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
            }
        }
    } else if (temas1.tema == 3) { // Monto de anualidad
        if (teoria.avance == 3) {
            if (esNumero && respuestaNumero == 86965.36) {
                ejer1();
            } else if (respuestaTexto.equalsIgnoreCase("$86965.36") || respuestaTexto.equals("86965.36")) {
                ejer1();
            } else {
                JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
            }
        } else if (teoria.avance == 4) {
            if (esNumero && respuestaNumero == 95383.59) {
                tem4Fin3 = 1;
                ejer2();
            } else if (respuestaTexto.equalsIgnoreCase("$95383.59") || respuestaTexto.equals("95383.59")) {
                                tem4Fin3 = 1;
ejer2();
            } else {
                JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
            }
        }
    }
}
    }else if (materias.materias == 3){
        if(Parcial.parcial==1){
            if(temas1.tema==1){
                if(teoria.avance==3){
                    if (respuestaTexto.equalsIgnoreCase("2H2 + O2 -> 2H2O")) {
                        tem3Fin1=1;
                        ejer1();
                    } else {
                    JOptionPane.showOptionDialog(null, "La ecuación es incorrecta, intenta de nuevo", "Incorrecta", 
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, 
                    getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }else if (teoria.avance==4){
                     if (respuestaTexto.equalsIgnoreCase("4Al + 3O2 -> 2Al2O3")) {
                ejer2();
            } else {
                JOptionPane.showOptionDialog(null, "La ecuación es incorrecta, intenta de nuevo", "Incorrecta", 
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, 
                    getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
            }
                }
            }else if (temas1.tema==2){
                if(teoria.avance==3){
                    if (respuestaTexto.equalsIgnoreCase("2C2H6 + 7O2 -> 4CO2 + 6H2O")) {
                        ejer1();
                    } else {
                    JOptionPane.showOptionDialog(null, "La ecuación es incorrecta, intenta de nuevo", "Incorrecta", 
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, 
                    getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
                    }
                }else if (teoria.avance==4){
                     if (respuestaTexto.equalsIgnoreCase("2CH3OH + 3O2 -> 2CO2 + 4H2O")) {
                         tem3Fin2=1;
                ejer2();
            } else {
                JOptionPane.showOptionDialog(null, "La ecuación es incorrecta, intenta de nuevo", "Incorrecta", 
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, 
                    getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
            }
                }
            }
        }
    }else if (materias.materias == 5){
        if (Parcial.parcial == 1) { // Finanzas parcial 1
    if (temas1.tema == 1) { // PEPS
        if (teoria.avance == 3) {
            if (esNumero && respuestaNumero == 210.0) {
                ejer1();
            } else if (respuestaTexto.equalsIgnoreCase("$210") || respuestaTexto.equals("210")) {
                ejer1();
            } else {
                JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
            }
        } else if (teoria.avance == 4) {
            if (esNumero && respuestaNumero == 194.0) {
                tem5Fin1 = 1;
                ejer2();
            } else if (respuestaTexto.equalsIgnoreCase("$194") || respuestaTexto.equals("194")) {
                tem5Fin1 = 1;
                ejer2();
            } else {
                JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
            }
        }
    } else if (temas1.tema == 2) { // LIFO
        if (teoria.avance == 3) {
            if (esNumero && respuestaNumero == 215.0) {
                ejer1();
            } else if (respuestaTexto.equalsIgnoreCase("$215") || respuestaTexto.equals("215")) {
                ejer1();
            } else {
                JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
            }
        } else if (teoria.avance == 4) {
            if (esNumero && respuestaNumero == 198.0) {
                tem5Fin2 = 1;
                ejer2();
            } else if (respuestaTexto.equalsIgnoreCase("$198") || respuestaTexto.equals("198")) {
                tem5Fin2 = 1;
                ejer2();
            } else {
                    JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
            }
        }
    } else if (temas1.tema == 3) { // Costo Promedio
        if (teoria.avance == 3) {
            if (esNumero && respuestaNumero == 212.5) {
                ejer1();
            } else if (respuestaTexto.equalsIgnoreCase("$212.5") || respuestaTexto.equals("212.5")) {
                ejer1();
            } else {
                JOptionPane.showOptionDialog(null, "La respuesta es incorrecta, vuelve a intentarlo", "Incorrecta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, getIcon("/imagenes/error.png", 40, 40), opciones, opciones[0]);
            }
        } else if (teoria.avance == 4) {
            if (esNumero && respuestaNumero == 210.0) {
                tem5Fin3 = 1;
                ejer2();
            } else if (respuestaTexto.equalsIgnoreCase("$210") || respuestaTexto.equals("210")) {
                tem5Fin3 = 1;
                ejer2();
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
    private javax.swing.JLabel imgConta;
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
