package questions;

import java.util.Scanner;

public class Swap {
//    static void swaps( int a[] ){
//        int temp;
//       for(int i=0 ; i < a.length-1 ; i++ ){
//           temp=a[i];
//           a[i]=a[i+1];
//           a[i+1]=temp;
//       }
//    }

//    static int [] swapping(int a,int b){
//        int temp;
//        temp=a;
//        a=b;
//        b=temp;
//        int lastswap []= {a,b} ;
//        return lastswap;
//    }



    int a,b;
    static void sw( Swap obj2 ){
        int temp=obj2.a;
        obj2.a=obj2.b;
        obj2.b=temp;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Swap obj=new Swap();
        int a = sc.nextInt();
        int b=sc.nextInt();
        obj.a=a;
        obj.b=b;
        Swap.sw(obj);
        System.out.println(obj.a+"   "+obj.b);



       // int arr[]={a,b};
        //int arr2[]=Swap.swapping(a,b);
       // System.out.println(arr2[0]+" "+arr2[1]);
       // Swap.swaps(arr);
       // System.out.println(arr[0]+" "+arr[1]);
    }
}
