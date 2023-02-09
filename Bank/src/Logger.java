import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Logger {
    // – mechanism for storing Log instances (in files, database, etc.)

    public String LoggerName; // for later use.

    public static ArrayList<Log> myLogs = new ArrayList<>();

    public Logger(String loggerName, ArrayList<Log> myLogs) {
        LoggerName = loggerName;
        this.myLogs = myLogs;
    }

    public void setLoggerName(String loggerName) {
        LoggerName = loggerName;
    }

    public static ArrayList<Log> getMyLogs() {
        return myLogs;
    }

    public static void setMyLogs(ArrayList<Log> myLogs) {
        Logger.myLogs = myLogs;
    }

    public String getLoggerName() {
        return LoggerName;
    }

    @Override
    public String toString() {
        return "Logger{" +
                "LoggerName='" + LoggerName + '\'' +
                ", myLogs=" + myLogs +
                '}';

    }
}
