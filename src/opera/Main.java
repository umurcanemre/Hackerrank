package opera;

public class Main {

	public static void main(String[] args) {
		String s = "Sun 10:00-20:00\nFri 05:00-10:00\nFri 16:30-23:50\nSat 10:00-24:00\nSun 01:00-04:00\nSat 02:00-06:00\nTue 03:30-18:15\nTue 19:00-20:00\nWed 04:25-15:14\nWed 15:14-22:40\nThu 00:00-23:59\nMon 05:00-13:00\nMon 15:00-21:00";
		System.out.println(Solution2.solution(s));
		
		
		s = "Mon 01:00-23:00\nTue 01:00-23:00\nWed 01:00-23:00\nThu 01:00-23:00\nFri 01:00-23:00\nSat 01:00-23:00\nSun 01:00-21:00";
		System.out.println(Solution2.solution(s));
		
		s="Fri 05:00-10:00\nFri 16:30-23:50\nSat 10:00-23:00\nSat 02:00-06:00\nTue 03:30-18:15\nTue 19:00-20:00\nWed 04:25-15:14\nWed 15:14-22:40\nThu 00:00-23:59\nMon 05:00-13:00\nMon 15:00-21:00";
		System.out.println(Solution2.solution(s));
		
		s = "SMLMMLLSSS";
		System.out.println(Solution.solution(s));
		
	}

}
