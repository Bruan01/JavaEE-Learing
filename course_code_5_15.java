package course_code.five;
import java.text.*;
import java.time.*;

public class course_code_5_15 {
    public static void main(String[] args) {
        // 1.clock的使用
        Clock clock = Clock.systemUTC();
        System.out.println("获取当前时间："+clock.instant());
        System.out.println("获取时间毫秒数： "+clock.millis());
        // 2.Duration的使用
        Duration d = Duration.ofDays(1);//多少天
        System.out.println("一天等于多少："+d.toHours()+"小时");
        System.out.println("一天等于多少 "+d.toMinutes()+"分钟");
        // 3.Instant的使用
        Instant instant = Instant.now();
        System.out.println("当前时间："+instant);
        System.out.println("一小时后"+ instant.plusSeconds(3600));
        // 4.year yearMonth MonthDay
        Year year = Year.now();
        System.out.println("年份："+year);
        YearMonth yearMonth = YearMonth.now();
        System.out.println("年月："+yearMonth);
        // 获取系统默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("当前时区："+zoneId);
    }
}
