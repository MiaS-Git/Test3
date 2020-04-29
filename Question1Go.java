import java.util.*;
import java.io.*;

//|| chars[i]==('.')

class Main {
  public static void main(String[] args) {
     System.out.println("Go(Released 2007)\n");
    System.out.println("Enter FLoat: ");
    System.out.println("ex: 4e5, 9.09_87");
     Scanner input = new Scanner(System.in);
     String floatL = input.nextLine();
     System.out.println(isAFloat(floatL));
     System.out.println("Enter Int: ");
     System.out.println("ex: 90, 0xaf");
      String intL = input.nextLine();
     System.out.println(isAInt(intL));
     System.out.println("Enter String: ");
     System.out.println("ex: \"Hello\", 'Hello90'");
      String stringL = input.nextLine();
     System.out.println(isAString(stringL));
  }
 public static String isAFloat(String floatL){
 
   String fl = "Not a float";
 	if(floatL.matches("\\d+_*[0-9]*[.e]E*[_*[0-9]*]*")){
     fl = "FLoat";
   }else if (floatL.matches("\\d+_*[.e][eE]*[+-]*[0-9]*")){
      fl = "FLoat";
   }else if (floatL.matches("0[xX][0-9]*[._p][_*0-9a-fA-F]+")){
      fl = "FLoat";

    }
		return fl; 
	}

public static String isAInt(String intL){
   String il = "Not a int";
 	if(intL.matches("\\d+[_*0-9]*")){
     il = "Integer";
   }else if (intL.matches("0[xX][_*0-9a-fA-F]+")){
      il = "Integer";
   }else if (intL.matches("0[oO][0-7]+[_*[0-7]+]*")){
      il = "Integer";
   }else if (intL.matches("0[bB][0-1]+[_*[0-1]+]*")){
      il = "Integer";
   }
  return il;
}

public static String isAString(String stringL){
   String sl = "no";
   	if(stringL.matches("\"[a-z*A-Z*\\p{ASCII}*\\p{Punct}*\\p{Digit}*]*\"")){
     sl = "String";
   }else if (stringL.matches("'[\\p{Alnum}*\\p{ASCII}*\\p{Punct}*]*'")){
      sl = "String";
   }else if (stringL.matches("[\"*'*]*[\\p{Alnum}*\\p{ASCII}*\\p{Punct}*]*")){
      sl = "String";
   }
   return sl;
}

}
 
 