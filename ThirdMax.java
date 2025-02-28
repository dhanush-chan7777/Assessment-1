public class ThirdMax{
    public static int findThirdMax(int[][] arr){
        int first=0;
        int second=0;
        int third=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                int num=arr[i][j];
                if(num>first){
                    third=second;
                    second=first;
                    first=num;
                }else if(num>second&&num<first){
                    third=second;
                    second=num;
                }else if(num>third&&num<second){
                    third=num;
                }
            }
        }
        return third;
    }

public static void main(String args[]){
int arr[][]={{5,4,7},{1,8,3},{9,6,2}};
int thirdmax=findThirdMax(arr);
System.out.println("the third greatest number is:"+thirdmax);
}
}
