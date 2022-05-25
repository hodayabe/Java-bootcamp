package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
	 Map<ReportType, List<EventListener>> emailListeners = new HashMap<>();
	 Map<ReportType, List<EventListener>> sMSListeners = new HashMap<>();

	    public EventManager(ReportType... operations) {
	        for (ReportType operation : operations) {
	        	sMSListeners.put(operation, new ArrayList<>());
	        	emailListeners.put(operation, new ArrayList<>());
	        }
	    }
	    
	    public void subscribe(ReportType type, EmailNotificationListener listener) {
	        List<EventListener> users = emailListeners.get(type);
	        users.add(listener);
	        
	        
	        
	    }

	    public void subscribe(ReportType type, SmsNotificationListener listener) {
	        List<EventListener> users = sMSListeners.get(type);
	        users.add(listener);
	    }


	    
	    public void unsubscribe(ReportType type, EmailNotificationListener listener) {
	        List<EventListener> users = emailListeners.get(type);
	        users.remove(listener);
	    }
	    

	    public void unsubscribe(ReportType type, SmsNotificationListener listener) {
	        List<EventListener> users = sMSListeners.get(type);
	        users.remove(listener);
	    }
	    
	    

	    
	    public void notify(ReportType type,Report report) {
	        List<EventListener> users = emailListeners.get(type);
	        for (EventListener listener : users) {
	            listener.update(type, report);
	        }
	        users = sMSListeners.get(type);
	        for (EventListener listener : users) {
	            listener.update(type, report);
	        }
	    }
	    
	    

}
