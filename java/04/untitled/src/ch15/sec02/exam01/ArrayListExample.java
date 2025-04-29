package ch15.sec02.exam01;


import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();

        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        System.out.println(list.size());
        System.out.println(list.get(2).getSubject());
        System.out.println(list.get(2).getContent());
        System.out.println(list.get(2).getWriter());

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getSubject()+"/"+list.get(i).getContent()+"/"+list.get(i).getWriter());
        }

        list.remove(2);
        list.remove(2);

        for (Board i : list){
            System.out.println(i.getSubject()+"/"+i.getContent()+"/"+i.getWriter());

        }

    }
}
