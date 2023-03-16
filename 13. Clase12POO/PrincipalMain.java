
public class PrincipalMain {

	public static void main(String[] args) {

		/*CajaAhorro ca = new CajaAhorro();
		ca.setSaldo(100);
		ca.cobrarIntereses();
		
		System.out.println(ca.informarSaldo());*/

		CuentaComitente cuenta1 = new CuentaComitente(10000.0, "abc123");
		cuenta1.extraer(8000.0);
		
	}

}
