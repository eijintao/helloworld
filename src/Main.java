/**
 * 冒泡排序
 * */
public class Main {

    public static void main(String[] args) {
        int[] arrs=new int []{12,3,50,25,14,100,88};
        int temp;
        for (int i = 0; i <arrs.length-1 ; i++) {
            for (int j = 0; j <arrs.length-i-1 ; j++) {
                if(arrs[j]>arrs[j+1]){
                    temp=arrs[j];
                    arrs[j]=arrs[j+1];
                    arrs[j+1]=temp;
                }
            }
        }
        for (int arr : arrs) {
            System.out.print(arr+" ");
        }
    }
}
