package sample;

import java.util.ArrayList;
import java.util.Random;

public class Hunter {
    String weapon = "片手剣";
    String name = "Garana";
    ArrayList<Double> damageArray = new ArrayList<Double>();

    // コンストラクタ(インスタンス生成時に実行される処理)
    public Hunter() {
        // ダメージデータをArrayListに追加
        damageArray.add(100.0);
        damageArray.add(90.0);
        damageArray.add(80.0);
        damageArray.add(70.0);
        damageArray.add(60.0);
    }

    public double attack(ArrayList<String> elementArray){
        // Ramdomクラスをインスタンス化
        Random random = new Random();

        // RamdomクラスのnextIntメソッドを利用して、乱数を生成し、それぞれの変数に格納
        int randomValue = random.nextInt(5);
        int randomValue2 = random.nextInt(4);

        // ArrayListの中に入っている値を乱数インデックスで指定して取得
        String element = elementArray.get(randomValue);
        double damage = damageArray.get(randomValue2);

        // 属性ごとに条件分岐し、ダメージを算出
        if( element.equals("火属性") || element.equals("龍属性") ){
            damage = damage * 0.9;
        } else if ( element.equals("雷属性") || element.equals("水属性") || element.equals("氷属性") ) {
            damage = damage * 2.0;
        }

        // ハンターの攻撃力と属性をログ出力
        System.out.println(name + "の" + weapon + "の攻撃力は" + damage + "です。");
        System.out.println(name + "の" + weapon + "の属性は" + element + "です。");

        // 呼び出し先にダメージを戻す
        return damage;
    }
}
