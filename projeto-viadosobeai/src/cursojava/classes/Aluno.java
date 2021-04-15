package cursojava.classes;

/*ESTA É NOSSA CLASSE/OBEJETO QUE REPRESENTA O ALUNO*/
public class Aluno {

	/* Atributos */
	private String nome;
	private int idade;
	private String dataNascimento;
	private String nrorg;
	private String nrocpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculada;
	
	private double nota1 ;
	private double nota2 ;
	private double nota3 ;
	private double nota4 ;

	/*
	 * SET SÃO PARA ADICIONAR OU RECEBER DADOS PARA OS ATRIBUTOS GET É PARA
	 * RESGASTAR OU OBTER O VALOR DO ATRIBUTO
	 */

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNrorg() {
		return nrorg;
	}

	public void setNrorg(String nrorg) {
		this.nrorg = nrorg;
	}

	public String getNrocpf() {
		return nrocpf;
	}

	public void setNrocpf(String nrocpf) {
		this.nrocpf = nrocpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculada() {
		return serieMatriculada;
	}

	public void setSerieMatriculada(String serieMatriculada) {
		this.serieMatriculada = serieMatriculada;
	}

	/*metodo simples que retorna a media do aluno*/
	public double getmediaNota() {
		return(nota1 + nota2 + nota3 + nota4 ) / 4;
	}
	
}
