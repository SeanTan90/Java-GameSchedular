package SchedulerQuestion;

public class DayRepo implements IDayRepo {
	public Day[] days = new Day[5];
	
	
	@Override
	public String save(Day d) {
		StringBuilder sb = new StringBuilder(40);
		
		for(int i=0; i<days.length; i++) {
			if(d.getName().equals(days[i].getName())) {
				sb.append("Day already exist within Day List"); // Check if day object already exist in days array
				return sb.toString();
			}
		}
		
		for(int j=0; j<days.length; j++) { //Adding day object to the days array
			if(days[j] == null) {
				days[j] = d;
				sb.append("Successful adding of Day");
			}
		}
		return sb.toString();
		
	}

	@Override
	public Day findOne(String name) {
		
		for(int i=0; i<days.length; i++) {
			if(days[i].getName().equals(name)) {
				return days[i]; // returns a Day object if Day name from parameter matches a day from Day repository
			}
		}
		return null;
	}

	
	
	
	
	
	@Override
	public Day[] findAll() {
		return days;
	}

}
