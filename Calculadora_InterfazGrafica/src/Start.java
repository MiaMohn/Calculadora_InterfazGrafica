/*
 * @author Maria Gaio a.k.a. Mia Mohn
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Start {
	
	//Declaración de Variables

	private JFrame frame;
	private JTextField cajaTexto;
	private JButton botonC;
	private JButton botonPar;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JButton boton5;
	private JButton boton6;
	private JButton boton7;
	private JButton boton8;
	private JButton boton9;
	private JButton boton0;
	private JButton botonIgual;
	private JButton botonSuma;
	private JButton botonResta;
	private JButton botonMultiplicacion;
	private JButton botonDivision;
	
	private String contenidoCaja = "";
	private String num1 = "";
	private String num2 = "";
	private String operacion = "";
	private float n1 = 0.0f;
	private float n2 = 0.0f;
	private float res = 0.0f;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 346, 538);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		cajaTexto = new JTextField();
		cajaTexto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cajaTexto.setHorizontalAlignment(SwingConstants.RIGHT);
		
		cajaTexto.setEditable(false);	//Se bloquea la caja de texto para que el usuario solo pueda editarla mediante botones
		
		cajaTexto.setBounds(42, 41, 245, 53);
		frame.getContentPane().add(cajaTexto);
		cajaTexto.setColumns(10);
		
		//Botón C : resetea el contenido
		
		botonC = new JButton("C");
		botonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = "";
				num2 = "";
				operacion = "";
				cajaTexto.setText("");
				
				botonPar.setEnabled(true);
				boton1.setEnabled(true);
				boton2.setEnabled(true);
				boton3.setEnabled(true);
				boton4.setEnabled(true);
				boton5.setEnabled(true);
				boton6.setEnabled(true);
				boton7.setEnabled(true);
				boton8.setEnabled(true);
				boton9.setEnabled(true);
				boton0.setEnabled(true);
				botonIgual.setEnabled(true);
				botonSuma.setEnabled(true);
				botonResta.setEnabled(true);
				botonMultiplicacion.setEnabled(true);
				botonDivision.setEnabled(true);;
				
			}
		});
		botonC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		botonC.setBounds(42, 126, 50, 50);
		frame.getContentPane().add(botonC);
		
		//Botón Par : detecta si un numero es par o impar
		
		botonPar = new JButton("Par");
		botonPar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = cajaTexto.getText().toString();
				
				if(num1.equals(""))
				{
					cajaTexto.setText("Error");
				}
				else
				{
					try
					{
						n1 = Float.parseFloat(num1);
						
						if(n1 % 2 == 0)
						{
							cajaTexto.setText("Par");
						}
						else
						{
							cajaTexto.setText("Impar");
						}
	
					}
					catch (Exception ex)
					{
						cajaTexto.setText("Error");
					}
				}
				
				botonPar.setEnabled(false);
				boton1.setEnabled(false);
				boton2.setEnabled(false);
				boton3.setEnabled(false);
				boton4.setEnabled(false);
				boton5.setEnabled(false);
				boton6.setEnabled(false);
				boton7.setEnabled(false);
				boton8.setEnabled(false);
				boton9.setEnabled(false);
				boton0.setEnabled(false);
				botonIgual.setEnabled(false);
				botonSuma.setEnabled(false);
				botonResta.setEnabled(false);
				botonMultiplicacion.setEnabled(false);
				botonDivision.setEnabled(false);;
			}
		});
		botonPar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		botonPar.setBounds(102, 126, 80, 50);
		frame.getContentPane().add(botonPar);
		
		//Botones numericos
		
		boton1 = new JButton("1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contenidoCaja = cajaTexto.getText().toString();
				contenidoCaja = contenidoCaja + "1";
				cajaTexto.setText(contenidoCaja);
			}
		});
		boton1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boton1.setBounds(42, 212, 50, 50);
		frame.getContentPane().add(boton1);
		
		boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contenidoCaja = cajaTexto.getText().toString();
				contenidoCaja = contenidoCaja + "2";
				cajaTexto.setText(contenidoCaja);
			}
		});
		boton2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boton2.setBounds(102, 212, 50, 50);
		frame.getContentPane().add(boton2);
		
		boton3 = new JButton("3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contenidoCaja = cajaTexto.getText().toString();
				contenidoCaja = contenidoCaja + "3";
				cajaTexto.setText(contenidoCaja);
			}
		});
		boton3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boton3.setBounds(162, 212, 50, 50);
		frame.getContentPane().add(boton3);
		
		boton4 = new JButton("4");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contenidoCaja = cajaTexto.getText().toString();
				contenidoCaja = contenidoCaja + "4";
				cajaTexto.setText(contenidoCaja);
			}
		});
		boton4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boton4.setBounds(42, 283, 50, 50);
		frame.getContentPane().add(boton4);
		
		boton5 = new JButton("5");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contenidoCaja = cajaTexto.getText().toString();
				contenidoCaja = contenidoCaja + "5";
				cajaTexto.setText(contenidoCaja);
			}
		});
		boton5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boton5.setBounds(102, 283, 50, 50);
		frame.getContentPane().add(boton5);
		
		boton6 = new JButton("6");
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contenidoCaja = cajaTexto.getText().toString();
				contenidoCaja = contenidoCaja + "6";
				cajaTexto.setText(contenidoCaja);
			}
		});
		boton6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boton6.setBounds(162, 283, 50, 50);
		frame.getContentPane().add(boton6);
		
		boton7 = new JButton("7");
		boton7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contenidoCaja = cajaTexto.getText().toString();
				contenidoCaja = contenidoCaja + "7";
				cajaTexto.setText(contenidoCaja);
			}
		});
		boton7.setBounds(42, 354, 50, 50);
		frame.getContentPane().add(boton7);
		
		boton8 = new JButton("8");
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contenidoCaja = cajaTexto.getText().toString();
				contenidoCaja = contenidoCaja + "8";
				cajaTexto.setText(contenidoCaja);
			}
		});
		boton8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boton8.setBounds(102, 354, 50, 50);
		frame.getContentPane().add(boton8);
		
		boton9 = new JButton("9");
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contenidoCaja = cajaTexto.getText().toString();
				contenidoCaja = contenidoCaja + "9";
				cajaTexto.setText(contenidoCaja);
			}
		});
		boton9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boton9.setBounds(162, 354, 50, 50);
		frame.getContentPane().add(boton9);
		
		boton0 = new JButton("0");
		boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contenidoCaja = cajaTexto.getText().toString();
				contenidoCaja = contenidoCaja + "0";
				cajaTexto.setText(contenidoCaja);
			}
		});
		boton0.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boton0.setBounds(42, 415, 50, 50);
		frame.getContentPane().add(boton0);
		
		//Boton Igual : Detecta que operacion se realizará y devuelve el resultado
		
		botonIgual = new JButton("=");
		botonIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num2 = cajaTexto.getText().toString();
				cajaTexto.setText("");
				
				if(num2.equals(""))
				{
					cajaTexto.setText("Error");
				}
				else
				{
					try
					{
						//Se convierte el numero almacenado en un String a float
						
						n1 = Float.parseFloat(num1);
						n2 = Float.parseFloat(num2);
						
						if (operacion.equals("+"))	//Suma
						{
							res = n1 + n2;
							cajaTexto.setText("" + res);
						}
						
						else if (operacion.equals("-"))	//Resta
						{
							res = n1 - n2;
							cajaTexto.setText("" + res);
						}
						
						else if (operacion.equals("*"))	//Multiplicacion
						{
							res = n1 * n2;
							cajaTexto.setText("" + res);
						}
						
						else if (operacion.equals("/"))	//Division
						{
							if (n1 == 0 || n2 == 0)
							{
								cajaTexto.setText("Indeterminación");
							}
							else
							{
								res = n1 / n2;	
								cajaTexto.setText("" + res);
							}
						}
					}
					catch (Exception ex)
					{
						cajaTexto.setText("Error");
					}
				}
				
				botonPar.setEnabled(false);
				boton1.setEnabled(false);
				boton2.setEnabled(false);
				boton3.setEnabled(false);
				boton4.setEnabled(false);
				boton5.setEnabled(false);
				boton6.setEnabled(false);
				boton7.setEnabled(false);
				boton8.setEnabled(false);
				boton9.setEnabled(false);
				boton0.setEnabled(false);
				botonIgual.setEnabled(false);
				botonSuma.setEnabled(false);
				botonResta.setEnabled(false);
				botonMultiplicacion.setEnabled(false);
				botonDivision.setEnabled(false);;
				
			}
		});
		botonIgual.setFont(new Font("Tahoma", Font.PLAIN, 16));
		botonIgual.setBounds(102, 415, 110, 50);
		frame.getContentPane().add(botonIgual);
		
		//Botones de Operaciones
		
		botonSuma = new JButton("+");
		botonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = cajaTexto.getText().toString();
				
				if(num1.equals(""))
				{
					cajaTexto.setText("Error");
					
					botonPar.setEnabled(false);
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					boton0.setEnabled(false);
					botonIgual.setEnabled(false);
					botonSuma.setEnabled(false);
					botonResta.setEnabled(false);
					botonMultiplicacion.setEnabled(false);
					botonDivision.setEnabled(false);;
				}
				else
				{
				cajaTexto.setText("");
				operacion = "+";
				
				botonPar.setEnabled(false);
				botonSuma.setEnabled(false);
				botonResta.setEnabled(false);
				botonMultiplicacion.setEnabled(false);
				botonDivision.setEnabled(false);;
				}
			}
		});
		botonSuma.setFont(new Font("Tahoma", Font.PLAIN, 16));
		botonSuma.setBounds(237, 212, 50, 50);
		frame.getContentPane().add(botonSuma);
		
		botonResta = new JButton("-");
		botonResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = cajaTexto.getText().toString();
				
				if(num1.equals(""))
				{
					cajaTexto.setText("Error");
					
					botonPar.setEnabled(false);
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					boton0.setEnabled(false);
					botonIgual.setEnabled(false);
					botonSuma.setEnabled(false);
					botonResta.setEnabled(false);
					botonMultiplicacion.setEnabled(false);
					botonDivision.setEnabled(false);;
				}
				else
				{
				cajaTexto.setText("");
				operacion = "-";
				
				botonPar.setEnabled(false);
				botonSuma.setEnabled(false);
				botonResta.setEnabled(false);
				botonMultiplicacion.setEnabled(false);
				botonDivision.setEnabled(false);;
				}
				
			}
		});
		botonResta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		botonResta.setBounds(237, 283, 50, 50);
		frame.getContentPane().add(botonResta);
		
		botonMultiplicacion = new JButton("*");
		botonMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = cajaTexto.getText().toString();
				
				if(num1.equals(""))
				{
					cajaTexto.setText("Error");
					
					botonPar.setEnabled(false);
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					boton0.setEnabled(false);
					botonIgual.setEnabled(false);
					botonSuma.setEnabled(false);
					botonResta.setEnabled(false);
					botonMultiplicacion.setEnabled(false);
					botonDivision.setEnabled(false);;
				}
				else
				{
				cajaTexto.setText("");
				operacion = "*";
				
				botonPar.setEnabled(false);
				botonSuma.setEnabled(false);
				botonResta.setEnabled(false);
				botonMultiplicacion.setEnabled(false);
				botonDivision.setEnabled(false);;
				}
				
			}
		});
		botonMultiplicacion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		botonMultiplicacion.setBounds(237, 354, 50, 50);
		frame.getContentPane().add(botonMultiplicacion);
		
		botonDivision = new JButton("/");
		botonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = cajaTexto.getText().toString();
				
				if(num1.equals(""))
				{
					cajaTexto.setText("Error");
					
					botonPar.setEnabled(false);
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
					boton9.setEnabled(false);
					boton0.setEnabled(false);
					botonIgual.setEnabled(false);
					botonSuma.setEnabled(false);
					botonResta.setEnabled(false);
					botonMultiplicacion.setEnabled(false);
					botonDivision.setEnabled(false);;
				}
				else
				{
				cajaTexto.setText("");
				operacion = "/";
				
				botonPar.setEnabled(false);
				botonSuma.setEnabled(false);
				botonResta.setEnabled(false);
				botonMultiplicacion.setEnabled(false);
				botonDivision.setEnabled(false);;
				}
				
			}
		});
		botonDivision.setFont(new Font("Tahoma", Font.PLAIN, 16));
		botonDivision.setBounds(237, 415, 50, 50);
		frame.getContentPane().add(botonDivision);
	}
}
