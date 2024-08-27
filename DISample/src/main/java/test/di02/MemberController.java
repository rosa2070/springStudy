package test.di02;

public class MemberController {
	private CommonDao dao;
	
	public void setDao(CommonDao dao) {
		this.dao = dao;
	}
	
	public void service() {
		dao.insert("홍길동");
		dao.update("홍길동");
		dao.select("홍길동");
		dao.delete("홍길동");
	}
}
