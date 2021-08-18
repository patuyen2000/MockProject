package fa.training.impl;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import fa.training.common.DBConnection;
import fa.training.entities.User;
import fa.training.entities.UserDAO;
import fa.training.common.SQLCommand;
public class UserDAOImpl implements UserDAO {
	private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private CallableStatement caStatement = null;
	private ResultSet results = null;
	@Override
	public List<User> getAll() throws SQLException {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<>();
		User user = null;
		try {
			connection=DBConnection.getInstance().getConnection();
			preparedStatement = connection.prepareStatement(SQLCommand.USER_QUERY_FIND_ALL);
			results = preparedStatement.executeQuery();
			while (results.next()) {
				user= new User();
				user.setUserID(results.getInt("UserID"));
				user.setRoleID(results.getInt("RoleID"));
				user.setUserName(results.getString("UserName"));
				user.setPassword(results.getString("Password"));
				users.add(user);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			try {
				if (connection != null) {
					connection.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return users;
	}



}
