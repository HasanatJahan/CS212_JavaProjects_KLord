public class SortedCandleList extends CandleList {
    public SortedCandleList(){
        super();
    }//one argument constructor

    //insert the candle in the proper position to keep the list sorted
    public static void add(Candle c){
        //create a new candleNode
        CandleNode newNode = new CandleNode(c);
        //if list is empty or the first node is bigger- add it to the beginning
        if(first.data==null || first.data.getPrice()>newNode.data.getPrice()){
            newNode.next= first;
            first= newNode;
            length++;
        }
        //find the appropriate place in the list and add to it
        else{
            CandleNode current = new CandleNode(c);
            current = first;
            System.out.println("this is what the first node looks like: " + first.data);
            while (current.next!=null &&(current.next.data.getPrice()<newNode.data.getPrice())){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }//add
}
