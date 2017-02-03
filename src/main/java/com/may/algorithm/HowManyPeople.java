package com.may.algorithm;

import java.util.Arrays;
import java.util.List;

/**
 * https://www.careercup.com/question?id=13817668
 *
 * Time complexity
 * - saveTimeTable : size of workTimeList
 * - getCount : average 24 * 60 * 60 / 2
 *
 * @author bebeside77
 */
public class HowManyPeople {
	// save (entry person count - exit person count) value per each seconds - [seconds][value]
	private int[] entryExitTimeTable = new int[24 * 60 * 60];

	public void saveTimeTable(List<WorkTime> workTimeList) {
		for (WorkTime workTime : workTimeList) {
			int entryTotalSecond = calculateTotalSec(workTime.entryTime);
			entryExitTimeTable[entryTotalSecond]++;

			int exitTotalSecond = calculateTotalSec(workTime.exitTime);
			entryExitTimeTable[exitTotalSecond]--;
		}
	}

	public int getCount(String hhmmss) {
		int targetSeconds = calculateTotalSec(hhmmss);

		if (entryExitTimeTable.length / 2 > targetSeconds) { // for reducing calculate range
			// calculate from 0 to target
			return Arrays.stream(entryExitTimeTable, 0, targetSeconds + 1).sum();
		} else {
			// calculate from target to end, multiple -1 because exit count is the value.
			return Arrays.stream(entryExitTimeTable, targetSeconds, entryExitTimeTable.length).sum() * -1;
		}

	}

	/**
	 * calculate total seconds of "HH:mm:ss".
	 *
	 * @param hhmmss
	 * @return
	 */
	private int calculateTotalSec(String hhmmss) {
		String[] entryArr = hhmmss.split(":");
		int hh = Integer.parseInt(entryArr[0]);
		int mm = Integer.parseInt(entryArr[1]);
		int ss = Integer.parseInt(entryArr[2]);

		return (hh * 60 * 60) + (mm * 60) + ss;
	}
}

class WorkTime {
	String entryTime;
	String exitTime;

	public WorkTime(String entryTime, String exitTime) {
		this.entryTime = entryTime;
		this.exitTime = exitTime;
	}
}
