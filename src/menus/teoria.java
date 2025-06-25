
package menus;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class teoria extends javax.swing.JFrame {

    int xMouse, yMouse;
    String mensaje = "Seguro que quieres abandonar la leccion"; 
    
    public static int avance;
    
    public teoria() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/logo.png")).getImage()); 
        
        
        txtNomTem.setEditable(false);
        txtNomMat.setEditable(false);
        
        imgConta.setVisible(false);imgCalDif.setVisible(false); imgFis.setVisible(false); imgQuim.setVisible(false); imgCalFin.setVisible(false);
        
        if (materias.materias == 1){
            barraTa.setBackground(new Color(144, 12, 63));
            cerrar.setBackground(new Color(144, 12, 63));
            jPanel2.setBackground(new Color(144, 12, 63));
            txtNomMat.setBackground(new Color(144, 12, 63));
            txtNomTem.setBackground(new Color(144, 12, 63));
            
            txtNomMat.setText("Cálculo diferencial");
            imgCalDif.setVisible(true);
            
            if (Parcial.parcial == 1){
                if (temas1.tema == 1){
                    txtNomTem.setText("Definición de una Función"); // Editar nombre de tema
                    txtTexto.setText("Una función asigna a cada entrada un único valor de salida posible.\n" +
                    "El conjunto de partida se llama dominio; el de llegada, codominio.\n" +
                    "No puede haber dos salidas diferentes para una misma entrada.\n" +
                    "Se clasifican como lineales, cuadráticas, racionales, entre otras.\n" +
                    "El valor absoluto, por ejemplo, define una función no lineal.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 2){
                    txtNomTem.setText("Representación gráfica de funciones"); // Editar nombre de tema
                    txtTexto.setText("Una función se grafica usando pares ordenados (x, f(x)) en el plano.\n" +
                    "Las gráficas permiten visualizar su comportamiento y propiedades.\n" +
                    "f(x) = x² tiene forma de parábola abierta hacia arriba.\n" +
                    "f(x) = |x| es una gráfica con forma de \"V\" simétrica.\n" +
                    "El criterio de la recta vertical permite verificar si es función.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 3){
                    txtNomTem.setText("Evaluación y operaciones con funciones"); // Editar nombre de tema
                    txtTexto.setText("Evaluar significa sustituir x por un valor en la función dada.\n" +
                    "Las funciones se pueden sumar, restar, multiplicar o dividir.\n" +
                    "(f + g)(x) se obtiene sumando f(x) y g(x).\n" +
                    "Igual ocurre con resta o multiplicación: operar por componentes.\n" +
                    "Es útil para combinar modelos o simplificar expresiones.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 4){
                    txtNomTem.setText("Noción de límite y sus teoremas"); // Editar nombre de tema
                    txtTexto.setText("El límite es el valor que f(x) se aproxima cuando x tiende a un número.\n" +
                    "Se puede calcular por sustitución directa si no hay indeterminaciones.\n" +
                    "Algunas propiedades: suma, resta, producto y cociente de límites.\n" +
                    "Los límites existen si la función es continua en ese punto.\n" +
                    "También pueden ser usados para describir el comportamiento cercano.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 5){
                    txtNomTem.setText("Tipos de límites y formas indeterminadas"); // Editar nombre de tema
                    txtTexto.setText("Límites pueden ser laterales, infinitos o hacia infinito.\n" +
                    "Las formas indeterminadas como 0/0 requieren simplificación.\n" +
                    "Se puede usar factorización, conjugada o división por x.\n" +
                    "Los límites infinitos implican crecimiento o decrecimiento sin fin.\n" +
                    "Las indeterminaciones se resuelven antes de evaluar.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 6){
                    txtNomTem.setText("Aplicación de los teoremas de límites"); // Editar nombre de tema
                    txtTexto.setText("Los teoremas permiten evaluar límites de forma estructurada.\n" +
                    "Se puede usar factorización, simplificación o propiedades.\n" +
                    "Cuando hay indeterminación, se deben transformar las expresiones.\n" +
                    "Los polinomios permiten sustitución directa por su continuidad.\n" +
                    "Los cocientes requieren más cuidado y frecuentemente factorización.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 7){
                    txtNomTem.setText("Continuidad y discontinuidad de una función"); // Editar nombre de tema
                    txtTexto.setText("Una función es continua si no hay saltos ni huecos en su gráfica.\n" +
                    "Tres condiciones: f(a) existe, el límite existe, ambos son iguales.\n" +
                    "Los polinomios son continuos en todos los reales.\n" +
                    "Las racionales pueden ser discontinuas donde el denominador es 0.\n" +
                    "Gráficamente se puede trazar sin levantar el lápiz.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 8){
                    txtNomTem.setText(" Intervalos de continuidad o discontinuidad"); // Editar nombre de tema
                    txtTexto.setText("La continuidad depende de dónde está definida la función.\n" +
                    "Se debe analizar el dominio para encontrar intervalos continuos.\n" +
                    "Se interrumpe donde hay raíces negativas o divisiones por cero.\n" +
                    "Las funciones racionales son discontinuas donde el denominador vale 0.\n" +
                    "Funciones raíz cuadrada requieren contenido ≥ 0.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)                    
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
                if (temas1.tema == 1){
                    img.setIcon(new ImageIcon(getClass().getResource("/imgFis/leyHo.png"))); 
                    txtNomTem.setText("Ley de hooke"); // Editar nombre de tema
                    txtTexto.setText("La Ley de Hooke describe cómo se comportan los resortes.\n" +
                    "Establece que la fuerza es proporcional a la elongación.\n" +
                    "Se expresa como F = -k·x, donde \"k\" es la constante del resorte.\n" +
                    "\"x\" es el alargamiento respecto a la posición de equilibrio.\n" +
                    "Solo se cumple dentro del límite elástico del material.\n" +
                    "La fuerza restauradora siempre actúa en sentido opuesto.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 2){
                    txtNomTem.setText("Módulo de Young"); // Editar nombre de tema
                    txtTexto.setText("El Módulo de Young mide la rigidez de un material.\n" +
                    "Se representa con la letra \"E\" y su unidad es el pascal (Pa).\n" +
                    "E = (F·L)/(A·ΔL), donde:\n" +
                    "F = fuerza, L = longitud original,\n" +
                    "A = área transversal, ΔL = elongación.\n" +
                    "Materiales con mayor E son menos deformables.\n" +
                    "Ej: el acero tiene un alto módulo de Young.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 3){
                    img.setIcon(new ImageIcon(getClass().getResource("/imgFis/densi.png")));
                    txtNomTem.setText("Densidad"); // Editar nombre de tema
                    txtTexto.setText("La densidad relaciona la masa y el volumen de un cuerpo.\n" +
                    "Se expresa como ρ = m/V, unidad: kg/m³ o g/cm³.\n" +
                    "Materiales diferentes tienen densidades distintas.\n" +
                    "El agua tiene una densidad de 1000 kg/m³.\n" +
                    "Un objeto flota si su densidad es menor que la del agua.\n" +
                    "Es útil para identificar sustancias.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 4){
                    img.setIcon(new ImageIcon(getClass().getResource("/imgFis/preHidro.png")));
                    txtNomTem.setText("Presión Hidrostática"); // Editar nombre de tema
                    txtTexto.setText("La presión hidrostática es causada por el peso\n" +
                    "del líquido sobre un punto sumergido.\n" +
                    "Depende de la profundidad, densidad y gravedad.\n" +
                    "Se calcula con la fórmula: P = ρgh\n" +
                    "ρ: densidad del líquido (kg/m³)\n" +
                    "g: gravedad (9.81 m/s²)\n" +
                    "h: profundidad (m)\n" +
                    "Actúa en todas las direcciones por igual.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 5){
                    txtNomTem.setText("Principio de Pascal"); // Editar nombre de tema
                    txtTexto.setText("El principio de Pascal dice que la presión\n" +
                    "aplicada a un fluido en reposo se transmite\n" +
                    "uniformemente en todas las direcciones.\n" +
                    "Se usa en sistemas hidráulicos.\n" +
                    "Permite multiplicar fuerzas con pistones.\n" +
                    "Muy útil en frenos y gatos hidráulicos.\n" +
                    "No depende del área ni forma del recipiente.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 6){
                    txtNomTem.setText("Principio de Arquímedes"); // Editar nombre de tema
                    txtTexto.setText("Todo cuerpo sumergido en un fluido\n" +
                    "recibe un empuje hacia arriba.\n" +
                    "Este empuje equivale al peso del\n" +
                    "fluido desplazado por el cuerpo.\n" +
                    "Es por eso que los objetos flotan o se hunden.\n" +
                    "Empuje: E = ρ·g·V desplazado");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 7){
                    img.setIcon(new ImageIcon(getClass().getResource("/imgFis/visco.png")));
                    txtNomTem.setText("Viscosidad"); // Editar nombre de tema
                    txtTexto.setText("La viscosidad es la resistencia que presentan los fluidos (líquidos o\n" + 
                    "gases) al movimiento o al flujo. Esta resistencia se debe a la fricción interna\n" + 
                    "entre las moléculas del fluido. Cuanto mayor es la viscosidad, más \n" + 
                    "difícilmente fluye el fluido y más lentamente se mueve. Por ejemplo, la miel\n" +
                    "tiene una viscosidad alta y fluye con lentitud, mientras que el agua tiene \n" +
                    "una viscosidad baja y fluye con facilidad.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 8){
                    img.setIcon(new ImageIcon(getClass().getResource("/imgFis/prensaHidra.png")));
                    txtNomTem.setText("Prensa hidràulica"); // Editar nombre de tema
                    txtTexto.setText("La prensa hidráulica funciona según el principio de Pascal, el cual\n" +
                    "establece que la presión aplicada en un punto de un fluido incompresible\n" +
                    "se transmite de forma uniforme en todas las direcciones dentro del fluido.\n" + 
                    "Gracias a esto, una pequeña fuerza aplicada en un pistón pequeño puede \n" + 
                    "generar una fuerza mucho mayor en otro pistón más grande, multiplicando\n" 
                            + "el efecto\n\n"
                            + "Fórmula: F1 / A1 = F2 / A2");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                }
            }else if (Parcial.parcial ==2){
                if (temas1.tema == 1){
                    txtNomTem.setText("Estado gaseoso");
                    txtTexto.setText("El estado gaseoso se caracteriza por tener forma y volumen variables, ya que los\n" +
                    "gases se expanden para ocupar completamente el recipiente que los contiene. Las\n" +
                    "partículas en un gas están muy separadas entre sí y se mueven de manera\n" +
                    "continua, rápida y desordenada, lo que les permite fluir y comprimirse con facilidad.\n\n"
                    + "Leyes importantes: - Ley de Boyle: P1V1 = P2V2 (a temperatura constante) - Ley\n" +
                    "de Charles: V1/T1 = V2/T2 (a presión constante) - Ecuación general de gases:\n" +
                    "PV = nRT");
                }
                else if (temas1.tema == 2){
                    txtNomTem.setText("Temperatura y escalas");
                    txtTexto.setText("La temperatura indica cuánta energía cinética tienen las partículas.\n" +
                    "A mayor movimiento molecular, mayor será la temperatura registrada.\n" +
                    "Se mide con termómetro en °C, °F y K, según la escala usada.\n" +
                    "Kelvin inicia en cero absoluto; Celsius y °F dependen del agua.\n" +
                    "Para convertir escalas se aplican fórmulas matemáticas simples\n\n"
                  + "C° → K° = c+273                        K° → F° = 1.8 (k-273.15)+32\n" +
                    "k° → C° = k-273                        \"C° → F° = 1.8 c +32\n" +
                    "F° → K° = (5/9) (f-32) + 273.15     \"F° → C° = F-32/1.8\"" );
                }
                else if (temas1.tema == 3){}
                else if (temas1.tema == 4){}
                else if (temas1.tema == 5){}
                else if (temas1.tema == 6){}
                else if (temas1.tema == 7){}
                else if (temas1.tema == 8){}
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
                if (temas1.tema == 1){
                    txtNomTem.setText("interés compuesto"); // Editar nombre de tema
                    txtTexto.setText("El interés compuesto es un principio fundamental en finanzas que\n" +
"describe cómo una inversión o deuda crece cuando los intereses\n" +
"ganados se reinvierten y comienzan a generar nuevos intereses. A\n" +
"diferencia del interés simple —donde solo se calcula sobre el capital\n" +
"inicial—, el interés compuesto se calcula sobre el capital inicial más\n" +
"los intereses acumulados previamente.\n"
                            + "I = C [ ( 1 + t ]^n – 1] \n"
                            + "C = capital\n" +
"T = tasa\n" +
"N = tiempo");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 2){
                    txtNomTem.setText( "Monto de una anualidad"); // Editar nombre de tema
                    txtTexto.setText("El monto de una anualidad es el valor acumulado al final del período,\n" +
"considerando todos los pagos realizados más los intereses generados durante ese\n" +
"tiempo. \n\n"
                            + "S = P [ ( 1+t)^n-1] / t \n"
                            + "P = pago o deposito periódico\n" +
"T = tasa\n" +
"N = tiempo ");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 3){
                    txtNomTem.setText("valor actual"); // Editar nombre de tema
                    txtTexto.setText("El valor actual (o valor presente) es el valor hoy de una cantidad de dinero que se\n" +
"recibirá o pagará en el futuro, ajustado por una tasa de interés. Es decir, cuánto\n" +
"necesitarías tener hoy para alcanzar una cantidad futura, considerando que el\n" +
"dinero genera rendimiento con el tiempo. \n\n"
                            + "A = P [1 – (1 + t)^-n] / t\n" +
"P = pagos o depósitos periódicos\n" +
"T = tasa\n" +
"N = tiempo ");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 4){
                    txtNomTem.setText("Tema 4"); // Editar nombre de tema
                    txtTexto.setText("informacion de tema 4");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 5){
                    txtNomTem.setText("Tema 5"); // Editar nombre de tema
                    txtTexto.setText("informacion de tema 5");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 6){
                    txtNomTem.setText("Tema 6"); // Editar nombre de tema
                    txtTexto.setText("informacion de tema 6");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 7){
                    txtNomTem.setText("Tema 7"); // Editar nombre de tema
                    txtTexto.setText("informacion de tema 7");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 8){
                    txtNomTem.setText("Tema 8"); // Editar nombre de tema
                    txtTexto.setText("informacion de tema 8");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
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
                if (temas1.tema == 1){
                    txtNomTem.setText("Balanceo de ecuaciones químicas"); // Editar nombre de tema
                    txtTexto.setText(" El balanceo de ecuaciones químicas es fundamental para cumplir "
                            + "\ncon la Ley de Conservación de la Materia, la cual establece que la"
                            + "\nmasa no se crea ni se destruye en una reacción química. Por lo "
                            + "\ntanto, el número de átomos de cada elemento debe ser igual en "
                            + "\nlos reactivos y en los productos. Para lograr esto, se utilizan "
                            + "\ncoeficientes estequiométricos delante de las fórmulas químicas."
                            + "\nEn este ejercicio, debes identificar qué números permiten balancear"
                            + "\ncorrectamente la ecuación dada. ");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    img.setIcon(new ImageIcon(getClass().getResource("/imgQ/tem1.png"))); 
                }else if (temas1.tema == 2){
                    txtNomTem.setText("Balanceo con múltiples compuestos "); // Editar nombre de tema
                    txtTexto.setText("Cuando una ecuación química incluye más de dos "
                            + "\ncompuestos, el balanceó puede volverse más complejo. Es "
                            + "\nimportante revisar cada elemento presente y asegurarse "
                            + "\nde que el número total de átomos por lado de la ecuación sea "
                            + "\nigual. Este tipo de ejercicio desarrolla la habilidad de observar "
                            + "\nlas relaciones cuantitativas entre los compuestos involucrados "
                            + "\nen una reacción química. ");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    img.setIcon(new ImageIcon(getClass().getResource("/imgQ/tem3.png"))); 

                    
                }else if (temas1.tema == 3){
                    txtNomTem.setText("Tema 3"); // Editar nombre de tema
                    txtTexto.setText("informacion de tema 3");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 4){
                    txtNomTem.setText("Tema 4"); // Editar nombre de tema
                    txtTexto.setText("informacion de tema 4");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 5){
                    txtNomTem.setText("Tema 5"); // Editar nombre de tema
                    txtTexto.setText("informacion de tema 5");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 6){
                    txtNomTem.setText("Tema 6"); // Editar nombre de tema
                    txtTexto.setText("informacion de tema 6");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 7){
                    txtNomTem.setText("Tema 7"); // Editar nombre de tema
                    txtTexto.setText("informacion de tema 7");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 8){
                    txtNomTem.setText("Tema 8"); // Editar nombre de tema
                    txtTexto.setText("informacion de tema 8");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
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
                if (temas1.tema == 1){
                    txtNomTem.setText("PEPS"); // Editar nombre de tema
                    txtTexto.setText("PEPS usa los productos más antiguos como los primeros en salir.\n" +
"Es útil cuando los precios suben constantemente con el tiempo.\n" +
"El costo de ventas se calcula con las primeras compras registradas.\n" +
"El inventario final queda con los productos más recientes.\n" +
"Este método es aceptado por normas contables internacionales.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 2){
                    txtNomTem.setText("LIFO"); // Editar nombre de tema
                    txtTexto.setText("LIFO usa los productos más recientes como los primeros en salir.\n" +
"El costo de ventas se basa en las últimas compras realizadas.\n" +
"Es útil en entornos de inflación alta para reducir utilidad fiscal.\n" +
"No está permitido en algunos países por normas fiscales.\n" +
"El inventario final queda con productos más antiguos.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 3){
                    txtNomTem.setText("TCosto Promedio"); // Editar nombre de tema
                    txtTexto.setText("Se calcula un costo promedio ponderado de todos los productos.\n" +
"El costo de ventas y el inventario se basan en ese promedio.\n" +
"Es útil cuando no hay gran variación entre precios de compras.\n" +
"Es fácil de aplicar y entender contablemente.\n" +
"Minimiza el impacto de precios muy altos o bajos.");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 4){
                    txtNomTem.setText("Tema 4"); // Editar nombre de tema
                    txtTexto.setText("informacion de tema 4");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 5){
                    txtNomTem.setText("Tema 5"); // Editar nombre de tema
                    txtTexto.setText("informacion de tema 5");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 6){
                    txtNomTem.setText("Tema 6"); // Editar nombre de tema
                    txtTexto.setText("informacion de tema 6");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 7){
                    txtNomTem.setText("Tema 7"); // Editar nombre de tema
                    txtTexto.setText("informacion de tema 7");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
                }else if (temas1.tema == 8){
                    txtNomTem.setText("Tema 8"); // Editar nombre de tema
                    txtTexto.setText("informacion de tema 8");   //Cambiar la informacion que se va a mostrar (Usen esto "\n" para enter)
                    
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
        txtNomMat = new javax.swing.JTextField();
        txtNomTem = new javax.swing.JTextField();
        imgCalDif = new javax.swing.JLabel();
        imgFis = new javax.swing.JLabel();
        imgQuim = new javax.swing.JLabel();
        imgCalFin = new javax.swing.JLabel();
        imgConta = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JLabel();
        txtTexto = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        btnSiguiente = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

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
        txtTexto.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtTexto.setRows(5);
        txtTexto.setBorder(null);
        jPanel3.add(txtTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 49, 610, 250));

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
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 120, 40));
        jPanel3.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 160, 110));

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
            avance = 0;
            
            temas1 abrir = new temas1();
            abrir.setVisible(true);
            dispose();
        } else if (seleccion == JOptionPane.CLOSED_OPTION) {
            
        } else {
            
        }
    }//GEN-LAST:event_btnVolverMouseClicked

    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked
        avance++;
        
        ejemplo abrir = new ejemplo();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSiguienteMouseClicked

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
    private javax.swing.JPanel barraTa;
    private javax.swing.JLabel btnSiguiente;
    private javax.swing.JLabel btnVolver;
    private javax.swing.JPanel cerrar;
    private javax.swing.JLabel img;
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
    private javax.swing.JTextField txtNomMat;
    private javax.swing.JTextField txtNomTem;
    private javax.swing.JTextArea txtTexto;
    // End of variables declaration//GEN-END:variables

    private Icon getIcon(String path, int w, int h) {
        return new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(w, h, 0));
    }
}
