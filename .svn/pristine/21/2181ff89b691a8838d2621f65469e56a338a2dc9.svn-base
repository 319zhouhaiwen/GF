package mapper.goods;

import java.util.List;
import java.util.Map;

import entity.goods.GoodsEntity;

/**
 * 
 * @author guoning
 *
 * 2019年7月19日下午7:16:27
 */
public interface GoodsMapper {
	/* 新增 */
	void add(GoodsEntity goods);

	/* 删除 */
	void delete(int id);
	
	/* <!-- 修改 --> */
	void update(GoodsEntity goods);
	
	/*查询所有*/
	List<GoodsEntity> query();
	
	/* 模糊查询 */
	List<GoodsEntity> queryMap(Map<String, Object> map);
	
	/* 查出模糊查询一共有多少条数据 */
	int pageCount(String dataName);

	/* 修改回显 */
	GoodsEntity query1(int id);
	
	int queryName(Map<String, Object> map);
	
	
	
}
