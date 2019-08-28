package service.goods;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.goods.GoodsDao;
import entity.goods.GoodsEntity;
import entity.page.PageEntity;
import mapper.goods.GoodsMapper;

@Service
public class GoodsService {
	@Autowired
	private GoodsDao goodsDao;
	@Autowired
	private GoodsMapper goodsMapper;
	/**
	 * 新增
	 * @param goods
	 */
	public void add(GoodsEntity goods) {
		goodsMapper.add(goods);
	}
	
	/**
	 * 删除
	 * @param id
	 */
	public void delete(int id) {
		goodsMapper.delete(id);
	}
	/**
	 * 修改
	 * @param goods
	 */
	public void update(GoodsEntity goods) {
		goodsMapper.update(goods);
	}
	
	/**
	 * 查询 分页 模糊查询
	 * @param dataName
	 * @param page
	 * @return
	 */
	public List<GoodsEntity> Query(String dataName,PageEntity page){
		if(dataName==null)
			dataName="";
		int pageNow = (page.getPageNow() - 1) * page.getPageSize();
		Map<String , Object> map=new HashMap<String, Object>();
		map.put("pageNow", pageNow);
		map.put("dataName", dataName);
		map.put("pageSize", page.getPageSize());
		return goodsMapper.queryMap(map);
	}
	
	/**
	 * 总条数
	 * @param dataName
	 * @return
	 */
	public int pageCount(String dataName) {
		return goodsMapper.pageCount(dataName);
	}
	
	/**
	 * 修改回显
	 * @param id
	 * @return
	 */
	public GoodsEntity Query1(int id) {
		return goodsMapper.query1(id);
	}
	
	/**
	 * 判断名字是否存在
	 * @param name
	 * @param id
	 * @return
	 */
	public int Query(String name,int id) {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("id", id);
		map.put("name", name);
		return goodsMapper.queryName(map);
	}
	
	public List<GoodsEntity> Query(){
		return goodsMapper.query();
	}
	
}
