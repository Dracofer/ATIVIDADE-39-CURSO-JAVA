package entities;

public class Product {
	
	private double altura;
	private char genero;
	private double mAlta = 0;
	private double mBaixa = 100;
	private double nHomens = 0;
	private double mAltura = 0;
	private double nMulheres = 0;
	
	public Product(double altura, char genero, double mAlta, double mBaixa, double nHomens, double mAltura,
			double nMulheres) {
		this.altura = altura;
		this.genero = genero;
		this.mAlta = mAlta;
		this.mBaixa = mBaixa;
		this.nHomens = nHomens;
		this.mAltura = mAltura;
		this.nMulheres = nMulheres;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public double getmAlta() {
		return mAlta;
	}
	public void setmAlta(double mAlta) {
		this.mAlta = mAlta;
	}
	public double getmBaixa() {
		return mBaixa;
	}
	public void setmBaixa(double mBaixa) {
		this.mBaixa = mBaixa;
	}
	public double getnHomens() {
		return nHomens;
	}
	public void setnHomens(double nHomens) {
		this.nHomens = nHomens;
	}
	public double getmAltura() {
		return mAltura;
	}
	public void setmAltura(double mAltura) {
		this.mAltura = mAltura;
	}
	public double getnMulheres() {
		return nMulheres;
	}
	public void setnMulheres(double nMulheres) {
		this.nMulheres = nMulheres;
	}
	public double getmediaAlturaMulher(double mediaAlturaMulher) {
		return mAltura / nMulheres;
	}
	
}
