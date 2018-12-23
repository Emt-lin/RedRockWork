package demoL5.domain;

import java.util.Map;

/**
 * @author psl
 */
public class ScoreStore {
    private Map<Goods,Integer> map;

    /**
     * 增加商品
     * @param goods
     */
    public void add(Goods goods,int count){
        if (map.containsKey(goods)){
            int cnt = map.get(goods);
            cnt += count;
            map.put(goods,cnt);
        }else {
            map.put(goods,count);
        }
    }

    /**
     * 兑换商品后，商品的数量变化
     * @param goods
     * @param count
     */
    public void reduce(Goods goods,int count){
        if (!map.containsKey(goods)){
            System.out.println("你兑换的商品不存在");
            return;
        }else if (map.get(goods)<count){
            System.out.println("你兑换的商品数量大于了库存");
            return;
        }else {
            int cnt = map.get(goods);
            cnt -= count;
            map.put(goods,cnt);
        }
    }
}
