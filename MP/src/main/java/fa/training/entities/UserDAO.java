package fa.training.entities;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {
	List<User> getAll() throws SQLException;

	/**
	 * Call a stored procedure to save a bill to database.
	 * 
	 * @method saveBill
	 * @param bill
	 * @return true if inserts success to database, else false
	 * @throws SQLException
	 */

}
