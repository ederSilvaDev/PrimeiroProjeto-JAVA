package javaExecutavel;

import java.io.NotActiveException;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class cursoJavaFunciona {

	public static void main(String[] args) {

		/* CONSTRUINDO UM OBJETO NO MUNDO REAL 
		 * new Aluno � uma instancia de Objeto da clase Aluno.java
		 * aluno1 ou 2 ou 3 s�o referencia*/
		Aluno aluno1 = new Aluno();
		
		/*fazendo referecia ao objeto pra asssim ter acesso aos atributos 
		 * gerados os set e getr�s dos atributos da classe Aluno 
		 * � possivel trabalhar com os atributos de quaquqler outra classe
		 * nesse caso os setNome, setIdade e etc.. s�o atributos da classe aluno 
		 * e nesse mesmo linha � atribudo o valor qualquer ("Eder") a */
		aluno1.setNome("�der");
		aluno1.setIdade(28);
		aluno1.setDataNascimento("08/02/1982");
		aluno1.setNomeMae("Lucimara");
		aluno1.setNomePai("Vilson");
		aluno1.setNomeEscola("Ely");
		aluno1.setNrocpf("221.441.995-50");
		aluno1.setNrorg("316459951");
		aluno1.setSerieMatriculada("006451");
		
		aluno1.setNota1(90.0);
		aluno1.setNota2(90.4);
		aluno1.setNota3(50.2);
		aluno1.setNota4(60.8);
		
		
		//aluno1.idade = JOptionPane.showInputDialog(aluno1.idade);
		
			/*AQUI O GET � USADO PARA RESGATAR E EM SEGUIDA IMPRIMIR O VALOR NA TELA */
			System.out.println("Nome � : " + aluno1.getNome());
			System.out.println("Nome � : " + aluno1.getmediaNota());
			
		Aluno aluno2 = new Aluno();// Aqui ser� a Julia
		Aluno aluno3 = new Aluno();// Aqui ser� o Carlos

	}
}