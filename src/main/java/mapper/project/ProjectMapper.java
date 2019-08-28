package mapper.project;

import java.util.List;
import java.util.Map;

import entity.project.ProjectEntity;
import entity.project.ProjectReport;

public interface ProjectMapper {
	
	//循环查出正文内容
	String select(int id);
	
	//模糊查询,分页
	List<ProjectEntity> query(Map<String,Object> map);
	
	//添加
	void insert(ProjectEntity projectentity);
	
	//修改
	void update(ProjectEntity projectentity);
	
	//修改回显
	ProjectEntity update1(int id);
	
	//删除
	void delete(Integer id);
	
	//前台文章查询
	List<ProjectEntity> query1();
	
	//查出总条数
	int zshuju(String name);
	
	//举报模糊查询
	List<ProjectReport> jbmhcx(String fuzzy);
	
	//前台举报添加
	void insert1(ProjectReport projectreport);
	
	//后台举报查询
	List<ProjectReport> chaxun();
	
	
	
}
