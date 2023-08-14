package lab__dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import lab__model.AddPatient;
import lab__model.Signup;

public class SignUpDAO {
	private static final String jdbcUrl = "jdbc:postgresql://localhost/postgres";
	private static final String jdbcUserId = "postgres";
	private static final String jdbcPassword = "Amjad2025@";

	public boolean signUp(Signup e) {
		int result = 0;
		try {
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Connection con = DriverManager.getConnection(jdbcUrl, jdbcUserId, jdbcPassword);
			PreparedStatement prep = con.prepareStatement("insert into SignUp values (?,?);");

			prep.setString(1, e.getUserName());
			prep.setString(2, e.getPassword());

			result = prep.executeUpdate();
			prep.close();
			con.close();

		} catch (SQLException s) {
			s.printStackTrace();
		}
		if (result == 1)
			return true;
		return false;
	}

	public boolean getLogin(Signup p) {
		boolean flag = false;
		try {
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Connection con = DriverManager.getConnection(jdbcUrl, jdbcUserId, jdbcPassword);
			PreparedStatement prep = con.prepareStatement("select * from Signup where userName=? and userPassword=?;");
			prep.setString(1, p.getUserName());
			prep.setString(2, p.getPassword());
			ResultSet rs = prep.executeQuery();

			if (rs.next())
				flag = true;
			prep.close();
			con.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
		return flag;
	}

	public boolean homePage(AddPatient a) {
		int result = 0;
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Date date = new Date();
			java.sql.Date datesql = new java.sql.Date(date.getTime());
			Connection con = DriverManager.getConnection(jdbcUrl, jdbcUserId, jdbcPassword);
			PreparedStatement prep = con.prepareStatement(
					"insert into AddPatient(patientName,Age,collecionDate,gender,reffrence,collectedBy) values(?,?,?,?,?,?)");
			prep.setString(1, a.getPatientName());
			prep.setByte(2, a.getAge());
			prep.setDate(3, datesql);
			prep.setString(4, a.getGender());
			prep.setString(5, a.getRefference());
			prep.setString(6, a.getCollectBy());
			result = prep.executeUpdate();
			prep.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (result > 0)
			return true;
		return false;
	}

	public ArrayList<AddPatient> allPatientList() {
		ArrayList<AddPatient> patient = new ArrayList<AddPatient>();
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {

			Connection con = DriverManager.getConnection(jdbcUrl, jdbcUserId, jdbcPassword);
			PreparedStatement prep = con.prepareStatement("select * from addPatient");
			ResultSet rs = prep.executeQuery();

			while (rs.next()) {
				patient.add(new AddPatient(rs.getInt(1), rs.getString(2), rs.getByte(3), rs.getDate(4), rs.getString(5),
						rs.getString(6), rs.getString(7)));
			}
			con.close();
			prep.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}
		return patient;

	}

	public void deletePatient(int id) {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {

			Connection con = DriverManager.getConnection(jdbcUrl, jdbcUserId, jdbcPassword);
			PreparedStatement prep = con.prepareStatement("delete  from addPatient where carid=?");
			prep.setInt(1, id);
			prep.executeUpdate();
			prep.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void deleteAdmin(String id) {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {

			Connection con = DriverManager.getConnection(jdbcUrl, jdbcUserId, jdbcPassword);
			PreparedStatement prep = con.prepareStatement("delete  from signup where username=?");
			prep.setString(1, id);
			prep.executeUpdate();
			prep.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
