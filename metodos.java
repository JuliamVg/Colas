import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class metodos {

    Scanner sc = new Scanner(System.in);
    objeto o = new objeto();
    Principal p = new Principal();
    Queue<objeto> cola = new LinkedList<objeto>();

    public void Registro(){


        System.out.println("Ingrese su nombre");
        String Nombre = sc.nextLine();
        o.setNombre(Nombre);
        
        System.out.println("Ingrese su Cedula");
        int cedula = sc.nextInt();
        o.setCedula(cedula);

        System.out.println("Ingrese su edad");
        int Edad = sc.nextInt();
        if (Edad < 18) {
            o.setEdad(Edad);
            System.out.println("Ya que usted es menor de edad, se le otorga un auxilio del 80% del minimo");
            
        }else{
            o.setEdad(Edad);


        } 
        

        System.out.println("Es usted desplazado?");
        String esDespladado = sc.nextLine();
        while (esDespladado.equalsIgnoreCase(esDespladado) && esDespladado == "SI" || esDespladado.equalsIgnoreCase(esDespladado) && esDespladado == "NO") {
            o.setEsDesplazado(esDespladado);
        }
        

        System.out.println("Que estrato es?");
        int estrato = sc.nextInt();
        o.setEstrato(estrato);

        cola.offer(o);
        

        p.menu();


        
    }


    public void Mostrar(){
        System.out.println(o.getNombre());
        System.out.println(o.getCedula());
        System.out.println(o.getEdad());
        System.out.println(o.isEsDesplazado());
        System.out.println(o.getEstrato());
    }

    public void Eliminar(){

        System.out.println("Ingrese el nombre del Usuario: ");
        String Nombre = sc.nextLine();
        
            
        


    }
    
}
