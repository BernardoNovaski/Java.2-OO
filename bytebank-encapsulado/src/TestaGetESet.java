
public class TestaGetESet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 2663);
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo;
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfiss�o("Programador");
		//op��o duas linhas
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfiss�o("Programador");
		
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
		
	}

}
