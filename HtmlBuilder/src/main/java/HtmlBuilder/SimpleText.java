package HtmlBuilder;

public class SimpleText implements HTMLElement {

    private final String text;

    public SimpleText(String text) {this.text  = text; }

    @Override
    public String toHtml() {

        return text;
    }

}
