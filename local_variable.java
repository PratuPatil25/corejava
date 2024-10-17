package variables;

class emp 
{
   int id;
   String name;
   int age;
   int salary;
 
}
public class local_variable {

	public static void main(String[] args) {
		
		emp em1 = new emp();
		em1.id=1;
		em1.name="Pratiksha";
		em1.age=24;
		em1.salary=30000;
		
		System.out.println("Employee no 1"+'\n'+"EMP ID " +em1.id +'\n' +"EMP Name " + em1.name +'\n'+ "EMP age "+ em1.age+'\n'+"EMP salary "+em1.salary);
		System.out.println('\n');
		
		emp em2 = new emp();
		em2.id=2;
		em2.name="Harsh";
		em2.age=24;
		em2.salary=40000;
		
		System.out.println("Employee no 2"+'\n'+"EMP ID " +em2.id +'\n' +"EMP Name " + em2.name +'\n'+ "EMP age "+ em2.age+'\n'+"EMP salary "+em2.salary);
		System.out.println('\n');
		
		emp em3 = new emp();
		em3.id=3;
		em3.name="Sakshi";
		em3.age=23;
		em3.salary=35000;
		
		System.out.println("Employee no 3"+'\n'+"EMP ID " +em3.id +'\n' +"EMP Name " + em3.name +'\n'+ "EMP age "+ em3.age+'\n'+"EMP salary "+em3.salary);
		System.out.println('\n');
		
		emp em4 = new emp();
		em4.id=4;
		em4.name="ram";
		em4.age=26;
		em4.salary=20000;
		
		System.out.println("Employee no 4"+'\n'+"EMP ID " +em4.id +'\n' +"EMP Name " + em4.name +'\n'+ "EMP age "+ em4.age+'\n'+"EMP salary "+em4.salary);
		System.out.println('\n');
		
		emp em5 = new emp();
		em5.id=5;
		em5.name="nitin";
		em5.age=24;
		em5.salary=40000;
		
		System.out.println("Employee no 5"+'\n'+"EMP ID " +em5.id +'\n' +"EMP Name " + em5.name +'\n'+ "EMP age "+ em5.age+'\n'+"EMP salary "+em5.salary);
		System.out.println('\n');
	}

}
