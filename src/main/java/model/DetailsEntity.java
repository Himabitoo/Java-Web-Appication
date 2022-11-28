package model;

public class DetailsEntity {
	
	private Integer roomNumber;
	private String roomTitle;
	private String roomTime;
	private String roomDetails;
	
	public DetailsEntity() {
		this.roomNumber = 0;
		this.roomTitle = "";
		this.roomTime = "";
		this.roomDetails = "";
	}
	
	public Integer getRoomNumber() {
		return this.roomNumber; 
	}
	
	public String getRoomTime() {
		return this.roomTime; 
	}
	
	public String getRoomTitle() {
		return this.roomTitle; 
	}
	
	public String getRoomDetails() {
		return this.roomDetails; 
	}
	
	
	public void setRoomNumber(Integer value) {
		this.roomNumber = value;
	}
	
	public void setRoomTime(String value) {
		this.roomTime = value;
	}
	
	public void setRoomTitle(String value) {
		
		this.roomTitle = value;
	}
	
	public void setRoomDetails(String value) {
		this.roomDetails = value;
	}
}
