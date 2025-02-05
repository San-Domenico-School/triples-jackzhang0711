import greenfoot.*;

public class WinScreen extends World {
    private boolean canRestart = false; // 避免立即重启游戏

    public WinScreen(int finalScore) {
        super(430, 600, 1); // 设定窗口大小，和 GameBoard 一致
        showText("🎉 You Won! 🎉", 215, 200);
        showText("Final Score: " + finalScore, 215, 250);
        showText("Press SPACE to Restart", 215, 350);

        Greenfoot.delay(50); // 停留一段时间，确保用户可以看到胜利画面
        canRestart = true;
    }

    public void act() {
        if (canRestart && Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld(new GameBoard()); // 重新开始游戏
        }
    }
}
