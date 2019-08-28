package dao.depaReciew;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.depa_reciew.DepaReciewEntity;
import entity.page.PageEntity;
import mapper.depaReciew.DepaReciewMapper;

/**
 * 部门审核表
 * @author Administrator
 *
 */

@Repository
public class DepaReciewDao {
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private DepaReciewMapper deoaDepaReciewMapper;	
	
	/**
	 * 添加部门 如果同意添加则把该条数据添加到部门表中 
	 *  不管通不通过数据都会在本表有记录
	 * 
	 * @throws SQLException
	 */
	public void insert(DepaReciewEntity depaReciewEntity) {
		deoaDepaReciewMapper.add(depaReciewEntity);
//		String sql = "insert into gf_depa_reciew(depa_code,depa_name,yes_no,depa_descride)values(?,?,?,?);";
//		jdbcTemplate.update(sql,depaReciewEntity.getCode(),depaReciewEntity.getName(),depaReciewEntity.getYesNo(),depaReciewEntity.getDescride());
	}
	
	/**
	 *查询所有部门申请 
	 */
	public List<DepaReciewEntity> query(String depaName,PageEntity pageEntity) {
		int pageNow = (pageEntity.getPageNow() - 1) * pageEntity.getPageSize();
//		String sql = "select id,depa_code code,depa_name name,yes_no yesNo,depa_descride descride from gf_depa_reciew where depa_name like ? LIMIT ?,?";
//		RowMapper<DepaReciewEntity> map = new BeanPropertyRowMapper<>(DepaReciewEntity.class);
//		List<DepaReciewEntity> list = jdbcTemplate.query(sql,map,"%"+deapName+"%",pageNow,pageEntity.getPageSize());
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("pageNow",pageNow);
		map.put("pageSize",pageEntity.getPageSize());
		map.put("depaName",depaName);
		List<DepaReciewEntity> list = deoaDepaReciewMapper.queryAll(map);
		return list;
	}
	
	/**
	 * 查出一共有多少条数据
	 * @return
	 */
	public int count(String name) {
//		String sql = "select count(*) from gf_depa_reciew where depa_name like ?";
//		int count = jdbcTemplate.queryForObject(sql,Integer.class,depaName);
		int count = deoaDepaReciewMapper.count(name);
		return count;
	}
	
	/**
	 *根据部门id获取对应的信息 
	 */
	public DepaReciewEntity queryId(int id) {
//		String sql = "select id,depa_code code,depa_name name,yes_no yesNo,depa_descride descride from gf_depa_reciew where id = ?";
//		RowMapper<DepaReciewEntity> map = new BeanPropertyRowMapper<>(DepaReciewEntity.class);
//		DepaReciewEntity depaReciewEntity = jdbcTemplate.queryForObject(sql,map,id);
		DepaReciewEntity depaReciewEntity = deoaDepaReciewMapper.queryId(id);
		return depaReciewEntity;
	}
	
	/**
	 * 删除部门申请  （不会删除部门表中的数据）
	 */
	public void delete(int id) {
//		String sql = "delete from gf_depa_reciew where id= ?;";
//		jdbcTemplate.update(sql,code);
		deoaDepaReciewMapper.delete(id);
	}
	
	/**
	 * 修改部门申请状态  比如没有通过的可以改为通过
	 * 
	 * @throws SQLException
	 */
	//=====================================================
//	public void update(DepaReciewEntity depaReciewEntity, int id) {
//		deoaDepaReciewMapper.update(depaReciewEntity);
//		String sql = "update gf_depa_reciew set yes_no=? where id= ?;";
//		jdbcTemplate.update(sql,depaReciewEntity.getYesNo(),id);
//		deoaDepaReciewMapper.update(depaReciewEntity);
//	}
}
