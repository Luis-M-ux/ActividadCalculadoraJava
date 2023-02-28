package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


public class Calculadora extends JFrame {
	public JButton btnSuma, btnResta, btnMult, btnDiv, btnIgual, limpiar,
	nueve, ocho, siete, seis, cinco, cuatro, tres, dos, uno, cero;

	public JLabel textfield, textfield2;

	public Calculadora() {
		componentes();
	}

	public void componentes() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);

		/* _Caja_de_Texto_Para_Guardar_Operaciones Falta_Implementar */
		textfield = new JLabel();
		textfield.setBounds(15, 12, 165, 55);
		textfield.setOpaque(true);
		textfield.setBackground(Color.cyan);
		panel.add(textfield);
		/* Segunda_Caja_de_Texto */
		textfield2 = new JLabel();
		textfield2.setBounds(15, 70, 165, 40);
		textfield2.setHorizontalAlignment(SwingConstants.RIGHT); // Ubicar_Texto_al_Lado_Derecho
		textfield2.setOpaque(true);
		textfield2.setBackground(Color.white); // Color_de_La_Caja_de_Texto
		textfield2.setForeground(Color.BLACK); // Color_de_La_Letra(en_este_caso_Numeros)
		textfield2.setFont(new Font("arial", Font.BOLD, 20)); // Tipo_de_Fuente_a_Utilizar_Normal,_Negrita_y_Tamaño
		panel.add(textfield2);
		// _Botone_1
		uno = new JButton("1");
		uno.setBounds(10, 125, 45, 45);
		panel.add(uno);
		// _Botone_2
		dos = new JButton("2");
		dos.setBounds(55, 125, 45, 45);
		panel.add(dos);
		// _Botone_3
		tres = new JButton("3");
		tres.setBounds(100, 125, 45, 45);
		panel.add(tres);
		// _Botone_Limpiar_"C"
		limpiar = new JButton("C");
		limpiar.setBounds(145, 125, 45, 45);
		panel.add(limpiar);
		// _Botone_4
		cuatro = new JButton("4");
		cuatro.setBounds(10, 170, 45, 45);
		panel.add(cuatro);
		// _Botone_5
		cinco = new JButton("5");
		cinco.setBounds(55, 170, 45, 45);
		panel.add(cinco);
		// _Botone_6
		seis = new JButton("6");
		seis.setBounds(100, 170, 45, 45);
		panel.add(seis);
		// _Botone_suma_"+"
		btnSuma = new JButton("+");
		btnSuma.setBounds(145, 170, 45, 45);
		panel.add(btnSuma);
		// _Botone_7
		siete = new JButton("7");
		siete.setBounds(10, 215, 45, 45);
		panel.add(siete);
		// _Botone_8
		ocho = new JButton("8");
		ocho.setBounds(55, 215, 45, 45);
		panel.add(ocho);
		// _Botone_9
		nueve = new JButton("9");
		nueve.setBounds(100, 215, 45, 45);
		panel.add(nueve);
		// _Botone_"-"
		btnResta = new JButton("-");
		btnResta.setBounds(145, 215, 45, 45);
		panel.add(btnResta);
		// _Botone_0
		cero = new JButton("0");
		cero.setBounds(10, 260, 45, 45);
		panel.add(cero);
		// _Botone_X
		btnMult = new JButton("x");
		btnMult.setBounds(55, 260, 45, 45);
		panel.add(btnMult);
		// _Botone_'/'
		btnDiv = new JButton("/");
		btnDiv.setBounds(100, 260, 45, 45);
		panel.add(btnDiv);
		// _Botone_'='
		btnIgual = new JButton("=");
		btnIgual.setBounds(145, 260, 45, 45);
		panel.add(btnIgual);
		btnIgual.setBorder(new LineBorder(Color.GREEN));
	}

}
