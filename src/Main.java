import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso Java");
		curso1.setDescricao("descrição curso Java");
		curso1.setCargaHoraria(10);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso Kotlin");
		curso2.setDescricao("descrição curso Kotlin");
		curso2.setCargaHoraria(12);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("descrição mentoria de Java");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
	}

}
