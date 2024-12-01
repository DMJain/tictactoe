package org.tictactoe.factories;

import org.tictactoe.models.BotDifficultyLevel;
import org.tictactoe.strategies.botplayingstratrgy.BotPlayingStrategy;
import org.tictactoe.strategies.botplayingstratrgy.EasyBotPlayingStrategy;
import org.tictactoe.strategies.botplayingstratrgy.HardBotPlayingStrategy;
import org.tictactoe.strategies.botplayingstratrgy.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategyFactory(BotDifficultyLevel botDifficultyLevel){
        if(botDifficultyLevel.equals(BotDifficultyLevel.EASY)){
            return new EasyBotPlayingStrategy();
        }else if(botDifficultyLevel.equals(BotDifficultyLevel.MEDIUM)){
            return new MediumBotPlayingStrategy();
        }else {
            return new HardBotPlayingStrategy();
        }
    }
}
