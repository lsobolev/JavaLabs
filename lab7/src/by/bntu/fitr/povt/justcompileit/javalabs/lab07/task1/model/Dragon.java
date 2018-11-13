package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task1.model;


public class Dragon {

    public final int FIRST_PERIOD = 200;
    public final int COUNT_HEAD_FIRST_PERIOD = 3;
    public final int STEP_NEXT_PERIOD = 100;
    public final int COUNT_HEAD_SECOND_PERIOD = 2;

    private String name;
    private int numHead;
    private int numEyes;
    private int age;

    public Dragon(String name, int age) {
        this.name = name;
        this.numHead = 3;
        this.numEyes = numHead * 2;
        this.age = this.ageValidation(age);
        this.calculateHead();
    }

    public String getName() {
        return name;
    }

    public int getNumEyes() {
        return numEyes;
    }

    public int getAge() {
        return age;
    }

    public int getNumHead() {
        return numHead;
    }

    private int ageValidation(int age) {
        if (age >= 0) {
            return age;
        } else {
            return 0;
        }
    }

    private void calculateHead() {

        int age = this.age;

        if (age >= FIRST_PERIOD) {
            numHead += FIRST_PERIOD * COUNT_HEAD_FIRST_PERIOD;
            age -= FIRST_PERIOD;
        } else {
            numHead += age * COUNT_HEAD_FIRST_PERIOD;
        }

        if (age >= STEP_NEXT_PERIOD) {
            numHead += STEP_NEXT_PERIOD * COUNT_HEAD_SECOND_PERIOD;
            age -= STEP_NEXT_PERIOD;
        } else {
            numHead += age * COUNT_HEAD_SECOND_PERIOD;
        }

        numHead += age;
        numEyes = numHead * 2;
    }


    @Override
    public String toString() {
        return "\nDragon: " + name +
                "\nAge: " + age +
                "\nNum Head: " + numHead +
                "\nNum Eyes: " + numEyes;
    }
}
