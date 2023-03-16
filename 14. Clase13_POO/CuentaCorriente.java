
public class CuentaCorriente extends Cuenta implements ImpuestoGravable, Comparable{
	
	private double descubiertoPermitido;
	private Integer saldoExtra;

	public CuentaCorriente(Integer saldoExtra) {
		this.descubiertoPermitido = descubiertoPermitido;
		this.saldoExtra = saldoExtra;
	}

	public double getDescubiertoPermitido() {
		return descubiertoPermitido;
	}



	public void setDescubiertoPermitido(double descubiertoPermitido) {
		this.descubiertoPermitido = descubiertoPermitido;
	}



	@Override
	public void extraer(double monto) {
		if(informarSaldo() + descubiertoPermitido <= monto)
			setSaldo(informarSaldo() - monto);
		
		
	}

	@Override
	public Double gravar(Double porcentaje) {
		double montoADescontar = getSaldo() * porcentaje;
		setSaldo(getSaldo()- montoADescontar); //logica segun la consigna
		return montoADescontar;

	}

	@Override
	public int compareTo(Object obj) {
		CuentaCorriente c1 = (CuentaCorriente) obj; //casting
		int respuesta = 0;

		if (this.saldoExtra > c1.saldoExtra) respuesta = 1;

		if(this.saldoExtra < c1.saldoExtra) respuesta = -1;


		return respuesta;
	}
}
