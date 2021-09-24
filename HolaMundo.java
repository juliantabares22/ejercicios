import java.util.Scanner;

public class HolaMundo {

    public static void main(String args[]) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número del mes acá: ");
        int numMes = Integer.parseInt(entrada.nextLine());

        var mes = numMes;
        var estacion = "Estación desconocida";
        switch (mes) {
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break; 
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
                
            case 9: case 10: case 11:
                estacion = "Otono";
                break;   
    }
        System.out.println("estacion = " + estacion);

}
}


