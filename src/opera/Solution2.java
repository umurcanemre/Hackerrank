package opera;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2 {

	private static List<String> days = Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
	private static final int dayTimeLimit = 2359;

	public static int solution(String S) {

		Map<String, List<Integer>> map = mapCalendar(S);

		int result = 0;
		for (int i = 0; i < days.size(); i++) {
			int inday = daysMid(map.get(days.get(i)));

			int nextDayPtr = i + 1;
			boolean nextCheck = true;
			int nextDay = daysEnd(map.get(days.get(i)));
			while (nextDayPtr < days.size() && nextCheck) {
				int nds = daysStart(map.get(days.get(nextDayPtr)));
				nextDay += nds;
				nextCheck = (nds == dayTimeLimit);
				if (nextCheck)
					nextDayPtr++;
			}

			if (inday > result)
				result = inday;
			if (nextDay > result)
				result = nextDay;
		}

		int resultMins = result % 100 + 1;

		return (result / 100) * 60 + resultMins;
	}

	private static Map<String, List<Integer>> mapCalendar(final String S) {
		Map<String, List<Integer>> map = new HashMap<>();
		for (String s : days)
			map.put(s, new ArrayList<Integer>());

		String[] meetings = S.split("\\r?\\n");

		for (String meeting : meetings) {
			String day = meeting.substring(0, 3);
			Integer startH = Integer.valueOf(meeting.substring(4, 6) + meeting.substring(7, 9));
			Integer endH = Integer.valueOf(meeting.substring(10, 12) + meeting.substring(13, 15));

			map.get(day).add(startH);
			map.get(day).add(endH);
		}

		map.entrySet().stream().forEach(e -> Collections.sort(e.getValue()));
		return map;
	}

	public static int daysMid(List<Integer> list) {
		if (list.isEmpty())
			return dayTimeLimit;

		int dur = list.get(0);

		for (int i = 1; i < list.size() - 1; i = i + 2) {
			if (list.get(i + 1) - list.get(i) > dur)
				dur = list.get(i + 1) - list.get(i);
		}

		int end = daysEnd(list);
		if (end > dur)
			dur = end;

		return dur;
	}

	public static int daysStart(List<Integer> list) {
		if (list.isEmpty())
			return dayTimeLimit;
		return list.get(0);
	}

	public static int daysEnd(List<Integer> list) {
		if (list.isEmpty())
			return dayTimeLimit;
		return dayTimeLimit - list.get(list.size() - 1);
	}
}
