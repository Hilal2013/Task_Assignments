package com.company;

import com.vdurmont.emoji.Emoji;
import com.vdurmont.emoji.EmojiParser;

public class PrintEmojiOnConsole {
    public static void main(String[] args) {
        String y = Character.toString( 128_512 );
        System.out.println( y ) ;
        System.out.println(EmojiParser.parseToUnicode(":smile: Good Morning "));
     //   System.out.println(EmojiParser.parseFromUnicode("smile" ,));
        System.out.println("\uD83E\uDD8A"+"Hello fox");
        System.out.println("\uD83D\uDE02");
        System.out.println("\uD83D\uDE05");
        System.out.println("");
    }
}
