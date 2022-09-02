import java.util.*;
class RevSentence2{

public static void main(String args[]){

    String input = "i am jeet";

    String[] spl = input.split(" ");

    for(int i= spl.length-1; i>=0 ; i--){
        System.out.print(spl[i]+" ");
    }

    
}

}