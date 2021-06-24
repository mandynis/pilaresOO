import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {

    private String name;
    private LocalDate inicio;
    private LocalDate fim;
    private List<Conteudo> conteudo = new ArrayList<>();
    private List<Dev> devs = new ArrayList<>();

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFim() {
        return fim;
    }

    public void setFim(LocalDate fim) {
        this.fim = fim;
    }

    public String getName() {
        return name;
    }

    public List<Conteudo> getConteudo() {
        return conteudo;
    }

    public void setConteudo(List<Conteudo> conteudo) {
        this.conteudo = conteudo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Dev> getDevs() {
        return devs;
    }

    public void setDevs(List<Dev> devs) {
        this.devs = devs;
    }
}
