import java.awt.*;
import java.applet.*;
public class radiob extends Applet{
 
public void init() {
	setFont(new Font("Verdana",Font.ITALIC,18));
	Label lblhobb = new Label("Hobbies:",Label.LEFT);
	add(lblhobb);
	CheckboxGroup chkgrp = new CheckboxGroup();
	Checkbox chkread = new Checkbox("Reading",chkgrp,true);
	add(chkread); 
	Checkbox chkmusic = new Checkbox("music",chkgrp,false);
	add(chkmusic); 
	Checkbox chkdrive = new Checkbox("driving",chkgrp,false);
	add(chkdrive); 
	}
}

/*
<applet code="appc.class" width="500" height="300">
</applet>
*/
