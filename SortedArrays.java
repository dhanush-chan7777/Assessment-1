public class SortedArrays {
    
        public static void matrixSort(int matrix[][]){
            int rows=matrix.length;
            int cols=matrix[0].length;
            int size=rows*cols;
            int[] arr=new int[size];
            int index=0;
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    arr[index]=matrix[i][j];
                    index++;
                }
                
            }
            for(int i=0;i<size-1;i++){
                for(int j=0;j<size-1-i;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            index=0;
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    matrix[i][j]=arr[index];
                    index++;
                }
            }
    
        }
        public static void main(String[] args) {
            int matrix[][]={{5,4,7},{1,8,3},{9,6,2}};
            matrixSort(matrix);
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix.length;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
    
            }
        }
        
    }
    

