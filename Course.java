class Course{
    public String course[]={"C#","JAVA","Python"};
    public int marks[]={80,68,30};

    public void displayMarks(){
        System.out.println("Marks obtained for the courses");
        System.out.println("Courses\t\t\tMarks");
        for(int i=0;i<3;i++){
            System.out.println(course[i]+"\t\t\t"+marks[i]);
        }
        System.out.println("The courses where the marks obtained are less than 40 are:");    }

    public void displayLessThan(){
        for(int i=0;i<3;i++){
            if(marks[i]<40){
                System.out.println(course[i]+":"+marks[i]);
            }
        }
    }
}