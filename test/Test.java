import static org.junit.Assert.*;

import java.util.List;
import javax.sql.DataSource;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mycom.spring.entity.Major;
import com.mycom.spring.entity.Student;
import com.mycom.spring.service.MajorService;
import com.mycom.spring.service.StudentService;


@RunWith(SpringJUnit4ClassRunner.class)
//制定运行的类
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
//选择配置文件
public class Test
{
	@Autowired
	private ApplicationContext applicationContext;
	@Autowired
	private MajorService majorService;
	@Autowired
	private StudentService studentSService;
	
//	@org.junit.Test
//	public void test()
//	{
//		DataSource dataSource= (DataSource)applicationContext.getBean(DataSource.class);
//		System.out.println(dataSource);
//	}
	@org.junit.Test
	public void test1()
	{
		List<Major> majors= majorService.getAll();
		System.out.println(majors);
	}

}
