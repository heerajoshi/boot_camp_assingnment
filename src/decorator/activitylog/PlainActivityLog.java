package decorator.activitylog;

public class PlainActivityLog implements ActivityLog {
  @Override
  public String log(String log) {
    return log;
  }
}
