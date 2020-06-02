public class productoAdyacentes {


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



}


