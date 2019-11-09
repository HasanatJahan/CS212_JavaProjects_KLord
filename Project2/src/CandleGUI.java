import java.awt.GridLayout;
import javax.swing.*;

/**
 * The CandleGUI class allows the user to display
 * the results of Candle array.
 *
 * @author Hasanat Jahan
 * @lab-section: 11H Cuiyuan Wang
 * @lab-time: TueThu 3:50PM-4:40PM
 */

public class CandleGUI extends JFrame {
    //constructor
    CandleGUI(CandleList candleList1, CandleList candleList2){
        super();
        setTitle("Candles");
        setSize(400,200);
        setLocation(100,100);
        setLayout(new GridLayout(1,2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        JTextArea textAreaLeft = new JTextArea(20,20);
        JTextArea textAreaRight = new JTextArea(20,20);
        textAreaLeft.setEditable(false);
        textAreaRight.setEditable(false);

        getContentPane().add(textAreaLeft);
        getContentPane().add(textAreaRight);
        textAreaLeft.setText("Unsorted Candles\n");
        textAreaRight.setText("Sorted Candles\n");

        pack();
        setVisible(true);

        displayCandle(candleList1, textAreaLeft);
        displayCandle(candleList2, textAreaRight);
    }


    /**
     * Method that fills the text area with the candles
     * @param candleList: the candle linked list
     *        myText: the JTextArea to display the results
     */
    public static void displayCandle(CandleList candleList, JTextArea myText){
        CandleNode current = candleList.first;
        while(current!=null){
            myText.append(current.data + " ");
            current= current.next;
        }
    }
}
