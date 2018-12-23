package demoL5.domain;

/**
 * @author psl
 */
public class Student {
    private String name;
    private int score;
    private ScoreStore scoreStore = new ScoreStore();

    /**
     * 兑换商品的方法
     * @param good
     */
    public void exchange(Goods good,int count){
        if (this.score-good.getScore()*count<0){
            System.out.println("抱歉，你的积分不足兑换此商品");
        }else {
            this.score -= good.getScore()*count;
            System.out.println("兑换成功，你兑换的商品为："+good.getGname()+"剩余积分为："+this.score);
            scoreStore.reduce(good,count);
        }

    }

    /**
     * 学长给学弟增加积分
     * @param eldStudent
     * @param score
     */
    public void add(EldStudent eldStudent,int score){
        this.score += score;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
