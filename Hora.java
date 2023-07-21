public class Hora {
    private int hora;
    private int minuto;
    private int segundo;
    public Hora(int hora, int minuto, int segundo) {
        setUnaHora(hora, minuto, segundo);
    }
    public void setUnaHora(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }
    private void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            System.out.println("Error: Hora inválida. Debe estar entre 0 y 23.");
        }
    }
    private void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            System.out.println("Error: Minuto inválido. Debe estar entre 0 y 59.");
        }
    }
    private void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            System.out.println("Error: Segundo inválido. Debe estar entre 0 y 59.");
        }
    }
    public int getHora() {
        return hora;
    }
    public int getMinuto() {
        return minuto;
    }
    public int getSegundo() {
        return segundo;
    }
    public void aumentarMinuto(int minutos) {
        int totalMinutos = hora * 60 + minuto + minutos;
        setUnaHora(totalMinutos / 60, totalMinutos % 60, segundo);
    }
    public void aumentarSegundo(int segundos) {
        int totalSegundos = hora * 3600 + minuto * 60 + segundo + segundos;
        setUnaHora(totalSegundos / 3600, (totalSegundos % 3600) / 60, totalSegundos % 60);
    }
    public void aumentarHora(int horas) {
        int totalHoras = hora + horas;
        setUnaHora(totalHoras, minuto, segundo);
    }
    public void mostrarHora() {
        System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
    }
    public static void main(String[] args) {
        Hora hora1 = new Hora(12, 30, 45);
        hora1.mostrarHora();
        hora1.aumentarMinuto(115);
        hora1.mostrarHora();
        hora1.aumentarSegundo(320);
        hora1.mostrarHora();
        hora1.aumentarHora(5);
        hora1.mostrarHora();
    }
}
