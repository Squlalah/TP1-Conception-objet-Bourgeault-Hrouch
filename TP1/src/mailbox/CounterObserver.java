package mailbox;

import javax.swing.JLabel;

public class CounterObserver extends JLabel implements Observer{
	
	public CounterObserver () {
		setText(""+0);
	}

	@Override
	public void update(Subject s) {
		MailBox mail_box = (MailBox) s;
		int nombre_mail = mail_box.getNumberOfMessages();
		this.setText(""+nombre_mail);
		
	}

}
