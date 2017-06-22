import java.util.Arrays;
import java.util.Comparator;

public class ComparatorAndComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee[] e=new Employee[4];
		e[0]=new Employee(9,"piyuri","sahu");
		e[1]=new Employee(6,"piyuri","sahu");
		e[2]=new Employee(10,"shruti","kesarwani");
		e[3]=new Employee(6,"Avika","Sharma");
		Arrays.sort(e);
		for(Employee e1:e)
		{
			System.out.println(e1);
		}
		NameComparator nameComparator=new NameComparator();
		Arrays.sort(e, nameComparator);
		System.out.println(e);
		for(Employee e1:e)
		{
			System.out.println(e1);
		}
		
		
	}
	
	
	

}


class Employee implements Comparable<Employee>
{
	
	private int id;
	private String name;
	private String workName;
	@Override
	
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	public Employee(int id, String name, String workName) {
		super();
		this.id = id;
		this.name = name;
		this.workName = workName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWorkName() {
		return workName;
	}
	public void setWorkName(String workName) {
		this.workName = workName;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", workName=" + workName + "]";
	}
	
	
	
	
	}

	class NameComparator implements Comparator<Employee>
	{

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}}
