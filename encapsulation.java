class Student{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setName("Vishwak");
        System.out.println("name is : " + s1.getName());

    }
}