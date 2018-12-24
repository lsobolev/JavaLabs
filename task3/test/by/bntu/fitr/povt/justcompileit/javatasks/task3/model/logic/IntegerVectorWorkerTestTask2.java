package by.bntu.fitr.povt.justcompileit.javatasks.task3.model.logic;

import by.bntu.fitr.povt.justcompileit.javatasks.task3.model.entity.IntegerVector;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerVectorWorkerTestTask2 {

    @Test
    public void case1() {

        int expected = 6;
        IntegerVector model = new IntegerVector(-1, 0, 1, 2, 3, 0, -1, 0);
        assertEquals(Integer.toString(expected), VectorWorker.getSumOfElementsBetweenFirsAndSecondZeroElement(model));

    }

    @Test
    public void case2() {
        String expected = VectorWorker.ONLY_ZERO_EL;
        IntegerVector model = new IntegerVector(0, 0, 0, 0, 0, 0, 0, 0);
        assertEquals(expected, VectorWorker.getSumOfElementsBetweenFirsAndSecondZeroElement(model));
    }

    @Test
    public void case3() {
        String expected = VectorWorker.VECTOR_IS_NULL;
        IntegerVector model = new IntegerVector(null);
        assertEquals(expected, VectorWorker.getSumOfElementsBetweenFirsAndSecondZeroElement(model));
    }

    @Test
    public void case4() {
        String expected = VectorWorker.VECTOR_NULL_LENGTH;
        IntegerVector model = new IntegerVector(0);
        assertEquals(expected, VectorWorker.getSumOfElementsBetweenFirsAndSecondZeroElement(model));
    }

    @Test
    public void case5() {

        String expected = VectorWorker.NO_ONE_ZERO_VALUE;
        IntegerVector model = new IntegerVector(-1, 0, 1, 2, 3, -1);
        assertEquals(expected, VectorWorker.getSumOfElementsBetweenFirsAndSecondZeroElement(model));

    }

    @Test
    public void case6() {

        String expected = VectorWorker.NO_NONZERO_EL;
        IntegerVector model = new IntegerVector(-1, 1, 0, 0, 2, 3, -1);
        assertEquals(expected, VectorWorker.getSumOfElementsBetweenFirsAndSecondZeroElement(model));

    }

    @Test
    public void case7() {

        String expected = VectorWorker.NO_ONE_ZERO_VALUE;
        IntegerVector model = new IntegerVector(-1, 1, 2, 3, -1);
        assertEquals(expected, VectorWorker.getSumOfElementsBetweenFirsAndSecondZeroElement(model));

    }


}
