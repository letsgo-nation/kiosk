package kiosk;

class FoodKiosk {
    private Burger porkBurger;
    private Burger beefBurger;
    private Burger cheeseBurger;
    private Pizza pepperoniPizza;
    private Pizza porkPizza;
    private Pizza cheesePizza;
    private Spaghetti tomatoSpaghetti;
    private Spaghetti creamSpaghetti;
    private Spaghetti roseSpaghetti;

    public FoodKiosk() {
        porkBurger = new Burger("porkBurger", 1.99, "delicious pork burger.");
        beefBurger = new Burger("beefBurger", 2.99, "sweet beef burger.");
        cheeseBurger = new Burger("cheeseBurger", 3.99, "cheese burger with five toppings.");
        porkPizza = new Pizza("porkPizza", 4.99, "large size pork pizza.");
        cheesePizza = new Pizza("cheesePizza", 5.99, "cheese pizza based with tomato sauce.");
        pepperoniPizza = new Pizza("pepperoniPizza", 6.99, "delicious pepperoni pizza.");
        tomatoSpaghetti = new Spaghetti ("tomatoSpaghetti", 7.99, "spicy tomato spaghetti.");
        creamSpaghetti = new Spaghetti ("creamSpaghetti", 8.99, "onion cream spaghetti.");
        roseSpaghetti = new Spaghetti ("roseSpaghetti", 9.99, "rose spaghetti with a rose.");
    }

    public void MainMenu() {
        System.out.println("[ FAST FOOD MENU ]");
        System.out.println("1. Burgers    | A delicious burger with juicy patty and toppings");
        System.out.println("2. Pizza      | A classic pizza with a variety of toppings");
        System.out.println("3. Spaghetti  | A spaghetti with various kinds of toppings");
        System.out.println(" ");
        System.out.println("[ ORDER MENU ]");
        System.out.println("4. Order       | 장바구니를 확인 후 주문합니다");
        System.out.println("5. Cancel      | 진행중인 주문을 취소합니다");
    }
    public void processChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("BURGER MENU 에 오신 걸 환영합니다.");
                System.out.println("1. " + porkBurger.getName() + " - $" + porkBurger.getPrice() + " - " + porkBurger.getDescription());
                System.out.println("2. " + beefBurger.getName() + " - $" + beefBurger.getPrice() + " - " +  beefBurger.getDescription() );
                System.out.println("3. " + cheeseBurger.getName() + " - $" + cheeseBurger.getPrice() + " - " + cheeseBurger.getDescription());
                break;
            case 2:
                System.out.println("PIZZA MENU 에 오신 걸 환영합니다.");
                System.out.println("1. " + porkPizza.getName() + " - $" + porkPizza.getPrice() + " - " + porkPizza.getDescription());
                System.out.println("2. " + cheesePizza.getName() + " - $" + cheesePizza.getPrice() + " - " + cheesePizza.getDescription());
                System.out.println("3. " + pepperoniPizza.getName() + " - $" + pepperoniPizza.getPrice() + " - " + pepperoniPizza.getDescription());
                break;
            case 3:
                System.out.println("SPAGHETTI MENU 에 오신 걸 환영합니다.");
                System.out.println("1. " + tomatoSpaghetti.getName() + " - $" + tomatoSpaghetti.getPrice() + " - " + tomatoSpaghetti.getDescription());
                System.out.println("2. " + creamSpaghetti.getName() + " - $" + creamSpaghetti.getPrice() + " - " + creamSpaghetti.getDescription());
                System.out.println("3. " + roseSpaghetti.getName() + " - $" + roseSpaghetti.getPrice() + " - " + roseSpaghetti.getDescription());
                break;
            case 4:
                System.out.println("아래와 같이 주문 하시겠습니까?");
//              주문 화면 작성하기
                break;
            case 5:
                System.out.println("진행하던 주문을 취소하시겠습니까?");
//               주문취소 화면 작성하기
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;

        }
    }
}