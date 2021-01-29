package lesson31;

import lesson31.builder.Setting;
import lesson31.factory.Document;
import lesson31.factory.JPGFactory;
import lesson31.factory.PDFFactory;
import lesson31.factory.TXTFactory;
import lesson31.prototype.Bot;

import java.util.Objects;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
//        //Factory example
//        Document txt = getDocument("TXT");
//        Document pdf = getDocument("PDF");
//        Document jpg = getDocument("JPG");
//
//        if (Objects.nonNull(txt)) txt.print();
//        if (Objects.nonNull(pdf)) pdf.print();
//        if (Objects.nonNull(jpg)) jpg.print();

//        //Singleton example
//        Configuration configuration = Configuration.instance("First");
//        System.out.println(configuration.getConfig());
//
//        configuration = Configuration.instance("Second");
//        System.out.println(configuration.getConfig());

//        //Prototype example
//        Bot bot = new Bot();
//        bot.setName("Alex");
//        bot.setType("Human");
//        bot.setCharger(100);
//        System.out.println("bot: " +bot);
//
//        Bot cloneBot = (Bot) bot.clone();
//        System.out.println("cloneBot: " + cloneBot);

        //Builder example
        Setting.Builder builder = new Setting.Builder();
        Setting setting1 = builder.withHost("Host").withPath("Path").withPort("8080").build();
        Setting setting2 = new Setting.Builder().withHost("HOST2").build();
    }

    private static Document getDocument(String factory) {
        switch (factory) {
            case "TXT":
                return new TXTFactory().getDocument();
            case "PDF":
                return new PDFFactory().getDocument();
            case "JPG":
                return new JPGFactory().getDocument();
        }
        return null;
    }
}
