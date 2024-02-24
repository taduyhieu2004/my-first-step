package animal;

public class DogAction  implements AnimalAction {
    @Override
    public void move() {

        System.out.println("walk on 4 legs");

    }

    @Override
    public void sound() {
        System.out.println("gau gau");

    }
}
