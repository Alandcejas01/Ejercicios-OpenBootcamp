package EjercicioTema3;

public class EjercicioTema3 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;
        int num3 = 50;

        var valor = sumaTres(num1, num2, num3);
        System.out.println(valor);

        Coche miCoche = new Coche();
        miCoche.aumentarPuertas();
        miCoche.aumentarPuertas();
        miCoche.aumentarPuertas();
        miCoche.aumentarPuertas();

        System.out.println("El auto tiene " + miCoche.puertas + " puertas");
    }
    public static int sumaTres(int a, int b, int c){
        return a + b + c;
    }
}

class Coche {
    public int puertas;

    public void aumentarPuertas(){
        this.puertas++;
    }

}