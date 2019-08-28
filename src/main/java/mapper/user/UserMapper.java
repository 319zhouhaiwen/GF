package mapper.user;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import entity.page.PageEntity;
import entity.user.UserEntity;

public interface UserMapper {
	
	//添加数据
	public void insert(UserEntity userEntity);
	
	/**
	 * 模糊查询
	 */
	public List<UserEntity> queryAll(Map<String ,Object> map);
	
	
	/**
	 * 所有
	 */
	public List<UserEntity> querys();
	
	
	/**
	 * 查出一共有多少条数据
	 * @return
	 */
	public int count(String userName);
	
	
	/**
	 * 根据id查出用户所有信息
	 */
	public UserEntity queryId(int id);

	
	
	/**
	 * 删除用户数据
	 */
	public void delete(int code);
	
	
	/**
	 * 修改用户数据
	 * 
	 * @throws SQLException
	 */
	public void update(UserEntity userEntity);
}
