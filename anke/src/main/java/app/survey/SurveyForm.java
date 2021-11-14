package app.survey;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SurveyForm {

	@NotNull(message = "必須項目です")
	@Size(min = 1, max = 100, message = "1~150以内で入力してください")
	private int age;

	@NotNull(message = "必須項目です")
	private String satis;

	@NotNull(message = "必須項目です")
	@Size(min = 1, max = 20, message = "20文字以内で入力してください")
	private String contents;

	public SurveyForm() {
	}

	public SurveyForm(int age, String satis, String contents) {
		super();
		this.age = age;
		this.satis = satis;
		this.contents = contents;
	}

	public int getAge() {
		return age;
	}

	public String getSatis() {
		return satis;
	}

	public String getContents() {
		return contents;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSatis(String satis) {
		this.satis = satis;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
}
