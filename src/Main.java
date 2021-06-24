import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Curso java =  new Curso();
        java.setTitulo("Curso de Java");
        java.setDescricao("Aprenda os conceitos básicos de Java");
        java.setCargahoras(60);

        Curso dotnet = new Curso();
        dotnet.setTitulo("Curso de .NET");
        dotnet.setDescricao("Aprenda os conceitos básicos de .NET");
        dotnet.setCargahoras(60);

        Curso aws = new Curso();
        aws.setTitulo("Curso de AWS");
        aws.setDescricao("Entenda os fundamentos do AWS");
        aws.setCargahoras(40);

        Mentoria mentor = new Mentoria();
        mentor.setTitulo("Conceitos de Orientação a Objetos");
        mentor.setDescricao("Imersão nos pilares do OO com Herança e Polimorfismo");
        mentor.setData(LocalDateTime.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setInicio(LocalDate.now());
        bootcamp.setFim(bootcamp.getInicio().plusDays(30));

        List<Conteudo> conteudo = Arrays.asList(java, dotnet, aws, mentor);
        bootcamp.setConteudo(conteudo);

        Dev amanda = new Dev();
        amanda.setName("Amanda Carolini");

        amanda.inscrever(bootcamp);
        amanda.inscrever(aws);
        amanda.progredir();
        amanda.progredir();

        Dev marcela = new Dev();
        marcela.setName("Marcela Rodrigues");

        marcela.inscrever(bootcamp);

    }
}
