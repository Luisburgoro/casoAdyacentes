import java.util.Scanner;

public class productoAdyacentes {

    public static void main(String[] args){
        
        int[] num = creacionArreglo();
        int mayor= productoAdyacentes(num);
        System.out.println("El num mayor es: "+mayor);
    }
    
     public static int[] creacionArreglo (){
            System.out.println("Ingrese cantidad de numeros que desee ingresar");
            int cant = validar();
            int[] arr = new int[cant];

            for (int i=0; i<arr.length; i++) {
                System.out.println("numero "+i);
                arr[i]= validar();
            }
            return arr;
        }

    public int productoAdyacentes(int [] arr) {
        int i;
        int Aux;
        int max = 0;

        if (arr.length == 1) {

            System.out.println("Arreglo con un único elemento.");
            return arr[0];

        } else {
            for (i = 0; i < arr.length - 1; i++) {

                Aux = arr[i] * arr[i + 1];

                if (max < Aux) {
                    max = Aux;
                }

            }
            return max;
        }
    }

    public static int validar(){
        Scanner input = new Scanner(System.in);

        int valor;
        while(!input.hasNextInt()){
            System.err.println("Introduzca un número entero como respuesta.");
            input.next();
        }
        valor = input.nextInt();
        return valor;
    }

}


