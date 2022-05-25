package observer;

public class SmsNotificationListener implements EventListener {
	private String phonNumber;

    public SmsNotificationListener(String phonNumber) {
        this.phonNumber = phonNumber;
    }


	@Override
	public void update(ReportType type, Report report) {
		System.out.println(type +" news report sent SMS to number:"+ phonNumber+ " Report:" + report.getInfo());
	}
	
	
}
