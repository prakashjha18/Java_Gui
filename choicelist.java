import java.awt.*;
import java.applet.*;
public class choicelist extends Applet{
 
public void init() {
	setFont(new Font("Verdana",Font.ITALIC,18));
	Label lblhobb = new Label("Hobbies:",Label.LEFT);
	add(lblhobb);
	Choice chkobbi = new Choice();
	chkobbi.add("reading");
	chkobbi.add("listening to music");
	chkobbi.add("driving");
	chkobbi.add("coding");
	add(chkobbi);
	}
}

/*
<applet code="appc.class" width="500" height="300">
</applet>
*/
