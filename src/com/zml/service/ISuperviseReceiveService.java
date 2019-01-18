package zml.service;

import java.util.List;

import zml.entity.SuperviseReceive;
import zml.pagination.Page;

public interface ISuperviseReceiveService {

	public List<SuperviseReceive> getListPage(Page<SuperviseReceive> page) throws Exception;
}
