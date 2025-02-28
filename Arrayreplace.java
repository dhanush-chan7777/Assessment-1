public class Arrayreplace {
    public static void main(String []args){
        int arr[][]={{5,4,7},{1,8,3},{9,6,2}};
        for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr.length;j++){
           
            if(i>j){
                System.out.print(arr[j][i]);
             }
             else {
                System.out.print(arr[i][j]);
                 }
              }
            System.out.println();
        }
 }
    }


    

