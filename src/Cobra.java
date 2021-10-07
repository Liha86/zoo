
public class Cobra extends Reptile  
{
    @Override
    String move()
    {
        String move = " Slither";
        return move;
    }
    String makeSound()
    {
        String makeSound = "hissssssss";
        return makeSound;
    }
            public void showType()
            {
                System.out.println(" The reptile is a  " + super.Reptile);
                System.out.println("The reptile moves " + this.move() + " and uses his  " 
                        + this.breathe() +  " to breath " + "and makes " + makeSound()+ ".\n");
            }
    
}
