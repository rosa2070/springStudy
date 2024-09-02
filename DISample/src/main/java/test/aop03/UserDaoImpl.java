package test.aop03;

public class UserDaoImpl implements UserDao {

	@Override
	public int insert(Object data) {
		for(int i = 1; i<=1000000000; i++);
		System.out.println(data + " 추가");
		return 1;
	}

	@Override
	public int update(Object data) {
		for(int i = 1; i<=1000000000; i++);
		System.out.println(data + " 수정");
		return 0;
	}

	@Override
	public int delete(Object data) {
		for(int i = 1; i<=1000000000; i++);
		System.out.println(data + " 삭제");
		return 0;
	}

	@Override
	public Object select(Object data) {
		for(int i = 1; i<=1000000000; i++);
		System.out.println(data + " 조회");
		return data;
	}
	

}
