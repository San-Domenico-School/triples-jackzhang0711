import greenfoot.*;
/**
 * Author: Jack
 * Date: 2.3.2025
 */

public class GameBoard extends World {
    private static final int NUM_CARDS_IN_DECK = 27; // Change to 27 for easy mode

    public GameBoard() {
        super(430, 600, 1); // Initialize the game world with dimensions
        prepareScene(); // Set up the scene
    }

    public void prepareScene() {
        Dealer dealer = new Dealer(NUM_CARDS_IN_DECK); // 传入必须的 int 参数
        addObject(dealer, -30, -30);

        Player player = new Player(dealer);
        addObject(player, -30, -30); // 确保 Player 不显示在游戏界面
    }
}