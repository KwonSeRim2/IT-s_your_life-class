package command;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileService fs = new FileService();

        Command[] commands = {
//                new AddCommand(),

                //익명 구현 객체
//                new Command() {
//                    @Override
//                    public void execute() {
//                        System.out.println("Add Command");
//                    }
//                },

                //람다식
                () -> System.out.println("Add Commandd"),
//                new OpenCommand(),
//                new PrintCommand(),
                //new ExitCommand()

                fs::open, // () -> fs.open()
                fs::print, // () -> fs.print()
                Main::exit // static 메소드 - 클래스명 :: 메소드명

        };

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1: Add, 2: Open, 3: Print, 4: Exit");
            System.out.print("선택: ");
            int sel = scanner.nextInt();

            commands[sel - 1].execute();
        }


    }

    public static void exit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("종료할까요?(Y/n) ");
        String answer = scanner.nextLine();

        scanner.close();
        if (answer.isEmpty() || answer.equalsIgnoreCase("y")) {
            System.exit(0);
        }
    }
}
