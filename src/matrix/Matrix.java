package matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Matrix {


  private final List<ArrayList<Integer>> matrix;

  Matrix(List<ArrayList<Integer>> matrix) {
    this.matrix = matrix;
  }

  Matrix add(List<ArrayList<Integer>> otherMatrix) {
    List<ArrayList<Integer>> result = new ArrayList<>();
    int noOfRows = otherMatrix.size();
    int noOfColumn = otherMatrix.get(0).size();
    for (int row = 0; row < noOfRows; row++) {
      ArrayList<Integer> rowArray = new ArrayList<>();
      for (int column = 0; column < noOfColumn; column++) {
        int element = this.matrix.get(row).get(column) + otherMatrix.get(row).get(column);
        rowArray.add(element);
      }
      result.add(rowArray);
    }
    return new Matrix(result);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Matrix)) return false;
    Matrix matrix1 = (Matrix) o;
    return Objects.equals(matrix, matrix1.matrix);
  }


}
