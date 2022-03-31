package pkg2reloj;

public class Usoreloj {
    public static void main(String[] args) {
        Reloj reloj1 = new Reloj();
        reloj1.setTime(18, 35, 23);
        reloj1.display();
        for(int i=0; i<1000; i++){ //itera con el metodo tictac +1 segundo en cada iteración
            reloj1.tictac();
            reloj1.display();
        }
    }
}
