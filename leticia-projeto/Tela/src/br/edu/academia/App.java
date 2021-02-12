package br.edu.academia;

 import java.time.LocalDate;

 import br.edu.academia.model.AtividadesNivel;
 import br.edu.academia.model.Pessoa;


 public class App {

	 public static void main(String[] args) {
		
		Pessoa informacoesLe = new Pessoa();
		
		informacoesLe.setNome("Leticia");
		informacoesLe.setSexo("F");
		informacoesLe.setPeso(50);
		informacoesLe.setAltura(1.55);
		informacoesLe.setDataDeNascimento(LocalDate.of(2002, 8, 20));
		informacoesLe.setNivelAtividade(AtividadesNivel.INTENSO);
		System.out.println("** " + informacoesLe.getNome() + " **");
		System.out.println("IMC: " + informacoesLe.getImc());
		System.out.println("Situação: " + informacoesLe.getStatusImc());
		System.out.println("Idade: " + informacoesLe.getIdade());
		System.out.println("NCD: " + informacoesLe.getNcd());
		System.out.println("***********************************");
		
Pessoa informacoesJoao = new Pessoa();
		
		informacoesJoao.setNome("João");
		informacoesJoao.setSexo("M");
		informacoesJoao.setPeso(150);
		informacoesJoao.setAltura(1.69);
		informacoesJoao.setDataDeNascimento(LocalDate.of(2005, 4, 10));
		informacoesJoao.setNivelAtividade(AtividadesNivel.MODERADO);
		System.out.println("** " + informacoesJoao.getNome() + " **");
		System.out.println("IMC: " + informacoesJoao.getImc());
		System.out.println("Situação: " + informacoesJoao.getStatusImc());
		System.out.println("Idade: " + informacoesJoao.getIdade());
		System.out.println("NCD: " + informacoesJoao.getNcd());
		System.out.println("***********************************");
		
Pessoa informacoesMatheus = new Pessoa();
		
		informacoesMatheus.setNome("Matheus");
		informacoesMatheus.setSexo("M");
		informacoesMatheus.setPeso(55);
		informacoesMatheus.setAltura(1.70);
		informacoesMatheus.setDataDeNascimento(LocalDate.of(1998, 3, 15));
		informacoesMatheus.setNivelAtividade(AtividadesNivel.LEVE);
		System.out.println("** " + informacoesMatheus.getNome() + " **");
		System.out.println("IMC: " + informacoesMatheus.getImc());
		System.out.println("Situação: " + informacoesMatheus.getStatusImc());
		System.out.println("Idade: " + informacoesMatheus.getIdade());
		System.out.println("NCD: " + informacoesMatheus.getNcd());
		System.out.println("***********************************");
	}
}
