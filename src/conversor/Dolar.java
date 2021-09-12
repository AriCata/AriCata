package conversor;

public class Dolar implements Moneda{
	
	private double cantidad;

	public Dolar(double cantidad) {
		super();
		this.cantidad = cantidad;
	}

	@Override
	public double cantidadEnEuros() {
			return cantidad*0.883509299;
	}

}
