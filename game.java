import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String action;
        System.out.println("欢迎来到冒险游戏！");
        System.out.println("您正在一个迷宫中，您需要找到出路。");
        System.out.println("您可以选择向左走，向右走，向上走或向下走。");
        System.out.println("请选择您想要进行的操作：");

        while (true) {
            System.out.print("> ");
            action = sc.nextLine();
            if (action.equals("向左走")) {
                System.out.println("您走到了一个新的房间。");
                System.out.println("您可以继续向左走，向右走，向上走或向下走。");
            } else if (action.equals("向右走")) {
                System.out.println("您走到了一个新的房间。");
                System.out.println("您可以继续向左走，向右走，向上走或向下走。");
            } else if (action.equals("向上走")) {
                System.out.println("您走到了一个新的房间。");

            }
        }
    }
}
