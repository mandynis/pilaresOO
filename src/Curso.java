public class Curso extends Conteudo {

    private int cargahoras;

    @Override
    public double calcularXp() {
        return xpPadrao * cargahoras;
    }

    public int getCargahoras() {
        return cargahoras;
    }

    public void setCargahoras(int cargahoras) {
        this.cargahoras = cargahoras;
    }
}
