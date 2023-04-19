package TwoDArraysQuestions;


public class SpiralMatrix {

    public static void printSprial(int spiral[][]) {

        int rowStart = 0;
        int rowEnd = spiral.length-1;
        int colStart = 0;
        int colEnd = spiral[0].length-1;

        while(rowStart <= rowEnd && colStart <= colEnd) {

            //top
            for(int i=colStart;i<=colEnd;i++) {
                System.out.print(spiral[rowStart][i]+" ");
            }

            //right
            for(int i=rowStart+1;i<=rowEnd;i++) {
                System.out.print(spiral[i][colEnd]+" ");
            }

            //bottom
            for(int i=colEnd-1;i>=colStart;i--) {
                if(colStart == colEnd) {
                    break;
                }
                System.out.print(spiral[rowEnd][i]+" ");
            }

            //left
            for(int i=rowEnd-1;i>rowStart;i--) {
                if(rowStart == rowEnd) {
                    break;
                }
                System.out.print(spiral[i][colStart]+" ");
            }

            //increment & decrement
            rowStart++;
            colStart++;
            rowEnd--;
            colEnd--;
        }
    }

    public static void main(String[] args) {
        int spiral[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

                          printSprial(spiral);


    }

    
}
