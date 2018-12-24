package by.bntu.fitr.povt.justcompileit.javatasks.task3.model.logic;

import by.bntu.fitr.povt.justcompileit.javatasks.task3.model.entity.IntegerVector;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerVectorWorkerTestTask1 {

    @Test
    public void case1(){

        int expected = 5;
        IntegerVector model = new IntegerVector(-1, 0, 1, 2, 3, 0, -1, 0);
        assertEquals(Integer.toString(expected), VectorWorker.getNumberMaxElement(model));

    }

    @Test
    public void case2(){

        String expected = VectorWorker.FALSE_RESULT;
        IntegerVector model = new IntegerVector(6);
        assertEquals(expected, VectorWorker.getNumberMaxElement(model));

    }

    @Test
    public void case3() {
        String expected = VectorWorker.VECTOR_IS_NULL;
        IntegerVector model = new IntegerVector(null);
        assertEquals(expected, VectorWorker.getNumberMaxElement(model));
    }

    @Test
    public void case4() {
        String expected = VectorWorker.FALSE_RESULT;
        IntegerVector model = new IntegerVector(0);
        assertEquals(expected, VectorWorker.getNumberMaxElement(model));
    }


}