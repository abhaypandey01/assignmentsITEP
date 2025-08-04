/*
Student Result Checker
Create a class Student with fields: name, mathMarks, scienceMarks.
Use setters to assign values. Add a method getAverage().
 */
class Student{
    private String name;
    private int mathMarks;
    private int scienceMarks;

    public void setName(String name){
        this.name = name;
    }

    public void setMathsMarks(int mathMarks){
        this.mathMarks = mathMarks;
    }

    public void setScienceMarks(int scienceMarks){
        this.scienceMarks = scienceMarks;
    }

    public int average(){
        return (mathMarks + scienceMarks)/2;
    }
}


class Test{
    public static void main(String args[]){
        Student obj = new Student();
        obj.setName("Ram");
        obj.setScienceMarks(90);
        obj.setMathsMarks(89);

        int avg = obj.average();

        System.out.println("Average is : " + avg);
    }
}