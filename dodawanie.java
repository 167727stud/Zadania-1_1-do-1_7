import java.util.Scanner;
class dodawanie {

  public static void dodawanie() 
{ 
  Scanner myInput = new Scanner( System.in );
  System.out.print( "wpisz pierwszą liczbe " );
double lel = myInput.nextInt();
lel = Math.sqrt(lel);
  System.out.print( "wpisz Drugą liczbe " );
  double kek = myInput.nextInt();
kek = Math.sqrt(kek);

  double rer = lel+kek;
    System.out.println("suma to "+rer);
  }
  //ble
}