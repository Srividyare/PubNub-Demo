package pubnubmon;

import com.pubnub.api.Callback;
import com.pubnub.api.Pubnub;

public class Publisher {
  Pubnub pubnub = new Pubnub("secure_key_publisher", 
      "secure_key_subscriber");

  public void publish(String message) {
    pubnub.publish("my_channel1", message, new Callback() {});

  }

  public static void main(String[] args) {
    Publisher pub = new Publisher();

    Subscriber main = new Subscriber();
    main.doSomething();
    Monitor mon = new Monitor();
    long time =  System.currentTimeMillis();
    while (true ) {
      if ((System.currentTimeMillis() - time > 5000)) {
        time = System.currentTimeMillis();
        if(mon.isAlive(args[0])) {
          pub.publish("Host is alive");
        } else {
          pub.publish("Host is dead");

        }

      }
    }

  }
}
