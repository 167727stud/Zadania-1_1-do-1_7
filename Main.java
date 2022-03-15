import java.util.Scanner;
class Main {
  Scanner myInput = new Scanner( System.in );
  
  public static void main(String[] args) 
{ System.out.print( "1-Zadanie 1_1");
  System.out.print(System.lineSeparator());  
  System.out.print( "2-Zadanie 1_2");
  System.out.print(System.lineSeparator());
  System.out.print( "3-Zadanie 1_3");
  System.out.print(System.lineSeparator());
  System.out.print( "4-Zadanie 1_4");
  System.out.print(System.lineSeparator());
  System.out.print( "5-Zadanie 1_5");
  System.out.print(System.lineSeparator());
  System.out.print( "6-stare zadanie 1_6");
  System.out.print(System.lineSeparator());
  System.out.print( "7-Zadanie 1_7");
  System.out.print(System.lineSeparator());
   System.out.print( "8-Zadanie 1_5 druga wersja czy jest parzysta");
  System.out.print(System.lineSeparator());
    System.out.print( "9-Zadanie 1_6 nowe zadanie z celcjuszami");
  System.out.print(System.lineSeparator());
  int mem=2;
  for(;;){
  Scanner myInput = new Scanner( System.in );
  mem = myInput.nextInt();

 
  switch(mem)
  {
    case 1:
    System.out.print( "H");
    System.out.print(System.lineSeparator()); 
          System.out.print( "e");
    System.out.print(System.lineSeparator()); 
          System.out.print( "l");
    System.out.print(System.lineSeparator()); 
          System.out.print( "l");
    System.out.print(System.lineSeparator()); 
          System.out.print( "o");
    System.out.print(System.lineSeparator()); 
          System.out.print( " ");
    System.out.print(System.lineSeparator()); 
          System.out.print( "W");
    System.out.print(System.lineSeparator()); 
          System.out.print( "o");
    System.out.print(System.lineSeparator()); 
          System.out.print( "r");
    System.out.print(System.lineSeparator()); 
          System.out.print( "l");
    System.out.print(System.lineSeparator()); 
          System.out.print( "d");
 
      
    break;
      
    case 2:
    wypisanie.wypisanie(); 
    break;

    case 3:
    dodawanie.dodawanie();
    break;

    case 4:
    kalkulator.kalkulator();
    break;

    case 5:
    Parzyste.Parzyste();
    break;

    case 6:
    Pierwsza.Pierwsza();
    break;

    case 7:
    Choinka.Choinka();
    break;
          case 8:
    Parzysta.Parzysta();
    break;

    case 9 :
    TalepszaJednostka.TalepszaJednostka();
    break;
                default:
 
  }
  
  
System.out.print(System.lineSeparator());
    System.out.print(System.lineSeparator());
    System.out.print(System.lineSeparator());
}}
}

