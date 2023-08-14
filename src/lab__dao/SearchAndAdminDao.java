package lab__dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import lab__model.AddPatient;
import lab__model.Signup;

public class SearchAndAdminDao {

	private static final String jdbcUrl = "jdbc:postgresql://localhost/postgres";
	private static final String jdbcUserId = "postgres";
	private static final String jdbcPassword = "Amjad2025@";

	public List<Signup> admin(){
		List <Signup> list=new ArrayList<Signup>();
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {

			e1.printStackTrace();
		}
		
		try {
			Connection con=DriverManager.getConnection(jdbcUrl, jdbcUserId, jdbcPassword);
			PreparedStatement prep=con.prepareStatement("select *from Signup");
			ResultSet rs=prep.executeQuery();
			
			while(rs.next())
			{
				list.add(new Signup(rs.getString(1),rs.getString(2)));
			}
			prep.close();
			con.close();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return list;
		
	}
	
	public static List<AddPatient> searchByPatientname(String name) {
		ArrayList<AddPatient> list = new ArrayList<AddPatient>();
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection(jdbcUrl, jdbcUserId, jdbcPassword);
			PreparedStatement prep = con.prepareStatement("select *from AddPatient where patientname=?");
			prep.setString(1, name);
			ResultSet rs = prep.executeQuery();
			while (rs.next()) {
				list.add(new AddPatient(rs.getString(1), rs.getByte(2), rs.getDate(3), rs.getString(4), rs.getString(5),
						rs.getString(6)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static ArrayList<AddPatient> SearchPatient(String name) {
		ArrayList<AddPatient> list = new ArrayList<AddPatient>();
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection(jdbcUrl, jdbcUserId, jdbcPassword);
			PreparedStatement prep = con.prepareStatement("select * from Addpatient where patientname like initcap('"+name+"%')");
			ResultSet rs = prep.executeQuery();
			while (rs.next()) {
				list.add(new AddPatient(rs.getInt(1),rs.getString(2), rs.getByte(3), rs.getDate(4), rs.getString(5), rs.getString(6),
						rs.getString(7)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static ArrayList<AddPatient> searchCollect(String name) {
		ArrayList<AddPatient> list = new ArrayList<AddPatient>();
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection(jdbcUrl, jdbcUserId, jdbcPassword);
			PreparedStatement prep = con.prepareStatement("select * from Addpatient where collectedBy like initcap('"+name+"%')");
			ResultSet rs = prep.executeQuery();
			while (rs.next()) {
				list.add(new AddPatient(rs.getInt(1),rs.getString(2), rs.getByte(3), rs.getDate(4), rs.getString(5), rs.getString(6),
						rs.getString(7)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static ArrayList<AddPatient> searchDoctor(String name) {
		ArrayList<AddPatient> list = new ArrayList<AddPatient>();
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection(jdbcUrl, jdbcUserId, jdbcPassword);
			
			PreparedStatement prep = con.prepareStatement("select * from Addpatient where reffrence like initcap('"+name+"%')");
			ResultSet rs = prep.executeQuery();
			while (rs.next()) {
				list.add(new AddPatient(rs.getInt(1),rs.getString(2), rs.getByte(3), rs.getDate(4), rs.getString(5), rs.getString(6),
						rs.getString(7)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
