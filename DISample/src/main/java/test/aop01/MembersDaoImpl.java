package test.aop01;

public class MembersDaoImpl implements MembersDao{

	@Override
	public int insert(Object data) {
		System.out.println(data + " 추가");
		return 1;
	}

	@Override
	public int update(Object data) {
		System.out.println(data + " 수정");
		return 0;
	}

	@Override
	public int delete(Object data) {
		System.out.println(data + " 삭제");
		return 0;
	}

	@Override
	public Object select(Object data) {
		System.out.println(data + " 조회");
		return data;
	}
	

}
