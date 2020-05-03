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
    } else if (Second >= First && Second >= Third){
           Max = Second;
      } else{
        Max = Third;
      }
       if (Second <= First && Second <= Third) {
         Min = Second;
        } else if(Third <= First && Third <= Second ){
        Min = Third;
        } else{
          Min = First;
      }
      if ((First >= Third && First <= Second) ||(First >= Second && First <= Third) ){
           Mid = First;
      }else if ((Second >= Third && Second <= First) ||(Second >= First && Second <= Third)){
           Mid = Second;
      }else{
        Mid = Third;
      }

  System.out.println("Min |  Mid  | Max");
  System.out.println(Min + "  |  " + Mid + "   | " + Max);

  }
  
}