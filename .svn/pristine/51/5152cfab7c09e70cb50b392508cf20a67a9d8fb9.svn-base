package mapper.emp;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import entity.emp.EmpEntity;
import entity.page.PageEntity;

public interface EmpMapper {
	
	
	/**
	 * 添加用户数据
	 * 
	 * @throws SQLException
	 */
	public void insert(EmpEntity empEntity);
	
	/**
	 * 查询用户
	 */
	public List<EmpEntity> queryAll(Map<String,Object> map);
	
	/**
	 * 查出一共有多少条数据
	 * @return
	 */
	public int count(String empName);
	
	/**
	 * 根据ID查出所对应的数据c
	 */
	public EmpEntity queryId(int id);
	
	/**
	 * 删除用户数据
	 */
	public void delete(int code);
	
	/**
	 * 修改用户数据
	 * @throws SQLException
	 */
	public void update(EmpEntity empEntity);
}
