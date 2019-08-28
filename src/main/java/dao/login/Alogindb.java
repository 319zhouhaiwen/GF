package dao.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import dao.db.Dao;
import entity.user.UserEntity;
import mapper.login.Aloginmapper;

@Repository
public class Alogindb {
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private Aloginmapper aloginmapper;
	
	public int checkUser(String account,String password) {
		
//		int mark=0;
//		try {
//			String sql="select count(*) from GF_account where account=? and password=?";
//			 mark=jdbcTemplate.queryForObject(sql,Integer.class,username,password);
//		} catch (DataAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return mark;
		
		
		int mark=0;
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("account", account);
		map.put("password", password);
		try {
			mark=aloginmapper.acheckUser(map);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mark;
		
//		int mark=0;
//		Connection conn=null;
//		PreparedStatement ps=null;
//		ResultSet rs=null;
//		try {
//			String sql="select count(*) from GF_account where account=? and password=?";		
//			
//			conn=Dao.getConn();//获取连接
//			
//			ps=conn.prepareStatement(sql);//发送sql到数据库
//			ps.setString(1, username);
//			ps.setString(2, password);
//			ps.executeQuery();//执行查询
//			rs=ps.getResultSet();
//			rs.next();
//			mark=rs.getInt(1);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			Dao.closeConn(conn,ps,rs);
//		}
//		return mark;
	}

	

	
}
