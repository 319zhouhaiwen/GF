package service.goodsreciew;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.goodsreciew.GoodsReciewDao;
import entity.goodsreciew.GoodsReciewEntity;
import entity.page.PageEntity;
import mapper.goodsreciew.GoodsReciewMapper;

/**
 * 
 * @author guoning
 *
 * 2019年5月29日下午9:14:07
 */
@Service
public class GoodsreciewService  {
	
	@Autowired
	private GoodsReciewDao goodsReciewDao;
	@Autowired
	private GoodsReciewMapper goodsReciewMapper;
	
	/**
	 * 新增
	 * @param goodsr
	 */
	public void add(GoodsReciewEntity goodsr) {
		goodsReciewMapper.add(goodsr);
	}
	/**
	 * 删除
	 * @param id
	 */
	public void delete(int id){
		goodsReciewMapper.delete(id);
	}
	
	/**
	 * 修改
	 */
	public void update(GoodsReciewEntity goodsr) {
		goodsReciewMapper.update(goodsr);
	}
	
	/**
	 * 查询
	 * @return
	 */
	public List<GoodsReciewEntity> query(){
		return goodsReciewMapper.query();
	}
	
	/**
	 * 模糊查询加分页
	 * @param dataName
	 * @param page
	 * @return
	 */
	public List<GoodsReciewEntity> query3(String  dataName,PageEntity page){
		if(dataName==null)
		dataName="";
		int pageNow = (page.getPageNow() - 1) * page.getPageSize();
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("dataName", dataName);
		map.put("pageNow", pageNow);
		map.put("pageSize", page.getPageSize());
		return goodsReciewMapper.query3(map);
	}
	
	/**
	 * 得到总条数
	 * @param dataName
	 * @return
	 */
	public int pageCount(String  dataName) {
		return goodsReciewMapper.pageCount(dataName);
	}
	
	/**
	 * 传入一个id 得到一个对象
	 * @param id
	 * @return
	 */
	public GoodsReciewEntity query(int id){
		return goodsReciewMapper.query1(id);
	}
	
	
	/**
	 * 传入一个名字 判断他是否存在 返回一个数量
	 * @param name
	 * @return
	 */
	public int query4(String  name) {
		return goodsReciewMapper.query4(name);
	}
	
	/**
	 * 判断名字是否重复
	 * @param name
	 * @param id
	 * @return
	 */
	public int query4(String name ,int id) {
		Map<String, Object> map=new HashMap<>();
		map.put("id",id);
		map.put("name", name);
		return goodsReciewMapper.query5(map);
	}
}
