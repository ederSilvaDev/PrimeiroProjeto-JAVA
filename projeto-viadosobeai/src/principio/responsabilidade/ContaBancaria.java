package principio.responsabilidade;

public class ContaBancaria {

	private String descricao;
	private double saldo = 8500;

	public void soma100reais() {
		saldo += 100;
	}

	public void diminui100reais() {
		saldo -= 100;
	}

	public void sacarDinheiro(double saque) {
		saldo -= saque;
	}

	public void despositoDinheiro(double desposito) {
		saldo += desposito;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}

}
