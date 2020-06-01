public class productoAdyacentes {


    public static int productoAdyacentes(int [] arr){
         int i;
         int arrAux = 0;
         int max = 0;

        try{
            for ( i = 0; i < arr.length; i++) {

                 arrAux = arr[i] * arr[i + 1];

                if(max<arrAux) {
                 max=arrAux;
                }

             }


        }catch (ArrayIndexOutOfBoundsException e){

}

      return max;
    }



}


