import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import java.io.IOException;

public class SubscriberLoop {

    public static void main(String[] args) throws InterruptedException, MqttException, IOException {
        String topic = "srihari/accelerometer_log";
        String broker = "tcp://m2m.eclipse.org:1883";
       receive(topic, broker, MqttClient.generateClientId());
        Object lock = new Object();
        synchronized (lock) {
            lock.wait();
        }
    }

    private static void receive(String topic, String broker, String clientId)  throws MqttException{

    }
}
