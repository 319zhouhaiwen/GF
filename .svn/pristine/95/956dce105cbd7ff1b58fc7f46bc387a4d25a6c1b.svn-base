package mapper.csr;
/**
 * 
 * @author :lyy
 * @date :下午2:45:38 2019年7月19日
 *
 */

import java.util.List;
import java.util.Map;

import entity.csr.CsrEntity;

public interface CsrMapper {
	
	
	//查询
	public List<CsrEntity> queryAll(Map<String,Object> map);
	
	//添加
	public void insert(CsrEntity csrEntity);
	
	//删除
	public void deleCsr(int id);
	
	//修改
	public void updateCsr(CsrEntity csrEntity);
	
	//根据id查询数据
	public CsrEntity queryCsrId(int id);
	
	//查询一共有多少条数据
	public int queryCount(String csrName);
	
	//查询所有数据导出excel表
	public List<CsrEntity> queryAllExcel();
	
}
