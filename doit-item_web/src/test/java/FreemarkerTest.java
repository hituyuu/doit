import freemarker.template.Configuration;
import freemarker.template.Template;
import org.junit.Test;

import java.io.FileWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yby.
 * Date 2018/9/19 17:59.
 * Description:
 */
public class FreemarkerTest {
    @Test
    public void test1() throws  Exception {
        //创建配置对象
        Configuration configuration = new Configuration(Configuration.getVersion());
        //设置模板文件所在的路径
        configuration.setClassForTemplateLoading(this.getClass(), "/ftl");
        //设置字符集
        configuration.setDefaultEncoding("UTF-8");
        //创建模板对象
        Template template = configuration.getTemplate("01.ftl");
        //创建数据集
        Map<String, Object> dataModel = new HashMap<String, Object>();
        dataModel.put("name", "helloword!你好世界");
        //创建Writer对象,注意,输出流如果文件路径不存在,会报异常
        Writer out = new FileWriter("d:/ftl/a.html");
        //使用模板对象输出文件
        template.process(dataModel, out);
        //关闭流
        out.close();
    }
}
