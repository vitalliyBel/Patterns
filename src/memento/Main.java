package memento;

public class Main {
    public static void main(String[] args){
        СlothesPerson clothes = new  СlothesPerson();
        clothes.setJacket(true);
        clothes.setShoes(true);
        System.out.println(clothes);
        Save setOfClothes = clothes.save();
        clothes.setTrousers(true);
        System.out.println(clothes);
        clothes.loud(setOfClothes);
        System.out.println(clothes);

    }
}
