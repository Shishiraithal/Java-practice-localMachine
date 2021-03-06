package PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> genrate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);

        if (numRows == 0)  return triangle;
        for (int i = 1; i < numRows; i++) {
            List<Integer> prev_row = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prev_row.get(j - 1) + prev_row.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        List<List<Integer>> result = pascalsTriangle.genrate(3);
        for(List ele : result){
            System.out.println(ele.toString());
            
            }
    }


}
