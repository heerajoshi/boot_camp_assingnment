package decorator.activitylog;

import java.util.Date;

public class AcitvityLogWithMilliSecond implements ActivityLog{

  private  ActivityLog activityLog;

  public AcitvityLogWithMilliSecond(ActivityLog activityLog) {
    this.activityLog = activityLog;
  }

  @Override
  public String log(String log) {
    return new Date() + activityLog.log(log);
  }
}
