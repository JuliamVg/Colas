import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Principal {

    public void menu(){
            
        System.out.println("----- BIENVENIDO -----");
        System.out.println("1. Registrarse");
        System.out.println("2. Mostrar informacion");
        System.out.println("3. Eliminar usuario");
        System.out.println("4. Salir");

        }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        metodos m = new metodos();
        objeto o = new objeto();
        Principal p = new Principal();

        p.menu();       

        int opt;

        opt = sc.nextInt();

        while (opt != 4) {

            switch (opt) {
                case 1:
                m.Registro();
                    
                    break;

                case 2:
                m.Mostrar();

                    break;

                case 3: 

                    break;

                case 4: 

                    break;

                default:

                System.out.println("Opcion no valida");

                    break;

            }
            
        }

        

    }
}