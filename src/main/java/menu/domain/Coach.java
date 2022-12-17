package menu.domain;

public class Coach {

    private final String name;
    private Menus canNotEatMenus ;

    public Coach(String name) {
        if(!isValidName(name)){
            throw new IllegalArgumentException("코치의 이름은 최소 2글자, 최대 4글자입니다.");
        }
        this.name = name;
        this.canNotEatMenus = new Menus("");
    }

    private static boolean isValidName(String name) {
        return 2 <= name.length() && name.length() <= 4;
    }

    public void addCanNotEatMenus(Menus canNotEatMenus) {
        if(!isValidMenuSize(canNotEatMenus)){
            throw new IllegalArgumentException("코치가 못 먹는 메뉴의 개수는 최소 0개, 최대 2개입니다.");
        }
        this.canNotEatMenus = canNotEatMenus;
    }

    private boolean isValidMenuSize(Menus canNotEatMenus) {
        return canNotEatMenus.size() <= 2;
    }

    public String getName() {
        return name;
    }
}
