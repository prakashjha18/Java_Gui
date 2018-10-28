import java.awt.*;
import java.applet.*;
public class checkbox extends Applet{
 
public void init() {
	setFont(new Font("Verdana",Font.ITALIC,18));
	Label lblhobb = new Label("Hobbies:",Label.LEFT);
	add(lblhobb);
	Checkbox chkread = new Checkbox("Reading");
	add(chkread); 
	Checkbox chkmusic = new Checkbox("music",true);
	add(chkmusic); 
	Checkbox chkdrive = new Checkbox("driving");
	add(chkdrive); 
	}
}

/*
<applet code="appc.class" width="500" height="300">
</applet>
*/
/*
methods of the checkbox object 
1)getLabel()
2)setLabel()
3)getState()
4)setState()
*/
