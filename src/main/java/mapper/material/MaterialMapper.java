package mapper.material;

import java.util.List;
import java.util.Map;

import entity.material.MaterialEntity;
import entity.page.PageEntity;

public interface MaterialMapper {
	/**
	  *  添加素材
	 * @param material
	 * @author zlj
	 */
	public void insertMaterial(MaterialEntity material);
	
	/**
	  * 删除素材
	 * @param materialId
	 * @author zlj
	 */
	public void deleteMaterial(Integer materialId);
		
	/**
	  * 修改素材
	 * @param material
	 * @author zlj
	 */
	public void updateMaterial(MaterialEntity material);
		
	/**
	  * 查询所有素材
	 * @author zlj
	 */
	public List<MaterialEntity> queryMaterial();
	
	/**
	 * 模糊查询加分页
	 * @param page
	 * @return List
	 * @author zlj
	 */
	public List<MaterialEntity> queryMaterialPage(Map<String, Object> map);
	
	/**
	 * 模糊查询总条数
	 * @param materialName
	 * @return int
	 * @author zlj
	 */
	public int queryCount(String materialName);
	
	/**
	 * 根据素材编号查询单条素材数据， 用于修改时回显,编号不能修改
	 * @param materialId
	 * @return material
	 * @author zlj
	 */
	public MaterialEntity queryOneMaterial(Integer materialId);
	
	/**
	 * 检查素材名称不能重复
	 * @param materialName
	 * @return int
	 * @author zlj
	 */
	public int checkMaterialName(String materialName);
	
	/**
	 * 修改时检查素材名称不能与其他相同
	 * @param materialName
	 * @param materialId
	 * @return int
	 * @author zlj
	 */
	public int checkUpdateMaterialName(Map<String, Object> map);
}
