import java.util.Scanner;


public class project1 {
    static Scanner scan = new Scanner(System.in);
    static int Player_HP = 100;
    static int Bot_HP = 100;
   
    public static void main(String[] args) {
        
        while(true)
            {
                
       
            String information = """
                        -------------------------------------------------------------The Final Breakout--------------------------------------------------------------
                        
                                                    Step into the ring and prepare for epic brawls in this pulse-pounding fighting game! 
                                                Battle against the best opponents around the world, using strategy and skill to come out on top. 
                                                    Will you rise to become the new champion of the arena, or will you fall in defeat? 
                                                                                    The fight is on!

                                                        For Attack-list write (List)                To start the game write Start (Start)
                        ----------------------------------------------------------------------------------------------------------------------------------------------
                """;

            System.out.println(information);
        
        // Denna While loop gör det möjligt för spelaren att välja att antingen se attack-listan både för botten och spelarens egna attacker genom att skriva List eller endast L.
       // Eller genom att skriva start så startar man spelet direkt. Allt annat som man skriver kommer inte gå igenom och man får invalid input.
            while(true){
                String laeeb = scan.nextLine();
                if (laeeb.equals("List") || laeeb.equals("list") || laeeb.equals("L") || laeeb.equals("l"))
                {
                    spelare_lista();
                    bot_lista();
                }
                else if(laeeb.equals("Start") || laeeb.equals("start") || laeeb.equals("START") || laeeb.equals("S") || laeeb.equals("s"))
                {
                    System.out.print("\nChoose a name: ");
                    String Username = scan.nextLine();
                    System.out.println("Welcome to The Final Breakout " +Username);
                    break;
                
                }
                else
                {
                    System.out.println("Invalid input, write Start or List");
                    continue;
                }

                int Username = 0;
                String U =Integer.toString(Username);

                System.out.print("\nChoose a name: ");
                U = scan.nextLine();
                System.out.println("Welcome to The Final Breakout " +U);
                break;
            }    

            while(Player_HP>0 && Bot_HP >0)
            {
                Player_Attacks(scan);
                Bot_Attacks();
                System.out.println("\nThe legendary fighter hp: "+Bot_HP);
                System.out.println("Player hp: "+Player_HP);
                scan.nextLine();
                clearScreen();
            }
    
            if (Bot_HP <=0)
            {
                System.out.println("You killed the legendary fighter");
                System.out.println("Game over!!!");
            }
            else
            {
                System.out.println("The legendary fighter killed you");
                System.out.println("Game over!!!");
            }

            System.out.println("Type restart if you want to play again!!");
            String restarter = scan.nextLine();
            if( restarter.equals("restart"))
            {
                Player_HP = 100;
                Bot_HP = 100;
                continue;
            }
        }
    }   
    
    static boolean spelare_lista(){
        System.out.println(("Your Attacks:"));
                   
            System.out.println("[1] Accuracy: 95%   Damage: -3hp");
            System.out.println("[2] Accuracy: 70%   Damage: -8hp");
            System.out.println("[3] Accuracy: 50%   Damage: -15hp");
            System.out.println("[4] Accuracy: 30%   Damage: -25hp");
            System.out.println("[5] Accuracy: 5%    Damage: -90hp");
            System.out.println("\nPress enter to continue:");
            scan.nextLine();
            return false;
    }

    static boolean bot_lista(){
    System.out.println("The legendary fighters attacks:");
    System.out.println("[1] Accuracy: 95%   Damage: -5hp");
    System.out.println("[2] Accuracy: 70%   Damage: -12hp");
    System.out.println("[3] Accuracy: 50%   Damage: -18hp");
    System.out.println("[4] Accuracy: 30%   Damage: -30hp");
    System.out.println("[5] Accuracy: 5%    Damage: -100hp");
    System.out.print("\nPress enter to start the game!!!");
    scan.nextLine();
    return false;
    }
        
    static boolean Player_Attacks(Scanner scan)
    {
        while(true)
        {

            System.out.println("");
            System.out.println("Choose your move!!!");
    
            
            String attack = scan.nextLine();
            double random = Math.random()*100;
    
    
            if (attack.equals("1"))
            {
                return Spelare_attck(random, 5, 3);
            }
    
            else if (attack.equals("2"))
            {
                return Spelare_attck(random, 30, 8);
            }
    
            else if (attack.equals("3"))
            {
                return Spelare_attck(random, 50, 15);
            }
    
            else if (attack.equals("4"))
            {
              return Spelare_attck(random, 70, 25);
            }
    
            else if (attack.equals("5"))
            {
                return Spelare_attck(random, 95, 90);
            }
    
            else if(attack.equals("6") || attack.equals("list") || attack.equals("List") || attack.equals("LIST"))
            {
                spelare_lista();
                continue;
            }
            else{
                System.out.println("invalid input");
                continue;
            }

        }
    }
    public static boolean Spelare_attck(double random, int min, int skada)
    {
        if(min<=random && random<=100)
        {
            System.out.println("Critical hit!!!");
            Bot_HP -= skada;
            return true;
        }
        else
        {
            System.out.println("Unfortunatly you missed!");
            return false;
        }
    }

    static boolean Bot_Attacks()
    {
        System.out.println("\nThe legendary fighters turn: ");
        double random = Math.random()*100;
        int x = (int)(Math.random()*(5)+1);
            switch(x){
                case 1:
                    if(random<=5 && random<=100)
                    {
                        System.out.println("The legendary fighter got a hit with Attack1");
                        Player_HP = Player_HP-5;
                        return true;
                    }
                case 2:
                    if(random<=30 && random<=100)
                    {
                        System.out.println("The legendary fighter got hit with Attack2");
                        Player_HP -= 12;
                        return true;
                    }

                case 3:
                    if(random<=50 && random<=100)
                    {
                        System.out.println("The legendary fighter got a hit with Attack3");
                        Player_HP -= 18;
                        return true;
                    }

                case 4:
                    if(random<=70 && random<=100)
                    {
                        System.out.println("The legendary fighter got a hit with Attack4");
                        Player_HP -= 30;
                        return true;
                    }   
                    
                    case 5:
                    if(random<=5 && random<=100)
                    {
                        System.out.println("The legendary fighter got a critical hit");
                        Player_HP -= 100;
                        return true;
                    }    
                
                default: 
                    System.out.println("The legendary fighter missed");
                    return false;
            }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
    }
}