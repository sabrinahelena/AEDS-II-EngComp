
public class Time {
    private Duende Lider;
    private Duende Entregador;
    private Duende Piloto;
    private Time[] times;

    public Time(){

    }
    public Time(Duende lider, Duende entregador, Duende piloto) {
        Lider = lider;
        Entregador = entregador;
        Piloto = piloto;
    }

    public void CostruirTime(Duende array[]) {
        Time[] times = new Time[array.length/3];
        if(array.length%3 == 0) {
            for (int i = 0; i < array.length/3; i++) {
                Duende lider = array[i];

                // Define os entregadores e pilotos seguindo a mesma lógica dos líderes
                Duende entregador = array[i + array.length/3];

                Duende piloto = array[i + 2*array.length/3];

                // Cria o time com os duendes definidos
                Time time = new Time(lider, entregador, piloto);
                times[i] = time;
            }
        }
        ImprimirTimes(times);
    }

    public void ImprimirTimes(Time times[]){
        for(int i = 0; i<times.length; i++){
            System.out.println("Time: " + (i+1) +
                    " Lider " + times[i].Lider.GetNome() +
                    " Entregador " + times[i].Entregador.GetNome() +
                    " Piloto : " + times[i].Piloto.GetNome());
        }
    }

}