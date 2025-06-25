
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
                    txtNomTem.setText("PEPS "); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("Compra: 5 a $10 y 5 a $15 → se venden 6 unidades.\n" +
"Se usan primero los de $10 y luego los de $15.\n" +
"Costo: 5×$10 + 1×$15 = $65. Inventario: 4 unidades.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("Compra: 10 a $12 y 10 a $18 → se venden 12 unidades.\n" +
"Se usan primero los de $12, luego los de $18.\n" +
"Costo: 10×$12 + 2×$18 = $156. Inventario: 8 productos.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 2){
                    txtNomTem.setText("LIFO"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("Compra: 5 a $10 y 5 a $15 → se venden 6 unidades.\n" +
"Se usan primero los de $15 y luego los de $10.\n" +
"Costo: 5×$15 + 1×$10 = $85. Inventario: 4 unidades");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("Compra: 10 a $12 y 10 a $18 → se venden 12 unidades.\n" +
"Se usan primero los de $18, luego los de $12.\n" +
"Costo: 10×$18 + 2×$12 = $216. Inventario: 8 productos.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 3){
                    txtNomTem.setText("Costo Promedio"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("Compra: 5 a $10 y 5 a $15 = 10 productos.\n" +
"Costo promedio = (5×10 + 5×15) ÷ 10 = $12.50\n" +
"Se venden 6 → costo = 6×$12.50 = $75. Inventario: 4×$12.50");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("Compra: 10 a $12 y 10 a $18 = 20 productos.\n" +
"Costo promedio = (120+180)÷20 = $15\n" +
"Se venden 12 → costo = 12×15 = $180. Inventario: 8×15 = $120");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
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
                    txtNomTem.setText("Interes compuesto"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("Inviertes $50,000 al 0.97% mensual por 3 meses.\n\nI = C[(1+t)^n – 1]\nI = 50,000[(1+0.0097)^3 – 1]\nI = 50,000[1.02938 – 1]\nI = 50,000[0.02938] = $1,469.16");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2"); 
                        txtTexto.setText("Depósitos de $3,000 cada 4 meses por 42 periodos\na 3.31% cuatrimestral.\n\nS = P[(1+t)^n – 1]/t\nS = 3,000[(1+0.0331)^42 – 1]/0.0331\nS = 3,000[2.92626]/0.0331 = $265,220.05");
                    }
                    
                }else if (temas1.tema == 2){
                    txtNomTem.setText("Valor actual"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                                txtTexto.setText("Pagos de $1,340 por 36 quincenas a 1.2% quincenal.\n\nA = P[1 – (1+t)^-n]/t\nA = 1,340[1 – (1+0.012)^-36]/0.012\nA = 1,340[0.34911]/0.012 = $38,985");
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                                txtTexto.setText("Inversión de $20,000 al 1.1% mensual por 6 meses.\n\nI = C[(1+t)^n – 1]\nI = 20,000[(1+0.011)^6 – 1]\nI = 20,000[0.06826] = $1,365.38");
                    }
                    
                }else if (temas1.tema == 3){
                    txtNomTem.setText("Tema 3"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1"); 
                                txtTexto.setText("Depósitos de $5,000 cada bimestre por 24 periodos\na una tasa del 2.1% bimestral.\n\nS = P[(1+t)^n – 1]/t\nS = 5,000[(1+0.021)^24 – 1]/0.021\nS = 5,000[0.61897]/0.021 = $147,373.81");

                    } else {
                        txtInstru.setText("Ejemplo 2");  
                                txtTexto.setText("Aportaciones trimestrales de $2,500 durante 20 trimestres\na una tasa del 2.5% trimestral.\n\nS = P[(1+t)^n – 1]/t\nS = 2,500[(1+0.025)^20 – 1]/0.025\nS = 2,500[0.63862]/0.025 = $63,862");
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
                    txtNomTem.setText("Balanceo de ecuaciones químicas"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");
                        jLabel1.setIcon(new ImageIcon(getClass().getResource("/imgQ/tem2.png")));
                        txtTexto.setText("");
                        txtTexto.setVisible(false);//Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("Fe₂O₃ + CO → Fe + CO₂\n" +
"El óxido de hierro reacciona con monóxido de carbono, produciendo hierro metálico y dióxido de carbono. \n" +
"\n" +
"El CO le quita oxígeno al óxido de hierro (Fe₂O₃) lo cual reduce el óxido a hierro metálico (Fe).\n" +
"\n" +
"Al mismo tiempo, el CO se oxida y se convierte en CO₂.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                    
                }else if (temas1.tema == 2){
                    txtNomTem.setText("Balanceo con múltiples compuestos"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        jLabel1.setIcon(new ImageIcon(getClass().getResource("/imgQ/tem4.png")));
                        txtTexto.setText("");
                        txtTexto.setVisible(false);//Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("   C₃H₈ + O₂ → CO₂ + H₂O\n" +
"Propano reacciona con oxígeno para formar dióxido de carbono y agua. Es una combustión completa, se debe balancear C, H y O.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
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
            }else if (Parcial.parcial == 2){
                if (temas1.tema == 1){
                    txtNomTem.setText("Estado Gaseoso"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText(" El aire en un neumático se comprime al aumentar la presión.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("2. El gas\n" +
"de una bombona se expande al liberarse, ocupando más espacio.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    }
                } else if (temas1.tema == 2){
                    txtNomTem.setText("Temperatura y escalas"); // Editar nombre de tema
                    
                    if(teoria.avance == 1){   // Detector ejemplo
                        txtInstru.setText("Ejemplo 1");  
                        txtTexto.setText("Convierte 25°c a F°\n" +
"Usamos la fórmula F= 1.8 • C + 32\n" +
"F = 1.8(25) + 32 = 45 + 32 = 77 °F\n" +
"El resultado es una temperatura en Fahrenheit.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    } else {
                        txtInstru.setText("Ejemplo 2");  
                        txtTexto.setText("Convierte 100 °F a C°\n" +
"C = (5/9)(100 − 32) = (5/9)(68) = 37.8 °C");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
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
        jLabel1 = new javax.swing.JLabel();

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
        jPanel2.add(txtNomTem, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 620, 40));

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
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 345, -1, -1));

        txtTexto.setEditable(false);
        txtTexto.setColumns(20);
        txtTexto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTexto.setRows(5);
        txtTexto.setBorder(null);
        jPanel3.add(txtTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 118, 701, 185));

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

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(691, 345, -1, -1));

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
        jPanel3.add(txtInstru, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 40, 686, 40));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 700, 180));

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
    private javax.swing.JLabel jLabel1;
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
