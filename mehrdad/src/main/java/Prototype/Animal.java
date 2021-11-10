package Prototype;

import java.util.Objects;

public abstract class Animal {
    public int weight;
    public String whereLive;

    public Animal() {
    }

    public Animal(Animal target) {
        if (target != null) {
            this.weight = target.weight;
            this.whereLive = target.whereLive;

        }

    }
    public abstract Animal clone();
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Animal)) return false;
        Animal shape2 = (Animal) object2;
        return shape2.weight == weight &&  Objects.equals(shape2.whereLive, whereLive);
    }
}
