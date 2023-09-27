package hibernate_package;
//importing required packages
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sailors")//table name
public class Sailors {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//primary key
	private int sid;
	@Column(name="sname")
	private String sname;
	@Column(name="age")
	private int age;
	@Column(name="exp")
	private int exp;
	
	//No arg constructor
	public Sailors() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Setters and getters
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Sailors [sid=" + sid + ", sname=" + sname + ", age=" + age + ", exp=" + exp + "]";
	}
	
}
