package application;

public class Fibonacci {
	
	public int calculaFibonacci(int i) {
		//m�todo recursivo com o operador tern�rio aplicado
		return (i > 1) ? calculaFibonacci(i-2) + calculaFibonacci(i-1) : i;
	}
}
