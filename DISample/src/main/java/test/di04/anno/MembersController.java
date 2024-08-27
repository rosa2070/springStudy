package test.di04.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MembersController {
	@Autowired
	private MembersService service;
	
	public void service() {
		service.insert("김회원");
		service.update("김회원");
		service.select("김회원");
		service.delete("김회원");

	}

}
