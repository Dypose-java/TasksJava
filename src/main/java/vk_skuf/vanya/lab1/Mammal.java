package vk_skuf.vanya.lab1;

public class Mammal {
    private String name,family;
    private float maxSpeed;

    public Mammal(String name, String family, float maxSpeed) {
        this.name = name;
        this.family = family;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }
}
