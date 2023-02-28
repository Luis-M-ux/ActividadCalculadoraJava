package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Modelo;
import vista.Calculadora;

public class Controlador implements ActionListener{
	private Calculadora c;
	private Modelo model;

	// Constructor
	public Controlador(Modelo model, Calculadora c) {
		this.model = model;
		this.c = c;
		this.c.uno.addActionListener(this);
		this.c.dos.addActionListener(this);
		this.c.tres.addActionListener(this);
		this.c.cuatro.addActionListener(this);
		this.c.cinco.addActionListener(this);
		this.c.seis.addActionListener(this);
		this.c.siete.addActionListener(this);
		this.c.ocho.addActionListener(this);
		this.c.nueve.addActionListener(this);
		this.c.btnSuma.addActionListener(this);
		this.c.btnResta.addActionListener(this);
		this.c.btnMult.addActionListener(this);
		this.c.btnDiv.addActionListener(this);
		this.c.btnIgual.addActionListener(this);
		this.c.cero.addActionListener(this);
	}
	public void iniciarVista() {
		c.setTitle("Calculadora");
		c.setLocationRelativeTo(null);
		c.setSize(205, 350);
//		c.setLayout(null);
		c.setResizable(true);
//		c.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		// Recepción_de _Eventos Para_cada_Botón
		if (e.getSource() == c.uno) {
			model.cadenaNum += "1";
			c.textfield2.setText(model.cadenaNum);
			model.activado = true;
		}
		if (e.getSource() == c.dos) {
			model.cadenaNum += "2";
			c.textfield2.setText(model.cadenaNum);
			model.activado = true;
		}
		if (e.getSource() == c.tres) {
			model.cadenaNum += "3";
			c.textfield2.setText(model.cadenaNum);
			model.activado = true;
		}
		if (e.getSource() == c.cuatro) {
			model.cadenaNum += "4";
			c.textfield2.setText(model.cadenaNum);
			model.activado = true;
		}
		if (e.getSource() == c.cinco) {
			model.cadenaNum += "5";
			c.textfield2.setText(model.cadenaNum);
			model.activado = true;
		}
		if (e.getSource() == c.seis) {
			model.cadenaNum += "6";
			c.textfield2.setText(model.cadenaNum);
			model.activado = true;
		}
		if (e.getSource() == c.siete) {
			model.cadenaNum += "7";
			c.textfield2.setText(model.cadenaNum);
			model.activado = true;
		}
		if (e.getSource() == c.ocho) {
			model.cadenaNum += "8";
			c.textfield2.setText(model.cadenaNum);
			model.activado = true;
		}
		if (e.getSource() == c.nueve) {
			model.cadenaNum += "9";
			c.textfield2.setText(model.cadenaNum);
			model.activado = true;
		}
		if (e.getSource() == c.cero) {
			if (model.cadenaNum == "") {
				model.activado = false;
			} else {
				if (model.cadenaNum != "" || model.cadenaNum != model.oper && model.num1 > 0) {
					model.cadenaNum += "0";
					c.textfield2.setText(model.cadenaNum);
					model.activado = true;
				}
			}
		}
		// _Borrar_Console
		if (e.getSource() == c.limpiar) {
			if (model.cadenaNum == "") {
				model.activado = false;
			}
			model.cadenaNum = "";
			c.textfield2.setText("");
		}
		// _Sumar
		if (e.getSource() == c.btnSuma) {
			if (model.cadenaNum == "") {
				model.activado = false;
			}
			if (model.activado == true) {
				model.num1 = Integer.parseInt(model.cadenaNum);
				c.textfield2.setText("+");
				model.cadenaNum = "";
				model.oper = "sumar";
				model.activado = false;
			}
		}
		;
		// _Restar
		if (e.getSource() == c.btnResta) {
			if (model.cadenaNum == "") {
				model.activado = false;
			}
			if (model.activado == true) {
				model.num1 = Integer.parseInt(model.cadenaNum);
				c.textfield2.setText("-");
				model.cadenaNum = "";
				model.oper = "restar";
				model.activado = false;
			}
		}
		// _Multiplicar
		if (e.getSource() == c.btnMult) {
			if (model.cadenaNum == "") {
				model.activado = false;
			}
			if (model.activado == true) {
				model.num1 = Integer.parseInt(model.cadenaNum);
				c.textfield2.setText("X");
				model.cadenaNum = "";
				model.oper = "multiplicar";
				model.activado = false;
			}
		}
		// _Dividir
		if (e.getSource() == c.btnDiv) {
			if (model.cadenaNum == "") {
				model.activado = false;
			}
			if (model.activado == true) {
				model.num1 = Integer.parseInt(model.cadenaNum);
				c.textfield2.setText("/");
				model.cadenaNum = "";
				model.oper = "dividir";
				model.activado = false;
			}
		}
		// _Igual
		if (e.getSource() == c.btnIgual) {
			if (model.cadenaNum == "") {
				model.activado = false;
			} else {
				int num2;
				num2 = Integer.parseInt(model.cadenaNum);

				if (model.activado == true) {
					if (model.oper.equals("null")) {
						c.textfield.setText(model.cadenaNum);
					} else if (model.oper.equals("sumar")) {
						model.resultado = model.num1 + num2;
						c.textfield2.setText(String.valueOf(model.resultado));
						model.cadenaNum = String.valueOf(model.resultado);
						model.activado = true;
						model.oper = "null";
					} else if (model.oper.equals("restar")) {
						model.resultado = model.num1 - num2;
						c.textfield2.setText(String.valueOf(model.resultado));
						model.cadenaNum = String.valueOf(model.resultado);
						model.activado = true;
						model.oper = "null";
					} else if (model.oper.equals("multiplicar")) {
						model.resultado = model.num1 * num2;
						c.textfield2.setText(String.valueOf(model.resultado));
					} else if (model.oper.equals("dividir")) {
						if (num2 != 0) {
							model.resultado = model.num1 / num2;
							c.textfield2.setText(String.valueOf(model.resultado));
						} else {
							String mensaje = "Ingrese un Valor a dividir diferente de Cero!";
							c.textfield2.setText(mensaje);
							return;
						}
					}
				}

			}
			model.activado = true;
		}

	}

}
