package test.di02;

public class MySQLDao implements CommonDao {

	@Override
	public void insert(String data) {
		System.out.println("오라클과 연동해서 " + data + " 추가");		
	}
	@Override
	public void update(String data) {
		System.out.println("오라클과 연동해서 " + data + " 수정");		
	}
	@Override
	public void delete(String data) {
		System.out.println("오라클과 연동해서 " + data + " 삭제");		
	}
	@Override
	public void select(String data) {
		System.out.println("오라클과 연동해서 " + data + " 조회");
	}
	
}
