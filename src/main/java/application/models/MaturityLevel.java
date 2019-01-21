package application.models;


public class MaturityLevel {
	
	public String getLevelName() {
		return levelName;
	}
	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}
	public MaturityType getType() {
		return type;
	}
	public void setType(MaturityType type) {
		this.type = type;
	}
	private String levelName;
	private MaturityType type;
	
}
