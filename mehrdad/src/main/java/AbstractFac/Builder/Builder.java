package AbstractFac.Builder;

import AbstractFac.Flower.Flower;
import AbstractFac.Tree.Tree;

public interface Builder {
    Tree createTree();
    Flower createFlower();
}
