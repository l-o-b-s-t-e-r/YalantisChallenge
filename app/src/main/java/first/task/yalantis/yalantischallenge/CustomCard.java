package first.task.yalantis.yalantischallenge;


public class CustomCard{

    private int firstImageId;
    private int secondImageId;

    public CustomCard(int id1, int id2){
        this.firstImageId = id1;
        this.secondImageId = id2;
    }

    public int getFirstImageId() {
        return firstImageId;
    }

    public int getSecondImageId() {
        return secondImageId;
    }
}
