
public class Salmon extends Fish
{
            public void showType()
            {
                System.out.println(" The fish is a  " + super.Fish);
                System.out.println("The fish moves " + this.move() + " and uses his  " 
                        + this.breathe() +  " to breath " + "and makes " + makeSound()+ ".\n");
            }
}
