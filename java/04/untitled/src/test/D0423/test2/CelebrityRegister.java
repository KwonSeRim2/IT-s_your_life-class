package Day.D0423.test2;


import java.util.Scanner;

public class CelebrityRegister {
    public static void main(String[] args) {
        GetName check = new GetName();
        String [] names = null;
        String [] names2 = null;

        Scanner scanner = new Scanner(System.in);

        System.out.print("남자 연예인 몇 명 등록할까요? ");
        int num = scanner.nextInt();
        scanner.nextLine();
        names = new String[num];
        MaleCelebrity[] MName = new MaleCelebrity[num];

        for (int i = 0; i < names.length; i++) {
            try {
                System.out.print("참가자 이름을 입력: ");
                String name = scanner.nextLine();
                MName[i] = new MaleCelebrity(name);

                // 중복 체크
                boolean isDuplicate = false;
                for (String n : names) {
                    if (MName[i].getName().equals(n)) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (isDuplicate) {
                    System.out.println(">> 중복된 이름입니다. 등록하지 않습니다.");
                    i--; // 인덱스 되돌리기: 다시 입력 받아야 하니까
                    continue;
                }

                check.nameCheck(MName[i].getName()); // 이름 유효성 검사
                names[i] = MName[i].getName();       // 등록

            } catch (InvalidNameException e) {
                System.out.println(e.getMessage());
                i--; // 예외 발생 시도 시에도 다시 입력 받아야 하므로 인덱스 되돌리기
            }
        }

        //-----------------------------------------------------------------------------

        System.out.print("여자 연예인 몇 명 등록할까요? ");
        int num2 = scanner.nextInt();
        scanner.nextLine();
        names2 = new String[num2];
        FemaleCelebrity[] FName = new FemaleCelebrity[num2];


        for (int i = 0; i < names2.length; i++) {
            try {
                System.out.print("참가자 이름을 입력: ");
                String name = scanner.nextLine();
                FName[i] = new FemaleCelebrity(name);

                // 중복 체크
                boolean isDuplicate = false;
                for (String n : names2) {
                    if (FName[i].getName().equals(n)) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (isDuplicate) {
                    System.out.println(">> 중복된 이름입니다. 등록하지 않습니다.");
                    i--; // 인덱스 되돌리기: 다시 입력 받아야 하니까
                    continue;
                }

                check.nameCheck(FName[i].getName()); // 이름 유효성 검사
                names2[i] = FName[i].getName();       // 등록

            } catch (InvalidNameException e) {
                System.out.println(e.getMessage());
                i--; // 예외 발생 시도 시에도 다시 입력 받아야 하므로 인덱스 되돌리기
            }
        }
        System.out.println();
        System.out.println("[남자 연예인 리스트]");
        for (MaleCelebrity n : MName) {
            System.out.println(n);
        }

        System.out.println();
        System.out.println("[여자 연예인 리스트]");
        for (FemaleCelebrity n : FName) {
            System.out.println(n);
        }


    }
}
