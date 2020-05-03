class Main {
  public static void main(String[] args) {
    int i,j;
    i= j =0;
    int x[][]= {{0,7,3,5},
              {4,5,6,8},
              {0,0,0,0},
              {9,4,2,7}};
    for(i=1 ; i<=3 ; i++){
      for(j=1 ; j<=3 ; j++){
        if(x[i][j] != 0){
          break;
      }else {
          System.out.println("First all-zero row is " + i );
          break;
      }
      }
    }
  }
}
