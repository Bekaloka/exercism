public class LogLevels {
    
    public static String message(String logLine) {
        int colonIndex = logLine.indexOf(":");
        String rest = logLine.substring(colonIndex + 1);
        return rest.trim();
    }

    public static String logLevel(String logLine) {
        int start = logLine.indexOf("[");
        int end = logLine.indexOf("]");
        String level = logLine.substring(start + 1, end);
        return level.toLowerCase();
    }

    public static String reformat(String logLine) {
        String message = LogLevels.message(logLine);
        String level = LogLevels.logLevel(logLine);
        String result = message.trim() + " " + "(" + level.toLowerCase() + ")";
        return result;
    }
}
