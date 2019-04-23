package lab04;

import java.util.HashMap;
import java.util.Map;

public class Controle {
	
	private Map<String, Aluno> alunos;
	
	public Controle() {
		this.alunos = new HashMap<String, Aluno>();
	}
	
	public boolean cadastraAluno(String matricula, String nome, String curso) {
		verificaEntradas(matricula, nome, curso);
		if (!this.alunos.containsKey(matricula)) {
			Aluno a = new Aluno(matricula, nome, curso);
			alunos.put(a.getMatricula(), a);
			return true;
		}else return false;
	}

	public Aluno exibeAluno(String matricula) {
		return this.alunos.get(matricula);
	}
	
	public void verificaEntradas(String matricula, String nome, String curso) {
		if (matricula == null) {
			throw new NullPointerException("Matricula Nula");
		}
		if (matricula == "" || matricula.trim().equals("")) {
			throw new IllegalArgumentException("Matricula vazia");
		}
		if (nome == null) {
			throw new NullPointerException("Nome Nulo");
		}
		if (nome == "" || nome.trim().equals("")) {
			throw new IllegalArgumentException("Nome vazio");
		}
		if (curso == null) {
			throw new NullPointerException("Curso vazio");
		}
		if (curso == "" || curso.trim().equals("")) {
			throw new IllegalArgumentException("Curso vazio");
		}
	}
	
	
}