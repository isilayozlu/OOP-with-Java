package AbstractClass.Q3;

public abstract class Student{
    private int id;
    private float mid;
    private float fin;

    public Student(int id,float mid, float fin){
        this.id=id;
        this.mid=mid;
        this.fin=fin;
    }

    abstract float computeTotalScore();

    public float computeBaseScore(){
        return mid*0.4f + fin*0.6f;
    }
}
