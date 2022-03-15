import java.util.Scanner;
class Parzysta {
public static void Parzysta() 
{ 
  double pep;
    System.out.print( "jaką liczbę chcesz sprawdzić czy jest parzysta");
   System.out.print(System.lineSeparator());
  Scanner myInput = new Scanner( System.in );
  pep = myInput.nextInt();
  if ( pep % 2 == 0 ){
        System.out.println("ta liczba jest parzysta");
        }
  else{System.out.println("ta liczba nie jest parzysta");}
  }}