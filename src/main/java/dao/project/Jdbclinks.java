package dao.project;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import entity.page.PageEntity;
import entity.project.ProjectEntity;
import entity.project.ProjectReport;
import mapper.project.ProjectMapper;


@Repository
public class Jdbclinks {
	
	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	@Autowired
	public ProjectMapper projectMapper;
	
	
	//查出所有数据导入Excel表
	public List<ProjectEntity> excel(){
		String sql = " select * from gf_article ";
		RowMapper<ProjectEntity> rowMapper = new BeanPropertyRowMapper<ProjectEntity>(ProjectEntity.class);
		List<ProjectEntity> list = jdbcTemplate.query(sql,rowMapper);
		
		return list;
	}
	
	
	//模糊查询,分页
	public List<ProjectEntity> query(String projectFuzzy,PageEntity pageEntity) {
//		String sql = " select * from gf_article where article_title like ? LIMIT ?,? ";
		int pageNow = (pageEntity.getPageNow() - 1) * pageEntity.getPageSize();
//		if(projectFuzzy == null) {
//			projectFuzzy = "";
//		}
//		RowMapper<ProjectEntity> rowMapper = new BeanPropertyRowMapper<ProjectEntity>(ProjectEntity.class);
//		List<ProjectEntity> list = jdbcTemplate.query(sql,rowMapper,"%"+projectFuzzy+"%",pageNow,pageEntity.getPageSize());
		
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("pageNow",pageNow);
		map.put("pageEntity",pageEntity.getPageSize());
		map.put("projectFuzzy",projectFuzzy);
		
		List<ProjectEntity> list = projectMapper.query(map);
		
		return list;
	}
	
	
	
	//查出总条数
	public int zshuju(String name) {
//		String sql = " select count(*) from gf_article where article_title like ? ";
//		if(name == null) {
//			name = "";
//		};
//		Integer count = jdbcTemplate.queryForObject(sql,Integer.class,"%"+name+"%");
		Integer count = projectMapper.zshuju(name);
		
		return count;
	}
	
	
	
	
	
	//举报模糊查询
	public List<ProjectReport> jbmhcx(String fuzzy) {
//		String sql = " select articlet_code articletcode,articlet_name articletitle,report_descride reporting from gf_report where articlet_name like ? ";
//		RowMapper<ProjectReport> rowMapper = new BeanPropertyRowMapper<ProjectReport>(ProjectReport.class);
//		List<ProjectReport> list = jdbcTemplate.query(sql,rowMapper,"%\\"+fuzzy+"%");
		List<ProjectReport> list = projectMapper.jbmhcx(fuzzy);
		
		return list;
	}
	
	
	
	
	//后台举报查询
	public List<ProjectReport> chaxun() {
//		String sql = " select articlet_code articletcode,articlet_name articletitle,report_descride reporting from gf_report ";
//		RowMapper<ProjectReport> rowMapper = new BeanPropertyRowMapper<ProjectReport>(ProjectReport.class);
//		List<ProjectReport> list = jdbcTemplate.query(sql,rowMapper);
		List<ProjectReport> list = projectMapper.chaxun();
		
		return list;
	}
	
	
	
	
	
	//前台举报添加
	public void insert1(ProjectReport projectreport) {
//		String sql = " insert into gf_report(articlet_name,report_descride)values(?,?) ";
//		jdbcTemplate.update(sql,projectreport.getArticletitle(),projectreport.getReporting());
		projectMapper.insert1(projectreport);
		
	}
	
	
	
	
	//修改回显
	public ProjectEntity update1(int id) {
//		String sql = "select * from gf_article where id = ?";
//		RowMapper<ProjectEntity> rowMapper = new BeanPropertyRowMapper<ProjectEntity>(ProjectEntity.class);
//		ProjectEntity projectEntity = jdbcTemplate.queryForObject(sql, rowMapper,id);
		ProjectEntity projectEntity = projectMapper.update1(id);
		
		return projectEntity;
		
	}
	
	
	
	
	//循环查出正文内容
	public String select(int id) {
//		String sql = " select article_text from gf_article where id = ? ";
//		String txt = jdbcTemplate.queryForObject(sql,String.class,id);
		String txt = projectMapper.select(id);
		return txt;
		
	}
	
	
	//前台文章查询
	public List<ProjectEntity> query() {
//		String sql = " select * from gf_article ";
//		RowMapper<ProjectEntity> rowMapper = new BeanPropertyRowMapper<ProjectEntity>(ProjectEntity.class);
//		List<ProjectEntity> list = jdbcTemplate.query(sql,rowMapper);
		List<ProjectEntity> list = projectMapper.query1();
		
		return list;
		
	}
	
	
	//添加
	public void insert(ProjectEntity projectentity) {
//		String sql = "insert into gf_article(article_code,article_title,article_text,goods_code) values(?,?,?,?) ";
//		jdbcTemplate.update(sql,projectentity.getArticle_code(),projectentity.getArticle_title(),projectentity.getArticle_text(),projectentity.getGoods_code());
		projectMapper.insert(projectentity);
	}
	
	//删除
	public void delete(Integer id) {
//		String sql = "delete from gf_article where id = ?";
//		jdbcTemplate.update(sql,id);
		projectMapper.delete(id);
		
	}
	
	//修改
	public void update(ProjectEntity projectentity) {
//		String sql = " update gf_article set article_title = ?,article_text = ? where id = ? ";
//		jdbcTemplate.update(sql, projectentity.getArticle_title(),projectentity.getArticle_text(),projectentity.getId());
		projectMapper.update(projectentity);
		
	}
	
	
	
	
}
