package test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import zml.entity.Group;
import zml.service.IBaseService;
import zml.service.IGroupService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/applicationContext.xml", "classpath*:/springMVC.xml" })
public class serviceTest {

	@Autowired
	private IBaseService<Group> baseService;
	
	@Autowired
	private IGroupService groupService;
	
	@Test
	public void serviceTests() throws Exception{
		List<Group> list = this.groupService.getGroupList();
		System.out.println(list.size());
	}
}
