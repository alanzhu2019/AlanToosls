import com.alan.bean.Nabfusers;
import com.alan.dao.NabfUsersDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {

        //System.out.printf("输入用户名：");
        //Scanner scanner = new Scanner(System.in);
        //String userid = scanner.next();
        Test test = new Test();
        test.testUser();
    }

    public void testUser() throws IOException {
        // 1.读取配置文件
        InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
        // 2.创建 SqlSessionFactory 工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 3.获取 SqlSession 对象
        SqlSession session = factory.openSession();
        // 4.使用 SqlSession 创建 Dao 接口的代理对象
        NabfUsersDao userDao = session.getMapper(NabfUsersDao.class);
        // 5.执行接口的方法
        List<Nabfusers> userList = userDao.gitUsers200();
        userList.forEach(user ->{
            System.out.println(user);
        });
    }
}
