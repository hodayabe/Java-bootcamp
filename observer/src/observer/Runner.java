package observer;

public class Runner {

	public static void main(String[] args) {
		
		NewsCompany news=new NewsCompany();
		news.events.subscribe(ReportType.SPORT, new SmsNotificationListener("432432438"));
		news.events.subscribe(ReportType.SPORT, new EmailNotificationListener("admin@example.com"));
		news.events.subscribe(ReportType.GENERAL, new SmsNotificationListener("123234234"));
		news.events.subscribe(ReportType.GENERAL, new EmailNotificationListener("123234234"));
		news.events.subscribe(ReportType.WEATHER, new SmsNotificationListener("432432438"));
		news.events.subscribe(ReportType.WEATHER, new EmailNotificationListener("admin@example.com"));
		
		
		news.addSportNews("Wariors Won");
		news.addGeneralNews("Peace finally arrived to the middle east");
		news.addWeatherNews("Volcano errapted in Hawaii");
	
	}

}
