package adapter;

public class Connection {
    public static void main(String[] args) {

        Love adapterLove = new AdapterLove(new MenWithBadTemper());
        adapterLove.cupidsArrowForHim();
        adapterLove.gotBetterForHim();
        Love cupidArrow = new AdapterLove(new WomanWithBadTemper());
        cupidArrow.cupidsArrowForHer();
        cupidArrow.gotBetterForHer();




    }
}
