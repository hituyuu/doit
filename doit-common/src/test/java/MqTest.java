/*import org.apache.activemq.ActiveMQConnectionFactory;
import org.junit.Test;

import javax.jms.*;*/


/**
 * Created by yby on 2018/9/17.
 */

/*public class MqTest  {
    @Test
    public void testMQProducerQueue() throws Exception {
        //1、创建工厂连接对象，需要制定ip和端口号
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://47.99.73.10:61616");
        //2、使用连接工厂创建一个连接对象
        Connection connection = connectionFactory.createConnection();
        //3、开启连接
        connection.start();
        //4、使用连接对象创建会话（session）对象
        // 第一个参数为是否开启事物,第二个参数在第一个为false才有效,表示自动应答
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        //5、使用会话对象创建目标对象，包含queue和topic（一对一和一对多）
        Queue queue = session.createQueue("test-queue");
        //6、使用会话对象创建生产者对象
        MessageProducer producer = session.createProducer(queue);
        //7、使用会话对象创建一个消息对象
        TextMessage textMessage = session.createTextMessage("hello!test-queue");
        //8、发送消息
        producer.send(textMessage);
        //9、关闭资源
        producer.close();
        session.close();
        connection.close();
    }


    @Test
    public void testConsumer() throws Exception{
        //第一步：创建ConnectionFactory对象，需要制定服务器IP和端口号
        //brokerURL服务器的IP和端口号
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://47.99.73.10:61616");
        //第二步：创建Connection对象
        Connection connection = connectionFactory.createConnection();
        //第三步：开启连接
        connection.start();
        //第四步：使用连接对象创建会话对象
        //第一个参数：是否开启事务，true为开启，第二个参数忽略
        //第二个参数：当第一个参数为false才有意义。消息应答模式：1、自动应答 2、手动应答，一般为自动应答即可
        Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
        //第五步：使用会话对象创建Destination对象（topic，queue），这里创建一个queue对象
        //参数: 队列名称
        Queue queue = session.createQueue("test-queue");
        //第六步：使用会话对象创建消费者对象
        MessageConsumer consumer = session.createConsumer(queue);
        //第七步：接收消息
        consumer.setMessageListener(new MessageListener(){
            public void onMessage(Message message){
                try{
                    TextMessage textMessage = (TextMessage)message;
                    String text = textMessage.getText();
                    //第八步：打印消息
                    System.out.println(text);
                }catch(JMSException e){
                    e.printStackTrace();
                }
            }
        });
        System.in.read();

        //第九步：关闭资源
        consumer.close();
        session.close();
        connection.close();
    }

}*/


