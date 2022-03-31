package pkg2reloj;

public class Usorelojalarma {
    public static void main(String[] args) {
        Relojalarma ralam1 = new Relojalarma(); //instanciamos 
        ralam1.setTime(18, 35, 23);
        ralam1.setAlarm(18, 50);
        for(int i=0; i<1000; i++){ //itera con el metodo tictac +1 segundo en cada iteración
            ralam1.tictac();
            ralam1.display();
        }
    }
}
