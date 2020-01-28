package lesson6;


public class Main {
    public static void main(String[] args) {
        //MyTreeMap<Integer, String> map = new MyTreeMap<>();
        MyTreeMap<Integer, String>[] maps = new MyTreeMap[20];

        for (int i = 0; i < maps.length; i++){
            maps[i] = new MyTreeMap<>();
            while (true){
                int a = (int)(Math.random()*(200+1)) - 100;
                //System.out.println(a);
                maps[i].put(a, "Значение");
                if(maps[i].getDepth() > 5){
                    break;
                }
            }
        }

        for (int i = 0; i < maps.length; i++) {
            if(!maps[i].isBalance()) {
                System.out.println((i + 1) + " - дерево несбалансированно");
            } else {
                System.out.println((i + 1) + " - дерево сбалансированно");
            }
        }


//        map.put(5,"five");
//        map.put(1,"one");
//        map.put(3,"tree");
//        map.put(7,"seven");
//        map.put(2,"two");
//        map.put(4,"four");
//        map.put(9,"nine");
//        map.put(0,"nine");
//        map.put(20,"nine");
//        map.put(10,"nine");
//        map.put(-1,"nine");
//        map.put(-2,"nine");
//        map.put(-9,"nine");
//        map.put(-5,"nine");
//        map.put(-10,"nine");
//
        //System.out.println(map.getDepth());
//
//        System.out.println(map);

    }
}
