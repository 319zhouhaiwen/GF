package mapper.depa;

import java.util.List;
import java.util.Map;

import org.apache.xmlbeans.impl.jam.mutable.MPackage;

import entity.depa.DepaEntity;

public interface DepaMapper {
	// 查询所有数据
	public List<DepaEntity> queryAll(Map<String,Object> map);
	
	
	//添加部门
	public void insert(DepaEntity depaEntity);
	
	//删除部门
	public void delete(int id);
	
	/* 根据id查出部门 */
	public DepaEntity queryId(int id);
	
	//修改部门
	public void update(DepaEntity depaEntity);
	
	
	//查出所有部门名称 
	public List<DepaEntity> queryDepaName();
	
	//查出一共有多少条数据
//	public int count(Map<String,Object> map);
	public int count(String name);
	
	/* 根据部门名字查出部门部门编号 */
	public String queryCode(String name);
	
	/* 根据部门code查出部门名称 */
	public String queryName(String name);
	
}
