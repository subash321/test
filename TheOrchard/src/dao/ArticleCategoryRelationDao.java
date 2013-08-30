package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import dao.ApplicationConnection;

	
	public class ArticleCategoryRelationDao extends ApplicationConnection {
		
		private	String findCategoryNameQuery="SELECT cid,categoryname FROM cms.categorydetailstable where approved=true && statusno=4";
		private String insertRelationCat ="insert into articlecategoryrelationtable(aid, cid)values(?,?)";
		
		public void findCategoryName()throws Exception{
			Connection con = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			try{
				con = getConnection();
				stmt =getPreparedstatement(con,findCategoryNameQuery);
				rs = stmt.executeQuery();
				while(rs.next()){
				System.out.println("DB_test"+rs.getInt(1));	
				}
			 	}catch (Exception e){
			 		e.printStackTrace();
			 	}finally{
			 		rs.close();
			 		stmt.close();
			 		con.close();
			 	}
			}
	}
