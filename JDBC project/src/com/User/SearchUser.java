package com.User;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class SearchUser{
	
	public List search(UserBean bean) throws Exception {
		
		ResourceBundle rb = ResourceBundle.getBundle("com.bundle.app");
		String driver = rb.getString("driver");
		String url = rb.getString("url");
		String username = rb.getString("username");
		String pwd = rb.getString("password");
		
		StringBuffer sb = new StringBuffer("select * from user where 1 = 1 ");
		
		Class.forName(driver);

		Connection conn = DriverManager.getConnection(url, username, pwd);
		
		List list = new ArrayList();
		
		if (bean != null) {
			
			  if (bean.getId() != 0) {
			 
			  sb.append(" and id like " + bean.getId() + " ");
			  
			 }
		
			if (bean.getFirstName() != null && bean.getFirstName().length() > 0) {

				sb.append("and firstName like '" + bean.getFirstName() + "%'");

			}
			
			if (bean.getLastName() != null && bean.getLastName().length() > 0) {

				sb.append("and lastName like '" + bean.getLastName() + "%'");

			}

			if (bean.getDob() != null && bean.getDob().getTime() > 0) {

				Date d = new Date(bean.getDob().getTime());

				System.out.println("dob ===> " + d);

				sb.append("and dob = '" + d + "'");

			}
			
			if (bean.getLoginId() != null && bean.getLoginId().length() >0) {
				
				sb.append(" and loginId like '" + bean.getLoginId()+ "%'");
			}
			
			
            if (bean.getPassword() != null && bean.getPassword().length() >0) {
				
            	sb.append(" and password like '" + bean.getPassword()+ "%'");
			}
            
            if (bean.getAddress()!= null && bean.getAddress().length()>0) {
            	sb.append(" and address like ' " + bean.getAddress() + " %'");
            	    	
            }
				
	}
		System.out.println("sql === > " + sb.toString());

	    PreparedStatement pstmt = conn.prepareStatement(sb.toString());

	    ResultSet rs = pstmt.executeQuery();

	    bean = null;

	while (rs.next()) {
        bean = new UserBean();
		bean.setId(rs.getInt(1));
		bean.setFirstName(rs.getString(2));
		bean.setLastName(rs.getString(3));
		bean.setLoginId(rs.getString(4));
		bean.setPassword(rs.getString(5));
		bean.setAddress(rs.getString(6));
		bean.setDob(rs.getDate(7));
		list.add(bean);
		
		
	}
	return list;
	}
	
}