
public class Dog extends Mammal
{
    @Override
    String move()
    {
        String move = " with four legs";
        return move;
    }
    @Override
    String makeSound()
    {
        String makeSound = "voff voff";
        return makeSound;
        
    }
    public void showType()
            {
                System.out.println(" The dog is a  " + super.Mammal);
                System.out.println("The dog moves " + this.move() + " and uses his  " 
                        + this.breathe() +  " to breath " + "and makes " + makeSound()+ ".\n");
            }
}
