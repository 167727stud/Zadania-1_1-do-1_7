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
  System.out.print( "6-Zadanie 1_6");
  System.out.print(System.lineSeparator());
  System.out.print( "7-Zadanie 1_7");
  System.out.print(System.lineSeparator());
  int mem=2;
  for(;;){
  Scanner myInput = new Scanner( System.in );
  mem = myInput.nextInt();

 
  switch(mem)
  {
    case 1:
    System.out.print( "Hello World");  
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
                default:
 
  }
  
  
System.out.print(System.lineSeparator());
    System.out.print(System.lineSeparator());
    System.out.print(System.lineSeparator());
}}
}

