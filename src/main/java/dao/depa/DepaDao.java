package dao.depa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import entity.depa.DepaEntity;
import entity.page.PageEntity;
import mapper.depa.DepaMapper;

/**
 * 部门审核
 * @author Administrator
 *
 */
@Repository
public class DepaDao {

//	@Autowired
//	private JdbcTemplate jdbcTemplate;
	@Autowired
	private DepaMapper depaMapper;
	/**
	 * 添加部门
	 * 
	 * @throws SQLException
	 */
	public void insert(DepaEntity depaEntity) {
//		String sql = "insert into gf_depa(depa_code,depa_name)values(?,?);";
//		jdbcTemplate.update(sql,depaEntity.getCode(),depaEntity.getName());
		depaMapper.insert(depaEntity);
	}
	
	/**
	 * 查询部门
	 */
	public List<DepaEntity> query(String depaName,PageEntity pageEntity) {
//		String sql = "select id,depa_code code,depa_name name from gf_depa where depa_name like ? LIMIT ?,?";
//		RowMapper<DepaEntity> map = new BeanPropertyRowMapper<>(DepaEntity.class);
//		List<DepaEntity> list =jdbcTemplate.query(sql,map,"%"+depaName+"%",pageNow,pageEntity.getPageSize());
		int pageNow = (pageEntity.getPageNow() - 1) * pageEntity.getPageSize();
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("pageNow",pageNow);
		map.put("pageSize",pageEntity.getPageSize());
		map.put("depaName",depaName);
		return depaMapper.queryAll(map);
	}
	
	/**
	 * 删除部门数据
	 */
	public void delete(int id) {
//			String sql = "delete from gf_depa where id= ?;";
//			jdbcTemplate.update(sql,code);
		depaMapper.delete(id);
	}
	
	/**
	 * 根据id查出部门
	 */
	public DepaEntity queryId(int id) {
//		String sql = "select id,depa_code code,depa_name name from gf_depa where id = ?";
//		RowMapper<DepaEntity> map = new BeanPropertyRowMapper<>(DepaEntity.class);
//		DepaEntity depaEntity = jdbcTemplate.queryForObject(sql,map,id);
		return depaMapper.queryId(id);
	}
	/**
	 * 修改部门数据
	 * 
	 * @throws SQLException
	 */
	public void update(DepaEntity depaEntity) {
//		String sql = "update gf_depa set depa_name=? where id= ?;";
//		jdbcTemplate.update(sql,depaEntity.getName(),id);
		depaMapper.update(depaEntity);
	}
	
	
	
	
	/**
	 * 查出所有部门名称
	 * @param pageEntity
	 * @return
	 */
	public List<DepaEntity> query() {
//		String sql = "select id,depa_code code,depa_name name from gf_depa";
//		RowMapper<DepaEntity> map = new BeanPropertyRowMapper<>(DepaEntity.class);
//		List<DepaEntity> list = jdbcTemplate.query(sql,map);
		List<DepaEntity> list = depaMapper.queryDepaName();
		return list;
	}
	
	
	/**
	 * 查出一共有多少条数据
	 * @return
	 */
	public int count(String name) {
//		String sql = "select count(*) from gf_depa where depa_name like ?";
//		int count = jdbcTemplate.queryForObject(sql,Integer.class,"%"+depaName+"%");
//		Map<String,Object> map = new HashMap<String, Object>();
//		map.put("depaName",name);
		int count = depaMapper.count(name);
		return count;
	}
	
	/**
	 * 模糊查询
	 */
//	public List<DepaEntity> query(String depaName) {
//		String sql = "select id,depa_code code,depa_name name from gf_depa where depa_name like ?";
//		RowMapper<DepaEntity> map = new BeanPropertyRowMapper<>(DepaEntity.class);
//		List<DepaEntity> list = jdbcTemplate.query(sql,map);
//		return list;
//	}
	
	/**
	 * 根据部门名字查出部门部门编号
	 */
	public String queryName(String name) {
//		String sql = "select depa_code from gf_depa where depa_name = ?";
//		String code = jdbcTemplate.queryForObject(sql,String.class,name);
		String code = depaMapper.queryCode(name);
		return code;
	}
	
	/**
	 * 根据部门code查出部门名称
	 */
	public String queryCode(String code) {
//		String sql = "select depa_name from gf_depa where depa_code = ?";
//		String name = jdbcTemplate.queryForObject(sql,String.class,code);
		String name = depaMapper.queryName(code);
		return name;
	}
}
