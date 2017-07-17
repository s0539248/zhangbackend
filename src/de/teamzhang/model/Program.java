package de.teamzhang.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.springframework.data.annotation.Id;

public class Program implements Serializable{
	static int MAX_DAYS = 4;
	static int MAX_SLOTS_PER_DAY = 4;
	@Id
	private BigInteger id;
	private String name;
	int noOfDays;
	List<Slot> assignedSlots;
	List<Course> courseList = new ArrayList<Course>();
	private boolean[][] fullSlots = new boolean[5][7];

	private int programMinusPoints;

	private Properties prop = new Properties();

	void Program() {

	}

	public boolean[][] getFullSlots() {
		return fullSlots;
	}

	public Properties getProp() {
		InputStream input = null;
		try {

			input = new FileInputStream(name + "settings.properties");

			// load a properties file
			prop.load(input);
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return prop;
	}

	public void addCourse(Course c) {
		courseList.add(c);
	}

	public List<Course> getCourses() {
		return courseList;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public boolean hasMoreDays() {
		return noOfDays < MAX_DAYS;
	}

	// max 4 slots per day constraint
	public boolean hasMoreSlotsPerDay(int day) {
		int cnt = 1;
		for (Slot slot : assignedSlots) {
			if (slot.getDay() == day) {
				cnt++;
				if (cnt > MAX_SLOTS_PER_DAY) {
					return false;
				}
			}
		}
		return true;
	}

	public void addSlot(Slot slot) {
		assignedSlots.add(slot);
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isTimeOccupied(int randomTime, int randomDay) {
		return fullSlots[randomDay][randomTime];
	}

	public void setFullSlot(int day, int time) {
		fullSlots[day][time] = true;
	}

	public void resetFullSlots() {
		for (int index = 0; index < fullSlots.length; index++)
			for (int inner = 0; inner < fullSlots[index].length; inner++)
				fullSlots[index][inner] = false;
	}

	public void setFreeSlot(int day, int time) {
		fullSlots[day][time] = false;

	}

	public void addMinusPoints(int value) {
		programMinusPoints += value;
	}

	public int getProgramMinusPoints() {
		return programMinusPoints;
	}

	public void resetMinusPoints() {
		programMinusPoints = 0;
	}
}