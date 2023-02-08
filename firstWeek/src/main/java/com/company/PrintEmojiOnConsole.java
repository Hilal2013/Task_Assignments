package com.company;

import com.vdurmont.emoji.Emoji;
import com.vdurmont.emoji.EmojiParser;

import java.util.Scanner;

public class PrintEmojiOnConsole {
    public static void main(String[] args) {

        System.out.println(EmojiParser.parseToUnicode(" Good Morning :smile:"));
        System.out.println(EmojiParser.parseToUnicode(" I :heart: you"));
        System.out.println(EmojiParser.parseToUnicode("Lets drink :coffee:"));
     //   System.out.println(EmojiParser.parseFromUnicode("smile" ,));
        System.out.println("\uD83E\uDD8A"+"Hello fox");
        System.out.println("\uD83D\uDE02");
        System.out.println("\uD83D\uDE05");
        String y = Character.toString( 128_512 );
        System.out.println( y ) ;
        System.out.println(EmojiParser.parseToUnicode("Good night :moon:"));

        Scanner scan = new Scanner(System.in);
        System.out.println("enter emoji");
        String emoji = scan.next();

        if(emoji.equals("smile")) {
            System.out.println("\uD83D\uDE00");
        }
    }
}
