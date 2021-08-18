package fa.training.entities;

public class User {
	private int UserID,RoleID;
	private String UserName,Password;
	
	public User(int userID, int roleID, String userName, String password) {
		super();
		this.UserID = userID;
		this.RoleID = roleID;
		this.UserName = userName;
		this.Password = password;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public int getRoleID() {
		return RoleID;
	}

	public void setRoleID(int roleID) {
		RoleID = roleID;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "User [UserID=" + UserID + ", RoleID=" + RoleID + ", UserName=" + UserName + ", Password=" + Password
				+ "]";
	}
	
}
