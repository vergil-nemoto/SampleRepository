package sample;

public class Main {
    public static void main(String[] args) {

        // それぞれのクラスをインスタンス可
        Hunter hunter = new Hunter();
        Monster monster = new Monster();

        // Hunterクラスのattackメソッドで算出したデータを変数attackPointに格納
        double attackPoint = hunter.attack(monster.element);
        
        // MonsterクラスのdamagedメソッドにattackPointを引数として受け渡して呼び出し 
        monster.damaged(attackPoint);
    }
}