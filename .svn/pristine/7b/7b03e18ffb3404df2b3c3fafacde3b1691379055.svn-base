package mapper.advert;

import java.util.List;
import java.util.Map;

import entity.advert.AdvertEntity;
import entity.page.PageEntity;

public interface AdvertMapper {
	/**
	  * 添加广告
	 */
	public void insertAdvert(AdvertEntity advert);
	
	/**
	  * 删除广告
	 */
	public void deleteAdvert(int id);
	
	/**
	  * 修改广告
	 */
	public void updateAdvert(AdvertEntity advert);
	
	/**
	 * 修改广告的展示状态
	 */
	public void updateAdvertShow(Map<String, Object> map);
	
	/**
	 * 根据商品id查询单条广告数据， 用于修改时回显
	 */
	public AdvertEntity queryOneAdvert(Integer id);
	
	/**
	 * 查询所有广告，用List接
	 */
	public List<AdvertEntity> queryAdvert();
	
	/**
	  * 分页查询广告
	 */
	public List<AdvertEntity> queryAdvertPage(Map<String,Object> map);
	
	/**
	  * 查询总条数
	 */
	public int queryCount();
}
