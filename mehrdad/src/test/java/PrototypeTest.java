import Prototype.Birds;
import Prototype.RunnerAnimal;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrototypeTest {

    @Test
    public void createBird(){

        Birds bird = new Birds();
        bird.weight = 4;
        bird.flyTime = 12;
        bird.whereLive = "iran";

        Birds newbird = (Birds) bird.clone();
        assertEquals(bird, newbird);

    }

    @Test
    public void createRunnerAnimal(){

        RunnerAnimal ra = new RunnerAnimal();
        ra.weight = 40;
        ra.whereLive = "africa";
        ra.speed = 30;

        RunnerAnimal newRa = (RunnerAnimal) ra.clone();
        assertEquals(ra, newRa);

    }
}
