
package br.edu.academia.model;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

//		Atributos (privado) da pessoa
	private String nome;
	private double altura;
	private double peso;
	private LocalDate dataDeNascimento;
	private String sexo;
	private String nivelAtividade;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public int getDataDeNascimento() {
		LocalDate hoje = LocalDate.now();
		Period periodo = Period.between(this.dataDeNascimento, hoje);
		
		return periodo.getYears();
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setNivelAtividade(String nivelAtividade) {
		this.nivelAtividade = nivelAtividade;
	}

	public String getNivelAtividade() {
		return this.nivelAtividade;
	}
	

//		Obter a idade do aluno
		public int getIdade() {
		LocalDate hoje = LocalDate.now();
		Period periodo = Period.between(this.dataDeNascimento, hoje);
		return periodo.getYears();
	}

//		Calcular IMC do aluno 
	public double getImc() {
		return this.peso / (this.altura * altura);
	}

	public String getStatusImc() {
		if (this.getImc() < 18.5) {
			return "Abaixo do peso";
		} else if (this.getImc() > 18.5 && this.getImc() < 25) {
			return ("Peso ideal");
		} else if (this.getImc() >= 25 && this.getImc() < 30) {
			return ("Levemente acima do peso");
		} else if (this.getImc() >= 30 && this.getImc() < 35) {
			return "Obesidade grau I";
		} else if (this.getImc() >= 35 && this.getImc() <= 40) {
			return "Obesidade grau II (Severa)";
		} else {
			return "Obesidade III (Morbida)";
		}
	}

//			Ncd 
	public double getNcd() {
		
		double ncd = 0;
		
		if (this.sexo == "M") {

			// Em relação a idade
			if (this.getIdade() >= 18 && this.getIdade() < 30) {
				ncd = 15.3 * this.peso + 679;
			} else if (this.getIdade() >= 31 && this.getIdade() <= 60) {
				ncd = 11.6 * this.peso + 879;
			} else {
				ncd = 13.5 * this.peso + 497;
			}
			
			if (this.nivelAtividade == AtividadesNivel.LEVE) {
				ncd *= 1.5;
			} else if (this.nivelAtividade == AtividadesNivel.MODERADO) {
				ncd *= 1.8; // ncd = ncd * 1.8
			} else if (this.nivelAtividade == AtividadesNivel.INTENSO) {
				ncd *= 2.1;
			}
			
		} 
		
		if (this.sexo == "F") {

			// Em relação a idade
			if (this.getIdade() >= 18 && this.getIdade() < 30) {
				ncd = 15.3 * this.peso + 679;
			} else if (this.getIdade() >= 31 && this.getIdade() <= 60) {
				ncd = 11.6 * this.peso + 879;
			} else {
				ncd = 13.5 * this.peso + 497;
			}
			
			if (this.nivelAtividade == AtividadesNivel.LEVE) {
				ncd *= 1.5;
			} else if (this.nivelAtividade == AtividadesNivel.MODERADO) {
				ncd *= 1.8; // ncd = ncd * 1.8
			} else if (this.nivelAtividade == AtividadesNivel.INTENSO) {
				ncd *= 2.1;
			}
		} 
		return ncd;
	}
}
