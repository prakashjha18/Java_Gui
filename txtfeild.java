import java.awt.*;
import java.applet.*;
public class txtfeild extends java.applet.Applet{
@Override
public void init() {
	setFont(new Font("Verdana",Font.BOLD,12));
	Label lblfname = new Label("First Name");
	add(lblfname);
	TextField txtfname = new TextField("Enter first name",30);
	add(txtfname);
	Label lbllname = new Label("Last Name");
	add(lbllname);
	TextField txtlname = new TextField("Enter last name",30);
	add(txtlname);
	Label lbluname = new Label("User Name");
	add(lbluname);
	TextField txtuname = new TextField("Enter User name",30);
	add(txtuname);
	Label lblpname = new Label("password");
	add(lblpname);
	TextField txtpass = new TextField(30);
	txtpass.setEchoChar('*');
	add(txtpass);
	}
}

/*
<applet code="appc.class" width="300" height="200">
</applet>
*/
