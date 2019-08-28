package dao.user;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import entity.page.PageEntity;
import entity.user.UserEntity;
import mapper.user.UserMapper;

@Repository
public class UserDao {

//	@Autowired
//	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 添加用户数据
	 * @throws SQLException
	 */
	public void insert(UserEntity userEntity) {
//		String sql = "insert into gf_user(user_name,user_code,user_sex,user_age,user_tel,user_root root,user_account,user_password,user_addr,user_black)values(?,?,?,?,?,?,?,?,?,?);";
//		jdbcTemplate.update(sql,userEntity.getName(),userEntity.getCode(),userEntity.getSex(), userEntity.getAge(),userEntity.getTel(),userEntity.getRoot(), userEntity.getAccount(),userEntity.getPassword(),userEntity.getAddr(),userEntity.getBlack());
		userMapper.insert(userEntity);
	}
	
	/**
	 * 模糊查询
	 */
	public List<UserEntity> query(String userName,PageEntity pageEntity) {
		int pageNow = (pageEntity.getPageNow() - 1) * pageEntity.getPageSize();
//		String sql = "select id,user_name name,user_code,user_sex sex,user_age age,user_tel tel,user_root root,user_account account,user_password password,user_addr addr,user_black black from gf_user where user_name like ? limit ?,?";
//		RowMapper<UserEntity> useRowMapper = new BeanPropertyRowMapper<>(UserEntity.class);
//		List<UserEntity> userEntity = jdbcTemplate.query(sql,useRowMapper,"%"+userName+"%",pageNow,pageEntity.getPageSize());
		
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("pageNow",pageNow);
		map.put("pageSize",pageEntity.getPageSize());
		map.put("userName",userName);
		List<UserEntity> userEntity = userMapper.queryAll(map);
		
		return userEntity;
	}
	
	/**
	 * 所有 导出Excel表使用
	 */
	public List<UserEntity> querys() {
//		String sql = "select id,user_name name,user_code,user_sex sex,user_age age,user_tel tel,user_root root,user_account account,user_password password,user_addr addr,user_black black from gf_user";
//		RowMapper<UserEntity> useRowMapper = new BeanPropertyRowMapper<>(UserEntity.class);
//		List<UserEntity> userEntity = jdbcTemplate.query(sql,useRowMapper);
		List<UserEntity> userEntity = userMapper.querys();
		return userEntity;
	}
	
	
	/**
	 * 查出一共有多少条数据
	 * @return
	 */
	public int count(String userName) {
//		String sql = "select count(*) from gf_user where user_name like ?";
//		int count =  jdbcTemplate.queryForObject(sql,Integer.class,"%"+userName+"%");
		int count = userMapper.count(userName);
		return count;
	}
	/**
	 * 根据id查出用户所有信息
	 */
	public UserEntity queryId(int id) {
//		String sql = "select id,user_name name,user_code,user_sex,user_age,user_tel tel,user_root,user_account account,user_password password,user_addr addr,user_black from gf_user where id= ?";
//		RowMapper<UserEntity> useRowMapper  = new BeanPropertyRowMapper<>(UserEntity.class);
//		UserEntity userEntity  = jdbcTemplate.queryForObject(sql,useRowMapper,id);
		UserEntity userEntity = userMapper.queryId(id);
		return userEntity;
	}
	

	/**
	 * 删除用户数据
	 */
	public void delete(int code) {
//		String sql = "delete from gf_user where id= ?;";
//		jdbcTemplate.update(sql,code);
		userMapper.delete(code);
	}

	/**
	 * 修改用户数据
	 * 
	 * @throws SQLException
	 */
	public void update(UserEntity userEntity) {
//		String sql = "update gf_user set user_name= ?,user_sex= ?,user_age= ?,user_tel= ?,user_root= ?,user_account= ?,user_password= ?,user_addr= ?,user_black= ? where id= ?;";
//		jdbcTemplate.update(sql,userEntity.getName(),userEntity.getSex(),userEntity.getAge(),userEntity.getTel(),userEntity.getRoot(),userEntity.getAccount(),userEntity.getPassword(),userEntity.getAddr(),userEntity.getBlack(),userEntity.getId());
		userMapper.update(userEntity);
	}

}