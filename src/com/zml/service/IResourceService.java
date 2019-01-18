package zml.service;

import java.util.List;

import zml.entity.GroupAndResource;
import zml.entity.Resource;
import zml.pagination.Page;
import zml.entity.GroupAndResource;
import zml.pagination.Page;

public interface IResourceService {

	public Resource getPermissions(Integer id) throws Exception;
	
	public List<Resource> getMenus(List<GroupAndResource> gr) throws Exception;
	
	public List<Resource> getAllResource() throws Exception;
	
	public List<Resource> getResourceListPage() throws Exception;
	
	public List<Resource> getResourceList(Page<Resource> p) throws Exception;
	
	public List<Resource> getResourceByType() throws Exception;
	
	public void doAdd(Resource entity) throws Exception;
	
	public void doUpdate(Resource entity) throws Exception;
	
	public void doDelete(Resource entity) throws Exception;
	
	public void doDelete(String id) throws Exception;
	
}
