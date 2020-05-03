import java.util.*;

class Main {
  public static void main(String[] args) {

    int First, Second, Third ;
    int Max,Min,Mid;
    Max=Mid=Min=0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter three values:");
     First = (int)Math.floor(Math.random() * 100);
    Second = (int)Math.floor(Math.random() * 100);
    Third = (int)Math.floor(Math.random() * 100);


    if (First >= Second && First >= Third) {
         Max = First;
        
        if (Second >= Third) {
          Mid = Second;
          Min = Third;
        } else {
          Mid = Third;
          Min = Second;
        }
    } else if (Second >= First && Second >= Third) {
         Max = Second;
        
        if (First >= Third) {
          Mid = First;
          Min = Third;
        } else {
          Mid = Third;
          Min = First;
        }
    } else if(Third >= First && Third >= Second ){
        Max = Third;

        if (First >= Second) {
          Mid = First;
          Min = Second;
        } else {
          Mid = Second;
          Min = First;
        }
      }
  System.out.println("Min |  Mid  | Max");
  System.out.println(Min + "  |  " + Mid + "   | " + Max);

  }

}

