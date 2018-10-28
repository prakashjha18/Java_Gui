import java.awt.*;
import java.applet.*;
public class textarea extends java.applet.Applet{
String letter="";

@Override
public void init() {
	letter = this.getParameter("details");
	TextArea txtareaDetails = new TextArea(letter, 10, 35);
	add(txtareaDetails);
	}
}

/*
<applet code="appc.class" width="300" height="200">
</applet>
*/
