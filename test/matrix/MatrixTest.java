package matrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

class MatrixTest {

  @Test
  void shouldReturnTheTransposeOfMatrix() {

    List<ArrayList<Integer>> matrix1 = new ArrayList<>();
    matrix1.add(new ArrayList<>(asList(2, 4, 6)));
    matrix1.add(new ArrayList<>(asList(1, 3, 5)));

    List<ArrayList<Integer>> matrix2 = new ArrayList<>();
    matrix2.add(new ArrayList<>(asList(1, 5, 3)));
    matrix2.add(new ArrayList<>(asList(4, 6, 2)));

    Matrix matrix = new Matrix(matrix1);
    Matrix  actual = matrix.add(matrix2);

    List<ArrayList<Integer>> result = new ArrayList<>();
    result.add(new ArrayList<>(asList(3, 9, 9)));
    result.add(new ArrayList<>(asList(5, 9, 7)));
    Matrix expected = new Matrix(result);
    assertEquals(expected,actual);
  }
}