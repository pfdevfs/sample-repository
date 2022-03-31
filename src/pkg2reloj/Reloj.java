package pkg2reloj;

public class Reloj {
    protected int hora;
    protected int minuto;
    protected int segundo;
    
    public Reloj (){
        
    }
    
    public Reloj (int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
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

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
    public void setTime (int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public void display(){
        System.out.println(hora+":"+minuto+":"+segundo);
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
    }
    
}
