import java.awt.*;
import java.applet.*;
public class labels extends Applet{
 
public void init() {
	setFont(new Font("Verdana",Font.ITALIC,18));
	
	Label lblleft = new Label("Label left",Label.LEFT);
	add(lblleft);
	Label lblCenter = new Label("Label Center",Label.CENTER);
	add(lblCenter);
	Label lblright = new Label("Label Right",Label.RIGHT);
	add(lblright);
	}
}

/*
<applet code="appc.class" width="300" height="300">
</applet>
*/
