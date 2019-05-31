package mailbox;

import javax.swing.JLabel;

public class MailObserver extends JLabel implements Observer {

	String text = "";
	
	public MailObserver () {
		setText("");
	}
	
	@Override
	public void update(Subject s) {
		MailBox mail_box = (MailBox) s;
		int nombre_message = mail_box.getNumberOfMessages();
		text += mail_box.read().subject + "<br>";
		this.setText("<html><body" + nombre_message + "<br>" + text + "</body></html");
		
	}
	
	

}
