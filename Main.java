import java.util.Scanner;
class Main {
  
  public static void main(String[] args) 
{ 
  int pep;
  double lel;
  double kek;
  double rer;
  System.out.print( "Wciśnij odpowiednią liczbe");
   System.out.print(System.lineSeparator());
  System.out.print( "1 – dla sumy") ;
   System.out.print(System.lineSeparator());
  System.out.print( "2 – dla różnicy");
   System.out.print(System.lineSeparator());
  System.out.print( "3 – dla iloczynu");
   System.out.print(System.lineSeparator());
  System.out.print( "4 – dla ilorazu");
   System.out.print(System.lineSeparator());
    System.out.print( "inna – Wyjdź");
   System.out.print(System.lineSeparator());
  Scanner myInput = new Scanner( System.in );
  pep = myInput.nextInt();
  
  switch(pep){
    case 1:
  
  System.out.print( "wpisz pierwszą liczbe " );
lel = myInput.nextInt();
  System.out.print( "wpisz Drugą liczbe " );
kek = myInput.nextInt();
  rer = lel+kek;
    System.out.println("suma to "+rer);
      break;
          case 2:

  System.out.print( "wpisz pierwszą liczbe " );
lel = myInput.nextInt();
  System.out.print( "wpisz Drugą liczbe " );
kek = myInput.nextInt();
 rer = lel-kek;
    System.out.println("suma to "+rer);
      break;
          case 3:
 
  System.out.print( "wpisz pierwszą liczbe " );
lel = myInput.nextInt();
  System.out.print( "wpisz Drugą liczbe " );
kek = myInput.nextInt();
rer = lel*kek;
    System.out.println("suma to "+rer);
      break;
          case 4:

  System.out.print( "wpisz pierwszą liczbe " );
lel = myInput.nextInt();
  System.out.print( "wpisz Drugą liczbe " );
kek = myInput.nextInt();
rer = lel/kek;
    System.out.println("suma to "+rer);
      break;
    default:
      break;
             }
  }
  //ble
}