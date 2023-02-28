package modelo;

public class Modelo {
	public int num1, resultado;
	public String oper = "nula", cadenaNum = "";
	public boolean activado = true;
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	public String getOper() {
		return oper;
	}
	public void setOper(String oper) {
		this.oper = oper;
	}
	public String getCadenaNum() {
		return cadenaNum;
	}
	public void setCadenaNum(String cadenaNum) {
		this.cadenaNum = cadenaNum;
	}
	public boolean isActivado() {
		return activado;
	}
	public void setActivado(boolean activado) {
		this.activado = activado;
	}
}
