package test.di03;

import org.springframework.stereotype.Repository;

@Repository
public class BoardImplDao implements Board {

	@Override
	public void insert(String data) {
		System.out.println(data + "글 등록");
		
	}

	@Override
	public void delete(String data) {
		System.out.println(data + "글 삭제");
		
	}

	@Override
	public void update(String data) {
		System.out.println(data + "글 수정");
		
	}

	@Override
	public void select(String data) {
		System.out.println(data + "글 조회");
		
	}

}
