package util;


public class Time {
	private int hour;
	private int minute;
	private int second;
	private boolean am; // am pm ±¸ºÐ
	
	public Time() {
	}
	public Time(int hour, int minute, int second) {
		this.setHour(hour);
		this.setMinute(minute);
		this.setSecond(second);
	}
	public boolean isAm() {
		return am;
	}
	public void setAm(boolean am) {
		this.am = am;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour < 0 || hour > 23){
			return;
		}
		
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute <0 || minute >= 60){
			return;
		}
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second < 0 || second >= 60){
			return;
		}
		this.second = second;
	}

	public void display() {
		String t = "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
		System.out.println(t);
	}
	
	
	
	
	
	
}
