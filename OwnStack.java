import java.util.* ;
import java.util.ArrayList;
// import java.util.Stack;

public class OwnStack{
    /**
     * 
     * 
     * @param BackendArray
     * Implementing stack using Array Backend
     * 
     * Stack follows LIFO 
     * 
     * Methods to be implemented in Stack are
     * Push
     *      push should place the element in the Array (Last)
     * Pop
     *      pop should get the element from the Array (pops the element)
     * 
     */
     ArrayList <Float> BackendArray=new ArrayList <Float> ();

    //  void OwnStack(ArrayList <Float> BackendArray){

    //     this.BackendArray=BackendArray;
    // }

    void push(float x){

        this.BackendArray.add(x);
    }

    float pop(){
        int lastIndex=this.BackendArray.size()-1;
        float res=this.BackendArray.remove(lastIndex);
        return res;
    }

    public static void main(String [] args){
    ArrayList <Float> BackendArray=new ArrayList <Float> ();

    OwnStack s=new OwnStack();

    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);

    System.out.println(s.pop());
    System.out.println(s.pop());
    }


}

