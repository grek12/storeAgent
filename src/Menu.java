import java.util.Scanner;

class Menu {
    Scanner scan = new Scanner(System.in);
    String s = "";
    int x = 0;
    String name;
    Store store = new Store("nameStore");
    public void mainMenu() {

        while (!"7".equals(s)) {
            System.out.println("1. Добавить покупателя");
            System.out.println("2. Удалить покупателя");
            System.out.println("3. Получить среднюю стоимость покупок в магазине");
            System.out.println("4. Получить данные о всех покупателях");
            System.out.println("5. Работа с покупателями");
            System.out.println("6. Выход");
            s = scan.next();
            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
            }
            switch (x) {
                case 1:
                    System.out.println("Введите  фамилию покупателя");
                    name = scan.next();
                    store.addBuy(name);
                    break;
                case 2:
                   store.delBuy();
                    break;
                case 3:
                    System.out.println(   store.srCena());
                    break;
                case 4:
                    System.out.println( store.getAll());
                    break;
                case 5:
                 menu2();
                    break;
}}}

    public void menu2() {
        System.out.println("Введите  фамилию покупателя");
        String num = scan.next();
        store.findBuy(num);
        System.out.println(store.findBuy(num));
        while (!"7".equals(s)) {
            System.out.println("1. Изменить фамилию покупателя.");
            System.out.println("2. Добавить покупку.");
            System.out.println("3. Изменить цену покупку.");
            System.out.println("4. Получить сумму покупок.");
            System.out.println("5. Вывод всех данных покупателя.");
            System.out.println("7. В главное меню.");
            s = scan.next();
            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
            }
            switch (x) {
                case 1:
                    System.out.println("Введите новую фамилию покупателя");
                    name = scan.next();
                    store.findBuy(num).getBuy().setFam(name);
                    num = name;
                    break;
                case 2:
                    System.out.println("Введите сумму покупки");
                    int number = scan.nextInt();
                    store.findBuy(num).getBuy().addPocupka(number);
                    break;
                case 3:
                    System.out.println("Ввдеите номер покупки ");
                    int cena1 = scan.nextInt();
                    System.out.println("Ввдеите новую цену");
                    int cena2 = scan.nextInt();
                    store.findBuy(num).getBuy().setPocupka(cena1, cena2);
                    break;
                case 4:
                    System.out.println(store.findBuy(num).getBuy().sumPoc());
                    break;
                case 5:
                    System.out.println(store.findBuy(num).getBuy().getData());
                    break;
                case 6:
                    mainMenu();
                    break;

            }}}

}
