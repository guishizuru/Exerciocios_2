package SistemaDeReservasDePassagens;


public class Reserva {
    private String horario;
    private String localDeChegada;

    public Reserva(String horario, String localDeChegada){
        this.horario = horario;
        this.localDeChegada = localDeChegada;

    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLocalDeChegada() {
        return localDeChegada;
    }

    public void setLocalDeChegada(String localDeChegada) {
        this.localDeChegada = localDeChegada;
    }
}
