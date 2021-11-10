package AbstractFac.Builder;

import AbstractFac.Flower.Flower;
import AbstractFac.Flower.IranianFlower;
import AbstractFac.Tree.IraninaTree;
import AbstractFac.Tree.Tree;

public class IranianBuilder implements Builder{
    @Override
    public Tree createTree() {
        return new IraninaTree();
    }

    @Override
    public Flower createFlower() {
        return new IranianFlower();
    }
}
