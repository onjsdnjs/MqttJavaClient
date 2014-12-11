import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.junit.Test;

public class PublisherTest {

    @Test
    public void shouldPublishAMessage() throws Exception {
        String topic = "srihari/accelerometer_log";
        String content = "Message from MqttPublishSample";
        int qos = 2;
        String broker = "tcp://m2m.eclipse.org:1883";
        String clientId = "JavaSample";
        send(topic, content, qos, broker, clientId);
    }

    private void send(String topic, String content, int qos, String broker, String clientId) throws MqttException {

    }
}
