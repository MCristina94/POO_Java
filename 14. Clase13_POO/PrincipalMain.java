
public class PrincipalMain {

	public static void main(String[] args) {

	/*	CajaAhorro ca = new CajaAhorro();
		ca.setSaldo(100);
		ca.cobrarIntereses();
		
		System.out.println(ca.informarSaldo());*/

		/*CuentaCorriente cc = new CuentaCorriente();
		cc.setSaldo(1000);
		cc.gravar(0.21);
		System.out.println(cc.informarSaldo());*/

		CuentaCorriente cc1 = new CuentaCorriente(1600);
		CuentaCorriente cc2 = new CuentaCorriente(600);

		if(cc1.compareTo(cc2)>0){
			System.out.println("la cuenta 1 es mayor que la cuenta 2");
		}else if(cc1.compareTo(cc2)<0){
			System.out.println("la cuenta 1 es menor que la cuenta 2");
		}else{
			System.out.println("las cuentas son iguales");
		}


	}

}
