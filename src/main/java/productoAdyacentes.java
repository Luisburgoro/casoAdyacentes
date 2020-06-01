public class productoAdyacentes {


    public int productoAdyacentes(int [] arr){
         int i;
         int Aux;
         int max = 0;

        try{
            for ( i = 0; i < arr.length; i++) {

                 Aux = arr[i] * arr[i + 1];

                if(max<Aux) {
                 max=Aux;
                }

             }


        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error.");
}

      return max;
    }



}


