public class SortedCandleList extends CandleList {
    public SortedCandleList(){
        super();
    }//one argument constructor

    /**
     * Method to add a new node in order in the sorted list
     * @param c: a new candle
     */
    public static void add(Candle c){
        //create a new candleNode
        CandleNode newNode = new CandleNode(c);
        CandleNode current = first;
        while (current.next!=null &&(current.next.data.getPrice()<newNode.data.getPrice())){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }//add
}
