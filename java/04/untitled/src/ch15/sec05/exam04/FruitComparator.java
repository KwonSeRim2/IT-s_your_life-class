package ch15.sec05.exam04;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {


    //Comparator를 구현하기 위해 필수로 필요
    // compare: 외부에서 받아온 두개의 값 바교
    @Override
    public int compare(Fruit o1, Fruit o2) {
        if(o1.price < o2.price) return -1;
        else if(o1.price == o2.price) return 0;
        else return -1;
    }
}
