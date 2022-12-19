import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
            curso1.setTitulo("Curso Java");
            curso1.setDescricao("Principais conceitos para começar a desenvolver com a linguagem Java");
            curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
            curso2.setTitulo("Curso JS");
            curso2.setDescricao("Principais conceitos para começar a desenvolver com a linguagem JavaScript");
            curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria(); {
            mentoria.setTitulo("Mentoria de Java");
            mentoria.setDescricao("Converse com profissionais da área e saiba como progredir nos estudos em Java");
            mentoria.setData(LocalDate.now());
        }

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Principais conceitos e conteúdos para iniciar na carreira como Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devAndriele = new Dev();
        devAndriele.setNome("Andriele");
        devAndriele.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Andriele" + devAndriele.getConteudosInscritos());
        devAndriele.progredir();
        devAndriele.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Andriele" + devAndriele.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Andriele" + devAndriele.getConteudosConcluidos());
        System.out.println("XP:" + devAndriele.calcularTotalXp());

        System.out.println("----------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

    }
}
