import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria1);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev dev1 = new Dev();
		dev1.setNome("Primeiro");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos: " + dev1.getConteudoInscritos());
		dev1.progredir();
		dev1.progredir();
		System.out.println("Conteudos concluídos: " + dev1.getConteudoConcluido());
		System.out.println("Conteudos ainda inscritos: " + dev1.getConteudoInscritos());
		System.out.println("XP: " + dev1.calcularTotalXp());
		
		System.out.println("-------------------");
		
		Dev dev2 = new Dev();
		dev2.setNome("Segundo");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos: " + dev2.getConteudoInscritos());		
		dev2.progredir();
		System.out.println("Conteudos concluídos: " + dev2.getConteudoConcluido());
		System.out.println("Conteudos ainda inscritos: " + dev2.getConteudoInscritos());
		System.out.println("XP: " + dev2.calcularTotalXp());
	}

}
