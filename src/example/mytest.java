package example;

public class mytest {

    public static void main(String[] agr){
        String url = "https://mhpic.jumanhua.com/comic/D/斗破苍穹拆分版/719话/1.jpg-mht.middle.webp";
        Manhua manhua = new Manhua();

        System.out.println("manhua = " + manhua.getStatus(url));
    }

}
