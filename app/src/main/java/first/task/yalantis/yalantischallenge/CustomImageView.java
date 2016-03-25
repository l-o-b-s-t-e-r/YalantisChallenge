package first.task.yalantis.yalantischallenge;


public class CustomImageView{

    private int mFirstImageId;
    private int mSecondImageId;

    public CustomImageView(int id1, int id2){
        this.mFirstImageId = id1;
        this.mSecondImageId = id2;
    }

    public int getFirstImageId() {
        return mFirstImageId;
    }

    public int getSecondImageId() {
        return mSecondImageId;
    }
}
