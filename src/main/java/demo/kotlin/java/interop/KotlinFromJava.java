package demo.kotlin.java.interop;

import demo.kotlin.kotlin.interop.Article;
import demo.kotlin.kotlin.interop.CompanionTest;
import demo.kotlin.kotlin.interop.ObjectTest;
import demo.kotlin.kotlin.interop.StringUtil;

public class KotlinFromJava {
    void accessorsCall() {
        Article article = new Article("Title", "body", true);
        String title = article.getTitle();
        article.setBody("new body");
        String body = article.getBody();
        boolean isNew = article.isNew();
    }

    void topLevelFuncCall() {
        StringUtil.getFirstName("Kotlin awesome", " ");
    }

    void staticCall() {
        CompanionTest.foo();
        CompanionTest.Companion.bar();

        ObjectTest.foo();
        ObjectTest.INSTANCE.bar();
    }
}
