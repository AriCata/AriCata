package conversor;

public class Yen implements Moneda{
	
	private double cantidad;

	public Yen(double cantidad) {
		super();
		this.cantidad = cantidad;
	}

	@Override
	public double cantidadEnEuros() {
		return cantidad*0.00779327499;
	}
}
