public class productoAdyacentes {


     public  int productoAdyacentes(int [] arr,int[] arrAux){
         int i;
         int max= arrAux[0];


        try{
            for ( i = 0; i < arr.length; i++) {

             arrAux[i] = arr[i] * arr[i + 1];

             if(max<arrAux[i]) {

                 max=arrAux[i];

             }

             }


        }catch (ArrayIndexOutOfBoundsException e){

}

      return max;
    }



}


