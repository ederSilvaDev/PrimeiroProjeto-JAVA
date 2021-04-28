package principio.responsabilidade;

public class testeConta {

	public static void main(String[] args) {

		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("Conta Bancaria");
		
		System.out.println(bancaria);

		bancaria.diminui100reais();
		
		System.out.println(bancaria);
		
		bancaria.despositoDinheiro(1000);
		
		System.out.println(bancaria);
		
		bancaria.soma100reais();
		
		System.out.println(bancaria);
	}

}
