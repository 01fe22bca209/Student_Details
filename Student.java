class Student{
    String name;
    String usn;
    String department="Computer Applications";
    String program="BCA";
    String registered_courses[]={"C#","JAVA","Python"};
    
    public void display(){
        System.out.println("-----Student Details-----");
        name="Keerthi";
        usn="01fe22bca209";
        System.out.println("Name:"+name);
        System.out.println("Usn:"+usn);
        System.out.println("Department:"+department);
        System.out.println("Program:"+program);
        System.out.println("Courses Registered");
        for(int i=0;i<3;i++){
            System.out.println(i+")"+registered_courses[i]);
        }}
         public static void main(String[] args){
            Student s=new Student();
            s.display();
        }
    }

