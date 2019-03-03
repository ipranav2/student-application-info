class Student
{
	int rollno; int marks;
	char grade;
	void addmission(int r)
		{
			rollno=r;
			System.out.println( rollno +" Student enrolled");
		}
	void exam(int m)
		{
			marks=m;
			System.out.println( marks +" obtained by "+ rollno +" Student");
		}
	void result()
		{
			if (marks>=80)
				grade='A';
			else if (marks>=60)
				grade='B';
			else if (marks>=40)
				grade='C';
			else
				grade='D';
		}
	void report()
		{
			System.out.println("rollno : "+rollno);
			System.out.println("marks: "+marks);
			System.out.println("grade: "+grade);
		}
		boolean compare(Student st)
		{
			boolean b;
			b= rollno ==st.rollno && marks==st.marks;
			return(b);
		}
}