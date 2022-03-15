import java.util.Scanner;
class kalkulator {
public static void kalkulator() 
{ 
  int pep;
  double lel;
  double kek;
  double rer;
  System.out.print( "Wciśnij odpowiednią liczbe");
   System.out.print(System.lineSeparator());
  System.out.print( "1 – ") ;
   System.out.print(System.lineSeparator());
  System.out.print( "2 – ");
   System.out.print(System.lineSeparator());
  System.out.print( "3 – ");
   System.out.print(System.lineSeparator());
  System.out.print( "4 – dla ilorazu");
   System.out.print(System.lineSeparator());
    System.out.print( "inna – Wyjdź");
   System.out.print(System.lineSeparator());
  Scanner myInput = new Scanner( System.in );
  pep = myInput.nextInt();

  switch(pep){
    case 1:
//pole prostokąta
  System.out.print( "wpisz długość pierwszego boku " );
lel = myInput.nextInt();
  System.out.print( "wpisz długość drugiego boku " );
kek = myInput.nextInt();
  rer = lel*kek;
    System.out.println("pole "+rer);
      break;
          case 2:

  System.out.print( "Podaj pierwszy promień " );
lel = myInput.nextInt();
  System.out.print( "Podaj drugi promień " );
kek = myInput.nextInt();
  double    tet = 3.14 ;

 rer = (lel*lel*tet)+(kek*kek*tet) ;
    System.out.println("suma to "+rer);
      break;
          case 3:

  System.out.print( "wpisz długość podstwy " );
lel = myInput.nextInt();
  System.out.print( "podaj wysokość padającą na podstawe " );
kek = myInput.nextInt();
int beb = 2;
rer = lel*kek/beb;
    System.out.println("suma to "+rer);
      break;
          case 4:

  System.out.print( "wpisz pierwszą liczbe " );
lel = myInput.nextInt();
  System.out.print( "wpisz Drugą liczbe " );
kek = myInput.nextInt();
      if(kek==0){
        System.out.println("dzielnik nie może być zerem ");

      }
      else{rer = lel/kek;
    System.out.println("suma to "+rer);}
      break;
    default:
      break;
             }
  }
  //ble
}