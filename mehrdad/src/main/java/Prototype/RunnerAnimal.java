package Prototype;

public class RunnerAnimal extends Animal{
    public int speed;
    public RunnerAnimal() {
    }

    public RunnerAnimal(RunnerAnimal target) {
        super(target);
        if (target != null) {
            this.speed = target.speed;
        }
    }
    @Override
    public Animal clone() {
        return new RunnerAnimal(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof RunnerAnimal) || !super.equals(object2)) return false;
        RunnerAnimal shape2 = (RunnerAnimal) object2;
        return shape2.speed == speed;
    }
}
