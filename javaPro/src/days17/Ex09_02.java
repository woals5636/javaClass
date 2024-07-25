package days17;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Ex09_02 {
	// 개강일로 부터 오늘 (현재)까지 d h m s ms .. 출력
	// Calendar
	public static void main(String[] args) {
        // Calendar c: 현재 시간
        Calendar c = Calendar.getInstance();

        // Calendar o: 특정 날짜 (2024년 7월 1일 9시 0분 0초)
        Calendar o = Calendar.getInstance();
        o.set(2024, Calendar.JULY, 1, 9, 0, 0);

        // Calendar c와 o 출력
        System.out.println("현재 시간: " + calendarToString(c));
        System.out.println("특정 날짜: " + calendarToString(o));

        // 두 날짜의 경과 시간 계산
        long diffInMillis = c.getTimeInMillis() - o.getTimeInMillis();

        // 밀리초를 일, 시간, 분, 초, 밀리초로 변환
        long diffInDays = TimeUnit.MILLISECONDS.toDays(diffInMillis);
        long diffInHours = TimeUnit.MILLISECONDS.toHours(diffInMillis) % 24;
        long diffInMinutes = TimeUnit.MILLISECONDS.toMinutes(diffInMillis) % 60;
        long diffInSeconds = TimeUnit.MILLISECONDS.toSeconds(diffInMillis) % 60;
        long diffInMilliseconds = diffInMillis % 1000;

        // 결과 출력
        System.out.printf("경과 시간: %d일 %d시간 %d분 %d초 %d밀리초\n",
                diffInDays, diffInHours, diffInMinutes, diffInSeconds, diffInMilliseconds);
    }

    // Calendar 객체를 문자열로 변환하는 메서드
    public static String calendarToString(Calendar calendar) {
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // MONTH는 0부터 시작하므로 1을 더함
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY); // 24시간 형식
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int millisecond = calendar.get(Calendar.MILLISECOND);

        return String.format("%04d-%02d-%02d %02d:%02d:%02d.%03d",
                year, month, day, hour, minute, second, millisecond);
    }
}