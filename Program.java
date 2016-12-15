package com.lessons.frontend;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Program extends JFrame {
	private double op1 = 0, op2 = 0;
	int operacion = 0;
	private boolean nueva = true;
	private JPanel pnlContainer;
	private JTextField txtForm;
	private JButton btnCE;
	private JButton btnC;
	private JButton btnEmpty2;
	private JButton btnEmpty3;
	private JButton btn0;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnMultiply;
	private JButton btnDivide;
	private JButton btnDot;
	private JButton btnEqual;

	public Program() {
		// Setear el titulo de la ventana
		this.setTitle("Calculator");
		// Definir la dimension de la ventana (ancho, alto)
		this.setSize(250, 300);
		// Setear NO dimensionable la ventana
		this.setResizable(false);
		// Ubicar la ventana en el centro de la pantalla
		this.setLocationRelativeTo(null);
		// Cerrar la ventana al hacer click en boton de X (cerrar)
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Setear icono de la barra superior de la ventana
		this.setIconImage(new ImageIcon(
				getClass().getResource("./calculator-16-170891.png"))
						.getImage());
		// Agregar el panel al JFrame
		this.getContentPane().add(this.createPanelContainer());
		// Hacer visible la ventana
		this.setVisible(true);
	}

	private JPanel createPanelContainer() {
		pnlContainer = new JPanel(); // crear panel contenedor
		pnlContainer.setLayout(new GridBagLayout()); // setear el layout manager del panel contenedor
		GridBagConstraints gbc = new GridBagConstraints(); // crear objeto para las definir las reglas de layout

		txtForm = new JTextField();
		gbc.gridx = 0; // número columna
		gbc.gridy = 0; // número fila
		gbc.gridwidth = 4; // numero de columnas de ancho
		gbc.gridheight = 1; // numero de filas de ancho
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.BOTH; // rellenar la celda en ambos sentidos (horizontal y vertical)
		gbc.insets = new Insets(3, 3, 3, 3); // definir el relleno exterior
		pnlContainer.add(txtForm, gbc); // agregar el textField al panel contenedor
       
		btnCE = new JButton("CE");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		pnlContainer.add(btnCE, gbc);
		btnCE.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed (ActionEvent e){
			txtForm.setText("");
				op1=op2=0;
			}
				
			});

		btnC = new JButton("C ");
		gbc.gridx = 1;
		gbc.gridy = 1;
		pnlContainer.add(btnC, gbc);

		btnEmpty2 = new JButton("  ");
		gbc.gridx = 2;
		gbc.gridy = 1;
		pnlContainer.add(btnEmpty2, gbc);

		btnEmpty3 = new JButton("");
		gbc.gridx = 3;
		gbc.gridy = 1;
		pnlContainer.add(btnEmpty3, gbc);

		btn7 = new JButton("7");
		gbc.gridx = 0;
		gbc.gridy = 2;
		pnlContainer.add(btn7, gbc);
		btn7.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed (ActionEvent e){
				if (nueva){
					txtForm.setText("");
					nueva=false;
				}
				txtForm.setText(txtForm.getText()+"7");
			}
		});
		
		btn8 = new JButton("8");
		gbc.gridx = 1;
		gbc.gridy = 2;
		pnlContainer.add(btn8, gbc);
		btn8.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed (ActionEvent e){
				if (nueva){
					txtForm.setText("");
					nueva=false;
				}
				txtForm.setText(txtForm.getText()+"8");
			}
		});

		btn9 = new JButton("9");
		gbc.gridx = 2;
		gbc.gridy = 2;
		pnlContainer.add(btn9, gbc);
		btn9.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed (ActionEvent e){
				if (nueva){
					txtForm.setText("");
					nueva=false;
				}
				txtForm.setText(txtForm.getText()+"9");
			}
		});

		btnDivide = new JButton("/");
		gbc.gridx = 3;
		gbc.gridy = 2;
		pnlContainer.add(btnDivide, gbc);

		btn4 = new JButton("4");
		gbc.gridx = 0;
		gbc.gridy = 3;
		pnlContainer.add(btn4, gbc);
		btn4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed (ActionEvent e){
				if (nueva){
					txtForm.setText("");
					nueva=false;
				}
				txtForm.setText(txtForm.getText()+"4");
			}
		});

		btn5 = new JButton("5");
		gbc.gridx = 1;
		gbc.gridy = 3;
		pnlContainer.add(btn5, gbc);
		btn5.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed (ActionEvent e){
				if (nueva){
					txtForm.setText("");
					nueva=false;
				}
				txtForm.setText(txtForm.getText()+"5");
			}
		});

		btn6 = new JButton("6");
		gbc.gridx = 2;
		gbc.gridy = 3;
		pnlContainer.add(btn6, gbc);
		btn6.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed (ActionEvent e){
				if (nueva){
					txtForm.setText("");
					nueva=false;
				}
				txtForm.setText(txtForm.getText()+"6");
			}
		});

		btnMultiply = new JButton("*");
		gbc.gridx = 3;
		gbc.gridy = 3;
		pnlContainer.add(btnMultiply, gbc);

		btn1 = new JButton("1");
		gbc.gridx = 0;
		gbc.gridy = 4;
		pnlContainer.add(btn1, gbc);
		btn1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed (ActionEvent e){
				if (nueva){
					txtForm.setText("");
					nueva=false;
				}
				txtForm.setText(txtForm.getText()+"1");
			}
		});

		btn2 = new JButton("2");
		gbc.gridx = 1;
		gbc.gridy = 4;
		pnlContainer.add(btn2, gbc);
		btn2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed (ActionEvent e){
				if (nueva){
					txtForm.setText("");
					nueva=false;
				}
				txtForm.setText(txtForm.getText()+"2");
			}
		});

		btn3 = new JButton("3");
		gbc.gridx = 2;
		gbc.gridy = 4;
		pnlContainer.add(btn3, gbc);
		btn3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed (ActionEvent e){
				if (nueva){
					txtForm.setText("");
					nueva=false;
				}
				txtForm.setText(txtForm.getText()+"3");
			}
		});

		btnMinus = new JButton("-");
		gbc.gridx = 3;
		gbc.gridy = 4;
		pnlContainer.add(btnMinus, gbc);

		btn0 = new JButton("0");
		gbc.gridx = 0;
		gbc.gridy = 5;
		pnlContainer.add(btn0, gbc);
		btn0.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed (ActionEvent e){
				if (nueva){
					txtForm.setText("");
					nueva=false;
				}
				txtForm.setText(txtForm.getText()+"0");
			}
		});

		btnDot = new JButton(".");
		gbc.gridx = 1;
		gbc.gridy = 5;
		pnlContainer.add(btnDot, gbc);

		btnEqual = new JButton("=");
		gbc.gridx = 2;
		gbc.gridy = 5;
		pnlContainer.add(btnEqual, gbc);

		btnPlus = new JButton("+");
		gbc.gridx = 3;
		gbc.gridy = 5;
		pnlContainer.add(btnPlus, gbc);
		btnPlus.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed (ActionEvent e){
				if (op1!=0)
					//op1=op1+ double.parsedouble (txtForm.getText());
				//else
					//op1=double.parsedouble (txtForm.getText());
				operacion = 1;
				txtForm.setText("");
				txtForm.setText(txtForm.getText()+"btnPlus");
			
			}
		});

		return pnlContainer;
	}

	public static void main(String[] args) {
		new Program();
	}

}
