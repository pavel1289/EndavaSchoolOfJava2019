package schoolofjava.day08.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {
    @JmsListener(destination = "${destination.queue}")
    public void receiveMessage(String msg) {
        System.out.println("Message Received by Listener 2: " + msg);
        System.out.println();
        System.out.println();
    }
}
