package application.data;

/**
 * Reporter for the number of validations succeeded/failed
 * @author ecom-anandraj.t
 *
 */

public class StatsGenerator {
	
	private int validationSucceeded;
	public int getValidationSucceeded() {
		return validationSucceeded;
	}

	public void setValidationSucceeded(int validationSucceeded) {
		this.validationSucceeded = validationSucceeded;
	}

	public int getValidationFailed() {
		return validationFailed;
	}

	public void setValidationFailed(int validationFailed) {
		this.validationFailed = validationFailed;
	}

	public int getTotalValidations() {
		return totalValidations;
	}

	public void setTotalValidations(int totalValidations) {
		this.totalValidations = totalValidations;
	}

	private int validationFailed;
	private int totalValidations;
	private static StatsGenerator statsInstance = null;
	
	private StatsGenerator() {
		validationSucceeded=0;
		validationFailed =0;
		totalValidations = 0;
	}
	
	public static StatsGenerator getInstance() {
		
		if(statsInstance==null) {
			synchronized (StatsGenerator.class) {
				if(statsInstance==null) {
					statsInstance = new StatsGenerator();
				}
			}
		}
		return statsInstance;
		
	}
	
	public void updateStatsCount(boolean success) {
		synchronized (StatsGenerator.class) {
			if(success) {
				validationSucceeded++;
			} else {
				validationFailed++;
			}
			totalValidations++;
		}
	}

}
