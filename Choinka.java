import java.util.Scanner;
class Choinka {
public static void Choinka() 
{ 
  


    Scanner myInput = new Scanner( System.in );
  System.out.print( "wpisz pierwszą liczbe " );
int rer = myInput.nextInt();

  System.out.print( "wpisz Drugą liczbe " );
  int heh = myInput.nextInt();

  for(int pep = 0;pep<rer;pep++)
    {

            for(int lel = 0;lel<heh;lel++)
        {
          System.out.print("X");

        }
            for(int kek = 0;kek<rer;kek++)
        {
              System.out.print(".");

        }
      rer--;
      heh++;

      System.out.print(System.lineSeparator());
    }
      System.out.print("............|||||||............");
            System.out.print(System.lineSeparator());
      System.out.print("............|||||||............");
            System.out.print(System.lineSeparator());
      System.out.print("............|||||||............");


}}