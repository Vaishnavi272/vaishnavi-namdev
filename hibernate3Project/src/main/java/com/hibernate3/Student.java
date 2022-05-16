package com.hibernate3;
import javax.persistence.*;

@Entity
@Table(name="Student_details")
public class Student {
		  
	    @Id
	    @Column(name="Roll_no")
	    @GeneratedValue(strategy = GenerationType.AUTO)
		  private Integer rollNo;
	    
	      @Column(name="NAME")
		  private String name; 
	      
	      @Column(name="AGE")
		  private Integer age; 
	      
	      @Column(name="CLASS_Section")
		  private String classSection; 
	      
	      @Column(name="ADDRESS")
		  private String address;
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(Integer rollNo, String name, Integer age, String classSection, String address) {
			super();
			this.rollNo = rollNo;
			this.name = name;
			this.age = age;
			this.classSection = classSection;
			this.address = address;
		}
		public Integer getRollNo() {
			return rollNo;
		}
		public void setRollNo(Integer rollNo) {
			this.rollNo = rollNo;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public String getClassSection() {
			return classSection;
		}
		public void setClassSection(String classSection) {
			this.classSection = classSection;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		  
		  
		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", classSection=" + classSection
					+ ", address=" + address + "]";
		}  
		  
		  
		 

}
