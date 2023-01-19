import java.util.Scanner;


public class project1 {

    static int Player_HP = 100;
    static int Bot_HP = 100;
   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
                                    
        String information = """
                        -------------------------------------------------------------välkommen till Tensta fight--------------------------------------------------------------

                                                            För attack-lista skriv (Lista)                För att spela skriv (Start)
                """;

        System.out.println(information);
        
        String laeeb = scan.nextLine();

        if (laeeb.equals("Lista") || laeeb.equals("lista"))
    {
        System.out.println("(1)Attack 1 har 95% chans att träffa och gör 3 skada");
        System.out.println("(2)Attack 2 har 70% chans att träffa och gör 8 skada");
        System.out.println("(3)Attack 3 har 50% chans att träffa och gör 15 skada");
        System.out.println("(4)Attack 4 har 30% chans att träffa och gör 25 skada");
        System.out.println("(5)Attack 5 har 50% chans att träffa och gör 90 skada");
        System.out.print("Tryck enter för att starta matchen");
        scan.nextLine();
    }
        
       
        System.out.print("\nVälj ett namn: ");
        String Username = scan.nextLine();
        System.out.println("välkommen till tensta " +Username);
       
        while(Player_HP>0)
        {
            Player_Attacks(scan);
            //Bot_Attacks();
            System.out.println("Bot hp: "+Bot_HP);
            System.out.println("Spelare hp: "+Player_HP);
        }
    
    }

    
    
    static boolean Player_Attacks(Scanner scan)
    {
        System.out.println("\nGör ditt drag!!!");
        
        String attack = scan.nextLine();


        if (attack.equals("1"))
        {
            double random = Math.random()*100;

            if(5<=random && random<=100)
            {
                System.out.println("Träff");
                Bot_HP = Bot_HP-3;
                return true;
            }
            else
            {
                System.out.println("Attack 1 missade!");
                System.out.println(Bot_HP);
                return false;
            }
        }

        if (attack.equals("2"))
        {
            double random = Math.random()*100;

            if(30<=random && random<=100)
            {
                System.out.println("Träff");
                Bot_HP = Bot_HP-8;
                return true;
            }
            else
            {
                System.out.println("Attack 2 missade!");
                System.out.println(Bot_HP);
                return false;
            }
        }

        if (attack.equals("3"))
        {
            double random = Math.random()*100;

            if(50<=random && random<=100)
            {
                System.out.println("Träff");
                Bot_HP = Bot_HP-15;
                return true;
            }
            else
            {
                System.out.println("Attack 3 missade!");
                System.out.println(Bot_HP);
                return false;
            }
        }

        if (attack.equals("4"))
        {
            double random = Math.random()*100;

            if(70<=random && random<=100)
            {
                System.out.println("Träff");
                Bot_HP = Bot_HP-25;
                return true;
            }
            else
            {
                System.out.println("Attack 4 missade!");
                System.out.println(Bot_HP);
                return false;
            }
        }

        if (attack.equals("5"))
        {
            double random = Math.random()*100;

            if(95<=random && random<=100)
            {
                System.out.println("Träff");
                Bot_HP = Bot_HP-90;
                return true;
            }
            else
            {
                System.out.println("Attack 5 missade!");
                System.out.println(Bot_HP);
                return false;
            }
        }

        return false;


    }

    static boolean Bot_Attacks()
    {
        System.out.println("\nbottens tur: ");
       
        {
            double random = Math.random()*100;

            if(Bot_HP>=75 && Player_HP==100)
            {
                
                Player_HP = Player_HP-70;
            }
            
            return false;
        }
    }
}



