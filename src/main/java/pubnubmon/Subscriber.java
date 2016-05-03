package pubnubmon;

import com.pubnub.api.Callback;
import com.pubnub.api.Pubnub;
import com.pubnub.api.PubnubError;
import com.pubnub.api.PubnubException;

public class Subscriber {
  
 Pubnub pubnub = new Pubnub("secure_key_publisher",
      "secure_key_subscriber"); 
  public void doSomething() {
  try {
    pubnub.subscribe("my_channel1", new Callback() { // hardcoding channel name for a sample      
      
        @Override
        public void successCallback(String channel, Object message) {
          System.out.println(message);
        }

        @Override
        public void errorCallback(String channel, PubnubError error) {
            System.out.println("NO YO");
        }
    });
      
      
      
        
  } catch (PubnubException e) {
    System.out.println(e.toString()); // TODO: Bad to use sysout in prod
  }
  }
  

  
  public static void main(String[] args) {
    Subscriber main = new Subscriber();
    main.doSomething();
  }
}
