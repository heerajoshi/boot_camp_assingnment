package decorator.activitylog;

public class ActivityWithSecondTimeStamp implements ActivityLog {


  private  ActivityLog activityLog;

  public ActivityWithSecondTimeStamp(ActivityLog activityLog) {
    this.activityLog = activityLog;
  }

  @Override
  public String log(String log) {
    return activityLog.log(log);
  }
}
