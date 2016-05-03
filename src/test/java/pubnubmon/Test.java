package pubnubmon;


import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.Assert;



@PowerMockIgnore({ "javax.management.*", "javax.xml.*", "ch.qos.*",
  "org.slf4j.*", "com.sum.*", "org.xml.*" })
public class Test extends PowerMockTestCase {
  
  @org.testng.annotations.Test
  public void testHostalive() {
    Monitor mon = new Monitor();
    Assert.assertFalse(mon.isAlive("localhost")); // localhost not available on 80 if mac
  }

 
}
