package mapper.goodsreciew;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;

import entity.goodsreciew.GoodsReciewEntity;
import entity.page.PageEntity;
/**
 * 
 * @author guoning
 *
 * 2019年7月19日下午7:16:27
 */
public interface GoodsReciewMapper {
	/* 查询所有 */
	  List<GoodsReciewEntity> query();

	/* 审核表查询 模糊查询 分页 */
	  List<GoodsReciewEntity> query3(Map<String, Object> map);

	/* 审核表删除 */
	  void delete(int id);

	/* 查出模糊查询的值一共有多少条数据 */
	  int pageCount(String  dataName);
	  
	/* 传入一个id得到一个List */
	  GoodsReciewEntity query1(int id);
	  
	/* 判断名字是否存在 */
	  int query4(String  name);
	  
	  /*修改判断名字是否存在*/
	  int query5(Map<String, Object> map);
	  
	/* 新增 */
	  void add(GoodsReciewEntity goodsr);
	  /*修改*/
	  void update(GoodsReciewEntity goodsr);
}
