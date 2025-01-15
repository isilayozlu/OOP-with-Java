package AbstractClass.Q3;

public class PhDStudent extends MasterStudent implements ArticleScoreBehaviour{
    public int numberOfArticles;

    public PhDStudent(int id, float mid, float fin, int conf, int numberOfArticles){
        super(id,mid,fin,conf);
        this.numberOfArticles=numberOfArticles;
    }

    @Override
    public float computeTotalScore(){
        return super.computeTotalScore()+this.articleScore();
    }

    @Override
    public float articleScore(){
        return numberOfArticles*8;
    }
}