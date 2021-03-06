package javalab.Lab02.projectWork;

public class FirstProject
{
	String name;
	boolean isComplete;

	FirstProject(String name)
	{
		this.name = name;
	}

		void markAsComplete()
		{
			isComplete = true;
		}

		void markAsInComplete()
		{
			isComplete = false;
		}


		public static void main(String[] args) {
			FirstProject obj = new FirstProject("Java");

				obj.markAsInComplete();
			System.out.println("Name of subject: " + obj.name);
			System.out.println("status: " + obj.isComplete);

				obj.markAsComplete();
			System.out.println("Name of subject: " + obj.name);
			System.out.println("status: " + obj.isComplete);
		}
}