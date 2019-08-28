package service.advert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.advert.AdvertDao;
import entity.advert.AdvertEntity;
import entity.page.PageEntity;

@Service
public class AdvertService {
	@Autowired
	private AdvertDao advertDao;
	
	/**
	  * 添加广告
	 */
	@Transactional
	public void insertAdvert(AdvertEntity advert) {
		advertDao.insertAdvert(advert);
	}
	
	/**
	  * 删除广告
	 */
	@Transactional
	public int deleteAdvert(Integer id) {
		int mark = 0;
		try {
			advertDao.deleteAdvert(id);
			mark = 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mark;
	}
	
	/**
	 * 修改广告
	 */
	@Transactional
	public void updateAdvert(AdvertEntity advert) {
		advertDao.updateAdvert(advert);
	}

	/**
	 * 修改广告的展示状态
	 */
	@Transactional
	public int updateAdvertShow(Integer advertShow,Integer id) {
		int mark = 0;
		try {
			Map<String, Object> map = new HashMap<>();
			map.put("advertShow", advertShow);
			map.put("id", id);
			advertDao.updateAdvertShow(map);
			
			mark=1;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return mark;//修改成功返回1，修改失败返回0
	}
	
	/**
	 * 根据商品id查询单条广告数据， 用于修改时回显
	 */
	@Transactional
	public AdvertEntity queryOneAdvert(Integer id) {
		AdvertEntity advert = advertDao.queryOneAdvert(id);
		return advert;
	}
	
	/**
	  * 查询所有广告，用List接
	 */
	public List<AdvertEntity> queryAdvert() {
		List<AdvertEntity> listAdvert  = advertDao.queryAdvert();
		return listAdvert;
	}
	
	/**
	  * 分页查询，用List接
	 */
	public List<AdvertEntity> queryAdvertPage(PageEntity page) {
		int count = advertDao.queryCount();//查询总条数
		page.setCount(count);//给page设总条数

		int pageStartIndex = (page.getPageNow() - 1) * page.getPageSize();
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("pageStartIndex", pageStartIndex);/* 起始下标 */
		map.put("pageSize", page.getPageSize());/* 每页显示多少条 */
		List<AdvertEntity> listAdvert = advertDao.queryAdvertPage(map);

		return listAdvert;
	}
	
}
