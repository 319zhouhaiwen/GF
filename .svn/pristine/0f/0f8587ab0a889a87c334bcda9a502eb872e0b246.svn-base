package controller.order;

import java.io.OutputStream;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import entity.order.OrderEntity;
import service.order.OrderService;
import service.user.UserService;

@Component
public class OrderExcel extends AbstractXlsxView {

	@Autowired
	private UserService userService;

	@Autowired
	private OrderService orderService;
	@Autowired
	private ResourceBundleMessageSource messageSource;

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Locale locale = (Locale) request.getSession().getAttribute("locale");

		String fileName = "OrderExcel.xls";
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/ms-excel");
		response.setHeader("Content-Disposition", "inline; filename=" + new String(fileName.getBytes(), "iso8859-1"));
		OutputStream outputStream = response.getOutputStream();
		// 产生Excel表头
		Sheet sheet = workbook.createSheet(messageSource.getMessage("EssentialInformation", null, locale));
		Row header = sheet.createRow(0);
		// 产生标题列
		// header.createCell(0).setCellValue(messageSource.getMessage("add.male", null,
		// locale));

		header.createCell(0).setCellValue(messageSource.getMessage("order.userCode", null, locale));
		header.createCell(1).setCellValue(messageSource.getMessage("order.orderDate", null, locale));
		header.createCell(2).setCellValue(messageSource.getMessage("order.shippingAddr", null, locale));
		header.createCell(3).setCellValue(messageSource.getMessage("order.receivingAddr", null, locale));
		header.createCell(4).setCellValue(messageSource.getMessage("order.receiver", null, locale));
		header.createCell(5).setCellValue(messageSource.getMessage("order.goodsName", null, locale));
		header.createCell(6).setCellValue(messageSource.getMessage("order.goodsNum", null, locale));
		header.createCell(7).setCellValue(messageSource.getMessage("order.goodsPrice", null, locale));
		header.createCell(8).setCellValue(messageSource.getMessage("order.receiptStatus", null, locale));
		header.createCell(9).setCellValue(messageSource.getMessage("order.orderStatus", null, locale));
		header.createCell(10).setCellValue(messageSource.getMessage("order.paymentStatus", null, locale));
		header.createCell(11).setCellValue(messageSource.getMessage("order.logisticsCode", null, locale));
		header.createCell(12).setCellValue(messageSource.getMessage("order.expressCode", null, locale));
		header.createCell(13).setCellValue(messageSource.getMessage("order.receiptTime", null, locale));
		header.createCell(14).setCellValue(messageSource.getMessage("order.payment", null, locale));
		header.createCell(15).setCellValue(messageSource.getMessage("order.orderCode", null, locale));
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("mm/dd/yyyy"));
		int rowNumber = 1;
		List<OrderEntity> list = orderService.ras();
		for (OrderEntity order : list) {
			Row row1 = sheet.createRow(rowNumber++);
			row1.createCell(0).setCellValue(order.getGoodsName());
			row1.createCell(1).setCellValue(order.getOrderDate());
			row1.createCell(2).setCellValue(order.getShippingAddr());
			row1.createCell(3).setCellValue(order.getReceivingAddr());
			row1.createCell(4).setCellValue(order.getReceiver());
			row1.createCell(5).setCellValue(order.getGoodsName());
			row1.createCell(6).setCellValue(order.getGoodsNum());
			row1.createCell(7).setCellValue(order.getGoodsPrice());
			row1.createCell(8).setCellValue(order.getReceiptStatus());
			row1.createCell(9).setCellValue(order.getOrderStatus());
			row1.createCell(10).setCellValue(order.getPaymentStatus());
			row1.createCell(11).setCellValue(order.getLogisticsCode());
			row1.createCell(12).setCellValue(order.getExpressCode());
			row1.createCell(13).setCellValue(order.getReceiptTime());
			row1.createCell(14).setCellValue(order.getPayment());
			row1.createCell(15).setCellValue(order.getOrderCode());
		}
		// 产生标题列
		workbook.write(outputStream);
		outputStream.flush();
		outputStream.close();
	}
}