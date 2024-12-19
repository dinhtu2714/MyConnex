
import java.time.LocalTime;
import java.time.Instant;
import java.time.ZoneOffset;

public class bai2 {
    public static class Time {
        int hour, minute, second;

        public int getHour() {
            return this.hour;
        }

        public int getMinute() {
            return this.minute;
        }

        public int getSecond() {
            return this.second;
        }

        public void setHour(int hour) {
            this.hour = hour;
        }

        public void setMinute(int minute) {
            this.minute = minute;
        }

        public void setSecond(int second) {
            this.second = second;
        }

        public void setTimeUnix(long time) {
            LocalTime t = Instant.ofEpochMilli(time).atOffset(ZoneOffset.UTC).toLocalTime();
            setHour(t.getHour());
            setMinute(t.getMinute());
            setSecond(t.getSecond());
        }

        public void printTime(long time) {
            setTimeUnix(time);
            System.out.println(this.hour + ":" + this.minute + ":" + this.second);
        }
    }
}
