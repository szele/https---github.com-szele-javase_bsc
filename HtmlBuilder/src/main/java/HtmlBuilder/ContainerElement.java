package HtmlBuilder;


import java.util.ArrayList;
import java.util.List;

public class ContainerElement extends BasicHtmlElement {


    private final List<HTMLElement> elements = new ArrayList<>();

    public void addElement(HTMLElement element) { elements.add(element);}

    public void addElement(String      element) { elements.add( new SimpleText(element));}


    @Override
    protected String getContent() {
        StringBuilder html = new StringBuilder();
        for (HTMLElement elem: elements)
        {
            html.append(elem.toHtml());
        }
        return html.toString();
    }



}
