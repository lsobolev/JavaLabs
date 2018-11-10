package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task1.model;


public class Dragon {

    private String name;
    private int numHead;
    private int numEyes;
    private int age;

    public Dragon(String name, int age) {
        numHead = 3;
        numEyes = numHead * 2;
        this.name = name;
        this.age = age;
        this.calculateHead();
    }

    public int getNumHead() {
        return numHead;
    }

    private void calculateHead() {

        int age = this.age;

        if (age >= 200) {
            numHead += 200 * 3;
            age -= 200;
        } else {
            numHead += age * 3;
            age = 0;
        }

        if (age >= 100) {
            numHead += 100 * 2;
            age -= 100;
        } else {
            numHead += age * 2;
            age = 0;
        }
        numHead += age;

        numEyes = numHead * 2;
    }


    @Override
    public String toString() {
        return "\nDragon: " + name +
                "\nNum Head: " + numHead +
                "\nNum Eyes: " + numEyes +
                "\nAge: " + age;
    }
}
