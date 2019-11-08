package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import exception.JobException;
import model.Job;

public class JobScheduleTest {
	DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Job job1;
	Job job2;
	Job job3;

	@Before
	public void setUp() {
		try {
			job1 = new Job(1, "Importação de arquivos de fundos", format.parse("2019-11-10 12:00:00"), 2.0);
			job2 = new Job(2, "Importação de arquivos de fundos", format.parse("2019-11-11 12:00:00"), 4.0);
			job3 = new Job(3, "Importação de arquivos de fundos", format.parse("2019-11-11 08:00:00"), 6.0);
		} catch (ParseException e) {
			new JobException(e.getMessage());
		}
			}

	@Test
	public void testObjectNotNull() {
		assertNotNull(job1);
	}

	@Test
	public void testParseDate() throws ParseException {		
		assertEquals(format.parse("2019-11-10 12:00:00"), job1.getDateMaxFinish());
	}

}
