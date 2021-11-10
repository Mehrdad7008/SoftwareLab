import AbstractFac.Builder.IranianBuilder;
import AbstractFac.Builder.JapaneseBuilder;
import AbstractFac.Flower.IranianFlower;
import AbstractFac.Flower.JapaneseFlower;
import AbstractFac.Tree.IraninaTree;
import AbstractFac.Tree.JapaneseTree;
import org.junit.Test;
import static org.junit.Assert.*;


public class AbstractFactory {

    @Test
    public void createIranianFlower() {
        IranianBuilder iranianBuilder = new IranianBuilder();
        IranianFlower irf= (IranianFlower) iranianBuilder.createFlower();
        int status = irf.doesCreate();
        int expectedStatus = 1;
        assertEquals(status, expectedStatus);
    }

    @Test
    public void createJapaneseFlower() {
        JapaneseBuilder jb = new JapaneseBuilder();
        JapaneseFlower jrf= (JapaneseFlower) jb.createFlower();
        int status = jrf.doesCreate();
        int expectedStatus = 1;
        assertEquals(status, expectedStatus);
    }

    @Test
    public void createIranianTree() {
        IranianBuilder iranianBuilder = new IranianBuilder();
        IraninaTree irf= (IraninaTree) iranianBuilder.createTree();
        int status = irf.doesCreate();
        int expectedStatus = 2;
        assertEquals(status, expectedStatus);
    }

    @Test
    public void createJapaneseTree() {
        JapaneseBuilder jb = new JapaneseBuilder();
        JapaneseTree jrf= (JapaneseTree) jb.createTree();
        int status = jrf.doesCreate();
        int expectedStatus = 2;
        assertEquals(status, expectedStatus);
    }
}
