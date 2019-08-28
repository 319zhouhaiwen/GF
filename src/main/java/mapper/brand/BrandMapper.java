package mapper.brand;

import java.util.List;
import java.util.Map;

import entity.brand.Brand;

public interface BrandMapper {
	
	public List<Brand> select(Map<String,Object> map);
	
	public int brandCount(String name);
	
	public String selectcode(String name);
	
	public void insert(Brand brand);
	
	public void update(Brand brand);
	
	public void delete(int id);
	
	public void deletegoods(String code);
	
	public void deleteag(String code);
	
	public Brand get(int id);
	
	public int count(String name);
	
	public List<Brand> query();
	
}
