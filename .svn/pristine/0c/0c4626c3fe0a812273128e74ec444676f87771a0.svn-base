package mapper.empReciew;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import entity.empReciew.EmpRecorEntity;
import entity.page.PageEntity;

public interface EmpReciewMapper {

	
	/**
	 * 添加用户数据
	 * 
	 * @throws SQLException
	 */
	public void insert(EmpRecorEntity empRecorEntity);
	
	/**
	 * 查询用户
	 */
	public List<EmpRecorEntity> queryAll(Map<String,Object> map);
	
	
	/**
	 * 查出一共有多少条数据
	 * @return
	 */
	public int count(String empName);
	
	/**
	 *根据id查出所对应的数据
	 */
	public EmpRecorEntity queryId(int id);
	
	/**
	 * 删除用户数据
	 */
	public void delete(int code);
	
	
	
}
