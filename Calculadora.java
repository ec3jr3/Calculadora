import java.awt.*;
import java.awt.event.*;
import java.math.MathContext;
import javax.management.StringValueExp;
import javax.swing.*;
public class Calculadora extends JFrame implements ActionListener
{
    String temp = "";
    String texto = "";
    float v1, v2;
    double con;
    int opcion;
    int ok = 1;
    
    JMenuBar contenedor;
    JMenu ver, edicion, ayuda;
    JRadioButtonMenuItem radianes, centimetros;
    JMenuItem estandar, cientifica, imc, formulageneral;
    JMenuItem copiar, pegar, historial, ver_ayuda, acerca_de;
    JButton btnGsm = new JButton("Gsm");
    JButton btnExpo = new JButton("Exp");
    JButton btnLogNat = new JButton("Ln");
    JButton btnSeno = new JButton("Sin");
    JButton btnPotencia = new JButton("x^y");
    JButton btnLog = new JButton("Log");
    JButton btnCoseno = new JButton("Cos");
    JButton btnNumAlCubo = new JButton("x^3");
    JButton btnFactorial = new JButton("n!");
    JButton btnTangente = new JButton("Tan");
    JButton btnNumAlCuad = new JButton("x^2");
    JButton btnFraccion = new JButton("1/x");
    JButton btnNum7 = new JButton("7");
    JButton btnNum8 = new JButton("8");
    JButton btnNum9 = new JButton("9");
    JButton btnDividir = new JButton("/");
    JButton btnNum4 = new JButton("4");
    JButton btnNum5 = new JButton("5");
    JButton btnNum6 = new JButton("6");
    JButton btnMultiplicar = new JButton("*");
    JButton btnNum1 = new JButton("1");
    JButton btnNum2 = new JButton("2");
    JButton btnNum3 = new JButton("3");
    JButton btnRestar = new JButton("-");
    JButton btnNum0= new JButton("0");
    JButton btnCambiarSignoANegativo = new JButton("+/-");
    JButton btnComa = new JButton(".");
    JButton btnSumar = new JButton("+");
    JButton btnEjecutarOperacion = new JButton("=");
    JButton btnRetroceso = new JButton("Retroceso");
    JButton btnCE = new JButton("CE");
    JButton btnC = new JButton("C");
    JButton btnRaizCuadrada = new JButton("Sqr");
    JButton btnCalcularPorcentaje = new JButton("%");
    JButton btnPuntoDecimal = new JButton(".");
    
    
    //formula general
    JButton btnNum0FG = new JButton("0");
    JButton btnNum1FG = new JButton("1");
    JButton btnNum2FG = new JButton("2");
    JButton btnNum3FG = new JButton("3");
    JButton btnNum4FG = new JButton("4");
    JButton btnNum5FG = new JButton("5");
    JButton btnNum6FG = new JButton("6");
    JButton btnNum7FG = new JButton("7");
    JButton btnNum8FG = new JButton("8");
    JButton btnNum9FG = new JButton("9");
    JButton btnEnterFG = new JButton("Enter");
    
    
    
    //botones del imc
    JButton btnNum0IMC = new JButton("0");
    JButton btnNum1IMC = new JButton("1");
    JButton btnNum2IMC = new JButton("2");
    JButton btnNum3IMC = new JButton("3");
    JButton btnNum4IMC = new JButton("4");
    JButton btnNum5IMC = new JButton("5");
    JButton btnNum6IMC = new JButton("6");
    JButton btnNum7IMC = new JButton("7");
    JButton btnNum8IMC = new JButton("8");
    JButton btnNum9IMC = new JButton("9");
    JButton btnEjecutarOperacionIMC = new JButton("=");
    JButton btnRetrocesoIMC = new JButton("Retroceso");
    JButton btnCEIMC = new JButton("CE2");
    JButton btnCIMC = new JButton("C2");
    
    
    JButton btnEnter = new JButton("Enter");
    JButton btnIMC = new JButton("IMC");
    
    JLabel Resultado1 = new JLabel("");
    JLabel peso = new JLabel("Peso");
    JLabel Resultado = new JLabel("Resultado");
    JLabel estatura = new JLabel("Estatura");
    JLabel Menu = new JLabel("");
    JLabel Menu1 = new JLabel("");
    JLabel Resultado2 = new JLabel("");
    JLabel Menu2 = new JLabel("");
    JLabel Menu3 = new JLabel("");
    JLabel Resultado3 = new JLabel("");
    JLabel Menu4 = new JLabel("");
    JLabel Menu5 = new JLabel("");
    JLabel Resultado4 = new JLabel("");
    JLabel Menu6 = new JLabel("");
    JLabel Menu7 = new JLabel("");
    
    
    //botones del imc
    
    JLabel resultadoFG = new JLabel("");
    JButton btnENTER = new JButton("ENTER");
    
    JTextField txtValor3 = new JTextField();
    JTextField txtValor = new JTextField();
    JTextField txtValor2 = new JTextField();
    public Calculadora(String nombre)
    {
        super(nombre);
        iniciarControles();
    }
    public void iniciarControles()
    {
        //menu ver
        contenedor = new JMenuBar();
        ver = new JMenu ("Ver");
        edicion = new JMenu ("Edicion");
        ayuda = new JMenu ("Ayuda");
        
        //crear los items del menu
        formulageneral  = new JMenuItem("Formula General");
        estandar = new JMenuItem ("Estandar");
        cientifica = new JMenuItem ("Cientifica");
        imc = new JMenuItem ("Calculadora de IMC");
        copiar = new JMenuItem ("Copiar Ctr+c");
        pegar = new JMenuItem ("Pegar Ctr+v");
        historial = new JMenuItem ("Historial");
        ver_ayuda= new JMenuItem ("Ver Ayuda");
        acerca_de = new JMenuItem ("Acerca de Calculadora");
        
        //agregar los items al contenedor de la ventana
        this.setJMenuBar (contenedor);
        contenedor.add (ver);
        contenedor.add (edicion);
        contenedor.add (ayuda);
        ver.add (estandar);
        ver.add (cientifica);
        ver.add (imc);
        ver.add(formulageneral);
        edicion.add (copiar);
        edicion.add (pegar);
        edicion.add (historial);
        ayuda.add (acerca_de);
        ayuda.add (ver_ayuda);
        
        //Botones de radio para seleccionar el formato de resultados
        radianes = new JRadioButtonMenuItem ("Radianes");
        centimetros = new JRadioButtonMenuItem ("Centimetros");
        radianes.setBounds(50,100,80,45);
        radianes.setBackground(Color.LIGHT_GRAY);
        centimetros.setBounds(150,100,90,45);
        centimetros.setBackground(Color.LIGHT_GRAY);
        txtValor.setBounds(50,50,405,35);
        
        btnGsm.setBounds(50,150,60,25);
        btnExpo.setBounds(115,150,60,25);
        btnLogNat.setBounds(180,150,60,25);
        btnSeno.setBounds(50,180,60,25);
        btnPotencia.setBounds(115,180,60,25);
        btnLog.setBounds(180,180,60,25);
        btnCoseno.setBounds(50,210,60,25);
        btnNumAlCubo.setBounds(115,210,60,25);
        btnFactorial.setBounds(180,210,60,25);
        btnTangente.setBounds(50,240,60,25);
        btnNumAlCuad.setBounds(115,240,60,35);
        btnFraccion.setBounds(180,240,60,25);
        
        //imc
        
        
        //Configuracion de botones de retrocesos
        btnRetroceso.setBounds(260,95,93,25);
        btnCE.setBounds(356,95,50,25);
        btnC.setBounds(409,95,44,25);
        
        //Configuracion de los botones numericos y
        //de los botones que definen los operadores aritmeticos
        btnNum7.setBounds(260,125,45,25);
        btnNum8.setBounds(310,125,45,25);
        btnNum9.setBounds(360,125,45,25);
        btnDividir.setBounds(410,125,45,25);
        btnNum4.setBounds(260,155,45,25);
        btnNum5.setBounds(310,155,45,25);
        btnNum6.setBounds(360,155,45,25);
        btnMultiplicar.setBounds(410,155,45,25);
        btnNum1.setBounds(260,185,45,25);
        btnNum2.setBounds(310,185,45,25);
        btnNum3.setBounds(360,185,45,25);
        btnRestar.setBounds(410,185,45,25);
        btnNum0.setBounds(260,215,45,25);
        btnCambiarSignoANegativo.setBounds(308,215,50,25);
        btnComa.setBounds(360,215,45,25);
        btnSumar.setBounds(410,215,45,25);
        btnEjecutarOperacion.setBounds(410,245,42,25);
        
        //agregar los objetos (controles) al Panel de la ventana
        this.getContentPane().add(txtValor);
        this.getContentPane().add(txtValor2);
        this.getContentPane().add(txtValor3);
        this.getContentPane().add(radianes);
        this.getContentPane().add(centimetros);
        this.getContentPane().add(btnGsm);
        this.getContentPane().add(btnExpo);
        this.getContentPane().add(btnLogNat);
        this.getContentPane().add(btnSeno);
        this.getContentPane().add(btnPotencia);
        this.getContentPane().add(btnLog);
        this.getContentPane().add(btnCoseno);
        this.getContentPane().add(btnNumAlCubo);
        this.getContentPane().add(btnFactorial);
        this.getContentPane().add(btnTangente);
        this.getContentPane().add(btnNumAlCuad);
        this.getContentPane().add(btnFraccion);
        this.getContentPane().add(btnNum7);
        this.getContentPane().add(btnNum8);
        this.getContentPane().add(btnNum9);
        this.getContentPane().add(btnDividir);
        this.getContentPane().add(btnNum4);
        this.getContentPane().add(btnNum5);
        this.getContentPane().add(btnNum6);
        this.getContentPane().add(btnMultiplicar);
        this.getContentPane().add(btnNum1);
        this.getContentPane().add(btnNum2);
        this.getContentPane().add(btnNum3);
        this.getContentPane().add(btnRestar);
        this.getContentPane().add(btnNum0);
        this.getContentPane().add(btnCambiarSignoANegativo);
        this.getContentPane().add(btnComa);
        this.getContentPane().add(btnSumar);
        this.getContentPane().add(btnEjecutarOperacion);
        this.getContentPane().add(btnRetroceso);
        this.getContentPane().add(btnCE);
        this.getContentPane().add(btnC);
        this.getContentPane().add(btnRaizCuadrada);
        this.getContentPane().add(btnCalcularPorcentaje);
        this.getContentPane().add(btnPuntoDecimal);
        this.getContentPane().add(peso);
        this.getContentPane().add(estatura);
        this.getContentPane().add(btnIMC);
        this.getContentPane().add(btnEnter);
        this.getContentPane().add(Resultado);
        this.getContentPane().add(Resultado1);
        this.getContentPane().add(Menu);
        this.getContentPane().add(Menu1);
        this.getContentPane().add(Resultado2);
        this.getContentPane().add(Menu2);
        this.getContentPane().add(Menu3);
        this.getContentPane().add(Resultado3);
        this.getContentPane().add(Menu4);
        this.getContentPane().add(Menu5);
        this.getContentPane().add(Resultado4);
        this.getContentPane().add(Menu6);
        this.getContentPane().add(Menu7);
        this.getContentPane().add(btnENTER);
        this.getContentPane().add(btnEnterFG);
        this.getContentPane().add(resultadoFG);
        
        this.getContentPane().add(btnNum0FG);
        this.getContentPane().add(btnNum1FG);
        this.getContentPane().add(btnNum2FG);
        this.getContentPane().add(btnNum3FG);
        this.getContentPane().add(btnNum4FG);
        this.getContentPane().add(btnNum5FG);
        this.getContentPane().add(btnNum6FG);
        this.getContentPane().add(btnNum7FG);
        this.getContentPane().add(btnNum8FG);
        this.getContentPane().add(btnNum9FG);
        
        this.getContentPane().add(btnNum0IMC);
        this.getContentPane().add(btnNum1IMC);
        this.getContentPane().add(btnNum2IMC);
        this.getContentPane().add(btnNum3IMC);
        this.getContentPane().add(btnNum4IMC);
        this.getContentPane().add(btnNum5IMC);
        this.getContentPane().add(btnNum6IMC);
        this.getContentPane().add(btnNum7IMC);
        this.getContentPane().add(btnNum8IMC);
        this.getContentPane().add(btnNum9IMC);
        this.getContentPane().add(btnEjecutarOperacionIMC);
        this.getContentPane().add(btnRetrocesoIMC);
        this.getContentPane().add(btnCEIMC);
        this.getContentPane().add(btnCIMC);
        
        
        //Configuracion de los botones con su evento respectivo.
        btnGsm.addActionListener(this);
        btnExpo.addActionListener(this);
        btnLogNat.addActionListener(this);
        btnSeno.addActionListener(this);
        btnPotencia.addActionListener(this);
        btnLog.addActionListener(this);
        btnCoseno.addActionListener(this);
        btnNumAlCubo.addActionListener(this);
        btnFactorial.addActionListener(this);
        btnTangente.addActionListener(this);
        btnNumAlCuad.addActionListener(this);
        btnFraccion.addActionListener(this);
        btnNum7.addActionListener(this);
        btnNum8.addActionListener(this);
        btnNum9.addActionListener(this);
        btnDividir.addActionListener(this);
        btnNum4.addActionListener(this);
        btnNum5.addActionListener(this);
        btnNum6.addActionListener(this);
        btnMultiplicar.addActionListener(this);
        btnNum1.addActionListener(this);
        btnNum2.addActionListener(this);
        btnNum3.addActionListener(this);
        btnRestar.addActionListener(this);
        btnNum0.addActionListener(this);
        btnCambiarSignoANegativo.addActionListener(this);
        btnComa.addActionListener(this);
        btnSumar.addActionListener(this);
        btnEjecutarOperacion.addActionListener(this);
        btnRetroceso.addActionListener(this);
        btnCE.addActionListener(this);
        btnC.addActionListener(this);
        btnRaizCuadrada.addActionListener(this);
        btnPuntoDecimal.addActionListener(this);
        btnIMC.addActionListener(this);
        btnEnter.addActionListener(this);
        btnEnterFG.addActionListener(this);
        btnENTER.addActionListener(this);
        
        btnNum1FG.addActionListener(this);
        btnNum2FG.addActionListener(this);
        btnNum3FG.addActionListener(this);
        btnNum4FG.addActionListener(this);
        btnNum5FG.addActionListener(this);
        btnNum6FG.addActionListener(this);
        btnNum7FG.addActionListener(this);
        btnNum8FG.addActionListener(this);
        btnNum9FG.addActionListener(this);
        btnNum0FG.addActionListener(this);
        
        btnNum1IMC.addActionListener(this);
        btnNum2IMC.addActionListener(this);
        btnNum3IMC.addActionListener(this);
        btnNum4IMC.addActionListener(this);
        btnNum5IMC.addActionListener(this);
        btnNum6IMC.addActionListener(this);
        btnNum7IMC.addActionListener(this);
        btnNum8IMC.addActionListener(this);
        btnNum9IMC.addActionListener(this);
        btnNum0IMC.addActionListener(this);
        btnEjecutarOperacionIMC.addActionListener(this);
        btnRetrocesoIMC.addActionListener(this);
        btnCEIMC.addActionListener(this);
        btnCIMC.addActionListener(this);
        
        
        //Configuracion de los eventos de los elementos del menu
        ver_ayuda.addActionListener(this);
        cientifica.addActionListener(this);
        estandar.addActionListener(this);
        imc.addActionListener(this);
        copiar.addActionListener(this);
        pegar.addActionListener(this);
        formulageneral.addActionListener(this);
        //Configuracion del menu con las caracteristicas dela ventana
        this.setBounds(500,100,475,335);
        this.setResizable(isMaximumSizeSet());//desactiva opcion maximiza
        
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //Ejecucion de la aplicacion
    public static void main()
    {
        new Calculadora("Calculadora");
    }
    //Definicion de los eventos ActionListener (Para cada operacion de la callculadora)
     public void actionPerformed (ActionEvent e)
     {
     txtValor.setFocusable(isFocusable());//desactivael cursor al ingresar un valor
        if(e.getSource()==Calculadora.this.btnLogNat)
     {
        v1=Float.parseFloat(txtValor.getText());
        txtValor.setText("");
        txtValor.setText(String.valueOf(Math.log(v1)));//ln
        v2=0;
     }
     if(e.getSource()==Calculadora.this.btnSeno)
     {
       v1=Float.parseFloat(txtValor.getText());
       con=(v1*Math.PI)/180;//conversion de radianes a sexagesimales
       txtValor.setText("");
       txtValor.setText(String.valueOf(Math.sin(con)));
       v2=0;  
       con=0;
     }
     if(e.getSource()==Calculadora.this.btnPotencia)
     {
       v1=Float.parseFloat(txtValor.getText());
       txtValor.setText("");
       txtValor.setText(String.valueOf(Math.sin(con)));
       opcion=5;
       temp="";
     }
     if(e.getSource()==Calculadora.this.btnLog)
     {
       v1=Float.parseFloat(txtValor.getText());
       txtValor.setText("");
       txtValor.setText(String.valueOf(Math.log(v1)));
       v2=0;
     }
     if(e.getSource()==Calculadora.this.btnCoseno)
     {
       v1=Float.parseFloat(txtValor.getText());
       con=(v1*Math.PI)/180;
       txtValor.setText("");
       txtValor.setText(String.valueOf(Math.cos(con)));
       con=0;
       v2=0;
     }
     if(e.getSource()==Calculadora.this.btnNumAlCubo)
     {
       v1=Float.parseFloat(txtValor.getText());
       txtValor.setText("");
       txtValor.setText(String.valueOf(Math.pow(v1,3)));
       v2=0;
     }
     if(e.getSource()==Calculadora.this.btnFactorial)//Calcular factorial
     {
       double factorial=1;
       int i;
       v1=Float.parseFloat(txtValor.getText());
       txtValor.setText("");
       for (i = 1; i <= v1; i++)
       {
        factorial = factorial * i; 
       }
       txtValor.setText(String.valueOf(factorial));
     }
     if(e.getSource()==Calculadora.this.btnTangente)
     {
       v1=Float.parseFloat(txtValor.getText());
       con=(v1*Math.PI)/180;//conversion de grados a radianes
       txtValor.setText("");
       txtValor.setText(String.valueOf(Math.tan(con)));
       con=0;
       v2=0;
     }
     if(e.getSource()==Calculadora.this.btnNumAlCuad)
     {
       v1=Float.parseFloat(txtValor.getText());
       txtValor.setText("");
       txtValor.setText(String.valueOf(Math.pow(v1,2)));
       v2=0;
     }
     if(e.getSource()==Calculadora.this.btnFraccion)
     {
       v1=Float.parseFloat(txtValor.getText());
       txtValor.setText("");
       if(v1 !=0)
           {
               txtValor.setText(String.valueOf(1/v1));
           }
           else
           {
               txtValor.setText("error");
           }
     }
      if(e.getSource()==Calculadora.this.btnNum7)
      {
       if(txtValor.getText()=="")
       {
         btnNum7.setText (btnNum7.getText());
         temp=btnNum7.getText();
        }
       else
        {
         txtValor.setText(temp+btnNum7.getText());
         temp+=btnNum7.getText();
        }
       
     }
      if(e.getSource()==Calculadora.this.btnNum8)
      {
       if(txtValor.getText()=="")
       {
         btnNum8.setText (btnNum8.getText());
         temp=btnNum8.getText();
        }
       else
        {
         txtValor.setText(temp+btnNum8.getText());
         temp+=btnNum8.getText();
        }
     }
      if(e.getSource()==Calculadora.this.btnNum9)
      {
       if(txtValor.getText()=="")
       {
         btnNum9.setText (btnNum9.getText());
         temp=btnNum9.getText();
        }
       else
        {
         txtValor.setText(temp+btnNum9.getText());
         temp+=btnNum9.getText();
        }
     }
      if(e.getSource()==Calculadora.this.btnNum4)
      {
       if(txtValor.getText()=="")
       {
         btnNum4.setText (btnNum4.getText());
         temp=btnNum4.getText();
        }
       else
        {
         txtValor.setText(temp+btnNum4.getText());
         temp+=btnNum4.getText();
        }
     }
      if(e.getSource()==Calculadora.this.btnNum5)
      {
       if(txtValor.getText()=="")
       {
         btnNum5.setText (btnNum5.getText());
         temp=btnNum5.getText();
        }
       else
        {
         txtValor.setText(temp+btnNum5.getText());
         temp+=btnNum5.getText();
        }
     }
      if(e.getSource()==Calculadora.this.btnNum6)
      {
       if(txtValor.getText()=="")
       {
         btnNum6.setText (btnNum6.getText());
         temp=btnNum6.getText();
        }
       else
        {
         txtValor.setText(temp+btnNum6.getText());
         temp+=btnNum6.getText();
        }
     }
      if(e.getSource()==Calculadora.this.btnNum1)
      {
       if(txtValor.getText()=="")
       {
         btnNum1.setText (btnNum1.getText());
         temp=btnNum1.getText();
        }
       else
        {
         txtValor.setText(temp+btnNum1.getText());
         temp+=btnNum1.getText();
        }
     }
      if(e.getSource()==Calculadora.this.btnNum2)
      {
       if(txtValor.getText()=="")
       {
         btnNum2.setText (btnNum2.getText());
         temp=btnNum2.getText();
        }
       else
        {
         txtValor.setText(temp+btnNum2.getText());
         temp+=btnNum2.getText();
        }
     }
      if(e.getSource()==Calculadora.this.btnNum3)
      {
       if(txtValor.getText()=="")
       {
         btnNum3.setText (btnNum3.getText());
         temp=btnNum3.getText();
        }
       else
        {
         txtValor.setText(temp+btnNum3.getText());
         temp+=btnNum3.getText();
        }
     }
      if(e.getSource()==Calculadora.this.btnNum0)
      {
       if(txtValor.getText()=="")
       {
         btnNum0.setText (btnNum0.getText());
         temp=btnNum0.getText();
        }
       else
        {
         txtValor.setText(temp+btnNum0.getText());
         temp+=btnNum0.getText();
        }
       }
       
     if(e.getSource()==Calculadora.this.btnCambiarSignoANegativo)
     {
         float temp6;
         temp6=-Float.valueOf(txtValor.getText());
         txtValor.setText(String.valueOf(temp6));
     }
     if(e.getSource()==btnRetroceso)//button retroceso
     {
         int i;;
         String temp2="";
         for (i = 0; i < txtValor.getText().length()-1; i++)
         {
             temp2=temp2+txtValor.getText().charAt(i);
         }
         txtValor.setText(temp2);
         temp=temp2;
     }
     if(e.getSource()==Calculadora.this.btnSumar)//operadores sumar
     {
         v1=Float.parseFloat(txtValor.getText());
         temp="";
         txtValor.setText("");
         opcion=1;
     }
     if(e.getSource()==Calculadora.this.btnRestar)//operadores restar
     {
         v1=Float.parseFloat(txtValor.getText());
         temp="";
         txtValor.setText("");
         opcion=2;
     }
     if(e.getSource()==Calculadora.this.btnMultiplicar)//operadores multiplicar
     {
         v1=Float.parseFloat(txtValor.getText());
         temp="";
         txtValor.setText("");
         opcion=3;
     }
     if(e.getSource()==Calculadora.this.btnDividir)//operadores dividir
     {
         v1=Float.parseFloat(txtValor.getText());
         temp="";
         txtValor.setText("");
         opcion=4;
     }
     if(e.getSource()==Calculadora.this.btnRaizCuadrada)//operadores raiz
     {
         v1=Float.parseFloat(txtValor.getText());
         txtValor.setText(String.valueOf(Math.sqrt(v1)));
         v1=0;
     }
     if(e.getSource()==Calculadora.this.btnPuntoDecimal)//decimal
     {
         temp=txtValor.getText();
         txtValor.setText(temp+".");
         temp+=txtValor.getText();  
     }
     if(e.getSource()==ver_ayuda || e.getSource()==acerca_de)
     {
        JOptionPane.showMessageDialog(null, "Proyecto Integrador "+"\n"+" Ingenieria en Sistemas Computacionales"+"\n"+"Derechos reservados."+"\n"+" Agosto - Diciembre 2018");
     }
     if(e.getSource()==copiar)//copiar el codigo 
     {
        txtValor.copy(); 
     }
     if(e.getSource()==pegar)//pegar el codigo 
     {
         txtValor.paste();
     }
     if(e.getSource()==Calculadora.this.btnEjecutarOperacion)
     //reallizando las funciones aritmeticas con dos operandos
     {
         v2= Float.parseFloat(txtValor.getText());
         switch(opcion)
         {
             case 1:
                     txtValor.setText("");
                     txtValor.setText(String.valueOf(v1+v2));
                     break;
         
         
             case 2: 
                     txtValor.setText("");
                     txtValor.setText(String.valueOf(v1-v2));
                     break;
         
             case 3:
                     txtValor.setText("");
                     txtValor.setText(String.valueOf(v1*v2));
                     break;
         
             case 4:  
                      if( v2!=0)
                      {
                          txtValor.setText("");
                          txtValor.setText(String.valueOf(v1/v2));
                      }
                      else
                            txtValor.setText("error");
                      break;
             case 5:
                         txtValor.setText("");
                         txtValor.setText(String.valueOf(Math.pow(v1, v2)));//x"y
                      break;
             default:
                     txtValor.setText("Valor Incorrecto");
         }
     }
     if(e.getSource()==Calculadora.this.btnCE)
     //botta todos posibles valores quese almacenan en la caja de texto
     {
         txtValor.setText("0");
         temp="";
         v1=0;
         v2=0;
         opcion=0;
         con=0;
     }
     if(e.getSource()==Calculadora.this.btnCEIMC)
     {
         txtValor2.setText("0");
         temp="";
         v1=0;
         v2=0;
         opcion=0;
         con=0;
     }
     if(e.getSource()==Calculadora.this.btnC)
     {
        txtValor.setText("0");
        temp="";
        v1=0;
        v2=0;
        opcion=0;
        con=0;
     }
     if(e.getSource()==Calculadora.this.btnEnter)
     {
         if(ok== 1)
         {
             temp= "";
             ok = 2;
         }
         
     }
      
     if(e.getSource()==Calculadora.this.btnNum7IMC)
      {
          if(ok==1){
       if(txtValor.getText()=="")
       {
         btnNum7.setText (btnNum7IMC.getText());
         temp=btnNum7IMC.getText();
        }
       else
        {
         txtValor.setText(temp+btnNum7IMC.getText());
         temp+=btnNum7IMC.getText();
        }
       }
       else{
           if(txtValor2.getText()=="")
           {
              btnNum7IMC.setText (btnNum7IMC.getText());
              temp=btnNum7IMC.getText(); 
           }
           else{
               txtValor2.setText(temp+btnNum7IMC.getText());
         temp+=btnNum7IMC.getText();
            }
        }
     }
     if(e.getSource()==Calculadora.this.btnNum8IMC)
      {
          if(ok==1){
       if(txtValor.getText()=="")
       {
         btnNum8IMC.setText (btnNum8IMC.getText());
         temp=btnNum8IMC.getText();
        }
       else
        {
         txtValor.setText(temp+btnNum8IMC.getText());
         temp+=btnNum7.getText();
        }
       }
       else{
           if(txtValor2.getText()=="")
           {
              btnNum8IMC.setText (btnNum8IMC.getText());
              temp=btnNum8IMC.getText(); 
           }
           else{
               txtValor2.setText(temp+btnNum8IMC.getText());
         temp+=btnNum8IMC.getText();
            }
        }
     }
     if(e.getSource()==Calculadora.this.btnNum9IMC)
      {
          if(ok==1){
       if(txtValor.getText()=="")
       {
         btnNum9IMC.setText (btnNum9IMC.getText());
         temp=btnNum9IMC.getText();
        }
       else
        {
         txtValor.setText(temp+btnNum9IMC.getText());
         temp+=btnNum7.getText();
        }
       }
       else{
           if(txtValor2.getText()=="")
           {
              btnNum9IMC.setText (btnNum9IMC.getText());
              temp=btnNum9IMC.getText(); 
           }
           else{
               txtValor2.setText(temp+btnNum9IMC.getText());
         temp+=btnNum9IMC.getText();
            }
        }
     }
     if(e.getSource()==Calculadora.this.btnNum6IMC)
      {
          if(ok==1){
       if(txtValor.getText()=="")
       {
         btnNum6IMC.setText (btnNum6IMC.getText());
         temp=btnNum6IMC.getText();
        }
       else
        {
         txtValor.setText(temp+btnNum6IMC.getText());
         temp+=btnNum6IMC.getText();
        }
       }
       else{
           if(txtValor2.getText()=="")
           {
              btnNum6IMC.setText (btnNum6IMC.getText());
              temp=btnNum6IMC.getText(); 
           }
           else{
               txtValor2.setText(temp+btnNum6IMC.getText());
         temp+=btnNum6IMC.getText();
            }
        }
     }
     if(e.getSource()==Calculadora.this.btnNum5IMC)
      {
          if(ok==1){
       if(txtValor.getText()=="")
       {
         btnNum5IMC.setText (btnNum5IMC.getText());
         temp=btnNum5IMC.getText();
        }
       else
        {
         txtValor.setText(temp+btnNum5IMC.getText());
         temp+=btnNum5IMC.getText();
        }
       }
       else{
           if(txtValor2.getText()=="")
           {
              btnNum5IMC.setText (btnNum5IMC.getText());
              temp=btnNum5IMC.getText(); 
           }
           else{
               txtValor2.setText(temp+btnNum5IMC.getText());
         temp+=btnNum5IMC.getText();
            }
        }
     }
     if(e.getSource()==Calculadora.this.btnNum4IMC)
      {
          if(ok==1){
       if(txtValor.getText()=="")
       {
         btnNum4IMC.setText (btnNum4IMC.getText());
         temp=btnNum4IMC.getText();
        }
       else
        {
         txtValor.setText(temp+btnNum4IMC.getText());
         temp+=btnNum4IMC.getText();
        }
       }
       else{
           if(txtValor2.getText()=="")
           {
              btnNum4IMC.setText (btnNum4IMC.getText());
              temp=btnNum4IMC.getText(); 
           }
           else{
               txtValor2.setText(temp+btnNum4IMC.getText());
         temp+=btnNum4IMC.getText();
            }
        }
     }
     if(e.getSource()==Calculadora.this.btnNum3IMC)
      {
          if(ok==1){
       if(txtValor.getText()=="")
       {
         btnNum3IMC.setText (btnNum3IMC.getText());
         temp=btnNum3IMC.getText();
        }
       else
        {
         txtValor.setText(temp+btnNum3IMC.getText());
         temp+=btnNum3IMC.getText();
        }
       }
       else{
           if(txtValor2.getText()=="")
           {
              btnNum3IMC.setText (btnNum3IMC.getText());
              temp=btnNum3IMC.getText(); 
           }
           else{
               txtValor2.setText(temp+btnNum3IMC.getText());
         temp+=btnNum3IMC.getText();
            }
        }
     }
     if(e.getSource()==Calculadora.this.btnNum2IMC)
      {
          if(ok==1){
       if(txtValor.getText()=="")
       {
         btnNum2IMC.setText (btnNum2IMC.getText());
         temp=btnNum2IMC.getText();
        }
       else
        {
         txtValor.setText(temp+btnNum2IMC.getText());
         temp+=btnNum2IMC.getText();
        }
       }
       else{
           if(txtValor2.getText()=="")
           {
              btnNum2IMC.setText (btnNum2IMC.getText());
              temp=btnNum2IMC.getText(); 
           }
           else{
               txtValor2.setText(temp+btnNum2IMC.getText());
         temp+=btnNum2IMC.getText();
            }
        }
     }
     if(e.getSource()==Calculadora.this.btnNum1IMC)
      {
          if(ok==1){
       if(txtValor.getText()=="")
       {
         btnNum1IMC.setText (btnNum1IMC.getText());
         temp=btnNum1IMC.getText();
        }
       else
        {
         txtValor.setText(temp+btnNum1IMC.getText());
         temp+=btnNum1IMC.getText();
        }
       }
       else{
           if(txtValor2.getText()=="")
           {
              btnNum1IMC.setText (btnNum1IMC.getText());
              temp=btnNum1IMC.getText(); 
           }
           else{
               txtValor2.setText(temp+btnNum1IMC.getText());
         temp+=btnNum1IMC.getText();
            }
        }
     }
     if(e.getSource()==Calculadora.this.btnNum0IMC)
      {
          if(ok==1){
       if(txtValor.getText()=="")
       {
         btnNum0IMC.setText (btnNum0IMC.getText());
         temp=btnNum0IMC.getText();
        }
       else
        {
         txtValor.setText(temp+btnNum0IMC.getText());
         temp+=btnNum0IMC.getText();
        }
       }
       else{
           if(txtValor2.getText()=="")
           {
              btnNum0IMC.setText (btnNum0IMC.getText());
              temp=btnNum0IMC.getText(); 
           }
           else{
               txtValor2.setText(temp+btnNum0IMC.getText());
         temp+=btnNum0IMC.getText();
            }
        }
     }
     if(e.getSource()==Calculadora.this.btnIMC)
     {
         ok = 1;
         float peso = Float.parseFloat (txtValor2.getText());
         float altura = Float.parseFloat (txtValor.getText());
         
         Resultado.setText(" "+(peso/altura/altura)*10000);
         float imc = Float.parseFloat (Resultado.getText());
         if(imc<18.5)
         {
            Resultado1.setText("Peso inferior a normal"); 
            Menu.setText("Menu: Papaya, 2 huevos, avena");
            Menu1.setText("juego de naranja");
         }
         else if((imc>18.5)&&(imc<24.9))
         {
            Resultado2.setText("IMC normal"); 
            Menu2.setText("Menu: Papaya, chilaquiles, cafe");
            Menu3.setText("juego de naranja ");
         }
         else if ((imc>25)&&(imc<29.9))
         {
             Resultado3.setText("IMC Peso superior al normal");
             Menu4.setText("Menu: Papaya, plato de avena");
             Menu5.setText("4 enfrijoladas");
         }
         else if(imc>30);
         {
           Resultado4.setText("IMC Obesidad");
             Menu6.setText("Menu: Papaya, manzana");
             Menu7.setText("2 molletes ");  
         }
     }
     if(e.getSource()==btnENTER)
     {
         double casita, a, b, c, x1, x2;
         
         System.out.println("Introduce el valor A");
         a = Double.parseDouble(txtValor.getText());
         System.out.println("Introduce el valor b");
         b = Double.parseDouble(txtValor2.getText());
         System.out.println("Introduce el valor c");
         c = Double.parseDouble(txtValor3.getText());
         casita = ((b*b)-(4*(a*c)));
         if(casita < 0) //si lo que se encuentra dentro de la raiz es mejor a cero es un numero ireal
         {
             resultadoFG.setText("La ecuacion no tiene solucion no real");
         }
         if(casita == 0)
         {
             System.out.println("La ecuacion tiene solo una raiz real");
             x1 = (-b)/(2*a);
             resultadoFG.setText("La solucion es x1=x2 " +x1);
         }
         if(casita>0)
         {
             System.out.println("La ecuacion tiene dos raices reales");
             x1 = (-b)+Math.sqrt(casita)/(2*a);
             x2 = (-b)-Math.sqrt(casita)/(2*a);
             resultadoFG.setText("El resultado/solucion es, x1 = " +x1+ "y x2 = " +x2);
         }
     }
     //Configurando los controles que apareen en la normal
     if(e.getSource()==imc)
     {
         //botones que no usaremos
        btnGsm.setVisible(false);
         btnExpo.setVisible(false);
         btnLogNat.setVisible(false);
         btnSeno.setVisible(false);
         btnPotencia.setVisible(false);
         btnLog.setVisible(false);
         btnCoseno.setVisible(false);
         btnNumAlCubo.setVisible(false);
         btnFactorial.setVisible(false);
         btnTangente.setVisible(false);
         btnNumAlCuad.setVisible(false);
         btnFraccion.setVisible(false);
         btnComa.setVisible(false);
         btnMultiplicar.setVisible(false);
         btnDividir.setVisible(false);
         btnRestar.setVisible(false);
         btnSumar.setVisible(false);
         btnRaizCuadrada.setVisible(false);
         btnCalcularPorcentaje.setVisible(false);
         centimetros.setVisible(false);
         radianes.setVisible(false);
         btnEjecutarOperacion.setVisible(false);
         btnNum0.setVisible(false);
         btnNum1.setVisible(false);
         btnNum2.setVisible(false);
         btnNum3.setVisible(false);
         btnNum4.setVisible(false);
         btnNum5.setVisible(false);
         btnNum6.setVisible(false);
         btnNum7.setVisible(false);
         btnNum8.setVisible(false);
         btnNum9.setVisible(false);
         btnEjecutarOperacion.setVisible(false);
         btnRetroceso.setVisible(true);
         btnCE.setVisible(true);
         btnC.setVisible(false);
         btnCambiarSignoANegativo.setVisible(false);
         
         btnNum0FG.setVisible(false);
         btnNum1FG.setVisible(false);
         btnNum2FG.setVisible(false);
         btnNum3FG.setVisible(false);
         btnNum4FG.setVisible(false);
         btnNum5FG.setVisible(false);
         btnNum6FG.setVisible(false);
         btnNum7FG.setVisible(false);
         btnNum8FG.setVisible(false);
         btnNum9FG.setVisible(false);
         
         btnENTER.setVisible(false);
         resultadoFG.setVisible(false);
         //botones que usaremos
         peso.setVisible(true);
         estatura.setVisible(true);
         btnPuntoDecimal.setVisible(true);
         btnIMC.setVisible(true);
         btnEnter.setVisible(true);
         btnEnterFG.setVisible(false);
         txtValor2.setVisible(true);
         btnNum0IMC.setVisible(true);
         btnNum1IMC.setVisible(true);
         btnNum2IMC.setVisible(true);
         btnNum3IMC.setVisible(true);
         btnNum4IMC.setVisible(true);
         btnNum5IMC.setVisible(true);
         btnNum6IMC.setVisible(true);
         btnNum7IMC.setVisible(true);
         btnNum8IMC.setVisible(true);
         btnNum9IMC.setVisible(true);
         Resultado.setVisible(true);
         btnEjecutarOperacionIMC.setVisible(false);
         btnRetrocesoIMC.setVisible(false);
         btnCEIMC.setVisible(true);
         btnCIMC.setVisible(false);
         
         Resultado1.setVisible(true);
         Menu.setVisible(true);
         Menu1.setVisible(true);
         Resultado2.setVisible(true);
         Menu2.setVisible(true);
         Menu3.setVisible(true);
         Resultado3.setVisible(true);
         Menu4.setVisible(true);
         Menu5.setVisible(true);
         Resultado4.setVisible(true);
         Menu6.setVisible(true);
         Menu7.setVisible(true);
         txtValor3.setVisible(false);
         
         txtValor.setBounds(120,15,210,35);
         txtValor2.setBounds(120,55,210,35);
         
         Menu7.setBounds(15,240,205,35);
         Menu6.setBounds(15,210,205,35);
         Resultado4.setBounds(15,180,205,35);
         
         Menu5.setBounds(15,240,205,35);
         Menu4.setBounds(15,210,205,35);
         Resultado3.setBounds(15,180,205,35);
         
         Menu3.setBounds(15,240,205,35);
         Menu2.setBounds(15,210,205,35);
         Resultado2.setBounds(15,180,205,35);
         
         
         Menu1.setBounds(15,240,205,35);
         Menu.setBounds(15,210,205,35);
         Resultado1.setBounds(15,180,205,35);
         Resultado.setBounds(15,150,205,35);
         estatura.setBounds(15,15,75,35);
         peso.setBounds(15,55,75,35);
         
         btnEnter.setBounds(380,245,70,25);
         btnIMC.setBounds(15,100,75,35);
         btnPuntoDecimal.setBounds(360,215,45,25);
         btnNum7IMC.setBounds(260,125,45,25);
         btnNum8IMC.setBounds(310,125,45,25);
         btnNum9IMC.setBounds(360,125,45,25);
         
         btnNum4IMC.setBounds(260,155,45,25);
         btnNum5IMC.setBounds(310,155,45,25);
         btnNum6IMC.setBounds(360,155,45,25);
         
         btnNum1IMC.setBounds(260,185,45,25);
         btnNum2IMC.setBounds(310,185,45,25);
         btnNum3IMC.setBounds(360,185,45,25);
         
         btnNum0IMC.setBounds(260,215,45,25);
         btnCambiarSignoANegativo.setBounds(308,215,50,25);
         btnComa.setBounds(360,215,45,25);
         btnEjecutarOperacionIMC.setBounds(410,245,42,25);
         btnRetrocesoIMC.setBounds(260,95,93,25);
         btnCEIMC.setBounds(409,95,52,25);
         btnCIMC.setBounds(410,125,50,25);
         btnCE.setBounds(356,95,50,25);
         btnC.setBounds(165,150,50,25);
         this.setBounds(500,100,475,355);
     }
     else if(e.getSource()==estandar)//decimal
     {
       btnGsm.setVisible(false);  
       btnExpo.setVisible(false);  
       btnLogNat.setVisible(false);  
       btnPotencia.setVisible(false);  
       btnLog.setVisible(false);  
       btnCoseno.setVisible(false);  
       btnNumAlCubo.setVisible(false);  
       btnFactorial.setVisible(false);  
       btnTangente.setVisible(false);  
       btnNumAlCuad.setVisible(false);  
       btnComa.setVisible(false);  
       centimetros.setVisible(false); 
       radianes.setVisible(false);
       btnSeno.setVisible(false);
        btnMultiplicar.setVisible(true);
         btnDividir.setVisible(true);
         btnRestar.setVisible(true);
         btnSumar.setVisible(true);
       btnEjecutarOperacion.setVisible(true);
       
       resultadoFG.setVisible(false);
       
       btnEnterFG.setVisible(false);
       btnENTER.setVisible(false);
       btnNum0FG.setVisible(false);
         btnNum1FG.setVisible(false);
         btnNum2FG.setVisible(false);
         btnNum3FG.setVisible(false);
         btnNum4FG.setVisible(false);
         btnNum5FG.setVisible(false);
         btnNum6FG.setVisible(false);
         btnNum7FG.setVisible(false);
         btnNum8FG.setVisible(false);
         btnNum9FG.setVisible(false);
       
       txtValor3.setVisible(false);
       txtValor2.setVisible(false);
        btnIMC.setVisible(false);
         btnEnter.setVisible(false);
          peso.setVisible(false);
         estatura.setVisible(false);
         Resultado1.setVisible(false);
         Menu.setVisible(false);
         Menu1.setVisible(false);
         Resultado2.setVisible(false);
         Menu2.setVisible(false);
         Menu3.setVisible(false);
         Resultado3.setVisible(false);
         Menu4.setVisible(false);
         Menu5.setVisible(false);
         Resultado4.setVisible(false);
         Menu6.setVisible(false);
         Menu7.setVisible(false);
         
         //botones que no usaremos
         btnNum0IMC.setVisible(false);
         btnNum1IMC.setVisible(false);
         btnNum2IMC.setVisible(false);
         btnNum3IMC.setVisible(false);
         btnNum4IMC.setVisible(false);
         btnNum5IMC.setVisible(false);
         btnNum6IMC.setVisible(false);
         btnNum7IMC.setVisible(false);
         btnNum8IMC.setVisible(false);
         btnNum9IMC.setVisible(false);
         Resultado.setVisible(false);
         btnNum0.setVisible(true);
         btnNum1.setVisible(true);
         btnNum2.setVisible(true);
         btnNum3.setVisible(true);
         btnNum4.setVisible(true);
         btnNum5.setVisible(true);
         btnNum6.setVisible(true);
         btnNum7.setVisible(true);
         btnNum8.setVisible(true);
         btnNum9.setVisible(true);
         btnEjecutarOperacionIMC.setVisible(false);
         btnRetrocesoIMC.setVisible(false);
         btnCEIMC.setVisible(false);
         btnCIMC.setVisible(false);
         
         btnEjecutarOperacion.setVisible(true);
         btnRetroceso.setVisible(true);
         btnCE.setVisible(true);
         btnC.setVisible(true);
         
       this.setBounds(500,100,300,300);
       txtValor.setBounds(10,50,260,35);
       
       btnRetroceso.setBounds(10,90,95,25);
       btnCE.setBounds(110,90,50,25);
       btnC.setBounds(165,90,50,25);
       btnCambiarSignoANegativo.setBounds(220,90,50,25);
       btnNum7.setBounds(10,120,45,25);
       btnNum8.setBounds(60,120,45,25);
       btnNum9.setBounds(110,120,48,25);
       btnDividir.setBounds(165,120,50,25);
       btnCalcularPorcentaje.setBounds(220,120,50,25);
       
       btnNum4.setBounds(10,150,45,25);
       btnNum5.setBounds(60,150,45,25);
       btnNum6.setBounds(110,150,48,25);
       btnMultiplicar.setBounds(165,150,50,25);
       btnFraccion.setBounds(220,150,52,25);
       
       btnNum1.setBounds(10,180,45,25);
       btnNum2.setBounds(60,180,45,25);
       btnNum3.setBounds(110,180,48,25);
       btnRestar.setBounds(165,180,50,25);
       btnRaizCuadrada.setBounds(220,180,52,25);
       
       btnNum0.setBounds(10,210,95,25);
       btnPuntoDecimal.setBounds(110,210,50,25);
       btnSumar.setBounds(165,210,50,25);
       btnEjecutarOperacion.setBounds(220,210,52,25);
       btnFraccion.setVisible(true);
       btnRaizCuadrada.setVisible(true);
       btnCalcularPorcentaje.setVisible(true);
     }
     else
     if(e.getSource()==cientifica)
     {
         //Configurando los controles que aparecen en la calculador
         btnEnterFG.setVisible(false);
         
         btnGsm.setVisible(true);
         btnExpo.setVisible(true);
         btnLogNat.setVisible(true);
         btnSeno.setVisible(true);
         btnPotencia.setVisible(true);
         btnLog.setVisible(true);
         btnCoseno.setVisible(true);
         btnNumAlCubo.setVisible(true);
         btnFactorial.setVisible(true);
         btnTangente.setVisible(true);
         btnNumAlCuad.setVisible(true);
         btnFraccion.setVisible(true);
         btnComa.setVisible(true);
         btnEjecutarOperacion.setVisible(true);
         btnENTER.setVisible(false);
         
         btnRetroceso.setVisible(true);
         btnCE.setVisible(true);
         btnC.setVisible(true);
         btnNum0.setVisible(true);
         btnNum1.setVisible(true);
         btnNum2.setVisible(true);
         btnNum3.setVisible(true);
         btnNum4.setVisible(true);
         btnNum5.setVisible(true);
         btnNum6.setVisible(true);
         btnNum7.setVisible(true);
         btnNum8.setVisible(true);
         btnNum9.setVisible(true);
         
          btnNum0IMC.setVisible(false);
         btnNum1IMC.setVisible(false);
         btnNum2IMC.setVisible(false);
         btnNum3IMC.setVisible(false);
         btnNum4IMC.setVisible(false);
         btnNum5IMC.setVisible(false);
         btnNum6IMC.setVisible(false);
         btnNum7IMC.setVisible(false);
         btnNum8IMC.setVisible(false);
         btnNum9IMC.setVisible(false);
         Resultado.setVisible(false);
         btnEjecutarOperacionIMC.setVisible(false);
         btnRetrocesoIMC.setVisible(false);
         btnCEIMC.setVisible(false);
         btnCIMC.setVisible(false);
         Resultado1.setVisible(false);
         Menu.setVisible(false);
         Menu1.setVisible(false);
         Resultado2.setVisible(false);
         Menu2.setVisible(false);
         Menu3.setVisible(false);
         Resultado3.setVisible(false);
         Menu4.setVisible(false);
         Menu5.setVisible(false);
         Resultado4.setVisible(false);
         Menu6.setVisible(false);
         Menu7.setVisible(false);
         
         btnRaizCuadrada.setVisible(false);
         btnCalcularPorcentaje.setVisible(false);
         
         centimetros.setVisible(true);
         radianes.setVisible(true);
         
         resultadoFG.setVisible(false);
         
         txtValor3.setVisible(false);
         txtValor.setBounds(50,50,405,35);
         btnFraccion.setBounds(180,240,60,25);
         btnNum7.setBounds(260,125,45,25);
         btnNum8.setBounds(310,125,45,25);
         btnNum9.setBounds(360,125,45,25);
         btnDividir.setBounds(410,125,45,25);
         btnNum4.setBounds(260,155,45,25);
         btnNum5.setBounds(310,155,45,25);
         btnNum6.setBounds(360,155,45,25);
         btnMultiplicar.setBounds(410,155,45,25);
         btnNum1.setBounds(260,185,45,25);
         btnNum2.setBounds(310,185,45,25);
         btnNum3.setBounds(360,185,45,25);
         btnRestar.setBounds(410,185,45,25);
         btnNum0.setBounds(260,215,45,25);
         btnCambiarSignoANegativo.setBounds(308,215,50,25);
         btnComa.setBounds(360,215,45,25);
         btnSumar.setBounds(410,215,45,25);
         btnEjecutarOperacion.setBounds(410,245,42,25);
         btnRetroceso.setBounds(260,95,93,25);
         btnCE.setBounds(356,95,50,25);
         btnC.setBounds(409,95,44,25);
         this.setBounds(500,100,475,355);
         
         txtValor2.setVisible(false);
        btnIMC.setVisible(false);
         btnEnter.setVisible(false);
          peso.setVisible(false);
         estatura.setVisible(false);
     }
     else if(e.getSource()==formulageneral)
     {
         //formula general
         btnEnter.setVisible(false);
         btnEnter.setBounds(380,245,70,25);
         btnEnterFG.setVisible(false);
         btnENTER.setVisible(true);
         btnENTER.setBounds(15,100,75,35);
         resultadoFG.setVisible(true);
         resultadoFG.setBounds(15,140,330,35);
         
         btnGsm.setVisible(false);
         btnExpo.setVisible(false);
         btnLogNat.setVisible(false);
         btnSeno.setVisible(false);
         btnPotencia.setVisible(false);
         btnLog.setVisible(false);
         btnCoseno.setVisible(false);
         btnNumAlCubo.setVisible(false);
         btnFactorial.setVisible(false);
         btnTangente.setVisible(false);
         btnNumAlCuad.setVisible(false);
         btnFraccion.setVisible(false);
         btnComa.setVisible(false);
         btnMultiplicar.setVisible(false);
         btnDividir.setVisible(false);
         btnRestar.setVisible(false);
         btnSumar.setVisible(false);
         btnRaizCuadrada.setVisible(false);
         btnCalcularPorcentaje.setVisible(false);
         centimetros.setVisible(false);
         radianes.setVisible(false);
         btnEjecutarOperacion.setVisible(false);
         
         
         btnRetroceso.setVisible(false);
         btnCE.setVisible(false);
         btnC.setVisible(false);
         btnNum0.setVisible(false);
         btnNum1.setVisible(false);
         btnNum2.setVisible(false);
         btnNum3.setVisible(false);
         btnNum4.setVisible(false);
         btnNum5.setVisible(false);
         btnNum6.setVisible(false);
         btnNum7.setVisible(false);
         btnNum8.setVisible(false);
         btnNum9.setVisible(false);
         
          btnNum0IMC.setVisible(false);
         btnNum1IMC.setVisible(false);
         btnNum2IMC.setVisible(false);
         btnNum3IMC.setVisible(false);
         btnNum4IMC.setVisible(false);
         btnNum5IMC.setVisible(false);
         btnNum6IMC.setVisible(false);
         btnNum7IMC.setVisible(false);
         btnNum8IMC.setVisible(false);
         btnNum9IMC.setVisible(false);
         Resultado.setVisible(false);
         
         btnNum0FG.setVisible(false);
         btnNum1FG.setVisible(false);
         btnNum2FG.setVisible(false);
         btnNum3FG.setVisible(false);
         btnNum4FG.setVisible(false);
         btnNum5FG.setVisible(false);
         btnNum6FG.setVisible(false);
         btnNum7FG.setVisible(false);
         btnNum8FG.setVisible(false);
         btnNum9FG.setVisible(false);
         
         btnEjecutarOperacionIMC.setVisible(false);
         btnRetrocesoIMC.setVisible(false);
         btnCEIMC.setVisible(false);
         btnCIMC.setVisible(false);
         Resultado1.setVisible(false);
         Menu.setVisible(false);
         Menu1.setVisible(false);
         Resultado2.setVisible(false);
         Menu2.setVisible(false);
         Menu3.setVisible(false);
         Resultado3.setVisible(false);
         Menu4.setVisible(false);
         Menu5.setVisible(false);
         Resultado4.setVisible(false);
         Menu6.setVisible(false);
         Menu7.setVisible(false);
         
         btnRaizCuadrada.setVisible(false);
         btnCalcularPorcentaje.setVisible(false);
         
         
         
         
         btnFraccion.setBounds(180,240,60,25);
         btnNum7FG.setBounds(260,125,45,25);
         btnNum8FG.setBounds(310,125,45,25);
         btnNum9FG.setBounds(360,125,45,25);
         btnDividir.setBounds(410,125,45,25);
         btnNum4FG.setBounds(260,155,45,25);
         btnNum5FG.setBounds(310,155,45,25);
         btnNum6FG.setBounds(360,155,45,25);
         btnMultiplicar.setBounds(410,155,45,25);
         btnNum1FG.setBounds(260,185,45,25);
         btnNum2FG.setBounds(310,185,45,25);
         btnNum3FG.setBounds(360,185,45,25);
         btnRestar.setBounds(410,185,45,25);
         btnNum0FG.setBounds(260,215,45,25);
         btnCambiarSignoANegativo.setBounds(308,215,50,25);
         btnComa.setBounds(360,215,45,25);
         btnSumar.setBounds(410,215,45,25);
         btnEjecutarOperacion.setBounds(410,245,42,25);
         btnRetroceso.setBounds(260,95,93,25);
         btnCE.setBounds(356,95,50,25);
         btnC.setBounds(409,95,44,25);
         this.setBounds(500,100,475,355);
         
         
         txtValor.setBounds(100,10,405,30);
         txtValor.setVisible(true);
         txtValor2.setBounds(100,35,405,30);
         txtValor2.setVisible(true);
         txtValor3.setBounds(100,65,405,30);
         txtValor3.setVisible(true);
         
        btnIMC.setVisible(false);
         
          peso.setVisible(false);
         estatura.setVisible(false);
      
         
         
         btnRetroceso.setVisible(false);
         btnCE.setVisible(false);
         btnC.setVisible(false);
       
         Resultado.setVisible(false);
         btnEjecutarOperacionIMC.setVisible(false);
         btnRetrocesoIMC.setVisible(false);
         btnCEIMC.setVisible(false);
         btnCIMC.setVisible(false);
         Resultado1.setVisible(false);
         Menu.setVisible(false);
         Menu1.setVisible(false);
         Resultado2.setVisible(false);
         Menu2.setVisible(false);
         Menu3.setVisible(false);
         Resultado3.setVisible(false);
         Menu4.setVisible(false);
         Menu5.setVisible(false);
         Resultado4.setVisible(false);
         Menu6.setVisible(false);
         Menu7.setVisible(false);
        centimetros.setVisible(false); 
       radianes.setVisible(false);
         
         btnRaizCuadrada.setVisible(false);
         btnCalcularPorcentaje.setVisible(false);
         
        
         
         
         btnFraccion.setBounds(180,240,60,25);
         btnNum7.setBounds(260,125,45,25);
         btnNum8.setBounds(310,125,45,25);
         btnNum9.setBounds(360,125,45,25);
         btnDividir.setBounds(410,125,45,25);
         btnNum4.setBounds(260,155,45,25);
         btnNum5.setBounds(310,155,45,25);
         btnNum6.setBounds(360,155,45,25);
         btnMultiplicar.setBounds(410,155,45,25);
         btnNum1.setBounds(260,185,45,25);
         btnNum2.setBounds(310,185,45,25);
         btnNum3.setBounds(360,185,45,25);
         btnRestar.setBounds(410,185,45,25);
         btnNum0.setBounds(260,215,45,25);
         btnCambiarSignoANegativo.setBounds(308,215,50,25);
         btnComa.setBounds(360,215,45,25);
         btnSumar.setBounds(410,215,45,25);
         btnEjecutarOperacion.setBounds(410,245,42,25);
         btnRetroceso.setBounds(260,95,93,25);
         btnCE.setBounds(356,95,50,25);
         btnC.setBounds(409,95,44,25);
         this.setBounds(500,100,475,355);
         btnEnterFG.setBounds(380,245,70,25);
         
        btnIMC.setVisible(false);
        btnCambiarSignoANegativo.setVisible(false); 
          peso.setVisible(false);
         estatura.setVisible(false);
     }
     
   };
};