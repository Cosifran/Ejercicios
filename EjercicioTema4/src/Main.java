public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------Creación de la condicion par e inpar-------------------------------");
        CondicionParEInpar(0);
        System.out.println("-------------------------------Creación del bucle While-------------------------------");
        CondicionWhile(0);
        System.out.println("-------------------------------Creación del bucle Dowhile-------------------------------");
        CondicionDowhile(3);
        System.out.println("-------------------------------Creación del bucle For-------------------------------");
        CondicionFor();
        System.out.println("-------------------------------Creación del bucle Switch-------------------------------");
        CondicionSwitch("Navidad");
    }

    static void CondicionParEInpar (int numeroIf){
        if (numeroIf < 0){
            System.out.println("numeroIf" + " Es negativo");
        } else if (numeroIf > 0) {
            System.out.println("numeroIf" + " Es positivo");
        }else {
            System.out.println("numeroIf es 0");
        }
    }

    static void CondicionWhile (int numeroWhile){
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
    }

    static void CondicionDowhile (int numeroDowhile){
       do {
           System.out.println("Solo me ejecuto una vez");
           numeroDowhile++;
       }while (numeroDowhile < 3);

    }

    static void CondicionFor(){
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
    }

    static void CondicionSwitch(String estaciones){
        String temp = estaciones.toLowerCase();
        switch (temp) {
            case "primavera" -> System.out.println("Te encuentras en primavera");
            case "otoño" -> System.out.println("Te encuentras en otoño");
            case "verano" -> System.out.println("Te encuentras en verano");
            case "invierno" -> System.out.println("Te encuentras en invierno");
            default -> System.out.println(estaciones + " no es una estacion");
        }
    }

}