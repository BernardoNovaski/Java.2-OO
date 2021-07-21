
public class TestaValores {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 2663);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(123123123);
		
		Conta conta2 = new Conta(1337, 2664);
		Conta conta3 = new Conta(1389, 2660);
		
		System.out.println(Conta.getTotal());
		
	}

}
