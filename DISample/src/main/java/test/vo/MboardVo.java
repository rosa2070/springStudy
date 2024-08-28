package test.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MboardVo {
	private int num;
	private String writer;
	private String title;
	private String content;
	private Date regdate;
}
