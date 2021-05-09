package actividad1;
import java.util.*;
import java.util.InputMismatchException;

/**
 *
 * @author Oscar Marcelo
 */
public class Actividad1 {
    
    public static void armarLista (){
        LinkedList <Integer> lista = new LinkedList<>();
        Scanner sc = new Scanner (System.in);
        boolean salir = false;
        int c = 0;
        int contador = 0;
        while(!salir){
            
            System.out.println("1. Ingresar elementos a la lista\n2. Ver lista actual\n3. Salir");
            
            try{
                int opcion = sc.nextInt();
                
                switch (opcion){
                    case 1:
                        lista = new LinkedList<>();
                        //System.out.println("Opcion 1\n");
                        System.out.println("¿Cuantos numeros desea ingresar a la lista en un rango de minimo 7 y maximo 14?: \n");
                        int respuesta = sc.nextInt();
                        if(respuesta>=7){
                            c = 0;
                            contador = 0;
                            while(c<respuesta){
                                System.out.println("Ingrese un número para agregar a la lista");
                                int numero = sc.nextInt();
                            if(numero == 0)
                                contador++;
                            lista.add(numero);   
                            c++;   
                            }   
                        }else{
                            System.out.println("Escoge una opción correcta");
                            break;
                        }
                        if(lista.contains(0)){
                            System.out.println("Contiene 0 la lista");
                            System.out.println("Lista normal\n" + lista);
                            lista.removeIf(n -> (n == 0));
                            for (int j = 0; j < contador; j++)
                                lista.add(0);
                            System.out.println("Lista con 0 al final:\n"+lista);
                        }
                        else
                            System.out.println("La lista no contiene ceros\n" + lista);
                        break;
                    case 2:
                        //System.out.println("Opcion 2\n");
                        if(lista.isEmpty())
                            System.out.println("Lista no contiene elementos\n" + lista);
                        else
                            System.out.println("Lista \n" + lista);
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo numeros entre 1 y 3");      
                }
            } catch (InputMismatchException e){
                System.out.println("Debe insertar un numero");
                sc.next();
            } 
        }
    }
    
    public static void main(String[] args) {    
        armarLista();
    }
}
