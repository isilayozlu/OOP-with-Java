package AbstractClass.Q3;

public class BachelourStudent extends Student implements ProjectScoreBehaviour{

    public BachelourStudent(int id, float mid, float fin){
        super(id,mid,fin);
    }

    @Override
    public float computeTotalScore(){
        return super.computeBaseScore()+ this.projectScore();
    }

    @Override
    public float projectScore(){
        return 20;
    }

}
