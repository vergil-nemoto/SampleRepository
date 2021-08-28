package sample;

import java.util.ArrayList;
import java.util.Arrays;

public class Monster {
    String name = "アルバトリオン";
    ArrayList<String> element = new ArrayList<String>(Arrays.asList("氷属性", "雷属性", "火属性", "水属性", "龍属性"));
    double healthPoint = 1000;

    // Hunterクラスのattackメソッドで算出したダメージを引数として受け取り、現在のHealthPointと減法で計算
    public void damaged(double damage){
        this.healthPoint = this.healthPoint - damage;

        // HealthPointをログ出力
        System.out.println(name + "の残りHPは" + this.healthPoint + "です。");
    }
}
