package board;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardApplicationTests {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testSqlSession() throws Exception{
		log.debug(sqlSession.toString()+" hello");
		System.out.println(sqlSession.toString());
	}
}
