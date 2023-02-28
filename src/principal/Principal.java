package principal;

import controlador.Controlador;
import modelo.Modelo;
import vista.Calculadora;

//import calculadora.componentes;
public class Principal {
	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		Modelo model = new Modelo();
		c.componentes();
		Controlador controladr = new Controlador(model, c);
		controladr.iniciarVista();
		c.setVisible(true);
	}

}
