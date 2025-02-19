import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Write a description of class ClickListener here.
 *
 * @author mrcallaghan
 * @version 19feb2025
 */
public class ClickListener implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent event)
    {
        System.out.println("button clicked!");
    }
}
