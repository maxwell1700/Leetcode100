package PascalsTriangle1;


import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {



    }

    static List<List<Integer>> generate(int numRows){
        List<List<Integer>> Triangle = new ArrayList<>();

        if(numRows == 0)return Triangle;

        List<Integer> firstRow =  new ArrayList<>();
        firstRow.add(1);

        Triangle.add(firstRow);

        for(int row = 1; row < numRows; row++){
            List<Integer>currRow = new ArrayList<>();
            currRow.add(1);

            for (int col = 1; col < row; col++){
                List<Integer>prevRow = Triangle.get(row - 1);
                currRow.add(prevRow.get(col - 1) + prevRow.get(col));
            }
            currRow.add(1);
            Triangle.add(currRow);
        }

        return Triangle;
    }
}
