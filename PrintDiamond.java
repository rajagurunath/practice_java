/**
* The HelloWorld program implements an application that
* simply displays "Hello World!" to the standard output.
*
* @author  Gurunath 
* @version 1.0
* @since   2019-10-05 
*/




import java.util.*;


public class PrintDiamond {
    /**
     * 
     * Enter the grid size
9
    *
   ***
  * * *
 *  *  *
*********
 *  *  *
  * * *
   ***
    *
     * @param grid
     */
    void printDiamond(int grid){
        // String s=string
        // System.out.println(string.charAt(0));
        // string.ChartAt()
        // int stringLength=string.length();
        // System.out.println(stringLength);
        // System.out.println(string.charAt(stringLength-1));
        int mid=grid/2;
        for (int i=0;i<grid;i++){
            for (int j=0;j<grid;j++){
                if (i==mid){
                    System.out.print("*");
                }
                else if (j==mid){
                    System.out.print("*");
                }
                else if (j==mid-i){
                    System.out.print("*");
                }
                else if (j==mid+i){
                    System.out.print("*");
                }
                
                else if ((mid-i)<0 &(j==i-mid)){
                    System.out.print("*");

                }

                else if (i+j==mid*3){
                    System.out.print("*");
                }
                // else if (((mid-i)<0 )&((mid-j)<0)){
                //     if (j==((j%i)+mid)){
                //         System.out.print("*");
                //     }
                // }
                // // else if ((mid-i)<0 &(j==mid+(j))){
                //     System.out.print("*");
                //     // System.out.print((j%mid)+i);
                // }
                // else if ((mid-i)<0 &(j==mid+2)){
                //     System.out.print("*");
                //     // System.out.print((j%mid)+i);
                // }
                // else if ((mid-i)<0 &(j==mid+1)){
                //     System.out.print("*");
                //     // System.out.print((j%mid)+i);
                // }
                // // else if (i>mid){
                //     // System.out.print(i+" "+j);
                //     if (j==i-mid){
                //         System.out.print("*");
                //     }

                // }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();

        }


    }
    public static void main(String[] args) {
        //printDiagonal()
        PrintDiamond funcObj =new PrintDiamond();
        System.out.println("Enter the grid size");
        Scanner sc= new Scanner(System.in);
        int grid=sc.nextInt();
        // int grid=9;
        funcObj.printDiamond(grid);
        sc.close();
    }

}

