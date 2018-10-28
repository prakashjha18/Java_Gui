import java.awt.*;
import java.applet.*;
public class button extends Applet{
@Override 
public void init() {
	setFont(new Font("Verdana",Font.ITALIC,18));
	Button btnsave = new Button("save");
	add(btnsave);
	Button btnedit = new Button("edit");
	add(btnedit);
	Button btndelete = new Button("delete");
	add(btndelete);
	Button btnreset = new Button("reset");
	add(btnreset);
	}
}

/*
<applet code="appc.class" width="300" height="300">
</applet>
*/
/*
methods of button object
getLabel()
setLabel()
*/
