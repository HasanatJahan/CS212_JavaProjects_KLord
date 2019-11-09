public class UnsortedCandleList extends CandleList {
    public UnsortedCandleList(){
        super();
    }//one argument constructor

    /**
     * Method to add a new candle to the unsorted linked list
     * @param  candle c
     */
    public static void add(Candle c){
        UnsortedCandleList.append(c);
    }//add
}