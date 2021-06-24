import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Dev {

    private String name;
    private List<Conteudo> inscrito = new ArrayList<>();
    private List<Conteudo> concluido = new ArrayList<>();

    public void inscrever(Conteudo conteudo) {
        if(inscrito.contains(conteudo)) {
            System.err.println("Você já está inscrito");
        } else {
            inscrito.add(conteudo);
        }
    }

    public void inscrever(Bootcamp bootcamp) {
        for(Conteudo conteudo : bootcamp.getConteudo()) {
            inscrever(conteudo);
        }
        bootcamp.getDevs().add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Conteudo> getInscrito() {
        return inscrito;
    }

    public void setInscrito(List<Conteudo> inscrito) {
        this.inscrito = inscrito;
    }

    public List<Conteudo> getConcluido() {
        return concluido;
    }

    public void setConcluido(List<Conteudo> concluido) {
        this.concluido = concluido;
    }

    public void progredir() {
        Optional<Conteudo> conteudo = inscrito.stream().findFirst();
        if (conteudo.isPresent()) {
            concluido.add(conteudo.get());
            inscrito.remove(conteudo.get());
        } else {
            System.err.println("Você não está mais inscrito nesse conteúdo");
        }
    }
}
