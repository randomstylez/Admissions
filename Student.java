
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author Joey Pietroluongo PatherID 5901749
 */
public class Student {
    
    private String first;
    private String last;
    private String idnumber;
    private String Courses;
    private Date date;
    
    static String getFirst(String first)
    {
        return JOptionPane.showInputDialog(first);
    }
    
    static String getLast(String l)
    {
        return JOptionPane.showInputDialog(l);
    }        
    
  
        String getstreet(String s)
        {
            return JOptionPane.showInputDialog(s);
        }
        
        String getcity(String c)
        {
            return JOptionPane.showInputDialog(c);
        }
        
        String getstate(String st)
        {
            return JOptionPane.showInputDialog(st);
        }
        
        String getzip(String z)
        {
            return JOptionPane.showInputDialog(z);
        }
    
}
