package array;

public class Student 
{
	int stuid;
    String name;
    float per;
public Student(int stuid,String name,float per)
{
super();
this.stuid=stuid;
this.name=name;
this.per=per;
}
//override
 public String toString() 
 {
	 return "Student [stuid="+stuid+", name="+name+",per="+per+"]";
	 
 }

}

