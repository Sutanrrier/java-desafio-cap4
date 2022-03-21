package application;

public class Fibonacci {
	
	public int calculaFibonacci(int i) {
		//método recursivo com o operador ternário aplicado
		return (i > 1) ? calculaFibonacci(i-2) + calculaFibonacci(i-1) : i;
	}
}
