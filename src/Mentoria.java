import java.time.LocalDateTime;

public class Mentoria extends Conteudo {

    private LocalDateTime data;

    @Override
    public double calcularXp() {
        return 0 ;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}