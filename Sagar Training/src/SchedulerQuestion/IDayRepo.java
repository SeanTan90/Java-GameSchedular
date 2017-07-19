package SchedulerQuestion;

public interface IDayRepo {

	
	public String save(Day p);
	
	
	public Day findOne(String name);
		
	
	public Day[] findAll();
		

}
