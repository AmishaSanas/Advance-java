package com.User;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

public class TestSearchUser {
	
	public static void main(String[] args) throws Exception {
		testSearch();
	}
	
	private static void testSearch() throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		SearchUser search = new SearchUser();

		UserBean bean = new UserBean();
		
		//bean.setFirstName("Kabir");
		
		//bean.setLastName("Patel");
		
		//bean.setLoginId("dev@gmail.com");

		//bean.setDob(sdf.parse("2000-05-30"));
		
		//bean.setPassword("kabir@123");
		
		//bean.setAddress("Kochi, Kerala ");

		List list = search.search(bean);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			bean = (UserBean) it.next();
			System.out.println(bean.getId() + " " + bean.getFirstName() + " " + bean.getLastName()+" "+bean.getLoginId());

		}

	}
	

}

