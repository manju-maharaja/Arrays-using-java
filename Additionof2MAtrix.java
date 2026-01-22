import java.util.Scanner;
class Additionof2Matrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers of rows:");
        int R=sc.nextInt();
        System.out.println("enter number of columns:");
        int C=sc.nextInt();
        int[][] arr1=new int[R][C];
        int[][] arr2=new int[R][C];
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
         int[][] arr3=new int[R][C];
         for(int i=0;i<R;i++) {
             for(int j=0;j<C;j++){
               
                System.out.println(arr3[i][j=arr1[i][j]+arr2[i][j]]);
            }
            System.out.println();
            sc.close();
        }
    }
}



        



