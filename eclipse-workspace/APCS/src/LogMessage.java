
public class LogMessage {
private String machineId;
private String description;

	public LogMessage(String message) {
		int spot = message.indexOf(":");
		machineId = message.substring(0,spot);
		description = message.substring(spot+1);
	}
	public boolean containsWord(String keyword) {
		if(description.indexOf(keyword)==-1) {
			return false;
		}
		if(!(description.substring(0,keyword.length()).equals(keyword)||(description.indexOf(" ")))) {
			return false;
		}
		
	}
}
