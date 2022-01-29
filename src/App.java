import br.com.dio.miller.*;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java - POO");
        curso1.setDescricao("Descrição do curso de Java - POO");
        curso1.setCargaHoraria(56);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Spring Boot");
        curso2.setDescricao("Descrição do curso de Boot");
        curso2.setCargaHoraria(24);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMiller = new Dev();
        devMiller.setNome("Miller");
        devMiller.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Miller:" + devMiller.getConteudosInscritos());
        devMiller.progredir();
        devMiller.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Miller:" + devMiller.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Miller:" + devMiller.getConteudosConcluidos());
        System.out.println("XP:" + devMiller.calcularTotalXp());

        System.out.println("\n-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}
