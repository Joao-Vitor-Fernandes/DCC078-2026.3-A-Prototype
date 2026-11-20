package padroescriacao.prototype;

public class Reserva implements Cloneable {
    private int codigo;
    private String hospede;
    private Quarto quarto;
    private int diarias;
    private double valorDiaria;
    private boolean altaTemporada;

    public Reserva(int codigo, String hospede, Quarto quarto, int diarias, double valorDiaria, boolean altaTemporada) {
        this.codigo = codigo;
        this.hospede = hospede;
        this.quarto = quarto;
        this.diarias = diarias;
        this.valorDiaria = valorDiaria;
        this.altaTemporada = altaTemporada;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getHospede() {
        return hospede;
    }

    public void setHospede(String hospede) {
        this.hospede = hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public int getDiarias() {
        return diarias;
    }

    public void setDiarias(int diarias) {
        this.diarias = diarias;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public boolean isAltaTemporada() {
        return altaTemporada;
    }

    public void setAltaTemporada(boolean altaTemporada) {
        this.altaTemporada = altaTemporada;
    }

    @Override
    public Reserva clone() throws CloneNotSupportedException {
        Reserva reservaClone = (Reserva) super.clone();
        reservaClone.quarto = (Quarto) reservaClone.quarto.clone();
        return reservaClone;
    }

    @Override
    public String toString() {
        return "Reserva{" +
            "codigo=" + codigo +
            ", hospede='" + hospede + '\'' +
            ", quarto=" + quarto +
            ", diarias=" + diarias +
            ", valorDiaria=" + valorDiaria +
            ", altaTemporada=" + altaTemporada +
            '}';
    }
}