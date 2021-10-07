
import java.util.Scanner;
public class Main 

{

    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        input = new Scanner(System.in);
        int choice;
        
        while(true)
        {
            System.out.println("Main menu");
            System.out.println("1.) Display human attributes \n");
            System.out.println("2.) Display dog attributes \n");
            System.out.println("3.) Display cobra attributes \n");
            System.out.println("4.) Display crow attributes \n");
            System.out.println("5.) Display salmon attributes \n");
            System.out.println("6.) Exit \n");

            choice = input.nextInt();
            
            switch (choice)
            {
                case 1:

                    Human human = new Human();
//                  human.print(" The human is a "+ human.Mammal + " and breathes with his " +  human.breathe() + " and moves " + human.move() + " and talks " + human.makeSound() + "\n");
                    human.showType();
                    break;
        
                case 2:

                    Dog dog = new Dog();
//                    dog.print(" The dog is a " + dog.Mammal + " and breathes with his" + dog.breathe() + " and moves " + dog.move() + " and talks " + dog.makeSound() + "\n");
                    dog.showType();
                    break;
                    
                case 3:

                    Cobra cobra = new Cobra();
//                    cobra.print(" The cobra is a "+ cobra.Reptile + " and breathes with his" + cobra.breathe() + " and moves " + cobra.move() + " and talks " + cobra.makeSound() + "\n");
                    cobra.showType();
                    break;
                    
                case 4:

                    Crow crow = new Crow();
//                    crow.print(" The crow is a " + crow.Bird + " and breathes with his " + crow.breathe() + " and moves " + crow.move() + " and talks " + crow.makeSound() + "\n");
                    crow.showType();
                    break;
                    
                case 5:

                    Salmon salmon = new Salmon();
//                    salmon.print(" The salmon breathes is a "+ salmon.Fish + " and breathes with his"  + salmon.breathe() + " and moves " + salmon.move() + " and talks " + salmon.makeSound() + "\n");
                    salmon.showType();
                    break;
                    
                case 6:
                    System.out.println("Exiting Program...");
                    System.exit(0);
                    break;
                    
                default:
                    
                    System.out.println("This is not a valid Menu Option! Please Select Another" + "\n");
                    break;
//                     comment
                   
            }
        }
    }
}