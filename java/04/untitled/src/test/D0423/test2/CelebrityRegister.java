package test.D0423.test2;


import java.util.Scanner;

public class CelebrityRegister {
    public static void main(String[] args) {
        GetName check = new GetName();
        String [] names = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("남자 연예인 몇 명 등록할까요? ");
        int num = scanner.nextInt();
        names = new String[num];

        for (int i = 0; i < names.length; i++) {
            try {
                String name;
                System.out.print("참가자 이름을 입력: ");
                name = scanner.nextLine();
                MaleCelebrity MName = new MaleCelebrity(name);

                for (String n : names){
                    if(n.equals(MName.getName())){
                        System.out.println(">> 중복된 이름입니다. 등록하지 않습니다.");
                    }else {
                        check.nameCheck(MName.getName());
                        names[i] = MName.getName();
                    }
                }


            } catch (InvalidNameException e) {
                String message = e.getMessage();
                System.out.println(message);
            }
        }


    }
}
