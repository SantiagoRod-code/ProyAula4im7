
package menus;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ejemplo extends javax.swing.JFrame {

    int xMouse, yMouse;
    String mensaje = "Seguro que quieres abandonar la leccion";
    
    public ejemplo() {
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
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("f(x) = 2x + 3. Entonces f(1) = 5 y f(2) = 7 por sustitución directa.\n"
                                + "Se multiplica x por 2 y se suma 3. Así se obtienen los valores de f(x)."); //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("f(x) = x². f(−2) = 4 y f(3) = 9. Se elevan los valores al cuadrado.\n"
                                + "Cada valor se sustituye en la función y se eleva al cuadrado.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 2){
                    txtNomTem.setText("Representación gráfica de funciones"); // Editatr nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("f(x) = x². Su gráfica es una parábola con vértice en el origen.\n"
                                + "La parábola surge al elevar x al cuadrado y es simétrica.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("f(x) = |x|. Tiene forma de \"V\", con vértice en (0,0).\n"
                                + "Los negativos se vuelven positivos y los positivos permanecen.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 3){
                    txtNomTem.setText("Evaluación y operaciones con funciones"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("f(x) = x + 2, g(x) = 3x → (f + g)(x) = 4x + 2.\n\n"
                                + "Se suman directamente los términos semejantes de ambas funciones.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("f(x) = x², g(x) = 2x → (f + g)(x) = x² + 2x.\n\n"
                                + "Los términos no semejantes se suman como están.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 4){
                    txtNomTem.setText("Noción de límite y sus teoremas"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("lim(x→2) x² = 4. Se sustituye directamente en la función.\n\n"
                                + "x² es continua, se evalúa directamente en x = 2: 2² = 4.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("lim(x→3)(2x + 1) = 7.\n\n"
                                + "Función polinómica continua: se sustituye x por 3.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 5){
                    txtNomTem.setText("Tipos de límites y formas indeterminadas"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("lim(x→0) 1/x. El límite tiende a ∞ o −∞, no existe como número finito.\n\n"
                                + "Depende del lado por el que te acerques; es un límite infinito.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("lim(x→2)(x²−4)/(x−2) = x + 2 → 4\n\n"
                                + "Se factoriza: (x−2)(x+2)/(x−2), se simplifica y evalúa.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 6){
                    txtNomTem.setText("Aplicación de los teoremas de límites"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("lim(x→−1)(x³ + x² + x + 1) = 0.\n\n"
                                + "Es polinomio continuo, se evalúa directamente: −1 + 1 −1 + 1 = 0.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("lim(x→2)(x²−4)/(x−2). Factoriza y luego evalúa.\n\n"
                                + "x²−4 = (x−2)(x+2), se simplifica y se evalúa x + 2 = 4.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 7){
                    txtNomTem.setText("Continuidad y discontinuidad de una función"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("f(x) = x² → continua en todos los reales.\n\n"
                                + "Es polinómica, cumple todas las condiciones de continuidad.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("f(x) = 1/(x−2) → discontinua en x = 2.\n\n"
                                + "El denominador se hace 0, hay asíntota vertical.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 8){
                    txtNomTem.setText("Intervalos de continuidad o discontinuidad"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("f(x) = (x + 2)/(x − 3) → continua en (−∞, 3) - (3, ∞)\n\n"
                                + "No está definida en x = 3 porque el denominador se hace 0.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("f(x) = √(x−1) → continua en [1, ∞)\n\n"
                                + "La raíz solo existe si x−1 ≥ 0, es decir x ≥ 1.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
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
                    txtNomTem.setText("Masa"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("Una pelota de fútbol tiene una masa de 450 gramos. Aunque esté en la Tierra o en la Luna, su masa no cambia.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
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
            barraTa.setBackground(new Color(22, 86, 35));
            cerrar.setBackground(new Color(22, 86, 35));
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
        }else if (materias.materias == 2){
            barraTa.setBackground(new Color(4, 27, 135));
            cerrar.setBackground(new Color(4, 27, 135));
            jPanel2.setBackground(new Color(4, 27, 135));
            txtNomMat.setBackground(new Color(4, 27, 135));
            txtNomTem.setBackground(new Color(4, 27, 135));
            
            txtNomMat.setText("Fìsica");
            imgFis.setVisible(true);
            
            if (Parcial.parcial == 1){
                if (temas1.tema == 1){   // Detector tema
                    txtNomTem.setText("Ley de hooke"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("Un resorte tiene k = 200 N/m y se estira 0.1 m.\n" +
                        "F = -k·x = -200·0.1 = -20 N\n" +
                        "El signo negativo indica fuerza opuesta al alargamiento.\n" +
                        "La fuerza restauradora es de 20 N hacia el equilibrio.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("Si una masa de 2 kg cuelga de un resorte, ¿cuánto se estira?\n" +
                        "F = m·g = 2·9.8 = 19.6 N\n" +
                        "Si k = 245 N/m, entonces x = F/k = 19.6/245 = 0.08 m\n" +
                        "El resorte se alarga 8 cm debido al peso de la masa.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 2){
                    txtNomTem.setText("Módulo de Young"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("Un alambre de 1 m se alarga 1 mm con 500 N de fuerza.\n" +
                        "A = 1 mm² = 1×10⁻⁶ m², ΔL = 0.001 m, L = 1 m\n" +
                        "E = (500×1)/(1×10⁻⁶ × 0.001) = 5×10¹¹ Pa\n" +
                        "Muestra un material muy rígido, como el acero.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("Una barra de 2 m y área 0.01 m² se alarga 0.002 m.\n" +
                        "F = 200 N, E = (200×2)/(0.01×0.002) = 2×10⁷ Pa\n" +
                        "Un valor bajo indica material más elástico.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 3){
                    txtNomTem.setText("Densidad"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("Una piedra pesa 500 g y ocupa 200 cm³.\n" +
                        "ρ = m/V = 500/200 = 2.5 g/cm³\n" +
                        "Como es más densa que el agua, se hunde.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("Un cilindro de masa 2 kg y volumen 0.001 m³.\n" +
                        "ρ = 2 / 0.001 = 2000 kg/m³\n" +
                        "Es más denso que el agua, no flota.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 4){
                    txtNomTem.setText("Presión Hidrostática"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("Un buzo está a 5 m bajo el agua.\n" +
                        "Densidad del agua: 1000 kg/m³\n" +
                        "Presión: P = 1000×9.81×5 = 49050 Pa\n" +
                        "Esa es la presión que siente el buzo.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("En una piscina, a 2 m de profundidad:\n" +
                        "P = 1000×9.81×2 = 19620 Pa\n" +
                        "Presión aumenta con la profundidad.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 5){
                    txtNomTem.setText("Principio de Pascal"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("Una fuerza de 10 N sobre un pistón pequeño\n" +
                        "se transmite al pistón grande.\n" +
                        "El pistón grande ejerce más fuerza.\n" +
                        "Se basa en que P = F/A es constante.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("En un gato hidráulico, el área del pistón\n" +
                        "grande es 5 veces mayor.\n" +
                        "La fuerza transmitida se multiplica por 5");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 6){
                    txtNomTem.setText("Principio de Arquímedes"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("Un bloque de 2 L de volumen en agua:\n" +
                        "E = 1000×9.81×0.002 = 19.62 N\n" +
                        "Empuje compensa su peso parcialmente.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("Un objeto flota si el empuje ≥ su peso.\n" +
                        "Si se hunde, el empuje es menor que el peso");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 7){
                    txtNomTem.setText("Viscosidad"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("La miel fluye más lento que\n" +
                        "el agua debido a su alta viscosidad. 2. El aceite de motor cambia su viscosidad con\n" +
                        "la temperatura: se vuelve más fluido cuando se calienta.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("La lava fluye lentamente por su alta viscosidad,\n" +
                        "lo que le impide desplazarse con rapidez.\n" +
                        "El jarabe se vuelve más líquido al calentarse,\n" +
                        "pues la temperatura reduce su viscosidad.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 8){
                    txtNomTem.setText("Prensa hidràulica"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("Un elevador hidráulico puede levantar autos aplicando una fuerza\n" +
                        "pequeña sobre un émbolo delgado. El fluido transmite la presión\n" +
                        "a un émbolo más grande, multiplicando la fuerza según el principio\n" +
                        "de Pascal. Esto permite levantar objetos muy pesados con poco esfuerzo.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("Una prensa hidráulica comprime materiales al aplicar presión en\n" +
                        "un émbolo pequeño. Esta presión se transmite a otro de mayor área,\n" +
                        "generando una fuerza mucho mayor. Así, se pueden moldear o cortar\n" +
                        "materiales sólidos con gran eficacia y precisión.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
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
        txtInstru = new javax.swing.JTextField();

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
        jPanel2.add(txtNomTem, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 500, 40));

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
        jPanel2.add(txtNomMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 340, 40));

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
        txtTexto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
                    .addComponent(txtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(43, Short.MAX_VALUE)))
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
    private javax.swing.JTextField txtInstru;
    private javax.swing.JTextField txtNomMat;
    private javax.swing.JTextField txtNomTem;
    private javax.swing.JTextArea txtTexto;
    // End of variables declaration//GEN-END:variables

    private Icon getIcon(String path, int w, int h) {
        return new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(w, h, 0));
    }
}
