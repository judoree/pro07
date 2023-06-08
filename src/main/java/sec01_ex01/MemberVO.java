package sec01_ex01;

import java.sql.Date;
	//전체 문서에서 찾을때 컨트롤 쉬프트 r
public class MemberVO {

	// 필(field) - 객체의 데이터가 저장되는 곳
	private String id;
	private String pwd;
	private String name; // private 다른 클래스에 서 필드 변경값 변환 불가
	private String email;
	private Date joinDate;

	// 생성자 - 객체의 값을 초기화 하는 놈 , 생성자 만드는 법 클래스명(){} 일종의 메서드(함수) 리턴 타입이 없다.

	// 기본 생성자
	public MemberVO() {
		System.out.println("Member 생성자 호출됌");
	}

	// 메서드 - 객체의 동작에 해당하는 실행 블록(블록은 중괄호)

	// Getter(다른 클래스에서 id 값을 가져가게 하는 역할) getID(){}
	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Date getJoinDate() {
		return joinDate;
	}
	// Setter(다른 클래스에서 id 값을 설정하는 역할)

	public void setId(String id) {
		this.id = id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	
	
	
	
	
	
	
}
