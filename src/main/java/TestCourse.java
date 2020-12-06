public class testCourse {
    public static void main(String[] args) {
	

		Professor prof1= new Professor("xyq", "X", "Yq");
        Course course1= new Course("MSE-23449", "Object Oriented Programming", prof1, 8);

     
		
		System.out.println(course1.getCredit());
		System.out.println(course1.getID());
	}
}
