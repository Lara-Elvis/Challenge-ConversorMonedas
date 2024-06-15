import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Principal {
    public static int cantidad = 0;
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaModena consulta = new ConsultaModena();

        int numeroMenu = 0;
        try {
            while (numeroMenu != 7) {
                System.out.println("*****************************************\n");
                System.out.println("Bienvendio a tu conversor de monedas:)");
                System.out.println("Escoja una opción: ");
                System.out.println("1. Dolares a euros");
                System.out.println("2. Euros a dolares");
                System.out.println("3. Reales brasileño a dolar");
                System.out.println("4. Peso chileno a dolar ");
                System.out.println("5. Euro a peso chileno");
                System.out.println("6. Libra egipcia a dolares");
                System.out.println("7. Salir");
                System.out.println("Escoja una opción: ");
                numeroMenu = Integer.valueOf(lectura.nextLine());

                switch (numeroMenu) {
                    case 1:
                        System.out.println("Ingrese una cantidad");
                        Principal.cantidad = Integer.valueOf((lectura.nextLine()));
                        Monedas monedas = consulta.monedas("USD", "EUR", Principal.cantidad);
                        System.out.println("\n*****************************************\n");
                        System.out.println(monedas);
                        System.out.println("\n*****************************************\n");
                        GeneradorArchivo generadorArchivo = new GeneradorArchivo();
                        generadorArchivo.guardarElJason(monedas);
                        break;

                    case 2:
                        System.out.println("Ingrese una cantidad");
                        Principal.cantidad = Integer.valueOf((lectura.nextLine()));
                        monedas = consulta.monedas("EUR", "USD", Principal.cantidad);
                        System.out.println("\n*****************************************\n");
                        System.out.println(monedas);
                        System.out.println("\n*****************************************\n");
                        generadorArchivo = new GeneradorArchivo();
                        generadorArchivo.guardarElJason(monedas);
                        break;

                    case 3:
                        System.out.println("Ingrese una cantidad");
                        Principal.cantidad = Integer.valueOf((lectura.nextLine()));
                        monedas = consulta.monedas("reales", "USD", Principal.cantidad);
                        System.out.println("\n*****************************************\n");
                        System.out.println(monedas);
                        System.out.println("\n*****************************************\n");
                        generadorArchivo = new GeneradorArchivo();
                        generadorArchivo.guardarElJason(monedas);
                        break;

                    case 4:
                        System.out.println("Ingrese una cantidad");
                        Principal.cantidad = Integer.valueOf((lectura.nextLine()));
                        monedas = consulta.monedas("CLP", "USD", Principal.cantidad);
                        System.out.println("\n*****************************************\n");
                        System.out.println(monedas);
                        System.out.println("\n*****************************************\n");
                        generadorArchivo = new GeneradorArchivo();
                        generadorArchivo.guardarElJason(monedas);
                        break;

                    case 5:
                        System.out.println("Ingrese una cantidad");
                        Principal.cantidad = Integer.valueOf((lectura.nextLine()));
                        monedas = consulta.monedas("EUR", "CLP", Principal.cantidad);
                        System.out.println("\n*****************************************\n");
                        System.out.println(monedas);
                        System.out.println("\n*****************************************\n");
                        generadorArchivo = new GeneradorArchivo();
                        generadorArchivo.guardarElJason(monedas);
                        break;

                    case 6:
                        System.out.println("Ingrese una cantidad");
                        Principal.cantidad = Integer.valueOf((lectura.nextLine()));
                        monedas = consulta.monedas("EGP", "USD", Principal.cantidad);
                        System.out.println("\n*****************************************\n");
                        System.out.println(monedas);
                        System.out.println("\n*****************************************\n");
                        generadorArchivo = new GeneradorArchivo();
                        generadorArchivo.guardarElJason(monedas);
                        break;

                    default:
                        System.out.println("\n*****************************************\n");
                        System.out.println("numero no encontrado");
                        System.out.println("\n*****************************************\n");
                }

            }

            }catch (NumberFormatException e){
            System.out.println("Escriba sólo numeros " + e.getMessage());
            }catch (Exception e){
            System.out.println("A ocurrido un error inesperado");
        }
    }
}
