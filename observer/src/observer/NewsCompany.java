package observer;

public class NewsCompany {
	 EventManager events;
	private Report report;
	
	
	public NewsCompany() {
		this.events = new EventManager(ReportType.SPORT,ReportType.WEATHER,ReportType.GENERAL);
	}
	
	
    public void addSportNews(String message) {
        this.report = new Report(message,ReportType.SPORT);
        events.notify(ReportType.SPORT, report);
    }
    
    
    public void addWeatherNews(String message) {
        this.report = new Report(message,ReportType.WEATHER);
        events.notify(ReportType.WEATHER, report);
    }
    
    
    public void addGeneralNews(String message) {
        this.report = new Report(message,ReportType.GENERAL);
        events.notify(ReportType.GENERAL, report);
    }

    


}
