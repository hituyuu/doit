import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Created by yby.
 * Date 2018/9/20 21:55.
 * Description:测试java操作redis数据库
 */
public class JedisTest {
    @Test
    public void jedis(){
        // 创建一个连接redis的实例,配置host和端口号
        Jedis jedis = new Jedis("47.99.73.10", 6379);
        // 如果redis设置了密码的话,设置redis的连接密码
        jedis.auth("$$ybyyby");
        // 使用实例的方法,其实对应reids的命令
        String name = jedis.get("name");
        // 打印结果
        System.out.println(name);

        // 关闭资源
        jedis.close();
    }

    @Test
    public void jedisPool(){
        // 配置redis连接池
        JedisPool jedisPool = new JedisPool("47.99.73.10", 6379);
        // 获取连接对象
        Jedis jedis = jedisPool.getResource();
        // 设置连接密码
        jedis.auth("$$ybyyby");
        // 设置值
        jedis.set("jedisPool", "helloword!");
        System.out.println(jedis.get("jedisPool"));

        // 关闭资源
        jedis.close();
        jedisPool.close();
    }
}
