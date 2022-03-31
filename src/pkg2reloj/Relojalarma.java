package pkg2reloj;

public class Relojalarma{
    protected Reloj reloj1;
    protected int horaAlarma;
    protected int minutoAlarma;
    protected int hora;
    protected int minuto;
    protected int segundo;
    
    public Relojalarma(){
        
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
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

    public Reloj getReloj1() {
        return reloj1;
    }

    public int getHoraAlarma() {
        return horaAlarma;
    }

    public int getMinutoAlarma() {
        return minutoAlarma;
    }

    public void setReloj1(Reloj reloj1) {
        this.reloj1 = reloj1;
    }

    public void setHoraAlarma(int horaAlarma) {
        this.horaAlarma = horaAlarma;
    }

    public void setMinutoAlarma(int minutoAlarma) {
        this.minutoAlarma = minutoAlarma;
    }
    
    public void setTime (int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public void display(){
        System.out.println(hora+":"+minuto+":"+segundo);
    }
    
    public void setAlarm (int hora, int minuto){
        this.horaAlarma = hora;
        this.minutoAlarma = minuto;
    }
    
    public void tictac(){
        this.segundo = this.segundo+1;
        if(segundo>59){
            minuto=minuto+1;
            segundo = 0;
        }
        if(minuto>59){
            hora=hora+1;
            minuto=0;
        }
        if(hora==horaAlarma && minuto==minutoAlarma && segundo==0){ //hacemos que las condiciones para que toque la alarma se cumplan
            System.out.println("la alarma esta sonando");
        }

    }
    
}
