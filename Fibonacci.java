
public class Fibonacci{

  public static void main (String args[]){

    /*
       1 + 1 = 2
       1 + 2 = 3
       2 + 3 = 5
       3 + 5 = 8
       5 + 8 = 13
    */

    int x = 0;
    int y = 1;
    int n;
    int i;

    for (i=0; i<15; i++){

       n = x + y;

       x = y;
       y = n;


      System.out.printf("%5s %n",n);
    }

  }

}