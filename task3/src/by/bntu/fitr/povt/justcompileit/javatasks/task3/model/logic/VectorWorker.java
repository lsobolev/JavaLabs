package by.bntu.fitr.povt.justcompileit.javatasks.task3.model.logic;

import by.bntu.fitr.povt.justcompileit.javatasks.task3.model.entity.IntegerVector;

public class VectorWorker {


    public static final String FALSE_RESULT = "All element are equal!";
    public static final String NO_NONZERO_EL = "Between zero elements there are no nonzero elements";
    public static final String ONLY_ZERO_EL = "Vector contains only zero elements.";
    public static final String NO_ONE_ZERO_VALUE = "Vector contains only one zero elements.";
    public static final String VECTOR_NULL_LENGTH = "Vector contains only one zero elements.";
    public static final String VECTOR_IS_NULL = "Vector is empty.";

    public static final int DEFAULT_INDEX_VALUE = -1;

    public static String getNumberMaxElement(IntegerVector vector) {

        String result = FALSE_RESULT;


        if (!vector.isNull()) {
            int maxEl = 0;
            boolean isExist = false;

            int index = 0;
            for (int i = 0; i < vector.getVectorLength(); i++) {
                if (maxEl < vector.getElementOfIndex(i)) {
                    maxEl = vector.getElementOfIndex(i);
                    isExist = true;
                    index = i + 1;
                }
            }

            if (isExist) {
                result = Integer.toString(index);
            }
        } else {
            result = VECTOR_IS_NULL;
        }

        return result;
    }

    public static boolean isOnlyZeroVectorEl(IntegerVector vector) {

        boolean isOnlyZero = true;

        for (int i = 0; i < vector.getVectorLength(); i++) {
            if (vector.getElementOfIndex(i) != 0) {
                isOnlyZero = false;
                break;
            }
        }
        return isOnlyZero;
    }


    public static int[] findFirsAndSecondIndexEl(IntegerVector vector) {

        int indexFirstZeroEl = DEFAULT_INDEX_VALUE;
        int indexSecondZeroEl = DEFAULT_INDEX_VALUE;

        for (int i = 0; i < vector.getVectorLength(); i++) {
            if (vector.getElementOfIndex(i) == 0 && indexFirstZeroEl == DEFAULT_INDEX_VALUE) {
                indexFirstZeroEl = i;
                i++;
            }
            if (vector.getElementOfIndex(i) == 0 && indexSecondZeroEl == DEFAULT_INDEX_VALUE) {
                indexSecondZeroEl = i;
            }
        }

        return new int[]{indexFirstZeroEl, indexSecondZeroEl};
    }

    public static String getSumOfElementsBetweenFirsAndSecondZeroElement(IntegerVector vector) {

        String result;
        if (vector.isNull()) {
            result = VECTOR_IS_NULL;

        } else {

            int[] indexZeroEl = findFirsAndSecondIndexEl(vector);
            int indexFirstZeroEl = indexZeroEl[0];
            int indexSecondZeroEl = indexZeroEl[1];

            if (vector.getVectorLength() == 0) {
                result = VECTOR_NULL_LENGTH;
            } else if (isOnlyZeroVectorEl(vector)) {
                result = ONLY_ZERO_EL;
            } else if (indexFirstZeroEl == DEFAULT_INDEX_VALUE || indexSecondZeroEl == DEFAULT_INDEX_VALUE) {
                result = NO_ONE_ZERO_VALUE;
            } else if (indexSecondZeroEl - indexFirstZeroEl == 1) {
                result = NO_NONZERO_EL;
            } else {
                int sum = 0;
                for (int i = indexFirstZeroEl; i < indexSecondZeroEl; i++) {
                    sum += vector.getElementOfIndex(i);
                }
                result = Integer.toString(sum);
            }
        }
        return result;

    }

}
