import HtmlBuilder.BodyElement;
import HtmlBuilder.DIVElement;
import HtmlBuilder.HTMLDocument;

public class HtmlBuilderTest {
    public static void main(String[] args) {


        BodyElement body = new BodyElement();
        body.addElement("Hello World!" );

        DIVElement div = new DIVElement();
        div.setId("divid123465798");
        div.addElement("Hello World2!" );
        body.addElement(div);

        HTMLDocument document= new HTMLDocument();
        document.setBody(body);

        System.out.println(document.toHtml());

    }

}
