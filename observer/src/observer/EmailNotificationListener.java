package observer;

public class EmailNotificationListener implements EventListener {
	private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }


	@Override
	public void update(ReportType type, Report report) {
		System.out.println(type +" news report sent email:"+ email+ " Report:" + report.getInfo());
	}
	
	
}
