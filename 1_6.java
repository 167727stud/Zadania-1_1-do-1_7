  public static void main(String[] args) 
{ 
  double pep;
    System.out.print( "jaką liczbę chcesz sprawdzić czy jest pierwsza");
   System.out.print(System.lineSeparator());
  Scanner myInput = new Scanner( System.in );
  pep = myInput.nextInt();
  double lel = Math.sqrt(pep);
  if(pep<11){
    for(int kek=2;kek<pep;kek++)//przypadek dla małych liczb
      {
        if(pep % kek == 0)
        {
          System.out.println("No nie wiem , chyba ta"+
                             " liczba nie jest pierwsza ");
        return ;
        }
      }
    System.out.println("Brawo trafiłeś w liczbę pierwszą"); 
    }
  else{//przypadek dla dużych liczb
  for(int kek=2;kek<lel;kek++)
    {
      if ( pep % kek  == 0 )
      {
        System.out.println("No nie wiem , chyba ta liczba nie jest pierwsza ");
        return ;
      }
      }
  System.out.println("Brawo trafiłeś w liczbę pierwszą");
    }}}