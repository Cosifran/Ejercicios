public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        int parametroUno = (int) (Math.random() * 100) + 1;
        int parametroDos = (int) (Math.random() * 100) + 1;
        int parametroTres = (int) (Math.random() * 100) + 1;
        miCoche.AnadirPuerta();

        System.out.println("Esta es la suma de los tres parametros -> " + Suma(parametroUno, parametroDos, parametroTres));
        System.out.println("El numero de ruedas del objeto miCoche -> " + miCoche.puertas);
    }

    static int Suma(int a, int b, int c){
        return a + b + c;
    }
}