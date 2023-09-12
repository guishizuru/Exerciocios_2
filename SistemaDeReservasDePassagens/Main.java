package SistemaDeReservasDePassagens;
/*Crie classes para representar um sistema de reservas de passagens de avião.
As classes podem incluir Voo, Passageiro e Reserva. Implemente métodos para reservar assentos em voos,
cancelar reservas e listar todas as reservas em um voo específico.*/
public class Main {
    public static void main(String[] args) {
        Voo voo = new Voo(101, 100);



        voo.adicionarPassageiros("Guilherme",123,"15:20","Belo Horizonte");

        voo.reservarAssento(2);
        voo.reservarAssento(3);

        voo.listarReservas();
        voo.cancelarReserva(2);
        voo.listarReservas();
    }
}
