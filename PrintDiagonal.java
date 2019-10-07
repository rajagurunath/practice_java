




import java.util.*;


public class PrintDiagonal {

    void printDiagonal(String string){
        // String s=string
        // System.out.println(string.charAt(0));
        // string.ChartAt()
        int stringLength=string.length();
        System.out.println(stringLength);
        System.out.println(string.charAt(stringLength-1));
        for (int i=0;i<string.length();i++){
            for (int j=0;j<string.length();j++){
                // System.out.print(i);
                // System.out.println(j);
                if (i==j){
                    System.out.print(string.charAt(i));
                }
                // System.out.print(stringLength-i-1);
                // System.out.print(string.charAt(stringLength-i-1));
                else if (stringLength-i-1==j){
                    System.out.print(string.charAt(stringLength-1-i));
                }
                else{
                    System.out.print(" ");
                }
                // else{
                //     System.out.println(" ");

                // }
                
            }
            System.out.println();

        }


    }
    public static void main(String[] args) {
        //printDiagonal()
        PrintDiagonal funcObj =new PrintDiagonal();
        System.out.println("Enter the string to print Diagnonally");
        Scanner sc= new Scanner(System.in);
        String string=sc.nextLine();
        funcObj.printDiagonal(string);
    }

}

