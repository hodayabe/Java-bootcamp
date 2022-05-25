package observer;

public class Report {
	private String info;
	private ReportType type;
	
	
	public Report(String info, ReportType type) {
		this.info = info;
		this.type = type;
	}

	

	public String getInfo() {
		return info;
	}



	@Override
	public String toString() {
		return "Report [info=" + info + ", type=" + type + "]";
	}

	

}
