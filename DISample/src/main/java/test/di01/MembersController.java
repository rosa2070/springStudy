package test.di01;

public class MembersController {
	private MembersDao dao;
	
	public MembersController() {}
	
	public MembersController(MembersDao dao) {
		this.dao = dao;
	}
	
	//스프링이 생성해준 객체 주입하기
	public void setDao(MembersDao dao) {
		this.dao = dao;
	}
	
	public void service() {
		dao.insert("홍길동1");
		dao.update("홍길동2");
		dao.delete("홍길동3");
		dao.select("홍길동4");
		
	}

}
