package com.may.algorithm;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 *
 *
 * @author bebeside77
 */
public class HowManyPeopleTest {
	private HowManyPeople howManyPeople = new HowManyPeople();

	@Test
	public void getCount() throws Exception {
		List<WorkTime> workTimeList = new ArrayList<>();

		workTimeList.add(new WorkTime("09:30:00", "19:30:00"));
		workTimeList.add(new WorkTime("10:30:00", "19:30:00"));
		workTimeList.add(new WorkTime("09:30:00", "19:30:00"));
		workTimeList.add(new WorkTime("09:30:00", "19:30:00"));
		workTimeList.add(new WorkTime("09:30:00", "23:30:00"));
		workTimeList.add(new WorkTime("09:30:00", "19:30:00"));
		workTimeList.add(new WorkTime("15:30:00", "19:30:00"));
		workTimeList.add(new WorkTime("16:00:15", "17:00:55"));
		workTimeList.add(new WorkTime("12:00:15", "23:00:55"));

		howManyPeople.saveTimeTable(workTimeList);

		assertThat(howManyPeople.getCount("10:00:00"), is(5));
		assertThat(howManyPeople.getCount("22:00:00"), is(2));
		assertThat(howManyPeople.getCount("14:00:00"), is(7));
		assertThat(howManyPeople.getCount("17:00:00"), is(9));
	}

}