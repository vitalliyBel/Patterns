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
    public void cupidsArrowForHim() {
        this.menWithBadTemper.HeFellInLove();
    }

    @Override
    public void gotBetterForHim() {
        this.menWithBadTemper.HeGottenBetter();
    }

    @Override
    public void cupidsArrowForHer() {
        this.womanWithBadTemper.SheFellInLove();
    }

    @Override
    public void gotBetterForHer() {
        this.womanWithBadTemper.SheGottenBetter();
    }
}
