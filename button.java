import java.applet.*;
import java.awt.*;
public class Myapplet extends Applet
{
    Button b1=new Button("Submit");
    Button b2=new Button("Reset");
    public void init()
    {
        add(b1);
        add(b2);
    }
}