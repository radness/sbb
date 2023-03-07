package com.example.sbb.util;

import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import org.springframework.stereotype.Component;

// Component 어노테이션을 사용하여 클래스를 생성하면 스프링부트에 의해 관리되는 빈(Bean, 자바객체)으로 등록된다.
@Component
public class CommonUtil {
    public String markdown(String markdown) {
        Parser parser = Parser.builder().build();
        Node document = parser.parse(markdown);
        HtmlRenderer renderer = HtmlRenderer.builder().build();
        return renderer.render(document);
    }
}
