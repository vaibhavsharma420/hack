import java.applet.Applet;
import java.awt.*;
import java.awt.event.* ;
public class scrollist extends Applet implements ActionListener
{
    List list1, list2 ;
    TextField text1 ;
    public void init()
    {
        text1 = new TextField(20);
        add(text1);
        list1 = new List(2, true);
        list1.add("Item 1");
        list1.add("Item 2");
        list1.add("Item 3");
        add(list1);
        list1.addActionListener(this);
        list2 = new List(3, true);
        list2.add("Item 4");
        list2.add("Item 5");
        list2.add("Item 6");
        add(list2);
        list2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== list1)
        {	
            text1.setText(((List)e.getSource()).getSelectedItem());
        }

        if(e.getSource()== list2)
        {
            text1.setText(((List)e.getSource()).getSelectedItem());
        }
    }
}
