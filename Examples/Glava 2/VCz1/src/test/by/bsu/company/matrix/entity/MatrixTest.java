package test.by.bsu.company.matrix.entity;

import by.bsu.company.matrix.entity.Matrix;
import by.bsu.company.matrix.exception.MatrixException;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by HP on 17.01.2017.
 */
public class MatrixTest {
    @Test( expected = MatrixException.class )
    public void createTest() throws MatrixException {
        Matrix m = new Matrix(2, -4);
    }


}