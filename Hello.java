import java.util.Scanner;

class Hello{
    public  static void main(String[]args) {
        System.out.println("Hello");
        Hello h = new Hello();
        h.test1();
    }

    void test1(){
        Scanner sc =new Scanner(System.in);
        double a=sc.nextDouble();
        int arr[]={1,2,3,4};
        int[] arr2 = arr;
        System.out.println(arr2[1]);
        System.out.println(a);
    }
}