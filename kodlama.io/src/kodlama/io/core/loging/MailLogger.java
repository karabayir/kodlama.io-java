package kodlama.io.core.loging;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {
		
		System.out.println("maile loglandı: "+data);
	}

}
