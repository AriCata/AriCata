package conversor;

public class Libra implements Moneda{
	
	private double cantidad;

	public Libra(double cantidad) {
		super();
		this.cantidad = cantidad;
	}

	@Override
	public double cantidadEnEuros() {
		return cantidad*1.1029861;
	}
}
