import greenfoot.*;

public class Animations {
    /**
     * 让选错的卡片快速抖动
     */
    public static void wobble(Card[] cards) {
        for (Card card : cards) {
            for (int i = 0; i < 3; i++) { // 让卡片快速摆动 3 次（减少时间）
                card.setLocation(card.getX() + 3, card.getY());
                Greenfoot.delay(1); // 抖动更快
                card.setLocation(card.getX() - 3, card.getY());
                Greenfoot.delay(1);
            }
        }
        Greenfoot.playSound("wobble.wav");
    }

    /**
     * 让选中的 Triple 卡片更快速、流畅地滑动 & 旋转
     */
    public static void slideAndTurn(Card[] cards) {
        for (Card card : cards) {
            // **优化滑动速度**
            for (int i = 0; i < 6; i++) { // 只执行 6 次，但步长更大
                card.setLocation(card.getX() + 10, card.getY()); // 每次移动 10 像素
                Greenfoot.delay(1); // 更小的延迟
            }

            // **优化旋转**
            for (int i = 0; i < 5; i++) { // 只执行 5 次，角度增大
                card.setRotation(card.getRotation() + 18); // 每次旋转 18°
                Greenfoot.delay(1); // 旋转更流畅
            }
        }
        Greenfoot.playSound("swoosh.wav");
    }
}
