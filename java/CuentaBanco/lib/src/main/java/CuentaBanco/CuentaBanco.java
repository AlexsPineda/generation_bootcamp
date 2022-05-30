package CuentaBanco;

public class CuentaBanco {
	double balance;
	double balanceminimo;
	boolean cuenta = true;
	
	public boolean depositar(double saldo,double deposito) {
		if(deposito < 100) 
			return false;
		return true;	
	}
	
	public boolean retirar(double saldo,double retiro) {
		if(saldo < retiro)
			return false;
		return true;
	}
	
	public boolean activar(String clabe) {
		if(clabe == "Activa")
			return true;
		return false;
	}
	
}
