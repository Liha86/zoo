
public class Crow extends Bird
{
    
    @Override
    String move()
    {
        String move = " flies";
        return move;
    }
    @Override
    String makeSound()
    {
        String makeSound = "cra cra cra";
        return makeSound;
    }
        public void showType()
            {
                System.out.println(" The bird is a  " + super.Bird);
                System.out.println("The bird moves " + this.move() + " and uses his  " 
                        + this.breathe() +  " to breath " + "and makes " + makeSound()+ ".\n");
            }
    
}
