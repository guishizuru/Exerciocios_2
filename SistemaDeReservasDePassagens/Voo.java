package SistemaDeReservasDePassagens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Voo {

    List<Passageiro> listaDePassageiros = new ArrayList<>();
    List<Reserva> listaDeReservas = new ArrayList<>();


    private int numeroVoo;
    private boolean[] assentosDisponiveis;

    public Voo(int numeroVoo, int totalDeAssentos){
        this.numeroVoo = numeroVoo;
        this.assentosDisponiveis = new boolean[totalDeAssentos];
        Arrays.fill(assentosDisponiveis, true);
    }

    public boolean reservarAssento(int numeroAssento){
        if(numeroAssento >= 1 && numeroAssento <=assentosDisponiveis.length){
            if(assentosDisponiveis[numeroAssento -1]){
                assentosDisponiveis[numeroAssento -1] = false;
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }



    public void adicionarPassageiros(String nome, int identificador, String horario, String localDeChegada){
        Passageiro passageiro = new Passageiro(nome,identificador);
        Reserva reserva = new Reserva(horario, localDeChegada);
        listaDePassageiros.add(passageiro);
        listaDeReservas.add(reserva);
    }
    public void listarReservas(){
        System.out.println("Listas de reservas para Voos" + numeroVoo + ":");
        for (int i = 0; i <assentosDisponiveis.length ; i++) {
            if(!assentosDisponiveis[i]){
                System.out.println("Assento " + (i + 1) + " esta reservado");
            }

        }
    }   public boolean cancelarReserva(int numeroAssento) {
        if (numeroAssento >= 1 && numeroAssento <= assentosDisponiveis.length) {
            if (!assentosDisponiveis[numeroAssento - 1]) {
                assentosDisponiveis[numeroAssento - 1] = true; // Marca o assento como disponível novamente
                return true; // Cancelamento de reserva realizado com sucesso
            } else {
                return false; // Assento já está disponível (não reservado)
            }
        } else {
            return false; // Número de assento inválido
        }
    }
}



