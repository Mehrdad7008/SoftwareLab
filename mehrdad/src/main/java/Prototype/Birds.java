package Prototype;

public class Birds extends Animal{

    public int flyTime;

    public Birds() {
    }

    public Birds(Birds target) {
        super(target);
        if (target != null) {
            this.flyTime = target.flyTime;
        }
    }
    @Override
    public Animal clone() {
        return new Birds(this);
    }


    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Birds) || !super.equals(object2)) return false;
        Birds shape2 = (Birds) object2;
        return shape2.flyTime == flyTime;
    }
}
