
public class TwoDimArray {

//    public static int[][] myArray = {{1,2,3},{4,5,6},{7,8,9}};
//    We don't want a hard coded array
    public static int[][] myArray;

    public static void main(String[] args) {
        String fileName="twodimension.txt";
        myArray= fillArray(fileName);
        printArray(myArray);
        System.out.println();
        printArrayEven(myArray);
    }

    public static int[][] fillArray(String myFile){
        TextFileInput tfi = new TextFileInput(myFile);
        int row = Integer.parseInt(tfi.readLine());
        int col = Integer.parseInt(tfi.readLine());

        int[][] arr= new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j]= Integer.parseInt(tfi.readLine());
            }
        }
        return arr;
    }

    private static void printArray (int[][] theArray) {
        for (int i=0; i<theArray.length; i++) {
            for (int j=0; j<theArray[i].length;j++)
                display(theArray[i][j]);
            System.out.println();
        }
    }
    private static void display (int num){
        if(num<10){
            System.out.print(num+"  ");
        }else{
            System.out.print(num+ " ");
        }
    }
    private static void printArrayEven(int[][] theArray){
        for (int i=0; i<theArray.length; i++) {
            for (int j=0; j<theArray[i].length;j++) {
                if(theArray[i][j]%2==0)
                    display(theArray[i][j]);
                else
                    System.out.print("*  ");
            }
            System.out.println();
        }
    }
}