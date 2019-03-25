package decorator.activitylog;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AcitvityLogWithMilliSecondTest {


  @Test
  void name() {
    PlainActivityLog plainActivityLog = new PlainActivityLog();
    AcitvityLogWithMilliSecond acitvityLogWithMilliSecond = new AcitvityLogWithMilliSecond(plainActivityLog);


    String expected = new Date()+"Some Text";
//    assertEquals(expected,acitvityLogWithMilliSecond.log("Some text"));
  }
}