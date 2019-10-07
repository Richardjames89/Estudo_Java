package bytebank;

public class Conta {
	double saldo;
	int ag;
	int num;
	String tit;
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
		
	}

}
