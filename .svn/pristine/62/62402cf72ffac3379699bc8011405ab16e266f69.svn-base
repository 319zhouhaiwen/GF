package dao.material;

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
import entity.page.Page;
import entity.page.PageEntity;
import mapper.material.MaterialMapper;

@Repository
public class MaterialDao {
	@Autowired
	private MaterialMapper materialMapper;
	/**
	  *  添加素材
	 * @param material
	 * @author zlj
	 */
	public void insertMaterial(MaterialEntity material) {
		materialMapper.insertMaterial(material);
	}
	
	/**
	  * 删除素材
	 * @param materialId
	 * @author zlj
	 */
	public void deleteMaterial(Integer materialId) {
		materialMapper.deleteMaterial(materialId);
	}
	
	/**
	  * 修改素材
	 * @param material
	 * @author zlj
	 */
	public void updateMaterial(MaterialEntity material) {
		materialMapper.updateMaterial(material);
	}
	
	/**
	  * 查询所有素材
	 * @author zlj
	 */
	public List<MaterialEntity> queryMaterial() {
		List<MaterialEntity> listMaterial = materialMapper.queryMaterial();
		return listMaterial;
	}
	
	/**
	 * 模糊查询总条数
	 * @param materialName
	 * @return
	 */
	public int queryCount(String materialName) {
		int count = materialMapper.queryCount(materialName);
		return count;
	}
	
	/**
	 * 模糊查询加分页
	 * @param page
	 * @param materialName
	 * @return List
	 * @author zlj
	 */
	public List<MaterialEntity> queryMaterialPage(Map<String, Object> map) {
		List<MaterialEntity> listMaterial = materialMapper.queryMaterialPage(map);
		return listMaterial;
	}
	
	/**
	 * 根据素材编号查询单条素材数据， 用于修改时回显,编号不能修改
	 * @param materialId
	 * @return material
	 * @author zlj
	 */
	public MaterialEntity queryOneMaterial(Integer materialId) {
		MaterialEntity material = materialMapper.queryOneMaterial(materialId);
		return material;
	}
	
	/**
	 * 检查素材名称不能重复
	 * @param materialName
	 * @return int
	 * @author zlj
	 */
	public int checkMaterialName(String materialName) {
		int mark = materialMapper.checkMaterialName(materialName);
		return mark;
	}
	
	/**
	 * 修改时检查素材名称不能与其他相同
	 * @param materialName
	 * @param materialId
	 * @return int
	 * @author zlj
	 */
	public int checkUpdateMaterialName(Map<String, Object> map) {
		int mark = materialMapper.checkUpdateMaterialName(map);
		return mark;
	}
}
