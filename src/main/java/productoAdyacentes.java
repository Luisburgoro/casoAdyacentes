import java.util.Scanner;

public class productoAdyacentes {

    public static void main(String[] args){
        
        int[] num = creacionArreglo();
        int mayor= productoAdyacentes(num);
        System.out.println("El producto mayor es: "+mayor);
    }
    
    public static int[] creacionArreglo (){

            System.out.println("Ingrese cantidad de numeros que desee ingresar");
            int cant=0;

            while (cant<1 || cant>21){
                cant = validar();
                if (cant<1 || cant>21){
                    System.out.println("Error al ingresar cantidad, es solo entre 1 y 21");
                }
            }

            int[] arr = new int[cant];

            for (int i=0; i<arr.length; i++) {
                System.out.println("Número "+i);
                
                while (arr[i]<-1000 || arr[i]>1000){
                    arr[i]= validar();
                    if (arr[i]<-1000 || arr[i]>1000){
                        System.out.println("Error al ingresar numero, solo puedes ingresar valores desde -1000 a 1000");
                    }
                }
                
            }

            return arr;
        }

    public static int productoAdyacentes(int [] arr) {
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


