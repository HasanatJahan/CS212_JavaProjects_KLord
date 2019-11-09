import java.util.*;
public class Project2 {
    public static TextFileInput inputFile;
    public static void main(String [] args){
        UnsortedCandleList unsortedList = new UnsortedCandleList();
        SortedCandleList sortedList = new SortedCandleList();
        String myFile = "input.txt";
        inputFile= new TextFileInput(myFile);

        String line = inputFile.readLine();
        while(line!=null){
            StringTokenizer cTokens = new StringTokenizer(line, ",");
            //only if the line has three arguments then get the arguments
            if(cTokens.countTokens()==3) {
                int h = Integer.parseInt(cTokens.nextToken());
                int w = Integer.parseInt(cTokens.nextToken());
                float p = Float.parseFloat(cTokens.nextToken());
                Candle c = new Candle(h, w, p);
                CandleNode newCandleNode = new CandleNode(c);

                //now add to the candle lists
                unsortedList.add(c);
                sortedList.add(c);
            }
            line = inputFile.readLine();
        }//while
    }
}
