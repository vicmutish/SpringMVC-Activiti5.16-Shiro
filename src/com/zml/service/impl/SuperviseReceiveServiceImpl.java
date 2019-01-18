package zml.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zml.entity.SuperviseReceive;
import zml.pagination.Page;
import zml.service.IBaseService;
import zml.service.ISuperviseReceiveService;
import zml.pagination.Page;
import zml.service.IBaseService;

@Service
public class SuperviseReceiveServiceImpl implements ISuperviseReceiveService {
	
	@Autowired 
	private IBaseService<SuperviseReceive> baseService;

	@Override
	public List<SuperviseReceive> getListPage(Page<SuperviseReceive> page) throws Exception {
		return this.baseService.getListPage("SuperviseReceive", new String[]{}, new String[]{}, page);
	}

}
