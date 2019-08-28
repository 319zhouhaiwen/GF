package dao.order;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import entity.order.OrderEntity;
import entity.order.OrderPage;
import mapper.order.OrderMapper;

@Repository
public class OrderDao {
	@Autowired
	private JdbcTemplate jdbctemplate;

	@Autowired
	private ResourceBundleMessageSource messageSource;

	@Autowired
	private OrderMapper ordermapper;

	/**
	 * 模糊查询 分页查询
	 * 
	 * @param lisk
	 * @return
	 */
	public List<OrderEntity> lisk(String lisk, OrderPage page) {
		Map<String, Object> mapa = new HashMap<String, Object>();
		mapa.put("lisk", lisk);

		Integer aa = ordermapper.selectcount(mapa);
		int ras = aa / page.getPageSize();
		if (aa % page.getPageSize() != 0) {
			ras = ras + 1;
		}
		page.setPogeCount(ras);
		page.setSum(aa);

		int start = (page.getPageNo() - 1) * page.getPageSize();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("a", start);
		map.put("b", page.getPageSize());
		map.put("lisk", lisk);
		return ordermapper.list(map);
	}

	/**
	 * 前台添加定单
	 * 
	 * @param order
	 */
	public void insert(OrderEntity order) {
		order.setDeletes(1);
		ordermapper.insert(order);
	}

	/**
	 * 前台查询
	 * 
	 * @param name
	 * @return
	 */
	public List<OrderEntity> selectqt(String name) {
		return ordermapper.selectqt(name);
	}

	/**
	 * 回显
	 * 
	 * @param id
	 * @return
	 */
	public OrderEntity get(Integer id) {
		return ordermapper.get(id);
	}

	/**
	 * 修改
	 * 
	 * @param order
	 */
	public void update(OrderEntity order) {
		ordermapper.update(order);
	}

	/**
	 * 前台删除 修改状态让前台看不见
	 * 
	 * @param id
	 */
	public void delete(Integer id) {
		ordermapper.delete(id);
	}

	/**
	 * 取消订单
	 * 
	 * @param id
	 * @param orderStatus
	 */
	public void OrderStatus(Integer id, String orderStatus) {
		Map<String, Object> map = new HashMap<>();
		map.put("id", id);
		map.put("orderStatus", orderStatus);
		ordermapper.OrderStatus(map);
	}

	/**
	 * 确认收货
	 * 
	 * @param id
	 */
	public void receiptStatus(Integer id) {
		ordermapper.receiptStatus(id);
	}

	public List<OrderEntity> ras(){
		return ordermapper.ras();
	}
}
