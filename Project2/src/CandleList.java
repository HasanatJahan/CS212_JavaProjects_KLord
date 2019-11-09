public abstract class CandleList {
    //first node in linked list is a dummy node
    protected static CandleNode first;
    //last node in the linked list
    protected static CandleNode last;
    //number of items in the list
    protected static int length;

    public CandleList(){
        first = new CandleNode(null);
        last = first;
        length = 0;
    }//no argument constructor

    public static void append(Candle c){
        CandleNode newNode = new CandleNode(c);
        last.next = null;
        last = newNode;
        length++;
    }//append

    /**
     * Method to get the length of the linked list
     */
    public static int getLength(){
        return length;
    }

}
