package UserMapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
public class User {

	@Mapper
	public interface UserMapper {
		/**
		 * 全ユーザーを取得
		 * 
		 * @return 全ユーザーの情報
		 * 
		 */
		List<User> selectAll();
	}
	
	public interface userKensaku {
		/**
		 * 条件によって、検索する
		 * 
		 * @return 全ユーザーの情報
		 * 
		 */
		List<User> selectJyoken();
	}
	
}
