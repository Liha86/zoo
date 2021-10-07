
public class Human extends Mammal
{
            @Override
            String move()
            {
                String move = " with two legs";
                return move;
            }
            @Override
            String makeSound()
            {
                String makeSound = " bla bla bla";
                return makeSound;
            }
            public void showType()
            {
                System.out.println(" The human is a  " + super.Mammal);
                System.out.println("The human moves " + this.move() + " and uses his  " 
                        + this.breathe() +  " to breath " + "and makes " + makeSound()+ ".\n");
   
            }
}
