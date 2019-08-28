package dao.advert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import dao.db.Dao;
import entity.advert.AdvertEntity;
import entity.material.MaterialEntity;
import entity.page.PageEntity;
import mapper.advert.AdvertMapper;

@Repository
public class AdvertDao {
	@Autowired
	private AdvertMapper advertMapper;
	
	/**
	  * 添加广告
	 */
	public void insertAdvert(AdvertEntity advert) {
		advertMapper.insertAdvert(advert);
	}
	
	/**
	  * 删除广告
	 */
	public void deleteAdvert(Integer id) {
		advertMapper.deleteAdvert(id);
	}
	
	/**
	 * 修改广告
	 */
	public void updateAdvert(AdvertEntity advert) {
		advertMapper.updateAdvert(advert);
	}
	
	/**
	 * 修改广告的展示状态
	 */
	public void updateAdvertShow(Map<String, Object> map) {
		advertMapper.updateAdvertShow(map);
	}
	
	/**
	 * 根据商品id查询单条广告数据， 用于修改时回显
	 */
	public AdvertEntity queryOneAdvert(Integer id) {
		AdvertEntity advert = advertMapper.queryOneAdvert(id);
		return advert;
	}
	
	/**
	 * 查询所有广告，用List接
	 */
	public List<AdvertEntity> queryAdvert() {
		List<AdvertEntity> listAdvert = advertMapper.queryAdvert();
		return listAdvert;
	}
	
	/**
	  * 分页查询，用List接
	 */
	public List<AdvertEntity> queryAdvertPage(Map<String, Object> map) {
		List<AdvertEntity> listAdvert = advertMapper.queryAdvertPage(map);
		return listAdvert;
	}	
	
	/**
	  * 查询总条数
	 */
	public int queryCount() {
		int count = advertMapper.queryCount();
		return count;
	}
}
