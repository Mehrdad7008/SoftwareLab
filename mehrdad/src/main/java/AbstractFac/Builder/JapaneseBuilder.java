package AbstractFac.Builder;

import AbstractFac.Flower.Flower;
import AbstractFac.Flower.JapaneseFlower;
import AbstractFac.Tree.JapaneseTree;
import AbstractFac.Tree.Tree;

public class JapaneseBuilder implements Builder{
    @Override
    public Tree createTree() {
        return new JapaneseTree();
    }

    @Override
    public Flower createFlower() {
        return new JapaneseFlower();
    }
}
