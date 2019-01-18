package zml.service;

import java.io.Serializable;
import java.util.List;

import zml.entity.Group;
import zml.pagination.Page;
import zml.pagination.Page;

/**
 * @ClassName: IGroupService
 * @Description:Group接口
 * @author: zml
 * @date: 2014-11-27 下午15:05:07
 *
 */
public interface IGroupService {

	public List<Group> getGroupListPage(Page<Group> page) throws Exception;
	
	public List<Group> getGroupList() throws Exception;
	
	public Group getGroupById(String id) throws Exception;
	
	public List<Group> getGroupListPage() throws Exception;
	
	public Serializable doAdd(Group group) throws Exception;

	public void doUpdate(Group group) throws Exception;
	
	public void doDelete(Group group) throws Exception;
}
