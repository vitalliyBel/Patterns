package adapter;

public  class AdapterLove implements Love {

    private MenWithBadTemper menWithBadTemper;

    public AdapterLove(MenWithBadTemper menWithBadTemper) {
        this.menWithBadTemper = menWithBadTemper;
    }

    private WomanWithBadTemper womanWithBadTemper;

    public AdapterLove( WomanWithBadTemper womanWithBadTemper) {
        this.womanWithBadTemper = womanWithBadTemper;
    }



    @Override
    public void cupidsArrow() {
        this.menWithBadTemper.HeFellInLove();
        this.womanWithBadTemper.SheFellInLove();

    }

    @Override
    public void gotBetter() {
        this.menWithBadTemper.HeGottenBetter();
        this.womanWithBadTemper.SheGottenBetter();


    }
}
